import java.util.Scanner;

public class inversesecond {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int[] inv = new int[arr.length];
		boolean bn = false;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			inv[i] = scn.nextInt();
		}
		inv(arr, inv, bn);
		
	}

	public static void inv(int[] arr, int[] inv, boolean bn) {
		for (int i = 0; i < arr.length; i++) {
			if (i == inv[arr[i]]) {
				bn = true;
			} else {
				bn = false;
			}
		}System.out.println(bn);

	}

}
