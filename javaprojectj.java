package com.raushani;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class javaprojectj extends javax.swing.JFrame {
    Connection con;
    ResultSet rs=null;
    public javaprojectj() {
        initComponents();
        con=new DBconnect().con;
        sm.setEnabledAt(1,false);
        sm.setEnabledAt(2,false);
//        sm.setEnabledAt(3,false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sm = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        ei = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        u1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sq = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Database = new javax.swing.JTable();
        msg = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SignUp Page");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 30, 187, 33);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usename");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 110, 140, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 150, 140, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email ID");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 190, 140, 30);
        jPanel1.add(un);
        un.setBounds(300, 110, 240, 30);

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        jPanel1.add(p);
        p.setBounds(300, 150, 240, 30);

        ei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eiActionPerformed(evt);
            }
        });
        jPanel1.add(ei);
        ei.setBounds(300, 190, 240, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 280, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Already have an account?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 260, 130, 14);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SignUp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 280, 120, 30);

        jLabel6.setBackground(new java.awt.Color(255, 204, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raushani/rkk.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 750, 470);

        sm.addTab("SignUp", jPanel1);

        jPanel2.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login page");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(250, 50, 160, 40);

        u1.setBackground(new java.awt.Color(255, 255, 255));
        u1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u1.setText("Username");
        u1.setOpaque(true);
        jPanel2.add(u1);
        u1.setBounds(89, 134, 140, 30);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("password");
        p1.setOpaque(true);
        jPanel2.add(p1);
        p1.setBounds(89, 190, 140, 30);

        uid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(uid);
        uid.setBounds(330, 140, 200, 30);

        pid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        jPanel2.add(pid);
        pid.setBounds(331, 194, 200, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(250, 290, 100, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raushani/rkk.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 10, 730, 470);

        sm.addTab("Login", jPanel2);

        jPanel3.setLayout(null);

        jLabel11.setText("Enter product name");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(58, 22, 140, 20);
        jPanel3.add(pn);
        pn.setBounds(60, 50, 130, 30);

        jLabel12.setText("Enter Product Id");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(60, 80, 130, 20);

        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        jPanel3.add(pi);
        pi.setBounds(60, 100, 130, 30);

        jLabel13.setText("Enter Stock Quantity");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(60, 140, 120, 25);
        jPanel3.add(sq);
        sq.setBounds(60, 160, 130, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Insert");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(600, 60, 90, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(600, 100, 90, 30);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(600, 140, 90, 30);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(600, 180, 90, 30);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Display");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(600, 220, 90, 30);

        Database.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Database.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Database);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 713, 140);

        msg.setBackground(new java.awt.Color(255, 255, 255));
        msg.setText("message will print here!");
        msg.setOpaque(true);
        jPanel3.add(msg);
        msg.setBounds(530, 270, 140, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raushani/rkk.jpg"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 0, 730, 470);

        sm.addTab("StockMarket", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sm, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_piActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void eiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sm.setSelectedIndex(1);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //;
        
        try{
            if(new projectJava(un.getText(), p.getText(),ei.getText(),con).insert())
            JOptionPane.showMessageDialog(this,"Signed Up","StockMarket",JOptionPane.PLAIN_MESSAGE);
        }catch (Exception ex){
            //msg.setText(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
        PreparedStatement ps=con.prepareStatement("select * from usertable where username=? and password=?");
        ps.setString(1, uid.getText());
        ps.setString(2, pid.getText());
        
//            if(new projectJava(un.getText(), p.getText(),ei.getText(),con))
//            JOptionPane.showMessageDialog(this,"Inserted Successfully","Update",JOptionPane.PLAIN_MESSAGE);
//     

        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            sm.setEnabledAt(1,true);
            sm.setEnabledAt(2,true);
            // sm.setSelectedIndex(2);
        }
        else
            JOptionPane.showMessageDialog(this,"Invalid UserName or Passwordt","ERROR",JOptionPane.ERROR_MESSAGE);
           // msg.setText("");
    } catch (SQLException ex) {
       ex.printStackTrace();
    }
           sm.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         try{
            if(new stk(Integer.parseInt(pi.getText()), pn.getText(),Integer.parseInt(sq.getText()),con).insert())
            JOptionPane.showMessageDialog(this,"Inserted Successfully","Update",JOptionPane.PLAIN_MESSAGE);
        }catch (Exception ex){
           // msg.setText(ex.getMessage());

            //msg.setText(ex.getMessage());
            ex.printStackTrace();
        }
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement ps=con.prepareStatement("Update stockmarket set product=? ,quantity=? where product_id=?");
            ps.setInt(2,Integer.parseInt(sq.getText()));
            ps.setInt(3,Integer.parseInt(pi.getText()));
            ps.setString(1,pn.getText());
            if(ps.executeUpdate()>0)
                JOptionPane.showMessageDialog(this,"Updated Successfully","Update",JOptionPane.PLAIN_MESSAGE);
            else 
               JOptionPane.showMessageDialog(this,"delete","Error",JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /*
        try {
            PreparedStatement ps=con.prepareStatement("Update dept set dname=? where did=?");
            ps.setInt(2,Integer.parseInt(did.getText()));
            ps.setString(1,dname.getText());
            if(ps.executeUpdate()>0)
                JOptionPane.showMessageDialog(this,"Updated Successfully","Update",JOptionPane.PLAIN_MESSAGE);
            else 
               JOptionPane.showMessageDialog(this,"delete","Error",JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       int d=Integer.parseInt(pi.getText());
        try{
            if(new stk(con).delete(d))
                msg.setText("Deleted successfully");
        }catch (Exception ex){
            msg.setText(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    try{
           PreparedStatement ps= con.prepareStatement("select * from stockmarket where product_id=? ");
           ps.setInt(1,Integer.parseInt(pi.getText()));
        rs=ps.executeQuery();
       
        if(rs.next())
        {
             //ps.setInt(Integer.parseInt(pi.getText(2)));
            // ps.setInt(3,Integer.parseInt(sq.getText()));
            //ps.setInt(2,Integer.valueOf(pi.getText()));
            pn.setText(rs.getString(2));
            //ps.setInt(3,Integer.valueOf(sq.getText()));
            
            
        }
        else
        {
            //System.out.println("Not in the database");
            JOptionPane.showMessageDialog(this,"Record doesn't exist","ERROR",JOptionPane.ERROR_MESSAGE);
        }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
       } 

        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
  try{
         PreparedStatement ps= con.prepareStatement("select * from stockmarket");
        rs=ps.executeQuery();               
        while(Database.getRowCount()>0)
        {
            ((DefaultTableModel)Database.getModel()).removeRow(0);
        }
        int columns=rs.getMetaData().getColumnCount();
        while(rs.next())
        {
            Object row[]=new Object[columns];
            for(int i=0; i<columns; i++)
                row[i]=rs.getObject(i+1);
            ((DefaultTableModel)Database.getModel()).insertRow(rs.getRow()-1,row);
        }
       } 
       catch(Exception e)
        {
            msg.setText(e.getMessage());

                   e.printStackTrace();
               }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(javaprojectj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaprojectj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaprojectj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaprojectj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaprojectj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Database;
    private javax.swing.JTextField ei;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField p;
    private javax.swing.JLabel p1;
    private javax.swing.JTextField pi;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pn;
    private javax.swing.JTabbedPane sm;
    private javax.swing.JTextField sq;
    private javax.swing.JLabel u1;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
