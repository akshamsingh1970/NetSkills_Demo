public class prime{
	public static void main(String[] args){
	    int a =0;
	    for(int n = 2; n<=20; n++){
		for(int i=2; i<=n; i++){
		    if(n%i == 0){
		        a++;
		    }
		 
		}
		if(a<2){
		    System.out.println(n + "");
		}
		a =0;
		}
		
		}

}
