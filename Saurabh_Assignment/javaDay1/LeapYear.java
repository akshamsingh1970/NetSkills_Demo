// 8-> Write a program to print the given number is leap year or not. Where your number is int year = 1990;

import java.util.*;
class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        solve(year);   
    }

    public static void solve(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("leap year.");
        }else{
            System.out.println("Non leap year.");
        }
    }
}