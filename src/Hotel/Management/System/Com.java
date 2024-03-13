package Hotel.Management.System;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Com {
Connection connection;
Statement statement;
public  Com(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/arpitdb", "root","arpit8839");
        statement = connection.createStatement();
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
}
