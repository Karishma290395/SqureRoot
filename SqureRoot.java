package test5;

public class SqureRoot {

	public static void main(String[] args) {

		int number = 576;
		int firstDigit = -1;
		int secondDigit = -1;
		int firstDigitMultiplied = 0;
		boolean chooseHigher = false;
		int counter = 0;
		int arrayNumber[] = { 5, 7, 6 };
		int squares[] = new int[11];
		int lastDigit[] = new int[5];

		for (int k = 0; k <= 10; k++) {
			System.out.println(k * k);
			squares[k] = k * k;
		}

		for (int j = 0; j < 10; j++) {
			int mod = squares[j] % 10;
			if (mod == arrayNumber[2]) {
				lastDigit[counter] = j;
				counter++;
			}
			if (arrayNumber[0] < squares[j] && firstDigit == -1) {
				firstDigit = j - 1;
				firstDigitMultiplied = firstDigit * (firstDigit + 1);
			}
		}
		if (firstDigitMultiplied < arrayNumber[0]) {
			chooseHigher = true;
		}
		if (chooseHigher) {
			secondDigit = lastDigit[1];
		} else
			secondDigit = lastDigit[0];

		System.out.println("The Square root of " + number + " :" + firstDigit + secondDigit);
	}
}