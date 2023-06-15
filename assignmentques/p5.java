public class p5 {
    public static void main(String args[])
    {
 
        int marks[] = { 100, 65, 100, 98, 78, 65 };
        int max_marks = marks.length * 100;
        int total = 0;
        String grade = "fail";
 
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        double percentage = ((double)(total) / max_marks) * 100;
 
        if (percentage >= 90) {
            grade = "distinction";
        }
        else {
            if (percentage >= 80 && percentage <= 89) {
                grade = "first division";
            }
            else {
                if (percentage >= 60 && percentage <= 79) {
                    grade = "second division";
                }
                else {
                    if (percentage >= 33 && percentage <= 59) {
                        grade = "third division";
                    }
                    else {
                        grade = "fail";
                    }
                }
            }
        }
 
        System.out.println(grade);
    }
}