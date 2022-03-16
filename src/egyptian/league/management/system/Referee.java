package egyptian.league.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Referee extends Rstadium {
    @Override
     public void dis() {
        this.setTitle("REFEREE DETAILS");
        this.setSize(1500, 1000);
        this.setLocation(0, 4);
        this.setVisible(true);
        this.setResizable(false);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
        this.add(p2);
        validate();
        b1.setText("Ahmed AlGhandur");
        b2.setText("Ahmed Gamal");
        b3.setText("Mohamed AlHanafy");
        b4.setText(" Tarek Magdy");
        b5.setText(" Ebrahim NourEldin ");
        b6.setText(" Exit");
        b1.setBounds(600, 180, 300, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setBounds(600, 230, 300, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b3.setBounds(600, 280, 300, 30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b4.setBounds(600, 330, 300, 30);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b5.setBounds(600, 380, 300, 30);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b6.setBounds(600, 430, 300, 30);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        l.setText("referee name");
        l.setFont(new Font(" ", Font.BOLD, 20));
        l.setBounds(50, 180, 250, 100);
        l.setForeground(Color.white);
        l2.setText("referee height");
        l2.setFont(new Font(" ", Font.BOLD, 20));
        l2.setBounds(400, 180, 250, 100);
        l2.setForeground(Color.white);
        l3.setText("referee wheight");
        l3.setFont(new Font(" ", Font.BOLD, 20));
        l3.setBounds(750, 180, 250, 100);
        l3.setForeground(Color.white);
        l4.setText("Matches");
        l4.setFont(new Font(" ", Font.BOLD, 20));
        l4.setBounds(1150, 180, 250, 100);
        l4.setForeground(Color.white);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
           
            f.add(l);
            f.add(l2); 
            f.add(l3);
            f.add(l4);
            // for text field
            t .setText("      Ahmed AlGhandur");
            t.setEditable(false);
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);
            
            t1.setText("                165 cm          ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                   70 kg");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       ALAhly  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Ceramica  vs  ALex union");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Pyramids  vs  Wadi Degla");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText(" Zamalek  vs  Wadi Degla");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Enpi  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("        ALAhly  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Ahmed AlGhandur Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
        } else if (ae.getSource() == b2) {
           
            f.add(l);
            f.add(l2);
            f.add(l3);
            f.add(l4);
            // for text field
            t.setText("      Ahmed Gamal");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                170 cm          ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                   70 kg");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Pyramids  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       ALAhly  vs  ALex union");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Zamalek  vs  Wadi Degla");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    Zamalek  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Smouha  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("        ALAhly  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Ahmed Gamal Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        } else if (ae.getSource() == b3) {
          
            f.add(l);
            f.add(l2);
            f.add(l3);
            f.add(l4);
            // for text field
            t.setText("     Mohamed AlHanafy ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                166 cm          ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                   80 kg");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Ceramica  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       ALAhly  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Zamalek  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    ALAhly  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Smouha  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Pyramids  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Mohamed AlHanafy Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b4) {
            
            f.add(l);
            f.add(l2);
            f.add(l3);
            f.add(l4);
            // for text field
            t.setText("          Tarek Magdy ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                174 cm          ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                   77 kg");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Ceramica  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       ALAhly  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Zamalek  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    ALAhly  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Smouha  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Pyramids  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Tarek Magdy Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
        } else if (ae.getSource() == b5) {
            f.add(l);
            f.add(l2);
            f.add(l3);
            f.add(l4);
            // for text field
            t.setText("        Ebrahim NourEldin ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                160 cm          ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                   67 kg");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       ALAhly  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Zamalek  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("     Enpi  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    Smouha  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("        Pyramids  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Esmaili  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Ebrahim NourEldin Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
           else if (ae.getSource() == b6) {
            this.setVisible(false);
        }
    }

}
