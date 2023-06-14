class StudentMarks{
    public static void main(String[] args){
        solve1(28);
    }

    public static void solve1(int percent){
        System.out.println("Percentage got "+percent);
        if(percent > 90){
            System.out.println("Grade: Distinction!!!");
        }else if(percent > 80){
            System.out.println("Grade: first div!!!");
        }else if(percent > 60){
            System.out.println("Grade: second div!!!");
        }else if(percent > 33){
            System.out.println("Grade: third div!!!");
        }else{
            System.out.println("Grade: Fail!!!");
        }
    }
}