package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicaeAndFIFOOrder {
public static void main(String[] args) {
	 int[] arr = {1, 5, 6, 79, 356, 24, 22, 33, 55, 65, 22, 33, 55};

     // Convert array to ArrayList
     List<Integer> arrayList = new ArrayList<>();
     for (int num : arr) {
         arrayList.add(num);
     }

     // Remove duplicates while maintaining the original order
     HashSet hs = new HashSet<Integer>(arrayList);

     // Print the ArrayList without duplicates
     System.out.println(hs);
     ArrayList alfifo = new ArrayList<>(hs);
     System.out.println(alfifo);
	
	
   
	
}
}
