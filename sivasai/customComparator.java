import java.util.Comparator;

public class customComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        double num1 = Double.parseDouble(o1.toString());
        double num2 = Double.parseDouble(o2.toString());
        if(num1>num2){
            return -1;
        }
        else if(num1<num2){
            return 1;
        }
        return 0;
    }
}
