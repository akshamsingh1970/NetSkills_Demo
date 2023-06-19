// 2-	Create a program to count the string words with the help of Stream API.
import java.util.*;
import java.util.stream.*;  

class CountWordsStream{
    String sentence;

    CountWordsStream(){
        sentence = null;
    }

    CountWordsStream(String str){
        sentence = str;
    }

    void getStrInp(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter sentence: ");
        sentence = sc.nextLine();
    }

    void solve(){
        String str = sentence;
        long cnt = 0L;
        try{
            String[] wordsList = str.split(" ");
            cnt = Arrays.stream(wordsList).count();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        
        System.out.println("Words count: "+cnt);
    }
}

class Main{
    public static void main(String args[]){
        CountWordsStream cws = new CountWordsStream();
        cws.getStrInp();
        cws.solve();
    }
}