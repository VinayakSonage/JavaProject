package Programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int count=0;
		if (num==1) {
			count++;
		}
		else
		
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				count++;
				
			}}
			if (count==0) {
				System.out.println(num+"it is a prime number");
			
			}
			else {
				System.out.println(num+"it is not a prime number");
				
			}
				
			
		}
	

}
