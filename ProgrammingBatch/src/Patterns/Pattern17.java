package Patterns;

import java.util.Scanner;

public class Pattern17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of rows:");
	int num=sc.nextInt();
	for (int r = 1; r <=num; r++) {
		if (r<=num/2) {
			for (int c = 1; c <=num/2; c++) {
				System.out.print("  ");
			}
		//	for (int k = 1; k < c; k++) {
				System.out.print("* ");
			}
		}
	//	else {
			if (num%2==1) {
				num -=1;
			 }
		//	for (int k = num/2; k <=c; c++) {
				System.out.print(" ");
			}
		//}
		//System.out.println();
	//}
	
	
}
//}
