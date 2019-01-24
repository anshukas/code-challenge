package day03;

import java.util.Scanner;

public class Solution {
	  private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int reminder = N % 2;
	        if(reminder == 0){
	            //even
	        	if(N>=2 && N<=5)
	        		System.out.println("Not Weird");
	        	if(N>=6 && N<=20)
	        		System.out.println("Weird");
	        	if(N > 20)
	        		System.out.println("Not Weird");
	        }else{
	            //odd
	            System.out.println("Weird");
	        }

	        scanner.close();
	    }
}
