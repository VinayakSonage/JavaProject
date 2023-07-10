package Patterns;


public class Pattern2 {
	public static void main(String[] args) {
		char ch='@';
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				if (i==1) {
					System.out.print("@");
					
					
				}
				else if (i==2) {
					
					System.out.print("$");
				}
                else if (i==3) {
					
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
