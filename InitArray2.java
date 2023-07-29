import javax.swing.*;
public class InitArray2 {
      public static void main( String args[] )
      {
         int array[] = {18, 32, 94, 37, 98, 19, 33, 11, 00, 67 };   
         String output = "Subscript\tValue\n";      
         for ( int counter = 0; counter < array.length; counter++ )
            output += counter + "\t" + array[ counter ] + "\n";   
         JTextArea outputArea = new JTextArea();
         outputArea.setText( output );   
         JOptionPane.showMessageDialog( null, outputArea, "Initializing an Array with a Declaration", JOptionPane.INFORMATION_MESSAGE );
         System.exit( 0 );
      }
}
