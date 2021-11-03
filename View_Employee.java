import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class View_Employee  implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;

    View_Employee(){
        f=new JFrame("View");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);



        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.black);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1);
        f.add(l2);



        t=new JTextField();
        t.setBounds(240,60,220,30);
        f.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.addActionListener(this);
        f.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        f.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            print_details p=new print_details(t.getText());
        }

    }

    public static void main(String[]ar){
        View_Employee v=new View_Employee();
    }
}



