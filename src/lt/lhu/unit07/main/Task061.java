package lt.lhu.unit07.main;

import java.util.Random;

public class Task061 {

	public static void main(String[] args) {
		int[] ar = new int[8];
		Random rand = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(99);
		}
	
		System.out.print("Original array:\t\t ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println();
		
		boolean sorted = false;
		int temp;
		while(!sorted) {
			sorted = true;
			for (int i = 0; i < ar.length - 1; i++) {
				if (ar[i] > [i+1]) {
					temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
					sorted = false;
				}	
			}
		}
		
		System.out.print("Sorted array;\t\t ");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println();
	}

}
