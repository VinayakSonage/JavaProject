package stringProgram;

import java.util.Scanner;
//1--->String count with consider space
public class String1 {

public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the String");
//	String str=sc.nextLine();
//	int count=0;
//	for (int i = 0; i < str.length(); i++) {
//		count++;
//		
//	}
//	System.out.println(count);
	
  //2--->String Character count without space
	
	
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	int count=0;
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println(count);
}
}
