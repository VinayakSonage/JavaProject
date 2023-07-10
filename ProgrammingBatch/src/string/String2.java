package string;

public class String2 {
public static void main(String[] args) {
	//find the length of the string
	String s="java is a programming language";
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)!=' ') {
			count++;
		}
		
	}
	System.out.println("total charater present inside string:" +count);
}
}
