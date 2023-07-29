public class MethodOverload {
     public static int square(int x) {
	return x * x;
     }
     public static double square(double x) {
	return x * x;
     }
     public static int sumOfSquares(int n) {
	int s = 0;
	for(int i = 1; i <= n; ++i)
	    s += square(i);
       return s;
    }
    public static double sumOfSquares(int n, double incr) {
	double s = 0;
	for(double i = 0; i <= n; i += incr)
	    s += square(i);
	return s;
    }
    public static void main(String[] args) {
	System.out.printf("sum of square upto 10 is %d\n", sumOfSquares(10));
    System.out.printf("sum of square upto 10 with 0.5 increment is %f\n", sumOfSquares(10, 0.5));
    }
}
