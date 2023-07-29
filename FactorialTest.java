public class FactorialTest {
    public static int fact(int n) {
	if(n == 0 || n == 1) return 1;
	    return n * fact(n - 1);
    }
    public static void main(String[] args) {
        for(int n = 0; n <= 10; ++n)
	    System.out.printf("%d! = %d\n", n, fact(n));
    }
}
