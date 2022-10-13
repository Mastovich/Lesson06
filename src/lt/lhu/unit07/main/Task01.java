package lt.lhu.unit07.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		int n = 12;
		int[] mas = new int[n];
		int sum = 0;
		
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt();
		}
		
		for (int i = 0; i < mas.length; i++) {
			if (i % 3 == 0) {
				sum = sum + mas[i];
				System.out.println(mas[i] + "	kratno");
			} else {
				System.out.println(mas[i] + "	ne kratno");
			}
		}
		
		System.out.println("sum =" + sum);
	}

}
