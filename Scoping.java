public class Scoping {
      int x = 1;   
      public void start()
      {
         int x = 5;   
         System.out.println( "local x in start is " + x );
         useLocal();
         useInstance();
         useLocal();
         useInstance();
         System.out.println( "\nlocal x in start is " + x );
      }   
      public void useLocal()
      {
         int x = 25;   
         System.out.println( "\nlocal x in useLocal is " + x + " after entering useLocal" );
         ++x;
         System.out.println( "\nlocal x in useLocal is " + x + " before exiting useLocal" );
      }
      public void useInstance()
      {
         System.out.println( "\ninstance variable x is " + x + " on entering useInstance" );
         x *= 10;
         System.out.println( "\ninstance variable x is " + x + " on exiting useInstance" );
   }
   public static void main(String[] args)
    {
       Scoping scoping = new Scoping();
       scoping.start();
    } 
}
