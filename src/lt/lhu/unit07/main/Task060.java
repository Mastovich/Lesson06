package lt.lhu.unit07.main;

import java.util.Random;

public class Task060 {

	public static void main(String[] args) {
		int[] ar = new int[8];
		Random rand = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(20);
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println();
		
		int min, temp;
		for (int i = 0; i < ar.length - 1; i++) {
			min = i;
			for (int y = i; y < ar.length; y++) {
				if (ar[y] > ar[min]) {
					min = y;
				}
			}
		temp = ar[i];
		ar[i] = ar[min];
		ar[min] = temp;
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		
		System.out.println();

	}

}
