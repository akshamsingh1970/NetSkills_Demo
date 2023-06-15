interface exam{
     int myMethod(int a);
}

class sum implements exam{
     public int myMethod(int a){
        int sum = 0;
        for (int i=1;i<=a;i++)
	            if (a%i==0){
                    // System.out.printf("%d ",i);
                    sum += i;
                }     
                return sum;
    }
    
}

class sumDivisor{
    public static void main(String[] args){
        sum obj = new sum();
        int e = obj.myMethod(8);
        System.out.println(e);
    }
}

