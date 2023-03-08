package enum01;
class A{}
public enum Season {

    SPRING("春天","春暖花开"),SUMMER("夏天","骄阳似火"),
    AUTUMN("秋天","秋高气爽"),WINTER("冬天","白雪皑皑");

    private String seasonName;
    private String desc;


    Season(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public static Season valueof(String spring) {
        return null;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
