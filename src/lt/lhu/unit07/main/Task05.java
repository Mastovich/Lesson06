package lt.lhu.unit07.main;

public class Task05 {

	public static void main(String[] args) {
		int[] mas = new int[] {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
		
		int newMass = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				newMass++;
			}
		}
		
		int[] mass = new int[newMass];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				mass[j++] = mas[i];
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{ %d }", mas[i]);
		}
		
		System.out.println();
		for (int j = 0; j < mass.length; j++) {
			System.out.printf(" [%d] ", mass[j]);
		}
	}

}
