package Patterns;

public class Pattern13 {
public static void main(String[] args) {
	for (int i = 1; i <=10; i++) {
		if (i%2!=0) {
		for (int k= 10 -i; k > 1; k--) {
			System.out.print(" ");
		} 
		
			for (int j = 1; j >=i; j++) {
				System.out.print("* ");
			}
			
		}
		System.out.println();
	}

}
}
