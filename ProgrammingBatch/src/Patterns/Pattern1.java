package Patterns;
 import java.util.Iterator;
public class Pattern1 {
	public static void main(String[] args) {
		char ch='A';
		for (int i = 1; i <=4; i++) {
			if (ch=='K') {
				ch='a';
				
			}
			for (int j = 1; j <=5; j++) {
				System.out.print(ch+ " ");
				ch++;
				
			}
			 System.out.println();
		}
	
	}

}
