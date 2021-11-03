import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class u_namepass implements ActionListener{
    JFrame f;
    JLabel id,id1,id2,id8,id15,lab,lab1;
    JTextField t1,t2;
    JButton b,b1;

    u_namepass(){
        f = new JFrame("Add username");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);


        id8 = new JLabel("Add username/password");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,35));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Create Username");
        id1.setBounds(50,80,400,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.add(id1);

        t1=new JTextField();
        t1.setBounds(220,80,150,30);
        f.add(t1);

        id2 = new JLabel("Create Password");
        id2.setBounds(50,130,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(220,130,150,30);
        f.add(t2);




        lab=new JLabel();
        lab.setBounds(200,450,250,200);
        f.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        f.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(40,220,120,30);
        f.add(b);

        b1=new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(180,220,120,30);

        f.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        f.setVisible(true);
        f.setSize(600,320);
        f.setLocation(400,300);
        f.setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){

        String a = t1.getText();
        String bb = t2.getText();



        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into login values('"+a+"','"+bb+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"username/password Successfully Inserted");
                f.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[ ] arg){
        new u_namepass();
    }
}







