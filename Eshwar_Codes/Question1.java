/* 1-> Create 1st class, where a class has one method that takes 2 integers as parameters and returns an integer denoting their sum.
Create 2nd class that inherits from a superclass of the first class.
Again 3rd class and here print the output of the first class method with the help of 2nd class object. 
 */
class FirstClass{
    public int method(int a, int b){
        return a+b;
    }
}
class SecondClass extends FirstClass{

}
class ThirdClass{
    public static void implement(){
        FirstClass obj = new SecondClass();
        System.out.println(obj.method(10,20)); //10+20
    }
    
}
public class Question1{
    public static void main(String[] args){
        ThirdClass.implement();
    }
}