import java.util.Scanner;

public class turnkoff {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int k = scn.nextInt();
		System.out.println(Integer.toBinaryString(n));
		
		int bitmask =1<<k;
//		System.out.println(Integer.toBinaryString(bitmask));
//		int z= - bitmask;
//		System.out.println(Integer.toBinaryString(~));
		int y = n & ~bitmask;
		System.out.println(Integer.toBinaryString(~bitmask));
		System.out.println(Integer.toBinaryString(y));

	}

}
