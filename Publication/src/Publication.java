import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Publication {
    private String header;
    private String [] tags = {};
    private String mainText;
    private int rating;
    public String getMainText() {
        return mainText;
    }

    public String getHeader() {
        return header;
    }
    List<Comment> comments = new ArrayList<>();

    int rateUp() {
        return rating++;
    }
    int rateDown() {
        return rating--;
    }
    Publication(String header, int rating,String
            mainText,String...tags){
        this.header = header;
        this.rating = rating;
        this.tags = tags;
        this.mainText = mainText;
    }
    Publication(){}

    public String toString() {
        String tagi = Arrays.deepToString(tags);
        String res = "("+ rating +")" + header + "\n" + tagi + "\n" +
                mainText;
        for(Comment com:comments) {
            res+= "\n\t" + com;
        }
        return res;
    }
}