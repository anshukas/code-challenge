package day11;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        // 
        int max_sum = -9 * 7;
        for (int i=1; i<5; i++){
        	for(int j=1; j <5; j++){
        		int currentSum = getHrsGlassSum(arr,i,j);
        		if(currentSum > max_sum)
        			max_sum = currentSum;
        	}
        }
        System.out.println(max_sum);
        scanner.close();
    }

	private static int getHrsGlassSum(int[][] arr, int row, int col) {
		int sum =0;
		sum += arr[row-1][col-1];
		sum += arr[row-1][col];
		sum += arr[row-1][col+1];
		sum += arr[row][col];
		sum += arr[row+1][col-1];
		sum += arr[row+1][col];
		sum += arr[row+1][col+1];
		return sum;
	}
}

