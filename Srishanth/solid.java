import java.util.Scanner;

public class solid {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows (odd number): ");
int rows = scanner.nextInt();

int spaces = rows / 2;
int stars = 1;

for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= spaces; j++) {
System.out.print(" ");
}

for (int j = 1; j <= stars; j++) {
System.out.print("*");
}

System.out.println();

if (i <= rows / 2) {
spaces--;
stars += 2;
} else {
spaces++;
stars -= 2;
}
}
}
}