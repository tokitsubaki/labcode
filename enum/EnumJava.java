import java.util.EnumMap;
import java.util.EnumSet;

public class EnumJava {

    public enum Season {SPRING, SUMMER, AUTUMN, WINTER};

    public enum SpeedType {
        SLOW(1),
        NATUAL(2),
        FAST(3);

        private int type;

        private SpeedType(int type) {
            this.type = type;
        }

        public int getSpeedType() {
            return this.type;
        }
    }

    public static void main(String[] args) {
        
        // 基本形
        Season spring = Season.SPRING;
        System.out.println(spring);

        // 代入
        Season autumn = Season.AUTUMN;
        Season fall = autumn;
        System.out.println(fall);

        // 比較
        Season winter = Season.WINTER;
        if (winter == Season.WINTER) {
            System.out.println(winter);
        } else {
            System.out.println("not WINTER");
        }

        if (winter.compareTo(Season.WINTER) == 0) {
            System.out.println(winter);
        } else {
            System.out.println("not WINTER");
        }

        // switch文
        Season summer = Season.SUMMER;
        switch(summer) {
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
            default:
                System.out.println("default.");
        }

        // enumのメソッド
        Season season = Season.SPRING;
        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(season.toString());

        System.out.println(Season.valueOf("SPRING"));
        // System.out.println(Season.valueOf("spring"));
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        // 独自メソッド・コンストラクタ
        SpeedType speed = SpeedType.SLOW;
        System.out.println(speed);
        System.out.println(speed.getSpeedType());

        // EnumSet
        EnumSet<Season> seasons = EnumSet.allOf(Season.class);
        System.out.println(seasons.size());
        seasons.forEach(System.out::println);

        EnumSet<Season> none = EnumSet.noneOf(Season.class);
        System.out.println(none.size());
        none.forEach(System.out::println);

        EnumSet<Season> springs = EnumSet.of(Season.SPRING);
        System.out.println(springs.size());
        springs.forEach(System.out::println);

        EnumSet<Season> springToAutumn = EnumSet.range(Season.SPRING, Season.AUTUMN);
        System.out.println(springToAutumn.size());
        springToAutumn.forEach(System.out::println);

        // EnumMap
        EnumMap<Season, String> seasonMap = new EnumMap<>(Season.class);
        seasonMap.put(Season.SPRING, "春");
        seasonMap.put(Season.SUMMER, "夏");
        seasonMap.put(Season.AUTUMN, "秋");
        seasonMap.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println(seasonMap.containsKey(Season.WINTER));
    }
}