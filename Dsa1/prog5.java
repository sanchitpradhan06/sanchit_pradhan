 import java.util.Scanner;

public class prog5 {
	public static int sum_Of_Digits(int n) {
		int rem;
		int c = n;
		int sum = 0;
		while (c > 9) {
			sum = 0;
			while (c != 0) {
				rem = c % 10;
				sum += rem;
				c = c / 10;
			}
			c = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		System.out.println("Sum of digits of " + n + " until the number is a single digit is " + sum_Of_Digits(n));
		sc.close();
	}
}