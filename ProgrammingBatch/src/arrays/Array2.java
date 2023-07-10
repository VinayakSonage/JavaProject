package arrays;
//create a method to return the average of element of array 
public class Array2 {
	public static int average(int [] arr) {
		int sum=0;
		int avg=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		return avg;
		
	}
public static void main(String[] args) {
	int [] arr= {10,20,50,45,60,70};
	System.out.println(average(arr));
}
}
