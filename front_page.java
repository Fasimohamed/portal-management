import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class front_page implements ActionListener {

    JFrame f;
    JLabel lblId;
    JLabel lbl12;
    JButton btn1,btn2;
    front_page() {
        f = new JFrame("pms_pvt_ltd");
        f.setBackground(Color.RED);
        f.setLayout(null);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\user2\\IdeaProjects\\pms\\src\\picture\\p7.png"));
        label.setBounds(280, 1, 2000, 600);
        f.add(label);



        JLabel lbl4 = new JLabel();
        lbl4.setIcon(new ImageIcon("C:\\Users\\user2\\IdeaProjects\\pms\\src\\picture\\p00.jpg"));
        lbl4.setBounds(920, 0, 400, 400);
        f.add(lbl4);

        JLabel label1 = new JLabel("IF YOU FOCUS ON RESULTS,YOU WILL NEVER CHANGE ...");
        label1.setBounds(200, 380, 1500, 100);
        label1.setFont(new Font("serif", Font.BOLD, 14));
        label1.setForeground(Color.DARK_GRAY);
        f.add(label1);

        JLabel label3 = new JLabel("WELCOME");
        label3.setBounds(180, 0, 800, 100);
        label3.setFont(new Font("serif", Font.BOLD, 50));
        label1.setForeground(Color.black);
        f.add(label3);

        JLabel label2 = new JLabel("IF YOU FOCUS ON CHANGE,YOU WILL GET RESULTS ...");
        label2.setBounds(202, 400, 1500, 100);
        label2.setFont(new Font("serif", Font.BOLD, 14));
        label2.setForeground(Color.DARK_GRAY);
        f.add(label2);




        btn1 = new JButton("CLICK HERE TO CONTINUE");
        btn1.setBackground(Color.gray);
        btn1.setForeground(Color.black);
        btn1.setBounds(520, 520, 300, 70);
        btn1.addActionListener(this);


        lblId = new JLabel();
        lblId.setBounds(0, 0, 1460, 750);
        lblId.setLayout(null);

        JTextArea textArea = new JTextArea(

                "About us:           "
                        +
                         "                        we develop software for clients                   " +
                        "             contact us:7896541232         "
                        +"mail:pms@gmail.com",
                6,
                20);
        textArea.setFont(new Font("Serif", Font.ITALIC, 17));
        textArea.setLineWrap(true);
        textArea.setBounds(1000,400,200,920);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        f.add(textArea);

        JLabel lid = new JLabel("PMS_Pvt_Ltd");
        lid.setBounds(180, 80, 1500, 100);
        lid.setFont(new Font("serif", Font.BOLD, 80));
        lid.setForeground(Color.BLACK);
        lblId.add(lid);

        lblId.add(btn1);
        f.add(lblId);

        f.getContentPane().setBackground(Color.white);
        f.setVisible(true);
        f.setSize(1500, 650);

    }
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == btn1) {
                f.setVisible(false);
                login I = new login();
            }

        }
            public static void main (String[]args){
                front_page f = new front_page();
            }

        }



