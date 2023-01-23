public class Time {

    private int second, minutes, hours,ALL,exception;
    public int getSec() {
        return second;
    }
    public int getMin(){
        return minutes;
    }
    public int getHours(){
        return hours;
    }
    public int allsec(){
        return ALL;
    }
    public void realTime(){
        if(hours == 0){
            this.exception++;
            System.out.print("00" + ":");
        }else if(hours > 0){
            System.out.print(hours + ":");
        }
        if (minutes == 0) {
            this.exception++;
            System.out.print("00" + ":");
        }else if(minutes > 0 && minutes <= 9){
            System.out.print("0" + minutes + ":");
        } else if (minutes > 10 && minutes < 60) {
            System.out.print(minutes + ":");
        }
        if (second == 0) {
            this.exception++;
            System.out.println("00");
        } else if (second > 0 && second <=9) {
            System.out.println("0" + second);
        }else if(second > 10 && second < 60){
            System.out.println(second);
        }
    }
    public void createTimeBySec (int sec) {
        this.ALL = sec;
        this.second = sec % 60;
        this.minutes = sec / 60;
        while (minutes >= 60){
            if(hours>=24){
                this.minutes = 0;
                this.second = 0;
                break;
            }else {
                this.minutes -= 60;
                this.hours++;
            }
        }
    }
    public void createTimeByHHMMSS(int hours,int minutes,int second){
        this.hours = hours;
        this.minutes = minutes;
        this.second = second;
        if (hours > 24) {
            throw new IllegalArgumentException("Вы ввели больше, чем 24 часа");
        }
        if (minutes >= 60)
        {
            throw new IllegalArgumentException("Вы ввели больше, чем 60 минут");
        }else if (hours == 24 && minutes != 0){
            this.minutes = 0;
        }
        if (second >= 60)
        {
            throw new IllegalArgumentException("Вы ввели больше, чем 60 секунд");
        }else if (hours == 24 && second != 0){
            this.second = 0;
        }
        this.ALL = hours * 60 * 60 + minutes * 60 + second;
    }
}
