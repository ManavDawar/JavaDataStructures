
public class stringpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		permutations(s);

	}

	public static void permutations(String s) {
		int limit = 1;
		for (int i = 1; i <= s.length(); i++) {
			limit *= i;
		}
		for (int i = 0; i < limit; i++) {
			int info = i;
			String temp = s;
			String res = "";
			for (int div = s.length(); div >= 1; div--) {
				int rem = info % div;
				info = info / div;
				
				res+=temp.charAt(rem);
				temp=temp.substring(0, rem)+temp.substring(rem+1);
			}
			
			
			System.out.println(res);
		}

	}

}
