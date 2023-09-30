
package com.raushani;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class projectJava {
    String email,username;
    String password;
    Connection con;
    public projectJava( String username,String pass,String email, Connection con)
    {
        this.password=pass;
        this.username=username;
        this.email=email;
        this.con=con;
    }
    public projectJava(Connection con)
    {
        password=" ";
        username="";
        email="";
        this.con=con;
    }
    public boolean insert() throws Exception
    {
        PreparedStatement ps= con.prepareStatement("Insert into usertable(username,email,password) values(?,?,?)");
        ps.setString(3, password);
        ps.setString(1, username);
        ps.setString(2, email);
        if(ps.executeUpdate()>0)
            return true;
        else
            return false;
    }
    public void display() throws Exception
    {
        PreparedStatement ps= con.prepareStatement("select * from usertable");
        ResultSet rs=ps.executeQuery();      
    }
    public void find() throws Exception
    {
       
    }
   public boolean delete(int d) throws Exception {
        PreparedStatement ps=con.prepareStatement("delete from usertable where password=?");
        ps.setInt(1,d);
        if(ps.executeUpdate()>0)
            return true;
        return false;
    }
}

//public class projectJava {
//    
//}
