class tableOf2and5 {
    public static void main(String[] arg){
        for(int i=2;i<=5;i++)
        {
        System.out.println(i+" Table ");
        print_table(i);
        }
    }
    static void print_table(int n){
        for(int i=1;i<=10;i++)
        {
            System.out.print(" "+n*i+" ");
        }
        System.out.println();
    }
}