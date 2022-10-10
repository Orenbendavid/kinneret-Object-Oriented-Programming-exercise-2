//* @authors (Matan Shabi  + Oren Ben David)
import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of numbers note! you can enter numbers up to that number 2,147,483,647");
		int times  = input.nextInt();
		int[] array = new int[times];

		System.out.println("enter the number of place of the  digit you want from 0-9 ");
		Scanner input2 = new Scanner(System.in);
		int digitNum = input2.nextInt();
		Number num;



		// Loop for reading times number into array
		for (int i = 0; i < times; i++) {
			System.out.println("\nEnter an integer ");
			array[i] = input.nextInt();
		}

		//Loop for printing the same  digit chose by user
		if(digitNum<=9)
		{
			for (int i = 0; i < times; i++) {
				num = new Number(array[i]);
				System.out.printf("the digit in the place you chose is %d placed in array at %d out of %d\n", num.getDigit(digitNum), i+1, times);
			}
		}
		else
		{
			System.out.println("number is too great");
		}

		// Loop for creating Number objects and checking number of digits in all numbers
		for (int i = 0; i< times;i++) {
			num = new Number(array[i]);
			System.out.printf("\nThe number of digits of %d is %d", num.getValue(),num.getNoOfDigits());
		}
		input.close();
		input2.close();
	}
}

