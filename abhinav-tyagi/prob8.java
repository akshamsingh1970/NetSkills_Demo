public class prob8 {
  public static void main(String[] args) {

    // Get the year from the user
    int year = 1990;

    // Check if the year is divisible by 4
    if (year % 4 == 0) {

      // Check if the year is divisible by 100
      if (year % 100 != 0) {

        // The year is a leap year
        System.out.println("The year " + year + " is a leap year.");

      } else {

        // The year is not a leap year if it is divisible by 100 but not by 400
        if (year % 400 != 0) {

          System.out.println("The year " + year + " is not a leap year.");

        } else {

          // The year is a leap year if it is divisible by 400
          System.out.println("The year " + year + " is a leap year.");

        }
      }

    } else {

      // The year is not a leap year if it is not divisible by 4
      System.out.println("The year " + year + " is not a leap year.");

    }
  }
}
