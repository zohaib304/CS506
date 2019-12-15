
// setp #1
import java.sql.*;

public class JdbcEx {

    public static void main(String[] args) {
        try {
            // step #2 load driver
            // setp #3 define the connection URL
            String url = "jdbc:odbc:personDSN";
            // step #4 establish the connection
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://G:\\1 - My School\\05-Fifth Semester\\CS506 - Web Design and Development\\database");
            // step #5 create statement
            Statement st = con.createStatement();
            // step #6 prepare & excute the query
            String sql = "SELECT * FROM Person";
            ResultSet rs = st.executeQuery(sql);
            // step #7 process the results
            while (rs.next()) {
                String fname = rs.getString("Fname");
                String lname = rs.getString("Lname");
                System.out.println(fname + " " + lname);
            }
            con.close();
        } catch (Exception sqlEx) {
            System.out.println(sqlEx);
        }

    } // end main

} // end class