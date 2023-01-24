public class Temperature {
    private static Temperature instance;
    private int gradus;
    public void getTemp(int gradus){
        this.gradus = gradus;
    }
    public void getAnswer(){
        if(gradus >= -50 && gradus < 10){
            System.out.println("Твоя температура: " + this.gradus + " мне холодно, ведь она в диапозоне от -50 до 10");
        }else if(gradus >= 10 && gradus < 25){
            System.out.println("Твоя температура: " + this.gradus + " мне нормально, ведь она в диапозоне от 10 до 25");
        }else if(gradus >= 25 && gradus < 60){
            System.out.println("Твоя температура: " + this.gradus + " мне горячо, ведь она в диапозоне от 25 до 60");
        }
    }
    public Temperature(){}
    public static Temperature getInstance(){
        if(instance == null){
            instance = new Temperature();
        }
        return instance;
    }

}
