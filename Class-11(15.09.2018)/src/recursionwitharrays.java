
public class recursionwitharrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 23, 56, 15, 56, 6 };
		int[] arr1 = { 1, 2, 3, 4, 0 };

		int[] indices = allIndices(arr, 56, 0, 0);
		int[] rev = inverse(arr1, 0);

		for (int val : indices) {
			System.out.print(val + " ");
		}
		System.out.println();
		for (int val : rev) {
			System.out.print(val + " ");
		}
//		displayR(arr, 0);
//		System.out.println(max(arr,0));
//		System.out.println(findStupid(arr, 56, 0));
//		System.out.println(findSmart(arr, 56, 0));
//		System.out.println(firstIndex(arr, 56, 0));
//		System.out.println(lastIndex(arr, 56, 0));

	}

	public static void displayR(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		displayR(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	public static int max(int[] arr, int vidx) {

		if (vidx == arr.length - 1) {
			return arr[vidx];
		}
		int misa = max(arr, vidx + 1);
		if (misa > arr[vidx]) {
			return misa;
		} else {
			return arr[vidx];
		}

	}

	public static boolean findStupid(int[] arr, int data, int vidx) {

		if (vidx == arr.length) {
			return false;
		}

		boolean fin = findStupid(arr, data, vidx + 1);
		if (fin == true) {
			return true;
		} else {
			if (arr[vidx] == data) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean findSmart(int[] arr, int data, int vidx) {

		if (vidx == arr.length) {
			return false;
		}

		if (arr[vidx] == data) {
			return true;
		} else {
			boolean fin = findStupid(arr, data, vidx + 1);
			return fin;
		}
	}

	public static int firstIndex(int[] arr, int data, int vidx) {

		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == data) {
			return vidx;
		} else {
			int first = firstIndex(arr, data, vidx + 1);
			return first;
		}

	}

	public static int lastIndex(int[] arr, int data, int vidx) {

		if (vidx == arr.length) {
			return -1;
		}

		int last = lastIndex(arr, data, vidx + 1);
		if (last == -1) {
			if (arr[vidx] == data) {
				return vidx;
			} else {
				return -1;
			}
		} else {
			return last;

		}
	}

	public static int[] allIndices(int[] arr, int data, int vidx, int fsf) {

		if (vidx == arr.length) {
			int[] ba = new int[fsf];
			return ba;
		}
		if (arr[vidx] == data) {
			int[] res = allIndices(arr, data, vidx + 1, fsf + 1);
			res[fsf] = vidx;
			return res;

		} else {
			int[] res = allIndices(arr, data, vidx + 1, fsf);
			return res;
		}

	}

	public static int[] inverse(int[] arr1, int vidx) {
		if (vidx == arr1.length) {

			int[] ba = new int[arr1.length];
			return ba;
		}
		int[] res = inverse(arr1, vidx + 1);
		res[arr1[vidx]] = vidx;
		return res;
	}

}
