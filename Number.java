//* @authors (Matan Shabi  + Oren Ben David )
public class Number {
	private int value;

	public Number(int value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public int getNoOfDigits() {
		int noOfDigits = 0;
		int temp = Math.abs(value);
		do {
			if (temp == 10) {
				noOfDigits += 2;
				break;
			}
			temp = temp / 10;
			noOfDigits++;
		}
		while (temp >= 1);
		return noOfDigits;
	}

	public int getDigit(int digitNum)
	{

		int n;
		int number = Math.abs(value);

			do {

				n = number % 10;
				number = number / 10;
				if (number == 0 && digitNum > 0) {
					n = -1;
					break;
				}
				digitNum--;
			} while (digitNum >= 0);


		return n;
	}


}
