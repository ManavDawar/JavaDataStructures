import java.util.Scanner;

public class starno {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int cntr=1;
		int c =1;
		while(cntr<=n) {
			int col = 1;
			while(col<=cntr) {
				System.out.print(c+"\t");
				col++;
				c++;
			}
			System.out.println();
			cntr++;
		}

	}

}
