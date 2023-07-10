package string;

import java.util.Scanner;

//find out how many uppercase present inside the string?
public class Strings3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter thr input");
	String s=sc.nextLine();
	int uppercount=0;
	//Logic 1
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
			uppercount++;
			
		}
	}
//	//logic 2
//	for (int i = 0; i < s.length(); i++) {
//		if (s.charAt(i)>=65 && s.charAt(i)<=90) {
//			uppercount++;
//			
//		}
//	}
	System.out.println(uppercount);
}
}
