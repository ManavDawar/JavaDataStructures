import java.util.Scanner;

public class uniqueno {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int unique =0;
		
		for(int i=0;i<=n;i++) {
			int num =scn.nextInt();
			unique=unique ^ num;
		}
		System.out.println(unique);
		
	}

}
