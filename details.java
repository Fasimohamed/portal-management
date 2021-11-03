import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class details implements ActionListener {
       JFrame f;
       JLabel lbl11, lbl12;
       JButton b1, b2, b3, b4, b5,b6,b7,b8;

       details() {
              f = new JFrame("Details");
              f.setBackground(Color.WHITE);
              f.setLayout(null);

              lbl11 = new JLabel();
              lbl11.setBounds(200, 200, 450, 370);
              lbl11.setLayout(null);
              lbl11.setIcon(new ImageIcon("C:\\Users\\user2\\IdeaProjects\\pms\\src\\picture\\p36.jpg"));
              f.add(lbl11);

              JLabel label = new JLabel();
              label.setIcon(new ImageIcon("C:\\Users\\user2\\IdeaProjects\\pms\\src\\picture\\p7.png"));
              label.setBounds(20, 30, 2000, 170);
              f.add(label);

              lbl12 = new JLabel("Details");
              lbl12.setBounds(230, 40, 500, 100);
              lbl12.setForeground(Color.BLACK);
              lbl12.setFont(new Font("serif", Font.TYPE1_FONT, 80));
              f.add(lbl12);

              b1 = new JButton("ADD EMPLOYEE");
              b1.setBounds(640, 10, 240, 60);
              b1.setFont(new Font("serif", Font.BOLD, 9));
              b1.setForeground(Color.black);
              b1.setBackground(Color.white);
              b1.addActionListener(this);
              f.add(b1);

              b2 = new JButton("VIEW EMPLOYEE");
              b2.setBounds(570, 80, 240, 60);
              b2.setFont(new Font("serif", Font.BOLD, 9));
              b2.setForeground(Color.BLACK);
              b2.setBackground(Color.white);
              b2.addActionListener(this);
              f.add(b2);

              b3 = new JButton("REMOVE EMPLOYEE");
              b3.setBounds(640, 150, 240, 60);
              b3.setFont(new Font("serif", Font.BOLD, 9));
              b3.setForeground(Color.BLACK);
              b3.setBackground(Color.white);
              b3.addActionListener(this);
              f.add(b3);

              b4 = new JButton("UPDATE EMPLOYEE");
              b4.setBounds(570, 220, 240, 60);
              b4.setFont(new Font("serif", Font.BOLD, 9));
              b4.setForeground(Color.BLACK);
              b4.setBackground(Color.white);
              b4.addActionListener(this);
              f.add(b4);

              b5 = new JButton("VIEW PROJECT");
              b5.setBounds(640, 290, 240, 60);
              b5.setFont(new Font("serif", Font.BOLD, 9));
              b5.setForeground(Color.black);
              b5.setBackground(Color.white);
              b5.addActionListener(this);
              f.add(b5);

              b6 = new JButton("ADD PROJECT");
              b6.setBounds(570, 360, 240, 60);
              b6.setFont(new Font("serif", Font.BOLD, 9));
              b6.setForeground(Color.black);
              b6.setBackground(Color.white);
              b6.addActionListener(this);
              f.add(b6);


           b8 = new JButton("CREATE ADMIN/PASSWORD");
           b8.setBounds(640, 430, 300, 60);
           b8.setFont(new Font("serif", Font.BOLD, 9));
           b8.setForeground(Color.black);
           b8.setBackground(Color.white);
           b8.addActionListener(this);
           f.add(b8);

              f.setVisible(true);
              f.setSize(1000, 600);
              f.getContentPane().setBackground(Color.WHITE);
              f.setLocation(110, 70);

       }

       public void actionPerformed(ActionEvent ae) {
           if (ae.getSource() == b1) {
               f.setVisible(false);
               new new_employee();
           }
           if (ae.getSource() == b2) {
               f.setVisible(false);
               new View_Employee();
           }
           if (ae.getSource() == b3) {
               f.setVisible(false);
               new Remove_employee();
           }
           if (ae.getSource() == b4) {
               f.setVisible(false);
               new search();
           }
           if (ae.getSource() == b5) {
               f.setVisible(false);
               new view_projects();
           }
           if (ae.getSource() == b6) {
               f.setVisible(false);
               new Add_project();
           }
           if (ae.getSource() == b8) {
               f.setVisible(false);
               new u_namepass();
           }
       }
              public static void main (String[ ]arg){
                     details d = new details();
              }
       }





