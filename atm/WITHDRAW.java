/*
    Elzoz
 */
package atm;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class WITHDRAW extends javax.swing.JFrame {

    public WITHDRAW() {
        initComponents();
    }
    int MYACCNUM,qr;
    public WITHDRAW(int AccNum,int n) 
    {
        initComponents();
        MYACCNUM=AccNum;
        qr=n;
        getBalance();
    }
    Connection con =null ;
    PreparedStatement pst = null;
    ResultSet Rs=null;
    Statement st=null ;
    int oldBalance;
    private void getBalance()
    {
            try{ 
                String query;  
                if(qr==1){
                    query = "select * from employee where accnum = ? ";
                }
                else{
                    query = "select * from accounttbl where AccNum = ? ";
                }
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                pst = con.prepareStatement(query);
                pst.setInt(1, MYACCNUM);
                Rs = pst.executeQuery();
                if(Rs.next())
                {
                    if(qr==1){
                        oldBalance=Rs.getInt(6);
                    }
                    else{
                        oldBalance=Rs.getInt(9);
                    }
                   
                   BALLBL.setText(""+oldBalance);
                }
                else
                {
                    //JOptionPane.showMessageDialog(null, " Wrong Account Number Or PIN ");
                }
                }
                catch (NumberFormatException | SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } 
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EXITBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AMOUNTb = new javax.swing.JTextField();
        DepositBtn6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LOGOUTBTN = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BALLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BANK OF EGYPT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATM MANAGMENT SYSTEM");

        EXITBTN.setBackground(new java.awt.Color(102, 0, 102));
        EXITBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EXITBTN.setForeground(new java.awt.Color(255, 255, 255));
        EXITBTN.setText("X");
        EXITBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(187, 187, 187)
                .addComponent(EXITBTN))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("AMOUNT :");

        AMOUNTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMOUNTbMouseClicked(evt);
            }
        });

        DepositBtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DepositBtn6.setForeground(new java.awt.Color(102, 0, 102));
        DepositBtn6.setText("WITHDRAW");
        DepositBtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepositBtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBtn6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("WITHDRAW");

        LOGOUTBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LOGOUTBTN.setForeground(new java.awt.Color(102, 0, 102));
        LOGOUTBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUTBTN.setText("LOGOUT");
        LOGOUTBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGOUTBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTBTNMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Your Balance :");

        BALLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BALLBL.setForeground(new java.awt.Color(102, 0, 102));
        BALLBL.setText("??");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BALLBL)
                .addContainerGap(246, Short.MAX_VALUE))
            .addComponent(LOGOUTBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(AMOUNTb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(DepositBtn6)
                        .addGap(210, 210, 210))))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(BALLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AMOUNTb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(DepositBtn6)
                .addGap(29, 29, 29)
                .addComponent(LOGOUTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AMOUNTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMOUNTbMouseClicked
       
    }//GEN-LAST:event_AMOUNTbMouseClicked

    private void DepositBtn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBtn6MouseClicked
        if(AMOUNTb.getText().isEmpty()||AMOUNTb.getText().equals(0))
        {
            JOptionPane.showMessageDialog(null, " Please Enter Valid Amount ");
        }
       else if(Integer.valueOf(AMOUNTb.getText()) > oldBalance )
        {   
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Amount (: " +oldBalance );        
        }
        else
        {
            String query;
            con =null ;
            pst = null;
            Rs=null;
            if(qr==1){
                query= "Update employee set balance = ? where accnum = ? ";
            }
            else{
               query= "Update accounttbl set Balance = ? where AccNum = ? ";
            }
            
             try{ 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                pst = con.prepareStatement(query);
                int newBalance,row;
                newBalance = oldBalance - Integer.valueOf(AMOUNTb.getText());
                pst.setInt(1, newBalance );
                pst.setInt(2,MYACCNUM);
                row=pst.executeUpdate(); 
                if( row == 1)
                {
                    JOptionPane.showMessageDialog(null, " Balance Updated Successfuly (: ");
                    BALLBL.setText(""+newBalance);
                    WithDrawMoney();
                    new MainMenu(MYACCNUM,qr).setVisible(true);
                    this.dispose();
                }
                else
                {
                     JOptionPane.showMessageDialog(null, "Missing Information ): ");
                }
                }
                catch (NumberFormatException | SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } 
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
        }
    }//GEN-LAST:event_DepositBtn6MouseClicked

    private void LOGOUTBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTBTNMouseClicked
        new CHOOSESERVICE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTBTNMouseClicked

    private void EXITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITBTNMouseClicked
        System.exit(1);
    }//GEN-LAST:event_EXITBTNMouseClicked
   
    int Trid=1;
     private void CountDep()
    {
        con =null ;
        pst = null;
        Rs=null;
        st=null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
            st=con.createStatement();
            Rs=st.executeQuery("select MAX(Tid) from transactiontbl ");
            Rs.next();
            Trid=Rs.getInt(1)+1;
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    
    String withdraw;
     String MyDate;
    public void GetDate()
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        MyDate = s.format(d);
    }
    public void WithDrawMoney() throws SQLException{
        con =null ;
        pst = null;
        Rs=null;
        try
        { 
            GetDate();
            CountDep();
            if(qr==1){
                withdraw="WITHDRAW EMPLOYEE";
            }
            else{
                withdraw="WITHDRAW USER";
            }
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
            String query="INSERT INTO  transactiontbl (Tid,AccNum,Type,TDate,Amount) VALUES ( ?, ?, ?, ?, ? ) ";
            pst = con.prepareStatement(query);
            pst.setInt(1,Trid);
            pst.setInt(2, Integer.valueOf(MYACCNUM));
            pst.setString(3, withdraw);
            pst.setString(4, MyDate);
            pst.setString(5, AMOUNTb.getText() );   
            int row=pst.executeUpdate();
            //JOptionPane.showMessageDialog(null," Account Saved ");
            //con.close();
        }
        catch (NumberFormatException | SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WITHDRAW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMOUNTb;
    private javax.swing.JLabel BALLBL;
    private javax.swing.JButton DepositBtn6;
    private javax.swing.JButton EXITBTN;
    private javax.swing.JLabel LOGOUTBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
