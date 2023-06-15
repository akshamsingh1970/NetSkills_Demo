public class third
{ public static void main(String args[])
{int[] arr = {22, 100, 44, 11, 22, 100, 77, 44, 11};

int firstMax = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;
int thirdMax = Integer.MIN_VALUE;

for (int num : arr) {
if (num > firstMax) {

thirdMax = secondMax;
secondMax = firstMax;
firstMax = num;
} else if (num > secondMax && num < firstMax) {
thirdMax = secondMax;
secondMax = num;
} else if (num > thirdMax && num < secondMax) {
thirdMax = num;
}
}

System.out.println("Third maximum element: " + thirdMax);}}