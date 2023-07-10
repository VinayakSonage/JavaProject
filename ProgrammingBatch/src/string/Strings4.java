package string;

import java.util.Scanner;

//count the number present inside the given string?
public class Strings4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the input: ");
	String s=sc.nextLine();
	int countvowels=0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			countvowels++;
		}
		else if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			countvowels++;
		}
	}
	System.out.println(countvowels);
}
}
