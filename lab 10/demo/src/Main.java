import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Stack;

import com.mysql.jdbc.Driver;
public class Main {
    public static void main(String[] args) {
//        DBName : javatoturial
            try{
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                String user = "root";
                String password = "1191997";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java",user,password);
                Statement stmt = con.createStatement();
                String query = new String("SELECT * from book");
                ResultSet rs = stmt.executeQuery(query);
                int i =0;
                while (rs.next()){
                    i++;
                    System.out.println("Item "+i+"\n ID : "+rs.getString(1)+"\n Name : "+rs.getString(2)+"\n Image : "+rs.getString(3));
                }
                stmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
    }
}