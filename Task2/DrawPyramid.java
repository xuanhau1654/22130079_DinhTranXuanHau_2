package Task2;

public class DrawPyramid {
	public static void drawPyramid(int n) {
		for (int i = 0; i < n; i++) {
			//
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
//
			for (int j = 0; j < 2 * i+2 ; j++) {
				System.out.print("*");
			}
//
			System.out.println();
		}
	}

	public static void main(String[] args) {
		drawPyramid(4);
	}
}
