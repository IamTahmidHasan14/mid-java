import java.util.Scanner;
public class Simplify {
    private int gcd(int a, int b) {
        int c;
        while(b != 0) {
	        a %= b;
	        c = a;
	        a = b;
	        b = c;
        }
        return a;
    }
    public String simplifyFraction(int numerator, int denominator) {
        int g = gcd(numerator, denominator);
        return (numerator / g) + " / " + (denominator / g);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        Simplify simplify = new Simplify();
        System.out.println(simplify.simplifyFraction(numerator, denominator)
       );
    }
}
