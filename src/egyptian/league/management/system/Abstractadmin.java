
package egyptian.league.management.system;
import javax.swing.*;
public abstract class  Abstractadmin {
    JFrame f=new JFrame();
    JLabel j2 = new JLabel();
    JPanel p3 = new JPanel();
    Adminh adminh = new Adminh();
    SignUp s = new SignUp();
    JButton login = new JButton("Log In");
    JButton cancel = new JButton("Cancel");
    JButton signup = new JButton("Sign Up");
    JTextField textn = new JTextField();
    JTextField textp = new JPasswordField();
    JLabel l1 = new JLabel("Username");
    JLabel l2 = new JLabel("Password");
    
    //For Display Data
    public abstract void display();
    
    //For Make Actions
    public abstract void actions();
}
