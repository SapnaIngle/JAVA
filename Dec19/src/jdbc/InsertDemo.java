package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sapna" ,"root", "Sapna@1102");

            Statement statement = connection.createStatement();

            String insert = "insert into employee(id,name,address) values(2,'Prakash','Pune')";
            String update = "update employee set name='Akash' where id = 1";
            String delete = "delete from employee where id=2";

            int i = statement.executeUpdate(delete);
            System.out.println(i + "row affected");

        } catch (ClassNotFoundException | SQLException e) {

            throw new RuntimeException(e);
        }

    }
}
