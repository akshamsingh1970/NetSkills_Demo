public class leapYear {
    public static void main(String[] args){

        int year=2002;

        // an year which is divisible either by 4 or 400 but not by 100
        if(year % 400 == 0){
                System.out.println(year + " is a leap year");
        }
        else if (year % 100 == 0){
                System.out.println(year + " is not a leap year");
        }
        else if ( year % 4 == 0){
                System.out.println(year + " is a leap year");
        }
        else{
                System.out.println(year + " is not a leap year");
        }
    }
}
