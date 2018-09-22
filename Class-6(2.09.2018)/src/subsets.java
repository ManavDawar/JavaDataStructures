import java.util.Scanner;

public class subsets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		subset(arr);
	}

	public static void subset(int[] arr) {
		for (int i = 0; i < (1<<arr.length); i++) {
			 System.out.print("[");
			for(int j=0;j<arr.length;j++){
				  if ((i & (1 << j)) > 0)
	                    System.out.print(arr[j] + " ");
		           
				
			} System.out.println("]");
		}
	}





}
