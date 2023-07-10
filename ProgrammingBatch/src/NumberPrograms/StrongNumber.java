package NumberPrograms;

import java.util.Scanner;

public class StrongNumber {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int copy=num;
	int sum=0;
	while (num>0) {
		
		int last=num%10;
		int fact=1;
		for (int i = 1; i <=last; i++) {
			fact*=i;
			
			
		}
		sum+=fact;
		num/=10;
	}
	
	if (copy==sum) {
		System.out.println("Number is strong");
	}
	else {
		System.out.println("not a strong number");
	}
}
}
