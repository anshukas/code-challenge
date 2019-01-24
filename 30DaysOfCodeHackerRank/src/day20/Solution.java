package day20;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numberOfSwaps = 0;
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		
		//write the code
		for (int i = 0; i < n; i++) {
			for (int j=0; j< n-1; j++){
				if(a[j] > a[j+1]){
					//swap(a[j],a[j+1]);
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					numberOfSwaps++;
				}
			}
		}
		
		/*for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");*/
		
		System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[n-1]);
		
	}
}
