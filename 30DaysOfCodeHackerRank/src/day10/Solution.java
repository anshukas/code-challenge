package day10;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = Integer.toBinaryString(n);
        
        System.out.println(binary);
        
        int counter = 0;
        int result = 0;
        for (int i=0; i < binary.length(); i++)
            if(binary.charAt(i) == '0')
            	counter = 0;
            else{
            	counter++;
            	result = Math.max(result, counter); 
            }
        System.out.println(result);

        scanner.close();
    }
}

