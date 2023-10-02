package Task1;

public class PascalTriangle {
	
		    public static void printPascalTriangle(int rows) {
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(getPascalTriangle(i, j) + " ");
		            }
		            System.out.println();
		        }
		    }
		    public static int getPascalTriangle(int row, int col) {
		        if (col == 0 || col == row) {
		            return 1;
		        } else {
		            return getPascalTriangle(row - 1, col - 1) + getPascalTriangle(row - 1, col);
		        }
		    }
		    public static void main(String[] args) {
		    	
			}
		}



