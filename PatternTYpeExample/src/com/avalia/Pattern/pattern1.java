package com.avalia.Pattern;

public class pattern1 {
	public static void main(String[] args) {
		int i;
		int row = 6;
		for (i = 1; i <= row; i++) {
			//for (int space = 1; space <= 6 - i; space++) {
				//System.out.print(" ");
				//}
			int k = 0, n = 1, count = 1, m = i;
			while (k!=((2 * i) - 1)) {
				if (count <= i) {
					System.out.print(((int) (Math.pow(2, (n - 1))))+" ");
					n++;
				} 
				else {
					System.out.print(((int)(Math.pow(2, (m - 1)))) -((int)(Math.pow(2, (m - 2))))+" ");
					m--;
				}
				count++;
				k++;
			}
			System.out.println();
		}
	}



}
