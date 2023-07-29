import javax.swing.JOptionPane;   
public class Analysis {
  public static void main( String args[] ) 
  {
       int passes = 0, failures = 0, student = 1, result;          
       String input, output;  
       while ( student <= 5 ) {
          input = JOptionPane.showInputDialog( "Enter result (1=pass, 2=fail)" );
          result = Integer.parseInt( input );
          if ( result == 1 )
             passes = passes + 1;
          else
             failures = failures + 1;
           student = student + 1;
         }
         output = "Passed: " + passes + "\nFailed: " + failures;
         if ( passes >= 4 )
            output = output + "\nRaise Tuition";  
         JOptionPane.showMessageDialog( null, output, "Analysis of Examination Results", JOptionPane.INFORMATION_MESSAGE );     
         System.exit( 0 );
      } 
   }
