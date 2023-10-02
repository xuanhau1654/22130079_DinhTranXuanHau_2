package Task1;

public class Task1_1 {
	
		// a)
//		public static int getSn1(int n) {
//			if (n == 1) {
//	            return 1;
//	        } else {
//	            int sign = n % 2 == 0 ? -1 : 1;
//	            return sign * n + getSn1(n - 1);
//	        }  
	//}
//		public static void main(String[] args) {
//			System.out.println(getSn1(3));
//		}

		// b)
//		 public static int getSn2(int n) {
//		        if (n == 1) {
//		            return 1;
//		        } else {
//		            return factorial(n) + getSn2(n - 1);
//		        }
//		    }
//		 private static int factorial(int n) {
//		        if (n == 1) {
//		            return 1;
//		        } else {
//		            return n * factorial(n - 1);
//		        }
//		    }
//		 public static void main(String[] args) {
//			System.out.println(getSn2(3));
//		}
	//}

		// c)
//		public static int getSn3(int n) {
//	        if (n == 1) {
//	            return 1;
//	        } else {
//	            return n * n + getSn3(n - 1);
//	        }
//	    }
//		public static void main(String[] args) {
//			System.out.println(getSn3(3));
//		}
	//}

		// d)
		public static double getSn4(int n) {
			if (n == 0) {
				return 1;
			} else {
				return 1 / product(2, n) + getSn4(n - 1);
			}
		}

		private static int product(int start, int end) {
			if (start > end) {
				return 1;
			} else {
				return start * product(start + 2, end);
			}
		}

		public static void main(String[] args) {
			System.out.println(getSn4(3));
		}
	}

