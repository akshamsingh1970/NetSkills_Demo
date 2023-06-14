class Question1
{
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }
}
class second extends Question1
{
   
}
class third extends second
{

    public static void main(String args[])
    {
        second obj =new second();
    int a=10;
    int b=20;
    obj.sum(a,b);
    }
    
}