/*
1-> Create 1st class, where a class has one method that takes 2 integers as parameters and returns an integer denoting their sum.
Create 2nd class that inherits from a superclass of the first class.
Again 3rd class and here print the output of the first class method with the help of 2nd class object. 
*/
class ClassOne{
    public static int sum(int a, int b){
        return a+b;
    }
}

class ClassTwo extends ClassOne{

}

class First{
    public static void main(String args[]){
        ClassTwo obj = new ClassTwo();
        int ans = obj.sum(3,4);
        System.out.println(ans);
    }
}