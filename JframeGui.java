import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author bagale
 */
//We use extends keyword to extend/inherit from Jframe
public class JframeGui extends JFrame{
    
    
    //TO ADD THE TITLE WE need to create the CONSTRUCTOR of our class
    //Adding componenys, adding buttons will be done here
    public JframeGui(){
        super("TITLE: LTSA App KRISHNA");
                                    
        //Add button to the screen
        //Set Layout first
        setLayout(new FlowLayout());
        
        //Create text Area
        
        //Create text Lebel
        
        //JLabel jlblwelcome = new JLabel("<html><h1 style=\"color:blue;\">Fill all the informations</h1><br /><hr>", SwingConstants.CENTER);
        JLabel jlblwelcome = new JLabel("<html><h1 style=\"color:blue;\">Fill all the informations</h1><br />");

        JLabel lblfn = new JLabel("<html>First Name: ");
        //lblfn.setText("Hello World"); // We can use this
        //Create text fields
        
        JTextField txt = new JTextField(10);
        
        JLabel lblWelcome = new JLabel("<html><br/></html>");
        
        
        JTextArea txtarea = new JTextArea(5, 2);
        txtarea.setText("Our Text Area");
        txtarea.setForeground(Color.gray);
        
        JCheckBox jcheckbox = new JCheckBox("Agreed with the terms and conditions");
        //JCheckBox jcheckboxlol = new JCheckBox("I want to Pay LOL");

        //create button
        JButton btn = new JButton("Submit");
        btn.setBackground(Color.BLUE);// NOt working
        btn.setForeground(Color.BLUE);
        
        // Adding them to Screen
        add(jlblwelcome);
        add(lblfn);
        add(txt);
        add(txtarea);
        add(jcheckbox);
        //add(jcheckboxlol);
        add(btn);
        //similarly create radiobuttons and so on
        //Work with events and ActionListener
        //KeyListener
        //MouseListener
        //MouseMotionListener
        
        /*Do the Graphics
            Creating Shapes
            Moving objects with keyboard and Mouse
            Inserting Images
        EQUATION SOLVING SIMPLE
        CALCULATOR
        
        */
        
    }
    
    //Jfrmae  has all the classes necessary for GUI
    public static void main(String[] args) {
        // first create class object
        JframeGui obj = new JframeGui();
        // use the functions of JFrame class
        
        //All these set.. methods are from JFrame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close app
        obj.setSize(350, 350);
        obj.setVisible(true);
        
        
        
    
    
    
    }
}
