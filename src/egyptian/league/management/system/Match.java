
package egyptian.league.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*; 
public class Match extends Abstractmatch {

 public Match()
{
}
  @Override
 public void display()
 {
 f0.setTitle("  MATCHS DETAILS  ");
 f0.setSize(1500,1000);
 f0.setLocation(0,4);
 f0.setVisible(true);
 set_add(f0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
  
 j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
           p2.add(j1);
            f0.add(p2);
            f0.validate();
  //b0.setBounds(530,120,550,35);b0.setBackground(Color.CYAN);b0.setForeground(Color.WHITE);
b1.setBounds(650,165,200,30);b2.setBounds(650,200,200,30);b3.setBounds(650,235,200,30);b4.setBounds(650,270,200,30);b5.setBounds(650,305,200,30);
b6.setBounds(650,340,200,30);b7.setBounds(650,375,200,30);b8.setBounds(650,410,200,30);b9.setBounds(650,445,200,30);b10.setBounds(650,480,200,30);
b11.setBounds(650,515,200,30);b12.setBounds(650,550,200,30);b13.setBounds(650,585,200,30);b14.setBounds(650,620,200,30); b15.setBounds(650,655,200,30);
b16.setBounds(650,690,200,30);b17.setBounds(650,725,200,30);b18.setBounds(650,760,200,30);
b1.setBackground(Color.BLACK);b1.setForeground(Color.WHITE);b2.setBackground(Color.BLACK);b2.setForeground(Color.WHITE);
b3.setBackground(Color.BLACK);b3.setForeground(Color.WHITE);b4.setBackground(Color.BLACK);b4.setForeground(Color.WHITE);
b5.setBackground(Color.BLACK);b5.setForeground(Color.WHITE);b6.setBackground(Color.BLACK);b6.setForeground(Color.WHITE);
b7.setBackground(Color.BLACK);b7.setForeground(Color.WHITE);b8.setBackground(Color.BLACK);b8.setForeground(Color.WHITE);
b9.setBackground(Color.BLACK);b9.setForeground(Color.WHITE);b10.setBackground(Color.BLACK);b10.setForeground(Color.WHITE);
b11.setBackground(Color.BLACK);b11.setForeground(Color.WHITE);b12.setBackground(Color.BLACK);b12.setForeground(Color.WHITE);
b13.setBackground(Color.BLACK);b13.setForeground(Color.WHITE);b14.setBackground(Color.BLACK);b14.setForeground(Color.WHITE);
b15.setBackground(Color.BLACK);b15.setForeground(Color.WHITE);b16.setBackground(Color.BLACK);b16.setForeground(Color.WHITE);
b17.setBackground(Color.BLACK);b17.setForeground(Color.WHITE);b18.setBackground(Color.BLACK);b18.setForeground(Color.WHITE);

b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);
b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);b10.addActionListener(this);
b11.addActionListener(this);b12.addActionListener(this);b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);
b16.addActionListener(this);b17.addActionListener(this);b18.addActionListener(this);

 }

    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==b1)
    {
    close(f0,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);  
 
        //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField (" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 14:30   16-1-21 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 14:30    2-1-21 ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 19:30 11-12-20 ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19:30 11-12-20 ");
 JTextField t15 = new JTextField(" 17:30 16-12-20 ");
 JTextField t16 = new JTextField(" 17:30 12-1-21");
 JTextField t17 = new JTextField(" -------------------- ");

 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" PETROSPORTS");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" ALEX ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" NEW SUEZ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField("AL-AHLY WE PEACE ");
 JTextField s15 = new JTextField(" NEW SUEZ ");
 JTextField s16 = new JTextField(" THE ARAB CONTACTORS ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f1); 
set_add(time,f1,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f1,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f1,l,l1,l2,l3,l4,l5);

    f1.setTitle(" CERAMICA CLEOPATRA  MATCHES DETAILS ");
    f1.setSize(1500,1000);f1.setLocation(0,4);f1.setVisible(true);
     
     //to show buttons
     b1.setBounds(20, 220, 200, 500);
     
    b2.setBounds(350,165,200,30);b3.setBounds(350,210,200,30);b4.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
    set_add(f1,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
       
    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
           p2.add(j1);
            f1.add(p2);
            validate();

    } 
    else if(ae.getSource()==b2)
    {
        close(f0,f1,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField("17:30 29-10-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField("14:30 11-12-20 ");
 JTextField t7 = new JTextField("17:00 15-10-20 ");
 JTextField t8 = new JTextField("14:30 25-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 19:30 21-12-20 ");
 JTextField t11 = new JTextField(" 14:30 14-1-21 ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 14-30 16-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 14:30 9-1-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" POLICE UNION ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" PETRO SPORTS ");
 JTextField s7 = new JTextField(" ISMAILIA ");
 JTextField s8 = new JTextField(" RAILROAD ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" RAILROAD ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField("RAILROAD");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" THE ARAB CONTRACTORS");
 
 referre(f2);
set_add(time,f2,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f2,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f2,l,l1,l2,l3,l4,l5);

    f2.setTitle(" ASWAN  MATCHES DETAILS ");
    f2.setSize(1500,1000);f2.setLocation(0,4);f2.setVisible(true);
     
    b2.setBounds(20, 220, 200, 500);
 b1.setBounds(350,165,200,30);b3.setBounds(350,210,200,30);b4.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
 b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
 b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
 b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
 set_add(f2,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);

     j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f2.add(p2);
            validate();
    } 
    
    else if(ae.getSource()==b3)
    {
       close(f0,f1,f2,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
        
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 19:30 28-12-20 ");
 JTextField t6 = new JTextField(" 19:30 2-1-21 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 19:30 2-1-21 ");
 JTextField t10 = new JTextField(" 19:30 9-1-21 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 19:30 17-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" 19:30 9-1-21 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" BURJ ALARAB ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" BURJ ALARAB ");
 JTextField s10 = new JTextField(" THE ARMY IN SUEZ ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" AIR DEFENSE ");
 JTextField s13 = new JTextField(" THE ARMY IN SUEZ ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" MILITARAY COLLEGE");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f3); 
set_add(time,f3,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f3,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f3,l,l1,l2,l3,l4,l5);

    f3.setTitle(" ZAMALEK  MATCHES DETAILS ");
    f3.setSize(1500,1000);f3.setLocation(0,4);f3.setVisible(true);
     
     b3.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b4.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
      
    set_add(f3,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);

         j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f3.add(p2);
            validate();
    } 
    else if(ae.getSource()==b4)
    {
        close(f0,f1,f2,f3,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 17:30 29-10-20 ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 17:00 11-1-2 ");
 JTextField t6 = new JTextField(" 17:00 27-12-20 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 15-1-21 ");
 JTextField t9 = new JTextField(" 17:00 18-12-20 ");
 JTextField t10 = new JTextField(" 17:00 7-1-21 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 17:00 12-12-20 ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" 17:00 2-1-21 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" POLICE UNION");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE");
 JTextField s6 = new JTextField(" ALEX ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" KHALED BESHARA ");
 JTextField s9 = new JTextField(" ALEX ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" AIR DEFENSE ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" SPORTS DEVICE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f4); 
set_add(time,f4,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f4,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f4,l,l1,l2,l3,l4,l5);

    f4.setTitle(" ALEX UNION  MATCHES DETAILS ");
    f4.setSize(1500,1000);f4.setLocation(0,4);f4.setVisible(true);
     b4.setBounds(20, 220, 200, 500);
     
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
    set_add(f4,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
          
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f4.add(p2);
            validate();
    } 
    else if(ae.getSource()==b5)
    {
        close(f0,f1,f2,f3,f4,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
     
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 20:00 8-10-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 19:30 1-1-12 ");
 JTextField t6 = new JTextField(" 17:30 8-1-21 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 14-10-20 ");
 JTextField t9 = new JTextField(" 19:30 24-12-20 ");
 JTextField t10 = new JTextField(" 20:00 30-10-20");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 14:30 11-1-21");
 JTextField t13 = new JTextField(" 14:30 15-1-21");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" 14:30 12-12-20 ");
 JTextField t16 = new JTextField(" 19:30 16-12-20 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" CAIRO INTERNATIONAL ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" ALAHLE WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" ALAHLY WE PEACE  ");
 JTextField s9 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" AIR DEFENCE ");
 JTextField s13 = new JTextField(" SPORTS DEVICE ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f5);
set_add(time,f5,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f5,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f5,l,l1,l2,l3,l4,l5);

    f5.setTitle(" WADI DEGLA  MATCHES DETAILS ");
    f5.setSize(1500,1000);f5.setLocation(0,4);f5.setVisible(true);
     b5.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
       set_add(f5,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
    
      j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f5.add(p2);
            validate();
    } 
    else if(ae.getSource()==b6)
    {
       close(f0,f1,f2,f3,f4,f5,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
     
    //time&&date
 JTextField t1 = new JTextField(" 19:30 8-1-21 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 1-1-21 ");
 JTextField t4 = new JTextField(" 17:00 11-1-21 ");
 JTextField t5 = new JTextField(" 19:30 1-1-21 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" 19:30 18-12-20 ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19:30 5-1-21 ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 19:30 13-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" NEW SUEZ ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" BURJ ALARAB ");
 JTextField s4 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" A;AHLY WE PEACE ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" ALAHLY WE PEACE ");
 
 //referee
 referre(f6);
set_add(time,f6,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f6,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f6,l,l1,l2,l3,l4,l5);

    f6.setTitle(" ALAHLY  MATCHES DETAILS ");
    f6.setSize(1500,1000);f6.setLocation(0,4);f6.setVisible(true);
     
     b6.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f6,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f6.add(p2);
            validate();
    } 
    else if(ae.getSource()==b7)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
     
    //time&&date
 JTextField t1 = new JTextField(" 14:30 16-1-21");
 JTextField t2= new JTextField(" 14:30 11-12-20 ");
 JTextField t3 = new JTextField(" 19:30 2-1-21 ");
 JTextField t4 = new JTextField(" 17:00 17-12-20 ");
 JTextField t5 = new JTextField(" 17;00 8-1-21 ");
 JTextField t6 = new JTextField(" 20:00 7-1-20 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" 17:00 22-12-20 ");
 JTextField t12 = new JTextField(" -------------------- "); 
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" 20:30 15-10-20 ");
 JTextField t17 = new JTextField(" 14:30 18-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" PETROSPORTS ");
 JTextField s2= new JTextField(" PEYROSPORTS ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" ALEX ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" PETROSPORTS ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s17 = new JTextField(" THE ARAB CONTRACTORS ");
 
 //referee
 referre(f7);
set_add(time,f7,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f7,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f7,l,l1,l2,l3,l4,l5);
    f7.setTitle(" ENPPI  MATCHES DETAILS ");
    f7.setSize(1500,1000);f7.setLocation(0,4); f7.setVisible(true); 
     
     b7.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f7,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18); 
          j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f7.add(p2);
            validate();
    } 
    else if(ae.getSource()==b8)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18);
    
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 29-12-20 ");
 JTextField t3 = new JTextField(" 20:00 10-26-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 21-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 17:00 13-12-0=20 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 17:00 17-12-20 ");
 JTextField t15 = new JTextField(" 19:30 17-12-20 ");
 JTextField t16 = new JTextField(" 17:00 9-1-21 "); 
 JTextField t17 = new JTextField(" 19:30 3-1-21 ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" PETROSPORTS ");
 JTextField s3 = new JTextField(" CAIRO INTERNATIONAL ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" KHALED BESHARA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" ISMAILIA ");
 JTextField s15 = new JTextField(" ISMAILIA ");
 JTextField s16 = new JTextField(" ISMAILIA ");
 JTextField s17 = new JTextField(" THE ARAB CLEARING ");
 
 //referee
 referre(f8);
set_add(time,f8,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f8,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f8,l,l1,l2,l3,l4,l5); 
    f8.setTitle(" ESMAILI  MATCHES DETAILS ");
    f8.setSize(1500,1000);f8.setLocation(0,4);f8.setVisible(true); 
     
     b8.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f8,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
     j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f8.add(p2);
            validate();
            
    } 
    else if(ae.getSource()==b9)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f10,f11,f12,f13,f14,f15,f16,f17,f18);
    
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 25-12-21 ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" 17:00 15-1-21 ");
 JTextField t5 = new JTextField(" 17:00 14-10-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 21-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 14:30 17-12-20 ");
 JTextField t11 = new JTextField(" 17:00 9-1-21 ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:00 11-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 14:30 30-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" RAILROAD ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" KHALED BESHARA ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" KHALED BESHARA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" MILITARY SPORTS APPARATAS");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" KHALED BESHARA ");
 
 //referee
 referre(f9); 
set_add(time,f9,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f9,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f9,l,l1,l2,l3,l4,l5);
    
    f9.setTitle(" ELGOUNA  MATCHES DETAILS ");
    f9.setSize(1500,1000);f9.setLocation(0,4);f9.setVisible(true);
     
     b9.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
    set_add(f9,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18); 
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f9.add(p2);
            validate();
    } 
    else if(ae.getSource()==b10)
    {
       close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f11,f12,f13,f14,f15,f16,f17,f18);
    
    //time&&date
 JTextField t1 = new JTextField(" 14:30 2-1-21 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 12-1-21 ");
 JTextField t4 = new JTextField(" -------------------- "); 
 JTextField t5 = new JTextField(" 19:30 24-12-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19;30 7-1-21 ");
 JTextField t15 = new JTextField(" 17:00 15-1-21 ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" ALEX ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" BURJ ALARAB ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" ALAHLY WE PEACE");
 JTextField s15 = new JTextField(" ALEX");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 referre(f10);
set_add(time,f10,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f10,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f10,l,l1,l2,l3,l4,l5);
    f10.setTitle(" SMOUHA  MATCHES DETAILS ");
    f10.setSize(1500,1000);f10.setLocation(0,4);f10.setVisible(true);
     
     b10.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
    set_add(f10,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
           j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f10.add(p2);
            validate();
     } 
    else if(ae.getSource()==b11)
    {
         close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f12,f13,f14,f15,f16,f17,f18);
  
     //time&&date
 JTextField t1 = new JTextField(" 19:30 21-12-30 ");
 JTextField t2= new JTextField(" 19:30 16-1-21 ");
 JTextField t3 = new JTextField(" 17:00 17-1-21 " );
 JTextField t4 = new JTextField(" 20:00 30-10-20");
 JTextField t5 = new JTextField( " -------------------- ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" 17:00 13-12-20 ");
 JTextField t8 = new JTextField(" 14:30 17-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 19:30 30-12-20 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 19:30 26-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" BURJ ALARAB");
 JTextField s2= new JTextField(" BURJ ALARAB");
 JTextField s3 = new JTextField(" BURJ ALARAB");
 JTextField s4 = new JTextField(" BURJ ALARAB");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" BURJ ALARAB");
 JTextField s8 = new JTextField(" BURJ ALARAB");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" BURJ ALARAB");
 
 //REFERRE
 referre(f11);
set_add(time,f11,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f11,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f11,l,l1,l2,l3,l4,l5);
    
    f11.setTitle(" EGYPTIAN  MATCHES DETAILS ");
    f11.setSize(1500,1000);f11.setLocation(0,4);f11.setVisible(true);
     
     b11.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
    set_add(f11,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f11.add(p2);
            validate();
    } 
    else if(ae.getSource()==b12)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f13,f14,f15,f16,f17,f18);
        
     //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new  JTextField(" 14:30 14-1-21 ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 19:30 18-12-20 ");
 JTextField t7 = new JTextField(" 17:00 22-12-20 ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 17:00 9-1-21 ");
 JTextField t10 = new JTextField(" 19:30 14-12-20 ");
 JTextField t11 = new JTextField(" 19:30 30-12-20");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:00 25-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" RAILROAD ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" PETROSPORT ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" ALEX ");
 JTextField s11 = new JTextField(" BURJ ALARAB ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f12);
set_add(time,f12,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f12,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f12,l,l1,l2,l3,l4,l5);
    
    f12.setTitle(" MAHALLA YARN   MATCHES DETAILS ");
    f12.setSize(1500,1000);f12.setLocation(0,4);f12.setVisible(true);
     
     b12.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f12,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
      j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f12.add(p2);
            validate();
    } 
    else if(ae.getSource()==b13)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f14,f15,f16,f17,f18);
     
     //time&&date
 JTextField t1 = new JTextField(" 19:30 27-12-20 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 17-12-20");
 JTextField t4 = new JTextField(" 17:00 12-12-20 ");
 JTextField t5 = new JTextField(" 14:30 11-1-21 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 17:00 1-1-21 ");
 JTextField t15 = new JTextField(" 14:30 8-1-21 ");
 JTextField t16 = new JTextField(" 17:00 16-1-21");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" NEW SUEZ ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" AIR DEFENSE ");
 JTextField s4 = new JTextField(" AIR DEFENSE ");
 JTextField s5 = new JTextField(" AIR DEFENSE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" AIR DEFENSE ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" AIR DEFENSE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f13);
set_add(time,f13,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f13,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f13,l,l1,l2,l3,l4,l5);
  
    f13.setTitle(" PYRAMIDS  MATCHES DETAILS ");
    f13.setSize(1500,1000);f13.setLocation(0,4);f13.setVisible(true);
     b13.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f13,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);  
     j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f13.add(p2);
            validate();    
    } 
    else if(ae.getSource()==b14)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f15,f16,f17,f18);
     
     //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 16-12-20 ");
 JTextField t3 = new JTextField(" 19:30 9-1-21 ");
 JTextField t4 = new JTextField(" 17:00 2-1-21 ");
 JTextField t5 = new JTextField(" 14:30 15-1-21 ");
 JTextField t6 = new JTextField(" 20:00 31-10-20 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 17:00 11-12-20 ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 17:00 25-12-20 ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 19:30 22-12-20");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" RAILROAD ");
 JTextField s3 = new JTextField(" THE ARMY IN SUEZ");
 JTextField s4 = new JTextField(" SPORTS DEVICE ");
 JTextField s5 = new JTextField(" SPORTS DEVICE ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" MILITARY SPORTS APPARATUS ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" SPORTS DEVICE ");
 
 //referee
 referre(f14);
set_add(time,f14,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f14,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f14,l,l1,l2,l3,l4,l5);
    
    f14.setTitle(" VANGUARDS OF THE ARMY  MATCHES DETAILS ");
    f14.setSize(1500,1000);f14.setLocation(0,4);f14.setVisible(true);
     
     b14.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
        set_add(f14,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f14.add(p2);
            validate();
    } 
    else if(ae.getSource()==b15)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f16,f17,f18);
     
    //time&&date
 JTextField t1 = new JTextField(" 19:30 11-12-20");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 19:30 15-1-21");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 17-12-20");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 19:30 7-1-21 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:00 1-1-21");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" 14:30 12-12-20");
 JTextField t16 = new JTextField(" 17:00 26-12-20");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" ISMAILIA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" ALAHLY WE PEACE " );
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" AIR DEFENSE");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f15);
set_add(time,f15,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f15,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f15,l,l1,l2,l3,l4,l5);
    
    f15.setTitle(" MILITARY PRODUCTION  MATCHES DETAILS ");
    f15.setSize(1500,1000);f15.setLocation(0,4);f15.setVisible(true);
     
     b15.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f15,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18); 
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f15.add(p2);
            validate();
    } 
    else if(ae.getSource()==b16)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f17,f18);
     
    //time&&date
 JTextField t1 = new JTextField(" 17:00 16-12-20 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 14:30 12-12-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 19:30 35-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" 17:00 15-1-21");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 14:30 8-1-21 ");
 JTextField t15 = new JTextField(" 14:30 21-12-20 ");
 JTextField t16 = new JTextField(" 17:00 30-12-20 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" NEW SUEZ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" POLICE UNION ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" ISMILIA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" ALEX ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" POLICE UNION ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" POLICE UNION ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f16);
set_add(time,f16,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f16,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f16,l,l1,l2,l3,l4,l5);

    f16.setTitle(" AHLI BANK  MATCHES DETAILS ");
    f16.setSize(1500,1000);f16.setLocation(0,4);f16.setVisible(true);
     
     b16.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b15.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f16,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
              j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f16.add(p2);
            validate();
    } 
    else if(ae.getSource()==b17)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f18);
     
