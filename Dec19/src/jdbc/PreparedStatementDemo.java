package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sapna" ,"root", "Sapna@1102");

            Scanner scanner = new Scanner(System.in);
            int id;
            String name;
            String address;
            System.out.println("Enter id,name,address");
            id = scanner.nextInt();
            name = scanner.next();
//            address = scanner.next();

            String insert = "insert into employee(id,name,address) values(?,?,?)";
            String update = "update employee set name = ? where id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
//            preparedStatement.setString(3,address);

            int i = preparedStatement.executeUpdate();
            System.out.println(i +"row affected");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
