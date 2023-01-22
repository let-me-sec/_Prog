import java.util.ArrayList;
import java.util.List;

public class Comment {
    private String textComm;
    int ratingCom;
    private int depth;
    List<Comment> comments = new ArrayList<>();
    public String getTextComm() {
        return textComm;
    }
    int reteUp() {
        return ratingCom++;
    }
    int reteDown() {
        return ratingCom--;
    }

    public void addComment(Comment comm) {
        comm.depth = depth+1;
        comments.add(comm);
    }
    public Comment(int ratingCom, String textComm) {
        this.ratingCom = ratingCom;
        this.textComm  =textComm;
    }

    public String toString() {
        String t="";
        for (int i =0; i<=depth; i++) t+="\t";
        String res = t + "(" + ratingCom + ")"+ textComm;
        for(Comment com:comments) {
            res+= "\n\t" +t + com;
        }
        return res;
    }
}
