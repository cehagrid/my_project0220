package enum01;

public enum Gender implements Run{
    // public static final Gender MAN = new Gender();
    MAN{
        @Override
        public void walk() {
            System.out.println("大步流星走");
        }
    },WOMAN{
        @Override
        public void walk() {
            System.out.println("婀娜多姿走");
        }
    };

 /*   @Override
    public void walk() {
        System.out.println("走路锻炼身体");
    }*/
}

interface Run{

    void walk();

}
