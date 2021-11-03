import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class login implements ActionListener {
    JFrame f;
    JLabel lblI1;
    JLabel lblI2;
    JTextField t1;
    JPasswordField t2;
    JButton btn1,btn2;

    login(){
        f=new JFrame("Login");

        f.setBackground(Color.WHITE);
        f.setLayout(null);

        lblI1 =new JLabel("Username");
        lblI1.setBounds(40,20,100,30);
        f.add(lblI1);

        lblI2 =new JLabel("Password");
        lblI2.setBounds(40,70,100,30);
        f.add(lblI2);

        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        f.add(t2);

        JLabel label=new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\user2\\IdeaProjects\\pms\\src\\picture\\p13.jpg"));
        label.setBounds(280,15,350,250);
        f.add(label);

        btn1=new JButton("Login");
        btn1.setBounds(40,140,120,30);
        btn1.setFont(new Font("serif",Font.BOLD,15));
        btn1.addActionListener(this);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        f.add(btn1);

        btn2=new JButton("Cancel");
        btn2.setBounds(180,140,120,30);
        btn2.setFont(new Font("serif",Font.BOLD,15));
        btn2.addActionListener(this);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        f.add(btn2);

        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(600,320);
        f.setLocation(400,300);


    }
    public void actionPerformed(ActionEvent ae){
        try{
            conn c1=new conn();
            String u =t1.getText();
            String v = t2.getText();

            String q = "select * from login where username='"+u+"' and password='"+v+"'";

            ResultSet rs = c1.s.executeQuery(q);
            if(rs.next()){
                new details().f.setVisible(true);
                f.setVisible(false);

            }else {
                JOptionPane.showMessageDialog(null, "Invalid username/password");
                f.setVisible(false);
            }

        }catch(Exception e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        login l = new login();
    }
}