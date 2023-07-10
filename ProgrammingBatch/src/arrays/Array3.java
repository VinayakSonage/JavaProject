package arrays;

import java.util.ArrayList;
import java.util.TreeSet;


public class Array3 {
public static void main(String[] args) {
	 int[] arr = {9, 2, 1, 8, 6};
	 ArrayList<Integer> oddNumbers = new ArrayList<>();
	 ArrayList<Integer> evenNumbers = new ArrayList<>();

     for (int num : arr) {
         if (num % 2 == 0) {
             evenNumbers.add(num);
         } else {
             oddNumbers.add(num);
         }
     }

     System.out.println("Odd numbers: " + oddNumbers);
     System.out.println("Even numbers: " + evenNumbers);
     
     TreeSet <Integer>oddNum = new TreeSet<Integer>();
     for(int se:oddNumbers)
    	 oddNumbers.add(se);
     System.out.println("Odd numbers (TreeSet): " + oddNum);
     
    
}
}
