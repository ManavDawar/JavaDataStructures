package test;

public class largestelse {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		int c = 30;
		
		if(a>=b) {
			if(a>=c) {
				System.out.println(a+"is largest.");
			}else {
				System.out.println(c+"is largest.");
				}
		} else {
			if(b>=c) {
				System.out.println(b+"is largest");
			}else {
				System.out.println(c+"is largest");
				}
			}
		}

}
