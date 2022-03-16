package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Home {
    String photo="D:\\artboard_26.jpg";
    JFrame f=new JFrame();
    EgyptionLeagueDetails l=new EgyptionLeagueDetails();
    Admin a = new Admin();
    Match m=new Match();
    Referee r=new Referee();
    Rstadium s=new Rstadium();
    Player p=new Player();
    Team t=new Team();
    TeamHeadCoach c=new TeamHeadCoach();
    SignUp si=new SignUp();
    Adminh h=new Adminh();
    JLabel j1=new JLabel();
    JPanel p2 =new JPanel();
    JButton b1 = new JButton("Admin Page");
    JButton b2 = new JButton("League Details");
    JButton b3 = new JButton("Match Details");
    JButton b4 = new JButton("Team Details");
    JButton b5 = new JButton("Stadium Details");
    JButton b6 = new JButton("Player Details");
    JButton b7 = new JButton("Referee Details");
    JButton b8 = new JButton("Coach Details");
    
    // Display Form Only
    public void Display(int x , int y){
        f.setLocation(x, y);
        f.setVisible(true);
        f.setSize(1500, 1000);
        f.setTitle(" Egyptian League Management System");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Display , Actions And Edit
    public void Display(int x , int y, int z) {
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b8.setBackground(Color.black);
        b8.setForeground(Color.white);
        b1.setBounds(x, 220, y, z);
        b2.setBounds(x, 300, y, z);
        b3.setBounds(x, 370, y, z);
        b4.setBounds(x, 460, y, z);
        b5.setBounds(x, 540, y, z);
        b6.setBounds(x, 620, y, z);
        b7.setBounds(x, 700, y, z);
        b8.setBounds(x, 770, y, z);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
            j1.setIcon(new ImageIcon(photo));
        p2.add(j1);
       f.add(p2);
        f.validate();
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    a.display();
                    a.actions();
                }
            }

        });
         b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b2) {
                    l.setVisible(true);
                }
            }

        });
         b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b3) {
                    m.display();
                }
            }

        });
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b5) {
                    s.dis();
                }
            }

        });
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b6) {
                    p.dis();
                }
            }

        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b4) {
                    t.setVisible(true);
                }
            }

        });
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b8) {
                    c.setVisible(true);
                }
            }

        });
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b7) {
                    r.dis();
                }
            }

        });
    }
}
