package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int count=0;
		int i =2;
		
		while(i*i<=n) {
			if(n%i == 0) {
				System.out.println(n+"Not prime");	
				return;
			}
			i++;
		}
		System.out.println(n+"Prime");
		
	}
		

}

