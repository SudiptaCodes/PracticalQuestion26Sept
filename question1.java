package FirstjavaTest;

public class SumofOddNumbers {

	public static void main(String[] args) {

		int initial = 7; // this is the starting range of the given number
		int end = 21; // this is the ending range of the given number

		int sum = 0;

		System.out.println("the odd numbers between" + initial + "&" + end + "is");

		for (int i = initial; i <= end; i++)// here we are applying the loop

			
		{
			if (i % 2 != 0) { // here we are checking the no is odd or not
				System.out.println(i + " ");
				sum += i;

			}
		}
		System.out.println("sum of the odd numbers between the range" + sum);
	}
}