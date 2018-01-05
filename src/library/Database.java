package library;

import java.sql.*;

public class Database{
           
    Connection con;
    Statement state = null;
    ResultSet result = null;

    public static String url = "jdbc:mysql://localhost:3306/library";
    public static String user = "utku";
    public static String password = "123456";
    
    //Bağlanti kurma fonksiyonu
    public void runDatabase() throws SQLException{
        con = DriverManager.getConnection(url,user,password);  
    } 
    
}