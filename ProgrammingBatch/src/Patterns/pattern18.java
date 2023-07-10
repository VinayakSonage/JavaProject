package Patterns;

public class pattern18 {
public static void main(String[] args) {
	 int n=5;
     for (int i = 1; i <=n; i++) { 
    	 for (int j =n*2-1; j >=i; j--) {
    		 System.out.print(" ");
				
			}
         
    	 for (int j = 1; j<=i; j++) {
    		 System.out.print("* ");
		}
    	 System.out.println();
    	 
				
			}
         for (int i = 1; i <=n; i++) {
		 for (int j = n-1; j >=i; j++) {
			 System.out.print(" ");
			 
		for (int j2 = 1; j2 <=n; j2++) {
			System.out.print("* ");
		}
		System.out.println();
		}
    	
     }	
     
}
}
