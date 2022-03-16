
package egyptian.league.management.system;
import java.awt.event.ActionListener;
import javax.swing.*; 
public abstract class Abstractmatch extends JFrame implements ActionListener  {
 JLabel j1 = new JLabel();
 JPanel p2 = new JPanel();
 JButton b0 = new JButton("   EGYPTIAN PREMIER LEAGUE  2020/2021 ");
 JButton b1 = new JButton(" CERAMICA  CLEOPATRA ");
 JButton b2 = new JButton(" ASWAN ");
 JButton b3 = new JButton(" ZAMALEK ");
 JButton b4 = new JButton(" ALEX  UNION ");
 JButton b5 = new JButton(" WADI  DEGLA "); 
 JButton b6 = new JButton(" AL_AHLY ");
 JButton b7 = new JButton(" ENPPI ");
 JButton b8 = new JButton(" ESMAILI ");
 JButton b9 = new JButton(" ELGOUNA ");
 JButton b10 = new JButton(" SMOUHA ");
 JButton b11= new JButton(" EGYPTIAN ");
 JButton b12 = new JButton(" MAHALLA  YARN ");
 JButton b13 = new JButton(" PYRAMIDS ");
 JButton b14= new JButton(" VANGUARDS  OF  THE ARMY ");
 JButton b15 = new JButton(" MILITARY  PRODUCTION ");
 JButton b16 = new JButton(" AHLI  BANK ");
 JButton b17= new JButton(" THE  ARAB  CONTRACTORS ");
 JButton b18 = new JButton(" EGYPT  OF  CLEARING "); 
 int time=0,stadium=1;
 JFrame f0 =new JFrame();
 JFrame f1 =new JFrame();
 JFrame f2 =new JFrame();
 JFrame f3 =new JFrame();
 JFrame f4 =new JFrame();
 JFrame f5 =new JFrame();
 JFrame f6 =new JFrame();
 JFrame f7 =new JFrame();
 JFrame f8 =new JFrame();
 JFrame f9 =new JFrame();
 JFrame f10 =new JFrame();
 JFrame f11=new JFrame();
 JFrame f12 =new JFrame();
 JFrame f13 =new JFrame();
 JFrame f14 =new JFrame();
 JFrame f15 =new JFrame();
 JFrame f16 =new JFrame();
 JFrame f17 =new JFrame();
 JFrame f18 =new JFrame();
JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
 
 
 //Display Details
  public abstract void display();
  
  
  //First Add Operation
  public abstract void set_add(JFrame y,JLabel l,JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel l5);
  
 
  //First Add Operation
  public abstract void set_add(int z,JFrame f,JTextField t1,JTextField t2,JTextField t3,JTextField t4
          ,JTextField t5,JTextField t6,JTextField t7,JTextField t8,JTextField t9,JTextField t10,JTextField t11
          ,JTextField t12,JTextField t13,JTextField t14,JTextField t15,JTextField t16,JTextField t17);
  //First Add Operation
  public abstract void set_add(JFrame f,JButton b1,JButton b2,JButton b3 ,JButton b4,JButton b5,JButton b6,JButton b7
          ,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16
          ,JButton b17,JButton b18);
  //For Closing
  public abstract void close(JFrame f1,JFrame f2,JFrame f3,JFrame f4,JFrame f5 
          ,JFrame f6,JFrame f7,JFrame f8,JFrame f9,JFrame f10,JFrame f11
          ,JFrame f12,JFrame f13, JFrame f14,JFrame f15,JFrame f16,JFrame f17,JFrame f18);
  //Refree Name
  public void referre(JFrame y)
  {};
  
}
