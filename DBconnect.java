 package com.raushani;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
    Connection con;
    
    public DBconnect()
    {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/StockMarket");
            System.out.println("connected successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String arg[])
    {
       new DBconnect();
        
    }
    
    
}
