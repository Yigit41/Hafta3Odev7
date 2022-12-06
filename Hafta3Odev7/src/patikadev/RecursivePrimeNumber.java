package patikadev;

import java.util.Scanner;

public class RecursivePrimeNumber {
	static boolean primeCheck(int n, int i) {
		if (n <= 2) {
			return (n == 2) ? true : false;

		}
		if (n % i == 0)
			return false;
		else if (i * i > n)
			return true;

		return primeCheck(n, i + 1);
	}

	public static void main(String[] args) {
		System.out.println("Please Enter A Number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (primeCheck(number, 2))
			System.out.println("The number entered is a \"prime\" number.");
		else
			System.out.println("The number entered is \"not a prime\" number.");

	}

}
