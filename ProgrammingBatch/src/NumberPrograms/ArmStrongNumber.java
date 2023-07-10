package NumberPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int temp=num;
    int	count=0;
    int flag=num;
    
    int sum=0;
    //count the digit
    while (temp>0) {    
		count++;
		temp=temp/10;
	}
    //separate the digit
    while (flag>0) {
		int last=flag%10;
		int power=1;
	//power of digit
		for (int i = 0; i < count; i++) {
			power=power*last;
		}
    //add the digit
		 sum=sum+power;
		 flag=flag/10;
	}
   //check the base digit and original digit
   if (sum==num) {
	System.out.println("Armstrong Number");
} 
   else {
	System.out.println("not a Aramstrong Number ");
}
}
}
