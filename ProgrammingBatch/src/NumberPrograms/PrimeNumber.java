package NumberPrograms;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int count=0;
	if (num==1) {
		count++;
	} else {
		for (int i = 2; i <num; i++) {
			if (num%2==0) {
				count++;
			}
			
		}
       if (count==0) {
		System.out.println("Prime number");
	} else {
       System.out.println("Not a prime Number");
	}
	}
}
}