//time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 12-12-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField("19:30 16-12-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" 20:30 15-10-20 ");
 JTextField t8 = new JTextField(" 17:00 9-1-21 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:30 21-10-20");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" 17:00 26-12-20");
 JTextField t16 = new JTextField(" 17:00 30-12-20");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" MILITARY COLLEGE");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s8 = new JTextField(" ISMAILIA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" AIR DEFENSE ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" ALAHLY WE DEFENSE ");
 JTextField s16 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f17);
set_add(time,f17,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f17,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f17,l,l1,l2,l3,l4,l5);
    
    f17.setTitle(" THE ARAB CONTRACTORS  MATCHES DETAILS ");
    f17.setSize(1500,1000);f17.setLocation(0,4);f17.setVisible(true);
     
     b17.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b15.setBounds(350,795,200,30);
    b16.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     set_add(f7,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
     set_add(f17,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18);
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f17.add(p2);
            validate();
    } 
    else if(ae.getSource()==b18)
    {
        close(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17);
 //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 9-1-21");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 19:30 18-12-20 ");
 JTextField t7 = new JTextField(" 14:30 18-12-20 ");
 JTextField t8 = new JTextField(" 19:30 3-1-21");
 JTextField t9 = new JTextField(" 14:30 30-12-20 ");
 JTextField t10 = new JTextField(" 20:00 16-10-20 ");
 JTextField t11 = new JTextField(" 19:30 26-12-20");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19:30 22-12-20 ");
 JTextField t15 = new JTextField(" 20:00 29-10-20 ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s7 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s8 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s9 = new JTextField(" KHALED BESHARA ");
 JTextField s10 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s11 = new JTextField(" BURJ ALARAB ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" SPORTS DEVICE ");
 JTextField s15 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f18);
set_add(time,f18,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
set_add(stadium,f18,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17);
set_add(f18,l,l1,l2,l3,l4,l5);
    f18.setTitle(" EGYPT OF CLEARING  MATCHES DETAILS ");
    f18.setSize(1500,1000);f18.setLocation(0,4);f18.setVisible(true);
     
     b18.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b15.setBounds(350,795,200,30);
    b16.setBounds(350,840,200,30); b17.setBounds(350,885,200,30);  
    
     set_add(f18,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18); 
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f18.add(p2);
            validate();
    }
    }
      @Override
    public void referre(JFrame y)
 {
    JFrame f;
    f=y;
 JTextField r1 = new JTextField(" AMEN AMER ");
 JTextField r2= new  JTextField(" MOHAMED FAROUK ");
 JTextField r3 = new JTextField(" MAHMOUD ASHOUR ");
 JTextField r4 = new JTextField(" JIHAD GRISHA ");
 JTextField r5 = new JTextField(" MOHAMED ABBAS ");
 JTextField r6 = new JTextField(" MOHAMED ABDEL QADER MORSI ");
 JTextField r7 = new JTextField(" SAMIR MAHMOUD ");
 JTextField r8 = new JTextField(" TAWFIQ ELSAID ");
 JTextField r9 = new JTextField(" HAMDY SHABAN ");
 JTextField r10 = new JTextField(" YASER ABDUL RAOUF ");
 JTextField r11 = new JTextField(" MOHAMED YOUSSEF ");
 JTextField r12 = new JTextField(" EBRAHIM NOUR ");
 JTextField r13 = new JTextField(" SAEED HAMZA ");
 JTextField r14 = new JTextField(" TAREK MAGDY ");
 JTextField r15 = new JTextField(" MOHAMED BASSIOUNI ");
 JTextField r16 = new JTextField(" MAHMOUD ELBANA  ");
 JTextField r17 = new JTextField(" AHMED ELADAWY ");
 
 r1.setBounds(1200,165,220,30); r2.setBounds(1200,210,220,30);r3.setBounds(1200,255,220,30);r4.setBounds(1200,300,220,30);
 r5.setBounds(1200,345,220,30);r6.setBounds(1200,390,220,30);r7.setBounds(1200,435,220,30);r8.setBounds(1200,480,220,30);
 r9.setBounds(1200,525,220,30);r10.setBounds(1200,570,220,30);r11.setBounds(1200,615,220,30);r12.setBounds(1200,660,220,30);
 r13.setBounds(1200,705,220,30); r14.setBounds(1200,750,220,30);r15.setBounds(1200,795,220,30);r16.setBounds(1200,840,220,30);
 r17.setBounds(1200,885,220,30);
 
 f.add(r1);f.add(r2);f.add(r3);f.add(r4);f.add(r5);f.add(r6);f.add(r7);f.add(r8);f.add(r9);f.add(r10);f.add(r11);f.add(r12);f.add(r13);
 f.add(r14);f.add(r15);f.add(r16);f.add(r17);
 
 }
    //time or staduim
    @Override
    public void set_add(int z,JFrame f,JTextField t1,JTextField t2,JTextField t3,JTextField t4,JTextField t5,JTextField t6,JTextField t7,JTextField t8,JTextField t9,JTextField t10,JTextField t11,JTextField t12,JTextField t13,JTextField t14,JTextField t15,JTextField t16,JTextField t17)
{
 if (z==0)
 {
  t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
  t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 }
 else if (z==1)
 {
     t1.setBounds(950,165,220,30);t2.setBounds(950,210,220,30);t3.setBounds(950,255,220,30);t4.setBounds(950,300,220,30);
 t5.setBounds(950,345,220,30);t6.setBounds(950,390,220,30);t7.setBounds(950,435,220,30);t8.setBounds(950,480,220,30);
 t9.setBounds(950,525,220,30);t10.setBounds(950,570,220,30);t11.setBounds(950,615,220,30);t12.setBounds(950,660,220,30);
 t13.setBounds(950,705,220,30);t14.setBounds(950,750,220,30);t15.setBounds(950,795,220,30);t16.setBounds(950,840,220,30);
 t17.setBounds(950,885,220,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);

 }
}
  // labels
    @Override
    public void set_add(JFrame y,JLabel l,JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel l5)
    { 
     JFrame f;
     f=y;    
    f.add(l);l.setText(" vs ");l.setFont(new Font(" ",Font.BOLD ,25 ));l.setBounds(260,430, 100, 100); l.setForeground(Color.BLACK );
    f.add(l1);l1.setText(" FIRST TEAM : ");l1.setFont(new Font(" ",Font.BOLD ,25 ));l1.setBounds(50,155, 200, 100);l1.setForeground(Color.BLACK);
    f.add(l2);l2.setText(" SECOND TEAM : ");l2.setFont(new Font(" ",Font.BOLD ,25 ));l2.setBounds(350,100, 220, 100);l2.setForeground(Color.WHITE);
    f.add(l3);l3.setText(" TIME && DATE  : ");l3.setFont(new Font(" ",Font.BOLD ,25 ));l3.setBounds(650,100, 250, 100); l3.setForeground(Color.WHITE);
    f.add(l4);l4.setText(" STADIUM  : ");l4.setFont(new Font(" ",Font.BOLD ,25 ));l4.setBounds(1030,100, 250, 100);l4.setForeground(Color.WHITE);
    f.add(l5);l5.setText(" ");l5.setFont(new Font(" ",Font.BOLD ,25 ));l5.setBounds(1090,100,50, 50);l5.setForeground(Color.WHITE);      
    }
    
     @Override
     public void set_add(JFrame f,JButton b1,JButton b2,JButton b3 ,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16,JButton b17,JButton b18)
     {
         f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18);
     }
     
 @Override
     public void close(JFrame f1,JFrame f2,JFrame f3,JFrame f4,JFrame f5 ,JFrame f6,JFrame f7,JFrame f8,JFrame f9,JFrame f10,JFrame f11,JFrame f12,JFrame f13, JFrame f14,JFrame f15,JFrame f16,JFrame f17,JFrame f18)
     {
     f1.setVisible(false);f2.setVisible(false);f3.setVisible(false);f4.setVisible(false);f5.setVisible(false);f6.setVisible(false);
     f7.setVisible(false);f8.setVisible(false);f9.setVisible(false);f10.setVisible(false);f11.setVisible(false);f12.setVisible(false);
     f13.setVisible(false);f14.setVisible(false);f15.setVisible(false);f16.setVisible(false);f17.setVisible(false);f18.setVisible(false);
     }
}