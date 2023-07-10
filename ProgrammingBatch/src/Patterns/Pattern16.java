package Patterns;

import java.util.Scanner;

public class Pattern16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of rows:");
	int num=sc.nextInt();
	for (int r = 1; r <=num; r++) {
		if (r<=num/2) {
			for (int c = 1; c <r; c++) {
				System.out.print("* ");
			}
		}
		else {
			for (int c = r; c <=num; c++) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	
	
}
}
