package test;

import java.util.Scanner;

public class fibonacci3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int t1 = 0, t2 = 1;

		while (t1 <= n)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}

}
