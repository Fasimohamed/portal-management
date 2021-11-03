import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
    public class Add_project implements ActionListener {
        JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id15,lab,lab1;
        JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        JButton b,b1;

        Add_project(){
            f = new JFrame("Add project");
            f.setBackground(Color.white);
            f.setLayout(null);

            id15=new JLabel();
            id15.setBounds(0,0,900,700);
            id15.setLayout(null);

            id =new JLabel();
            id.setIcon(new ImageIcon("C:\\Users\\user2\\IdeaProjects\\pms\\src\\picture\\p46.png"));
            id.setBounds(580,8,220,120);
            f.add(id);


            id8 = new JLabel("New Project Details");
            id8.setBounds(270,30,500,50);
            id8.setFont(new Font("serif",Font.ITALIC,35));
            id8.setForeground(Color.black);
            id15.add(id8);
            f.add(id15);


            id1 = new JLabel("Project name");
            id1.setBounds(50,150,200,30);
            id1.setFont(new Font("serif",Font.BOLD,20));
            f.add(id1);

            t1=new JTextField();
            t1.setBounds(200,150,150,30);
            f.add(t1);

            id2 = new JLabel("Project no");
            id2.setBounds(50,200,200,30);
            id2.setFont(new Font("serif",Font.BOLD,20));
            f.add(id2);

            t2=new JTextField();
            t2.setBounds(200,200,150,30);
            f.add(t2);

            id3= new JLabel("Project manager");
            id3.setBounds(30,250,500,30);
            id3.setFont(new Font("serif",Font.BOLD,20));
            f.add(id3);

            t3=new JTextField();
            t3.setBounds(200,250,150,30);
            f.add(t3);

            id4= new JLabel("Date of start(yyyy-mm-dd)");
            id4.setBounds(430,150,300,30);
            id4.setFont(new Font("serif",Font.BOLD,20));
            f.add(id4);

            t4=new JTextField();
            t4.setBounds(800,150,150,30);
            f.add(t4);

            id5= new JLabel("Date of completion(yyyy-mm-dd)");
            id5.setBounds(430,200,400,30);
            id5.setFont(new Font("serif",Font.BOLD,20));
            f.add(id5);

            t5=new JTextField();
            t5.setBounds(800,200,150,30);
            f.add(t5);

            id6= new JLabel("Client");
            id6.setBounds(490,250,100,30);
            id6.setFont(new Font("serif",Font.BOLD,20));
            f.add(id6);

            t6=new JTextField();
            t6.setBounds(800,250,150,30);
            f.add(t6);

            id7= new JLabel("Project Description(100 letters only)");
            id7.setBounds(285,340,300,30);
            id7.setFont(new Font("serif",Font.BOLD,20));
            f.add(id7);

            t7=new JTextField();
            t7.setBounds(90,370,850,30);
            f.add(t7);


            lab=new JLabel();
            lab.setBounds(200,450,250,200);
            f.add(lab);

            lab1=new JLabel("");
            lab1.setBounds(600,450,250,200);
            f.add(lab1);

            b = new JButton("Submit");
            b.setBackground(Color.BLACK);
            b.setForeground(Color.WHITE);
            b.setBounds(250,550,150,40);
            f.add(b);

            b1=new JButton("Cancel");
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(450,550,150,40);

            f.add(b1);

            b.addActionListener(this);
            b1.addActionListener(this);

            f.setVisible(true);
            f.setSize(1100,700);
            f.setLocation(130,10);
        }

        public void actionPerformed(ActionEvent ae){

            String a = t1.getText();
            String bb = t2.getText();
            String c = t3.getText();
            String d = t4.getText();
            String e = t5.getText();
            String ff = t6.getText();
            String g = t7.getText();


            if(ae.getSource() == b){
                try{
                    conn cc = new conn();
                    String q = "insert into project_details values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"')";
                    cc.s.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
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
            new Add_project();
        }
    }




