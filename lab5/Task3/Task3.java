import java.util.*;

public class Task3{
	interface TestLength {
	  boolean test(String s1, String s2);
	}
	
	interface IsAlphabet {
	  boolean test(String s1);
	}
	
	public static String betterString(String s1, String s2, TestLength tester) {
	  if (tester.test(s1, s2)) {
		return s1;
	  } else {
		return s2;
	  }
	}

	public static void main(String[] args) {
		TestLength testLength = (s1, s2) -> s1.length() > s2.length();
		System.out.println(betterString("nada","hamed",testLength));
		
		IsAlphabet testAlphabet = (s1) -> {
			for(int i =0; i<s1.length();i++){
				if(!Character.isLetter(s1.charAt(i))){
					return false;
				}
			}
			return true;
		};
		
		System.out.println(testAlphabet.test("asd"));
		
	}
}