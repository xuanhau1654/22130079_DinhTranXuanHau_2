package Task1;

public class Fibonacci {
	public static int getFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	public static void printFibonacci(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(getFibonacciRecursive(i) + " ");
		}
		System.out.println();
	}

	private static int getFibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
		}
	}

	public static void main(String[] args) {

	}
}
