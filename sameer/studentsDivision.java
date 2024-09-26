public class studentsDivision {
    public static void main(String[] args) {
        // Division based on student's marks
        System.out.println("Division based on student's marks"); 
        int[] marks = new int[]{ 12, 99, 45, 61, 84, 54, 78};
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] >= 90)
                System.out.println("Marks: " + marks[i] + ", Grade: DISTINCTION");
            else if(marks[i] < 90 && marks[i] >= 80) 
                System.out.println("Marks: " + marks[i] + ", Grade: FIRST DIVISION");
            else if(marks[i] < 80 && marks[i] >= 60) 
                System.out.println("Marks: " + marks[i] + ", Grade: SECOND DIVISION");
            else if(marks[i] < 60 && marks[i] >= 40)
                System.out.println("Marks: " + marks[i] + ", Grade: THIRD DIVISION");
            else 
                System.out.println("Marks: " + marks[i] + ", Grade: FAIL");
        }
    }
}
