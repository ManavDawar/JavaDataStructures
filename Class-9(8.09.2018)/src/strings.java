
public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
//		printChars(s);
		printsubStrings(s);
//		System.out.print(isPallindrome(s));
//		palindromicSubstrings(s);

	}

	public static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printsubStrings(String s) {
//		for(int i=0;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//				for(int k=i;k<=j;k++) {
//					System.out.print(s.charAt(k)+" ");
//				}System.out.println();
//			}
//		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}

	public static boolean isPallindrome(String s) {
		boolean bn = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}

		}
		return true;

	}

	public static void palindromicSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				if (isPallindrome(ss) == true) {
					System.out.println(s.substring(i, j));
				}

			}
		}

	}

}
