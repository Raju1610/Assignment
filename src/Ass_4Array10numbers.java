
public class Ass_4Array10numbers {
// 3)create an array of 10 numbers (any 10 numbers) and print out the average of 5th and 6th value..

	public static void main(String[] args) {

		int[] numbers = { 12, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int fifth = numbers[4];
		int sixth = numbers[5];

//		calculate average
		double average = fifth + sixth / 2;

//		print number 5 & 6 with average

		System.out.println(" Fifth number " + fifth);
		System.out.println("sixth number " + sixth);
		System.out.println("Average of 5th and 6th number " + average);

	}

}
