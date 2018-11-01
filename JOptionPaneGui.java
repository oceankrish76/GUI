
import javax.swing.JOptionPane;
/**
 *
 * @author bagale
 */
public class JOptionPaneGui {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog(null, "Enter your name: ");
        JOptionPane.showMessageDialog(null, "Your name is " + name);
    }
    
}
