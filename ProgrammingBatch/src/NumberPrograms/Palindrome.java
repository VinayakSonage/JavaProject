package NumberPrograms;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
Scanner sc = new	Scanner(System.in);
System.out.println("Enter the number: ");
int num=sc.nextInt();
int copy=num;
int rev=0;
while (num>0) {
	int last=num%10;
	rev=rev*10+last;
	num/=10;
}
 
 if (copy==rev) {
	System.out.println("Number is Palindrome");
} else {
System.out.println("Not a palindrome");
}
}
}
