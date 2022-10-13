package lt.lhu.unit07.main;

public class Task04 {

	public static void main(String[] args) {
		double[] mas = new double[] {0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2, 1.4};
		double k = 0;
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4.1f ]", mas[i]);
		}
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] <= mas[i++]) {
				k = k + 0;
			} else {
				k = k + 1;			
			}
		}
		
		if (k > 1) {
			System.out.println(" posledovatelnost ne vozrastajuschaja ");
		} else {
			System.out.println(" posledovatelnost vozrastajuschaja ");
		}
		
	}

}
