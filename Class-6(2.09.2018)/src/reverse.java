import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
//		int[] arr = { 100, 50, 100, 20, 99, 33, 66 };
//		
//		//logic
//		int hi=arr.length-1;
//		int lo =0;
//		
//		while(lo<hi) {
//			int temp = arr[lo];
//			arr[lo]=arr[hi];
//			arr[hi]=temp;
//			lo++;
//			hi--;
//		}
//		
//		
//		for(int val: arr) {
//			System.out.print(val+" ");
//		}

		 Scanner scn = new Scanner(System.in);
	        int n =scn.nextInt();
	        int[] arr = new int[n];
	        
	        for(int i =0;i<arr.length;i++){
	            arr[i]=scn.nextInt();
	        }
	        int hi=arr.length-1;
	        int lo=0;
	        
	        while(lo<hi){
	            int temp=arr[lo];
	            arr[lo]=arr[hi];
	            arr[hi]=temp;
	            hi--;
	            lo++;
	        }
	        
	        for(int i=0 ; i<arr.length;i++){
	            System.out.print(arr[i]);
	        }
	
	}

}
