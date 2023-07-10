package ArmStrongNumber;

public class Factorial {
	
	public static int getFactValue(int num) {
		 if (num>1) {
			 return num * getFactValue(num-1);
		 }
		 return 1;
	}
	public static int getDigitSum(int num) {
		if(num>10) {
			return num%10 + getDigitSum(num/10);
		}
		return num;
	}
	public static int getDigitProd(int num) {
		if (num>10) {
			if (num%10==0) {
				return 1*getDigitProd(num/10);
			}
			return num%10 *getDigitProd(num/10);
			//return (num%10==0)?1*getDigitProd(num/10):num%10 *getDigitProd(num/10);
		}
		return num;
	}
 static public void main(String[] args) {
	System.out.println(getFactValue(5));
	System.out.println("5631852 : "+getDigitSum(5631852));
	System.out.println("2025 : "+getDigitProd(202));
}
	
}


