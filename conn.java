

import java.sql.*;

public class conn {
     public Connection c;
     public Statement s;

    public conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/pms_pvt_ltd","root","mafia016&");
            s= c.createStatement();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

