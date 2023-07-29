import java.util.Scanner;
public class PowerMethod {
    public static double computePower(int x, int e) {
	if(e == 0) return 1;
	int p = 1;
	for(int i = 1; i <= Math.abs(e); ++i)
	    p *= x;
	if(e < 0)
	    return 1.0 / p;
	return p;
    }
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int x, e;
	x = scanner.nextInt();
	e = scanner.nextInt();
	double p = computePower(x, e);
	System.out.println(p);
    }
}
