/*
    Elzoz
 */
package atm;
import javax.swing.*;
import java.sql.*;

public class forgetpassword extends javax.swing.JFrame {

    public forgetpassword() {
        initComponents();
        LOGIN2.setVisible(false);
    }
    int qr;
    public forgetpassword(int n) {
        initComponents();
        qr=n;
        LOGIN2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CHECKBTN = new javax.swing.JButton();
        SIGNUPBTN2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        accnum = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        EXITBTN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LOGIN1 = new javax.swing.JLabel();
        LOGIN2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ForgetPassword");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Give Us These Informations To Ensure This Account Is Yours");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 420, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-user-48.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("___________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 287, 42));

        CHECKBTN.setBackground(new java.awt.Color(244, 244, 244));
        CHECKBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CHECKBTN.setForeground(new java.awt.Color(102, 0, 102));
        CHECKBTN.setText("CHECK");
        CHECKBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CHECKBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHECKBTNMouseClicked(evt);
            }
        });
        jPanel2.add(CHECKBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 343, 37));

        SIGNUPBTN2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SIGNUPBTN2.setForeground(new java.awt.Color(255, 255, 255));
        SIGNUPBTN2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SIGNUPBTN2.setText("LogIn");
        SIGNUPBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNUPBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNUPBTN2MouseClicked(evt);
            }
        });
        jPanel2.add(SIGNUPBTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 117, -1));

        name.setBackground(new java.awt.Color(102, 0, 102));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(242, 242, 242));
        jLabel14.setText("AccNum");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("___________________________________________________________");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 287, 42));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-phone-35.png")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-address-35.png")); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("___________________________________________________________");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 287, 42));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(242, 242, 242));
        jLabel19.setText("Phone");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        accnum.setBackground(new java.awt.Color(102, 0, 102));
        accnum.setForeground(new java.awt.Color(255, 255, 255));
        accnum.setBorder(null);
        jPanel2.add(accnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 280, 20));

        address.setBackground(new java.awt.Color(102, 0, 102));
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(null);
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(242, 242, 242));
        jLabel20.setText("Address");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("___________________________________________________________");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 300, 42));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-id-35.png")); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        phone.setBackground(new java.awt.Color(102, 0, 102));
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setBorder(null);
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 242, 242));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("I'm already remember it !");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 210, -1));

        EXITBTN.setBackground(new java.awt.Color(255, 255, 255));
        EXITBTN.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        EXITBTN.setForeground(new java.awt.Color(255, 255, 255));
        EXITBTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-close-30 (1).png")); // NOI18N
        EXITBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITBTNMouseClicked(evt);
            }
        });
        jPanel2.add(EXITBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 28, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 0, -1, 621));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\zoro.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 69, 467, 317));

        LOGIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGIN1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button (5).png")); // NOI18N
        LOGIN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGIN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOGIN1MouseEntered(evt);
            }
        });
        jPanel3.add(LOGIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 599, 78));

        LOGIN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGIN2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button (6).png")); // NOI18N
        LOGIN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGIN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGIN2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGIN2MouseExited(evt);
            }
        });
        jPanel3.add(LOGIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 599, 78));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("I'm already remember it !");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 600, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection con =null ;
    PreparedStatement pst = null;
    ResultSet Rs=null;
    Statement st;
    private void CHECKBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHECKBTNMouseClicked
        if(accnum.getText().isEmpty()||phone.getText().isEmpty()||address.getText().isEmpty()||name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"MISSING INFORMATION");
        }
        else{
            con =null;
            pst =null;
            Rs =null;
            String query;
            if(qr==1){
                query = "select * from employee where accnum = ? ";
            }
            else{
                query = "select * from accounttbl where accnum = ? ";
            }
            
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                pst = con.prepareStatement(query);
                pst.setString(1, accnum.getText() );
                Rs=pst.executeQuery();
                if( Rs.next())
                {
                    if(qr==1)
                    {
                        String x1 = Rs.getString(1);
                        String x2 = Rs.getString(4);
                        String x3 = Rs.getString(5);
                        if(x1.equals(name.getText())&&x2.equals(address.getText())&&x3.equals(phone.getText()))
                        {
                            new CHANGEPIN(Integer.valueOf(accnum.getText()),1).setVisible(true);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Wrong Information ): ");
                        }
                    }
                    else{
                        String x1 = Rs.getString(2);
                        String x2 = Rs.getString(6);
                        String x3 = Rs.getString(5);
                        if(x1.equals(name.getText())&&x2.equals(address.getText())&&x3.equals(phone.getText()))
                        {
                            new CHANGEPIN(Integer.valueOf(accnum.getText()),2).setVisible(true);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Wrong Information ): ");
                        }
                    }
                    
                   
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
    }//GEN-LAST:event_CHECKBTNMouseClicked

    private void SIGNUPBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNUPBTN2MouseClicked
        new log().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SIGNUPBTN2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void LOGIN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGIN1MouseEntered
        LOGIN1.setVisible(false);
        LOGIN2.setVisible(true);
    }//GEN-LAST:event_LOGIN1MouseEntered

    private void LOGIN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGIN2MouseExited
        LOGIN1.setVisible(true);
        LOGIN2.setVisible(false);
    }//GEN-LAST:event_LOGIN2MouseExited

    private void LOGIN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGIN2MouseClicked
        new log().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGIN2MouseClicked

    private void EXITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITBTNMouseClicked
        System.exit(1);
    }//GEN-LAST:event_EXITBTNMouseClicked

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
            java.util.logging.Logger.getLogger(forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgetpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECKBTN;
    private javax.swing.JLabel EXITBTN;
    private javax.swing.JLabel LOGIN1;
    private javax.swing.JLabel LOGIN2;
    private javax.swing.JLabel SIGNUPBTN2;
    private javax.swing.JTextField accnum;
    private javax.swing.JTextField address;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
