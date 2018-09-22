
public class subarraysum {

	public static void main(String[] args) {

		int[] arr = { 4, 5, -12, 3, 6, -2, 5, -20, 1, 2, 8 };
		kadans(arr);

	}

	public static void kadans(int[] arr) {
		int cmax = arr[0], omax = arr[0], cstart = 0, cend = 0, ostart = 0, oend = 0;
		for (int i = 1; i < arr.length; i++) {
			if (cmax >= 0) {// for a greater sequence we put equal to
				cmax += arr[i];
				cend++;

			} else {
				cmax = arr[i];
				cend = i;
				cstart = i;

			}
			if (cmax > omax) {//if it is equal we will get later sequence if it is only greater we will get earlier sequence
				omax = cmax;
				ostart = cstart;
				oend = cend;
			}

		}
		System.out.println(omax + " from " + ostart + " to " + oend);

	}

}
