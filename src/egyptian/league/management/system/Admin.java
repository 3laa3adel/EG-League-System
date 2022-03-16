package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends Abstractadmin {

    @Override
    public void display() {
        f.setLocation(0, 0);
        f.setVisible(true);
        f.setSize(1500, 1000);
        f.setTitle(" Egyptian League Management System");
        f.add(login);
        f.add(signup);
        f.add(cancel);
        f.add(l1);
        f.add(l2);
        f.add(textn);
        f.add(textp);
        j2.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p3.add(j2);
        f.add(p3);
        f.validate();
        l1.setBounds(450, 200, 130, 30);
        l1.setForeground(Color.white);
        textn.setBounds(600, 200, 250, 30);
        l2.setBounds(450, 250, 130, 30);
        l2.setForeground(Color.white);
        textp.setBounds(600, 250, 250, 30);
        login.setBounds(570, 300, 130, 30);
        cancel.setBounds(735, 300, 130, 30);
        signup.setBounds(650, 350, 130, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
    }
    
    
    
    @Override
    public void actions(){
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == login) {
                    if ((textn.getText().equals("admin")) && (textp.getText().equals("admin"))) {
                        adminh.setVisible(true); 
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Username Or Password");
                        textn.setText("");
                        textp.setText("");
                    }
                }
            }
        });
        signup.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == signup) {
                    s.setVisible(true);
                }
            }
        });
        cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == cancel) {
                    f.setVisible(false);
                }
            }
        });

    }

}
