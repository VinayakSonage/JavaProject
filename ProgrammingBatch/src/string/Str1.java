package string;

public class Str1 {
public static void main(String[] args) {
	String s="hello";
	String s1="";
	for (int i = 0; i < s.length(); i++) {
		s1+=s.charAt(i);
	}
 System.out.println(s1);
}
}
