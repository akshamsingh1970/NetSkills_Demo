package NetSkills_Demo.vinay;

public class leapYear {
    public static void main(String[] args) {
        // Finding leap years
        System.out.println("Finding given year is leap or not");
        int year = 1990;
        Boolean isLeap = isLeapYear(year);
        if(isLeap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    public static Boolean isLeapYear(int n) {
        if(n % 400 == 0)
            return true;
        if(n % 100 == 0)
            return false;
        if(n % 4 == 0)
            return true;
        return false;
    }
}
