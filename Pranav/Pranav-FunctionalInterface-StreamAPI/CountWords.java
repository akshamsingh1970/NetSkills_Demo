import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class CountWords {
    public String getS() {
        return s;
    }

    public static void setS(String s) {
        CountWords.s = s;
    }

    private static String s="What are you doing?";
    public static void main(String[] args){
        List<String> words= Arrays.asList(s.split("\\s+"));
//        String[] words=s.
//        Comparator<CountWords> compareStrings=Comparator.comparing(CountWords::getS);
        System.out.println("Number of words in the String: "+"'"+s+"'"+" is: "+ words.stream().count());
    }
}