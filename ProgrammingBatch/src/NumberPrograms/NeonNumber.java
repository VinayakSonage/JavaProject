package NumberPrograms;

import java.util.Scanner;

public class NeonNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int copy=num;
	
     int sum = 0;
     int square = num * num;

     while (square != 0) {
         int digit = square % 10;
         sum += digit;
         square /= 10;
     }

     if (sum == num) {
         System.out.println("Neon Number");
     } else {
         System.out.println("Not a Neon number");
     }
	
}
}
