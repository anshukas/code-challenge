package day06;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tCase = sc.nextInt();
		
		while(tCase-- != 0){
			String evenStr = "";
			String oddStr = "";
			String line = sc.next();
			char[] charArray = line.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if(i % 2 == 0)
					//System.out.println(charArray[i]);
					evenStr += charArray[i];
				else
					//System.out.println(charArray[i]);
					oddStr += charArray[i];
			}
			System.out.println(evenStr+" "+oddStr);
		}
	}
}
