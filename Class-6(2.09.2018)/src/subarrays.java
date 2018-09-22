
public class subarrays {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };
		subarray(arr);

	}

	public static void subarray(int[] arr) {
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				printAsubarray(arr, start, end);
			}
		}
	}

	public static void printAsubarray(int[] arr, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(".");
	}

}
