
package com.raushani;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Guddan
 */
public class stk {
    String product;
    int product_id,quantity;
    Connection con;
    public stk(int product_id, String product,int quantity, Connection con)
    {
        this.product=product;
        this.product_id=product_id;
        this.quantity=quantity;
        this.con=con;
    }
    public stk(Connection con)
    {
        product_id=0;
        product="";
        quantity=0;
        this.con=con;
    }
    public boolean insert() throws Exception
    {
        PreparedStatement ps= con.prepareStatement("Insert into stockmarket (product_id,product,quantity) values(?,?,?)");
        
        ps.setInt(1, product_id);
        ps.setString(2, product);
        ps.setInt(3, quantity);
        if(ps.executeUpdate()>0)
            return true;
        else
            return false;
    }
    public void display() throws Exception
    {
        PreparedStatement ps= con.prepareStatement("select * from stockmarket");
        ResultSet rs=ps.executeQuery();      
    }
    public void find() throws Exception
    {
       
    }
   public boolean delete(int d) throws Exception {
        PreparedStatement ps=con.prepareStatement("delete from stockmarket where product_id=?");
        ps.setInt(1,d);
        if(ps.executeUpdate()>0)
            return true;
        return false;
    }
}

//public class projectJava {
//    
//}


