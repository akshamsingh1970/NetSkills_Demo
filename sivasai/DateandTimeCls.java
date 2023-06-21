import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class DateandTimeCls{
    public static void main(String []args){
        //local date to string
        LocalDate date = LocalDate.now();
        String dt = date.toString();
        System.out.println(dt);

        //string to date
        dt = "2019-11-11";
        date = LocalDate.parse(dt);
        System.out.println(date);

        //time to string
        LocalTime time = LocalTime.now();
        String lt = time.toString();
        System.out.println(lt);

        //string to time
        lt = "10:43:42";
        time = LocalTime.parse(lt);
        System.out.println(time);

        
    }
}
