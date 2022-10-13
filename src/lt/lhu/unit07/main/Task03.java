package lt.lhu.unit07.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		int n = 9;
		int[] mas = new int[n];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt();
			System.out.printf("[%d]", mas[i]);
		}
		
		for (int i = 0; i < mas.length-8; i++) {
			if (mas[0] < 0) {
				System.out.println();
				System.out.println("-pervoje nechetnoje- ");
			} else {
				System.out.println();
				System.out.println("-pervoje chetnoje- ");
			}
		}
	}

}
