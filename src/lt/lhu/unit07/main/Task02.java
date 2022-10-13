package lt.lhu.unit07.main;

public class Task02 {

	public static void main(String[] args) {
		int[] mas = new int[] { 28, 90, 0, 55, 77, 51, 98, 25, 62, 0, 0, 65, 73, 0};
		
		int countZero = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZero++;
			}
		}
		
		int[] zeroPositionsArray = new int[countZero];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				zeroPositionsArray[j++] = i;
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		
		System.out.println();
		for (int i = 0; i < zeroPositionsArray.length; i++) {
			System.out.printf("-%d-", zeroPositionsArray[i]);
		}
	}
}
 		