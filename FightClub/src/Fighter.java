import java.util.function.Consumer;

public class Fighter implements attackList {
    private String name;
    private Combo combo;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int kick(){
        System.out.println(this.getName() + ": БАЦ!");
        return 1;
    }
    public int handStrike(){
        System.out.println(this.getName() + ": КИЯ!");
        return 2;
    }
    public int jumpStrike(){
        System.out.println(this.getName() + ": ВЖУХ!");
        return 3;
    }
    public void setCombo(Combo combo){
        this.combo = combo;
    }

    public void doCombo(){
        combo.COMBO.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer == 1){
                    kick();
                }else if(integer == 2){
                    handStrike();
                }else if(integer == 3){
                    jumpStrike();
                }
            }
        });
    }
    public Combo getCombo(){
        return this.combo;
    }
}
