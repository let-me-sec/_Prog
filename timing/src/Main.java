public class Main {
    public static void main(String[] args) {
        Time TIME = new Time();
        TIME.createTimeByHHMMSS(24,60,60);
        System.out.println(TIME.getHours());
        System.out.println(TIME.getMin());
        System.out.println(TIME.getSec());
        System.out.println(TIME.allsec());
        TIME.realTime();
    }
}