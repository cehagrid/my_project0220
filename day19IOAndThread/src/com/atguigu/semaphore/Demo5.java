package com.atguigu.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Java实现吸烟者问题
 * https://gitee.com/simple-one/CloudImage/raw/master/img/image-20200804224304498.png
 *
 * @author zsw
 * @date 2020/08/04 22:41
 */
public class Demo5 {
	// 香烟+胶水
	static Semaphore offer1 = new Semaphore(0);
	// 香烟+纸
	static Semaphore offer2 = new Semaphore(0);
	// 纸+胶水
	static Semaphore offer3 = new Semaphore(0);
	// 抽烟是否完成
	static Semaphore finish = new Semaphore(0);//,最小值为-1,为0时资源数是1
	// 对桌子进行互斥访问
	static Semaphore desk = new Semaphore(1);
	// 用于实现三个抽烟者轮流抽烟
	static int i = 0;



	public static void main(String[] args) {
		for (int j = 0; j < 3; j++) {
			Thread provider = new Thread(new Prodiver());
			provider.setName("provider" + i);
			provider.start();

			Thread smoke1 = new Thread(new Smoke1());
			smoke1.setName("smoke1:" + i);
			smoke1.start();

			Thread smoke2 = new Thread(new Smoke2());
			smoke2.setName("smoke2:" + i);
			smoke2.start();

			Thread smoke3 = new Thread(new Smoke3());
			smoke3.setName("smoke3:" + i);
			smoke3.start();

		}
	}

	static class Prodiver implements Runnable {

		@Override
		public void run() {
			while (true) {
				try{
					// 访问临界资源
					desk.acquire();
					if (i == 0) {
						offer1.release();
					} else if (i == 1) {
						offer2.release();
					} else {
						offer3.release();
					}
					i = (i + 1) % 3;
					// 等待有人抽烟完成
					finish.acquire();
					// 解除临界资源
					desk.release();
					Thread.sleep(100);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	static class Smoke1 implements Runnable {
		// 当前抽烟者抽了几支烟
		static int num = 0;
		@Override
		public void run() {
			while (true) {
				// 确保桌上有组合一
				try {
					offer1.acquire();
					num++;
					System.out.println(Thread.currentThread().getName() + "Smoke1正在抽第" + num + "根烟");
					// 抽完了
					finish.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	static class Smoke2 implements Runnable {
		// 当前抽烟者抽了几支烟
		static int num = 0;
		@Override
		public void run() {
			while (true) {
				// 确保桌上有组合二
				try {
					offer2.acquire();
					num++;
					System.out.println(Thread.currentThread().getName() + "Smoke2正在抽第" + num + "根烟");
					// 抽完了
					finish.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	static class Smoke3 implements Runnable {
		// 当前抽烟者抽了几支烟
		static int num = 0;
		@Override
		public void run() {
			while (true) {
				// 确保桌上有组合一
				try {
					offer3.acquire();//信号量-1操作 P操作
					num++;
					System.out.println(Thread.currentThread().getName() + "Smoke3正在抽第" + num + "根烟");
					// 抽完了
					finish.release();//信号量+1操作 V操作
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}



