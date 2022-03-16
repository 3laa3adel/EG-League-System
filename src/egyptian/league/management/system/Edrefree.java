
package egyptian.league.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Edrefree extends Edteam{
    @Override
    public void Ed(){
        this.setVisible(true);
        setSize(1500, 1000);
        button1.setBackground(Color.black);
        button1.setForeground(Color.WHITE);
        button2.setBackground(Color.black);
        button2.setForeground(Color.WHITE);
        button1.setBounds(600, 330, 300, 30);
        button2.setBounds(600, 380, 300, 30);
        add(button1);
        add(button2);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
        this.add(p2);
        validate();
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button1) {
                 Object[][] refree = {{"1", "Ahmed AlGhandur"}, {"2", "Ahmed Gamal"}, {"3", "Mohamed AlHanafy"}, {"4", "Tarek Magdy"}, {"5", "Ebrahim NourEldin"}, {"6", "MOHAMED BASSIOUNI"}, {"7", "AHMED ELADAWY"}, {"8", "JIHAD GRISHA"}, {"9", "MOHAMED ABDEL QADER MORSI"}, {"10", "EBRAHIM NOUR"}};
                    String[] address = {"  " ,"Refree"};
                    f.setLocation(0, 4);
                    f.setTitle("Edit Refrees");

                    DefaultTableModel m = new DefaultTableModel(refree, address);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            
                            team1.setText(m.getValueAt(i, 0).toString());
                            team2.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                               
                                row[0] = team1.getText();
                                row[1] = team2.getText();
                                m.addRow(row);
                            }
                        }
                    });
                    dlt.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == dlt) {
                                int i = t.getSelectedRow();
                                if (i > 0) {
                                    m.removeRow(i);
                                }
                            }
                        }
                    });
                    edit.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == edit) {
                                int i = t.getSelectedRow();
                                m.setValueAt(team1.getText(), i, 0);
                                m.setValueAt(team2.getText(), i, 1);
                            }
                        }
                    });
                    team1.setBounds(290, 260, 110, 25);
                    team2.setBounds(290, 300, 110, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    f.setSize(1500, 1000);
                    f.setLayout(null);
                    f.setVisible(true);
                    f.add(p);
                    f.add(team1);
                    f.add(team2);
                    f.add(add);
                    f.add(edit);
                    f.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    f.add(p2);
                }
            }
        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button2) {
                   setVisible(false);
                }
            }

        });
    }
    }