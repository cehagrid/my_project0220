//package com.atguigu.semaphore;
//
//import java.util.Random;
//
////在上面的代码中，线程`Smoker`表示每个吸烟者，线程`Agent`表示提供物品的代理。在`main()`方法中，创建了三个`Smoker`线程和一个`Agent`线程，并分别启动。
////
////		在`Smoker`线程的`run()`方法中，线程首先进入循环，等待agent提供需要的物品。当agent提供需要的物品后，线程开始“吸烟”，完成任务。之后，线程通知agent可以继续提供物品了，并随机休眠一段时间。
////
////		在`Agent`线程的`run()`方法中，线程首先进入循环，等待前一个任务完成。当前一个任务完成后，线程随机选择一个物品，生成新的两个物品中的一个，并通知等待的线程可以继续执行了。之后，线程随机休眠一段时间。
////
////		需要注意的是，在同步代码块中，线程使用了`wait()`和`notifyAll()`方法来进行线程同步，确保线程之间正确地协作完成任务。同时，使用`synchronized`关键字保证了代码块的原子性和独占性，避免了线程安全问题的出现。
//
//public class SmokerProblem {
//	private static final int TOBACCO = 0;
//	private static final int PAPER = 1;
//	private static final int MATCHES = 2;
//
//	private static final int AGENT_INTERVAL = 1000; // 间隔时间，单位毫秒
//
//	private static final Random RANDOM = new Random();
//
//	private static final Object lock = new Object();
//
//	private static int available = -1;
//
//	private static boolean[] items = new boolean[3];
//
//	public static void main(String[] args) {
//		Thread smoker1 = new Thread(new Smoker(TOBACCO, "Smoker with tobacco"));
//		Thread smoker2 = new Thread(new Smoker(PAPER, "Smoker with paper"));
//		Thread smoker3 = new Thread(new Smoker(MATCHES, "Smoker with matches"));
//
//		Thread agent = new Thread(new Agent());
//
//		smoker1.start();
//		smoker2.start();
//		smoker3.start();
//
//		agent.start();
//	}
//
//	private static class Smoker implements Runnable {
//		private final int type;
//		private final String name;
//
//		public Smoker(int type, String name) {
//			this.type = type;
//			this.name = name;
//		}
//
//		@Override
//		public void run() {
//			while (true) {
//				synchronized (lock) {
//					while (!items[type]) {
//						try {
//							lock.wait();
//						} catch (InterruptedException e) {
//							Thread.currentThread().interrupt();
//						}
//					}
//
//					System.out.println(name + " is smoking.");
//
//					// 完成任务后，通知agent可以继续生产物品了
//					items[type] = false;
//					available = -1;
//					lock.notifyAll();
//				}
//
//				// 随机休眠一段时间
//				try {
//					Thread.sleep(RANDOM.nextInt(1000));
//				} catch (InterruptedException e) {
//					Thread.currentThread().interrupt();
//				}
//			}
//		}
//	}
//
//	private static class Agent implements Runnable {
//		@Override
//		public void run() {
//			while (true) {
//				synchronized (lock) {
//					while (available != -1) {
//						try {
//							lock.wait();
//						} catch (InterruptedException e) {
//							Thread.currentThread().interrupt();
//						}
//
//						int rand = RANDOM.nextInt(3);
//
//						switch (rand) {
//							case TOBACCO:
//								if (items[PAPER]) {
//									items[PAPER] = false;
//									available = MATCHES;
//									System.out.println("Agent produced matches.");
//									lock.notifyAll();
//								} else if (items[MATCHES]) {
//									items[MATCHES] = false;
//									available = PAPER;
//									System.out.println("Agent produced paper.");
//									lock.notifyAll();
//								}
//								break;
//
//							case PAPER:
//								if (items[TOBACCO]) {
//									items[TOBACCO] = false;
//									available = MATCHES;
//									System.out.println("Agent produced matches.");
//									lock.notifyAll();
//								} else if (items[MATCHES]) {
//									items[MATCHES] = false;
//									available = TOBACCO;
//									System.out.println("Agent produced tobacco.");
//									lock.notifyAll();
//								}
//								break;
//
//							case MATCHES:
//								if (items[TOBACCO]) {
//									items[TOBACCO] = false;
//									available = PAPER;
//									System.out.println("Agent produced paper.");
//									lock.notifyAll();
//								} else if (items[PAPER]) {
//									items[PAPER] = false;
//									available = TOBACCO;
//									System.out.println("Agent produced tobacco.");
//									lock.notifyAll();
//								}
//								break;
//
//							default:
//								throw new IllegalStateException("Unexpected value: " + rand);
//						}
//					}
//
//					// 随机休眠一段时间
//					try {
//						Thread.sleep(AGENT_INTERVAL);
//					} catch (InterruptedException e) {
//						Thread.currentThread().interrupt();
//					}
//				}
//			}
//		}
//	}
//
//	public class SmokerTest {
//		public static void main(String[] args) {
//			// 创建一个代理和三个吸烟者
//			Agent agent = new Agent();
//			Smoker s1 = new Smoker(agent, Smoker.TOOLS.TOBACCO);
//			Smoker s2 = new Smoker(agent, Smoker.TOOLS.PAPER);
//			Smoker s3 = new Smoker(agent, Smoker.TOOLS.MATCHES);
//
//			// 启动线程
//			agent.start();
//			s1.start();
//			s2.start();
//			s3.start();
//
//			// 等待线程结束
//			try {
//				agent.join();
//				s1.join();
//				s2.join();
//				s3.join();
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//			}
//		}
//	}
//}
//
