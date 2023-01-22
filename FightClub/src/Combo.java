import java.util.ArrayList;
import java.util.Arrays;

public class Combo{
    ArrayList<Integer> COMBO = new ArrayList<>();

    public void removeTechnic(int ind){
        COMBO.remove(ind);
    }
    public void showCombination(){
        System.out.println(Arrays.toString(COMBO.toArray()));
    }
    public void addTechnic(int ind, int hit){
        COMBO.add(ind, hit);
    }
}
