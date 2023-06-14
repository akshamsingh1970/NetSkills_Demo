import java.util.Scanner;

public class ThirdMaxValue {
public static void main(String[] args){

// creating an object of scanner
Scanner myObj = new Scanner(System.in);
// creating an array of int datatype
int[] num = new int[8];

System.out.println("Enter the 8 numbers for your array: ");
for(int i=0;i<num.length; i++){
num[i] = myObj.nextInt();
}

int max1 = 0;
int max2 = 0;
int max3 = 0;

for(int i=1; i<num.length;i++){
int val = num[i];

if ( val > max1 ){
max3 = max2;
max2 = max1;
max1 = val;
}
else if( val < max1 && val > max2 ){
max3 = max2;
max2 = val;
}
else if (val < max2 && val>max3) {
max3 = val;
}
}
System.out.print("Third max number in the given array is: " + max3);

}
}