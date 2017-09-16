import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Order extends javax.swing.JFrame {

    
static Connection cn,con;
static PreparedStatement stmt;
static Statement st;
static ResultSet rs;
static String my[]=new String[10];
static int i=0;
    public Order() {
        initComponents();
        try
        {
              
          //   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
 //String url="jdbc:sqlserver://219.64.66.72:1433;instance=.\\MIMIT;databaseName=CollegeDB;user=user1;password=123";
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
 String url="jdbc:sqlserver://192.168.21.20:1433;instance=ANANYA-HP;databaseName=Collage;user=user2;password=12345";
            String sql = "select * from mainTable";
            cn = DriverManager.getConnection(url);
           //  stmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
     //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      //  cn=DriverManager.getConnection("jdbc:odbc:MK");
              
        st=cn.createStatement();
       
        rs=st.executeQuery(sql);
 
        while(rs.next())
        {
            my[i]=new String();

            my[i]=String.valueOf(rs.getString(1));

            jComboBox1.addItem(String.valueOf(rs.getString(1)));
            my[i]=String.valueOf(rs.getString(2));
         jComboBox2.addItem(String.valueOf(rs.getString(2)));
          my[i]=String.valueOf(rs.getString(3));
           jComboBox3.addItem(String.valueOf(rs.getString(3)));
            my[i]=String.valueOf(rs.getString(4));
           jComboBox4.addItem(String.valueOf(rs.getString(4)));
          // my[i]=String.valueOf(rs.getString(5));
          // jComboBox5.addItem(String.valueOf(rs.getString(5)));
   i++;
   
        }
       
        }
        catch(Exception e)
        {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton6.setText("Show Table");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setText("SHOP ITEMS");

        jButton5.setText("Place Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setText("Username");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Price");

        jLabel13.setText("Laptop Name");

        jLabel16.setText("Operating sysyem");

        jLabel15.setText("Company");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel1.setText("SRno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 110, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jComboBox2, 0, 110, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, 110, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jButton6))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(89, 89, 89)
                        .addComponent(jLabel13)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel14)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Vector columnNames = new Vector();
        Vector data = new Vector();
        JPanel p=new JPanel();
        try {
          //   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
 //String url="jdbc:sqlserver://219.64.66.72:1433;instance=.\\MIMIT;databaseName=CollegeDB;user=user1;password=123";
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
 String url="jdbc:sqlserver://192.168.21.20:1433;instance=ANANYA-HP;databaseName=Collage;user=user2;password=12345";
            String sql = "select * from mainTable";
            con = DriverManager.getConnection(url);
             stmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //Connection con = DriverManager.getConnection("jdbc:odbc:MK");
            //String sql = "Select * from main";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement( md.getColumnName(i) );
            }
            while (rs.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++){
                    row.addElement( rs.getObject(i) );
                }
                data.addElement( row );
            }
            rs.close();
            stmt.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        JTable table = new JTable(data, columnNames);
        TableColumn col;
        for (int i = 0; i < table.getColumnCount(); i++) {
            col = table.getColumnModel().getColumn(i);
            col.setMaxWidth(250);
        }
        JScrollPane scrollPane = new JScrollPane( table );
        p.add( scrollPane );
        JFrame f=new JFrame();
        f.add(p);
        f.setSize(600,400);
        f.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       try
{
 
       String srno=my[jComboBox1.getSelectedIndex()] ;
    
String msql="Select * from mainTable Where srno='"+srno+"'";
  st=cn.createStatement();

      rs=st.executeQuery(msql);

        while(rs.next())
        {
         jComboBox2.addItem(String.valueOf(rs.getString(2)));
           jComboBox3.addItem(String.valueOf(rs.getString(3)));
           jComboBox4.addItem(String.valueOf(rs.getString(4)));
           jComboBox5.addItem(String.valueOf(rs.getString(5)));
    }
        }
        catch(Exception e){}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        try
 {
      rs=stmt.executeQuery();
       rs.next();
   //   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
// String url="jdbc:sqlserver://219.64.66.72:1433;instance=.\\MIMIT;databaseName=CollegeDB;user=user1;password=123";
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
 String url="jdbc:sqlserver://192.168.21.20:1433;instance=ANANYA-HP;databaseName=Collage;user=user2;password=12345";
       String sql = "select * from order";
            con = DriverManager.getConnection(url);
             stmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
   //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:MK");
           // String sql = "Select * from order";
           // con = DriverManager.getConnection(url);
           //  stmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
 String un=jTextField4.getText();
          
           String cm1=jComboBox1.getSelectedItem().toString();
            String cm2=jComboBox2.getSelectedItem().toString();
             String cm3=jComboBox3.getSelectedItem().toString();
              String cm4=jComboBox4.getSelectedItem().toString();
               String cm5=jComboBox5.getSelectedItem().toString();
            String ssql="Insert Into order values(?,?,?,?,?,?)";
            stmt=con.prepareStatement(ssql);
stmt.setString(1, un);
stmt.setString(2,cm1);
stmt.setString(3, cm2);
stmt.setString(4, cm3);
stmt.setString(5, cm4);
stmt.setString(6, cm5);


stmt.executeUpdate();

JOptionPane.showMessageDialog(null, "Record Succesfully Inserted");
        
         jTextField4.setText("");
con.close();
        }
catch(Exception e)
  {
    JOptionPane.showMessageDialog(null, e);
}

    
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
