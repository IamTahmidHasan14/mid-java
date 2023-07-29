import javax.swing.JOptionPane;
public class Test {
  public static void main(String[] args) {
    String options = "1. input numbers\n2. See results\n3. See summary\n4. Exit\n";
    String option;
    do {
      JOptionPane.showMessageDialog(null, options, "Menu",  JOptionPane.INFORMATION_MESSAGE);
      option = JOptionPane.showInputDialog("your options");
    switch(option) {
      case "1": JOptionPane.showMessageDialog(null, "you chose " + option, "chosen", JOptionPane.INFORMATION_MESSAGE);
	    break;
      case "2": JOptionPane.showMessageDialog(null, "you chose " + option, "chosen", JOptionPane.INFORMATION_MESSAGE);
	    break;
      case "3":	JOptionPane.showMessageDialog(null, "you chose " + option, "chosen", JOptionPane.INFORMATION_MESSAGE);
	    break;
      case "4": JOptionPane.showMessageDialog(null, "you chose " + option, "chosen", JOptionPane.INFORMATION_MESSAGE);
				System.out.println("exiting");
	    break;
       }
   } while(!option.equals("4"));
  }
}
