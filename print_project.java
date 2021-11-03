import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class print_project implements ActionListener {


    JFrame f;
    JLabel id8, id, aid, id1, aid1, id2, aid2, id3, aid3, id4, aid4, id5, aid5, id6, aid6, id7, aid7, aid8, aid9, id9, id10, id11, id12, id13, id14, id15, id16, id17, lab;
    String project_name, project_no, project_manager, date_of_se, date_of_com, client, p_description;
    JButton b1, b2;


    print_project(String e_id) {
        try {
            conn con = new conn();
            String str = "select * from project_details where project_name = '" + e_id + "'";
            ResultSet rs = con.s.executeQuery(str);

            while (rs.next()) {


                project_name = rs.getString("project_name");
                project_no = rs.getString("project_no");
                project_manager = rs.getString("project_manager");
                date_of_se = rs.getString("date_of_se");
                date_of_com = rs.getString("date_of_com");
                client = rs.getString("client");
                p_description = rs.getString("p_description");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        f = new JFrame("Print Project Details");
        f.setVisible(true);
        f.setSize(2000, 700);
        f.setLocation(0, 5);
        f.setBackground(Color.white);
        f.setLayout(null);


        id9 = new JLabel();
        id9.setBounds(0, 0, 595, 642);
        id9.setLayout(null);


        id8 = new JLabel("Project Details");
        id8.setBounds(80, 10, 400, 30);
        f.add(id8);
        id8.setFont(new Font("serif", Font.BOLD, 25));
        id9.add(id8);
        f.add(id9);

        id = new JLabel("Project Name:");
        id.setBounds(50, 70, 200, 30);
        id.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id);

        aid = new JLabel(project_name);
        aid.setBounds(200, 70, 300, 30);
        aid.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid);

        id1 = new JLabel("Project no:");
        id1.setBounds(50, 120, 200, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id1);

        aid1 = new JLabel(project_no);
        aid1.setBounds(200, 120, 300, 30);
        aid1.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid1);


        id2 = new JLabel("Project manager:");
        id2.setBounds(50, 170, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id2);

        aid2 = new JLabel(project_manager);
        aid2.setBounds(270, 170, 300, 30);
        aid2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid2);

        id3 = new JLabel("Date of status entry:");
        id3.setBounds(50, 220, 300, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id3);

        aid3 = new JLabel(date_of_se);
        aid3.setBounds(270, 220, 200, 30);
        aid3.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid3);


        id4 = new JLabel("Date of completion:");
        id4.setBounds(50, 270, 300, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id4);

        aid4 = new JLabel(date_of_com);
        aid4.setBounds(270, 270, 200, 30);
        aid4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid4);


        id5 = new JLabel("Client:");
        id5.setBounds(50, 320, 200, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id5);

        aid5 = new JLabel(client);
        aid5.setBounds(270, 320, 200, 30);
        aid5.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid5);


        id6 = new JLabel("Project description:");
        id6.setBounds(50, 370, 300, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id6);

        aid6 = new JLabel(p_description);
        aid6.setBounds(240, 370, 1000, 30);
        aid6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(aid6);

        b1 = new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 580, 100, 30);
        b1.addActionListener(this);
        f.add(b1);

        b2 = new JButton("cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250, 580, 100, 30);
        b2.addActionListener(this);
        f.add(b2);

    }


    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "printed successfully");
            f.setVisible(false);
            details d = new details();
        }
        if (ae.getSource() == b2) {
            f.setVisible(false);
            new view_projects();
        }
    }

    public static void main(String[] args) {
        new print_project("print project");
    }
}





