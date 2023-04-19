package jdbc;

import java.sql.*;

/**
 * Registering driver
 * connection establishment
 * statement creation
 * statement execution
 * */
public class JdbcDemo {
// maven repository / mysql connector jar file install
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sapna" ,"root", "Sapna@1102");

            Statement statement = connection.createStatement();

            String str = "select * from employee";

            ResultSet rs = statement.executeQuery(str);

            while(rs.next()){
                System.out.println(rs.getInt("id")+ " " + rs.getString("name")+ " " + rs.getString("address"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
