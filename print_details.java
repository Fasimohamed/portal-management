import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
          public class print_details implements ActionListener {


        JFrame f;
        JLabel id8, id, aid, id1, aid1, id2, aid2, id3, aid3, id4, aid4, id5, aid5, id6, aid6, id7, aid7, aid8, aid9, id9, id10, id11, id12, id13, id14, id15, id16, id17, lab;
        String emp_id, name, address, phone, email, education, dob, Project, salary, department;
        JButton b1, b2;


        print_details(String e_id) {
            try {
                conn con = new conn();
                String str = "select * from employee_details where emp_id = '" + e_id + "'";
                ResultSet rs = con.s.executeQuery(str);

                while (rs.next()) {


                    name = rs.getString("name");
                    dob = rs.getString("dob");
                    email = rs.getString("Email");
                    education = rs.getString("education");
                    phone = rs.getString("phone");
                    address = rs.getString("address");
                    department = rs.getString("department");
                    salary = rs.getString("salary");
                    Project = rs.getString("Project");
                    emp_id = rs.getString("emp_id");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            f = new JFrame("Print Details");
            f.setVisible(true);
            f.setSize(705, 980);
            f.setLocation(450, 0);
            f.setBackground(Color.white);
            f.setLayout(null);


            id9 = new JLabel();
            id9.setBounds(0, 0, 595, 642);
            id9.setLayout(null);


            id8 = new JLabel("Employee Details");
            id8.setBounds(50, 10, 250, 30);
            f.add(id8);
            id8.setFont(new Font("serif", Font.BOLD, 25));
            id9.add(id8);
            f.add(id9);

            id = new JLabel("Employee Id:");
            id.setBounds(50, 70, 120, 30);
            id.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id);

            aid = new JLabel(emp_id);
            aid.setBounds(200, 70, 200, 30);
            aid.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid);

            id1 = new JLabel("Name:");
            id1.setBounds(50, 120, 100, 30);
            id1.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id1);

            aid1 = new JLabel(name);
            aid1.setBounds(200, 120, 300, 30);
            aid1.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid1);


            id2 = new JLabel("Date of Birth:");
            id2.setBounds(50, 170, 200, 30);
            id2.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id2);

            aid2 = new JLabel(dob);
            aid2.setBounds(200, 170, 300, 30);
            aid2.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid2);

            id3 = new JLabel("Email:");
            id3.setBounds(50, 220, 100, 30);
            id3.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id3);

            aid3 = new JLabel(email);
            aid3.setBounds(200, 220, 300, 30);
            aid3.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid3);


            id4 = new JLabel("Education:");
            id4.setBounds(50, 270, 100, 30);
            id4.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id4);

            aid4 = new JLabel(education);
            aid4.setBounds(200, 270, 300, 30);
            aid4.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid4);


            id5 = new JLabel("Contact No:");
            id5.setBounds(50, 320, 150, 30);
            id5.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id5);

            aid5 = new JLabel(phone);
            aid5.setBounds(200, 320, 300, 30);
            aid5.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid5);


            id6 = new JLabel("Address:");
            id6.setBounds(50, 370, 100, 30);
            id6.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id6);

            aid6 = new JLabel(address);
            aid6.setBounds(200, 370, 300, 30);
            aid6.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid6);


            id7 = new JLabel("Department:");
            id7.setBounds(50, 420, 180, 30);
            id7.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id7);

            aid7 = new JLabel(department);
            aid7.setBounds(200, 420, 300, 30);
            aid7.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid7);

            id10 = new JLabel("Salary:");
            id10.setBounds(50, 470, 100, 30);
            id10.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id10);

            aid9 = new JLabel(salary);
            aid9.setBounds(200, 470, 300, 30);
            aid9.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid9);

            id11 = new JLabel("Project:");
            id11.setBounds(50, 520, 100, 30);
            id11.setFont(new Font("serif", Font.BOLD, 20));
            f.add(id11);

            aid8 = new JLabel(Project);
            aid8.setBounds(200, 520, 300, 30);
            aid8.setFont(new Font("serif", Font.BOLD, 20));
            f.add(aid8);

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
            new View_Employee();
        }
    }

    public static void main(String[] args) {
         new print_details("print details");
    }
}



