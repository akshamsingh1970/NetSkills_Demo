// 4-> Write a program to print the even and odd numbers between 1 to 20.

class EvenOdd{
    public static void main(String args[]){
        System.out.println("Even numbers b/w 1 and 20: ");
        for(int i=1; i<=20; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers b/w 1 and 20: ");
        for(int i=1; i<=20; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}