class evenAndOdd {
    public static void main(String[] arg){
        System.out.println("Even numbers between 1 and 20 are ");
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            System.out.print(" "+i+" ");
        }
        System.out.println();
        System.out.println("Odd numbers between 1 and 20 are ");
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            System.out.print(" "+i+" ");
        }
    }

}

