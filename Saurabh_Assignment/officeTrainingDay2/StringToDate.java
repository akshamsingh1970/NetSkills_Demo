import java.time.*;//* LocalDate, LocalTime, LocalDateTime
import java.time.temporal.*;//* UnsupportedTemporalTypeException
import java.time.format.*; //* DateTimeParseException, DateTimeFormatter

class Main{
    public static void main(String args[]){

        //? string to date
        String date_str = "2023-01-12";

        try{
            LocalDate date = LocalDate.parse(date_str);
            System.out.println(date + " " +date.getClass()); 
        }catch(DateTimeParseException e){
            System.out.println("Exception: can't be parsed!!!");
        }

        //? date to string
        LocalDate newDate = LocalDate.now();

        // String str_date = newDate.format(DateTimeFormatter.ISO_DATE);
        String str_date = newDate.toString();
        System.out.println(str_date+" "+str_date.getClass()); 

        //? string to time
        String time_str = "10:34:56";
        try{
            LocalTime time = LocalTime.parse(time_str);
            System.out.println(time + " " +time.getClass()); 
        }catch(DateTimeParseException e){
            System.out.println("Exception: can't be parsed!!!");
        }

        //? time to string
        LocalTime newTime = LocalTime.now();

        // String str_time = newTime.format(DateTimeFormatter.ISO_TIME);
        String str_time = newTime.toString();
        System.out.println(str_time+" "+str_time.getClass());

        //? string to date-time
        String datetime_str = "2023-10-12T13:14:55";
        try{
            LocalDateTime datetime = LocalDateTime.parse(datetime_str);
            System.out.println(datetime + " " +datetime.getClass()); 
        }catch(DateTimeParseException e){
            System.out.println("Exception: can't be parsed!!!");
        }

        //? date-time to string
        LocalDateTime newDateTime = LocalDateTime.now();
        try{
            // String str_datetime = newDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
            String str_datetime = newDateTime.toString();
            System.out.println(str_datetime+" "+str_datetime.getClass());
        }catch(UnsupportedTemporalTypeException e){
            System.out.println("Exception: UnsupportedTemporalTypeException!!!");
        }
        
    }
}