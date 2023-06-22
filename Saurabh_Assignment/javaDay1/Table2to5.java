// Write a program to print the table of 2 to 5 numbers.

class Prob{
    public static void solve(){
        for(int i=2; i<=5; i++){
            System.out.println("\n"+i+"s table");
            for(int j=1; j<=10; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}

class Table2to5{
    public static void main(String args[]){
        Prob p = new Prob();
        p.solve();
    }
}