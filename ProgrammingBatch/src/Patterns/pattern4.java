package Patterns;
import java.util.Iterator;
public class pattern4 {
	public static void main(String[] args) {
		int n=1;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				if (i==4 && j==4) {
					System.out.print(0);
				}
				else {
					System.out.print(n+" ");
					n++;
				}
				
					System.out.print(n+" ");
					n++;
					}
		
			System.out.println();
			}
			
		}
		
	}

