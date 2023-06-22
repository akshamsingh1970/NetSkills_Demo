import java.time.*;
import java.time.temporal.*;//* UnsupportedTemporalTypeException
import java.time.format.*; //* DateTimeParseException, DateTimeFormatter


class Main{
    public static void main(String args[]){
        LocalDateTime date_time = LocalDateTime.now();

        LocalDate date = date_time.toLocalDate();
        LocalTime time = date_time.toLocalTime();

        try{
           DateTimeFormatter f = DateTimeFormatter.ofPattern("HH MM SS");
            String str = time.format(f); 
            System.out.println(str);
        }catch(UnsupportedTemporalTypeException e){
            System.out.println(e);
        }
        
        System.out.println("date: "+date+" time: "+time);
    }
}