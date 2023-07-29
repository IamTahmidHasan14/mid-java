class Reference {
    int a = 2;
 }
public class MethodArgument {
    public static void gotByValue(int a) {
        a += 1;
    }
    public static void gotByRef(Reference ref) {
	    ref.a += 1;
    }
   public static void main(String[] args) {
       int a = 1;
       System.out.println(a);
       gotByValue(a);
       System.out.println(a);
       Reference reference = new Reference();
       System.out.printf("reference.a = %d\n", reference.a);
       gotByRef(reference);
       System.out.printf("reference.a = %d\n", reference.a);
    }
}
