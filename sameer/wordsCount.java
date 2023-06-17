import java.util.Arrays;
import java.util.List;

public class wordsCount {
    public static void main(String[] args) {
        String str = "Hello World World Hello string is repeating string";
        List<String> words = Arrays.asList(str.split("\\s+"));

        long count = words.stream().count();
        System.out.println("String: " + str);
        System.out.println("Number of words: " + count);
    }
}
