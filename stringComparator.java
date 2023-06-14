import java.util.Comparator;

public class stringComparator implements Comparator {

    public int compare(Object a1, Object b1){
        float a=Float.parseFloat(a1.toString());
        float b=Float.parseFloat(b1.toString());
        if(a>b){
            return -1;
        } else if (b>a) {
            return 1;
        }
        return 0;
    }
}