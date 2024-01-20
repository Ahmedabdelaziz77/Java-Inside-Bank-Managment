/*
    Elzoz
 */
package atm;
import javax.swing.JOptionPane;
import java.sql.*;

public class loguser extends javax.swing.JFrame {

    public loguser() {
        initComponents();
        show.setVisible(false);
        BACKBTN2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        EXITBTN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        fpas = new javax.swing.JLabel();
        LOGINBTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SIGNUPBTN = new javax.swing.JLabel();
        PASSWORDTb = new javax.swing.JPasswordField();
        ACCNUMTb = new javax.swing.JTextField();
        unshow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BACKBTN1 = new javax.swing.JLabel();
        BACKBTN2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(EXITBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 0, 28, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 415, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("___________________________________________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 287, 42));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hello! let's get started");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 415, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-user-48.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Accnum");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 135, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("___________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 287, 42));

        show.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-blind-30.png")); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 237, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 221, -1, -1));

        jCheckBox1.setForeground(new java.awt.Color(242, 242, 242));
        jCheckBox1.setText("Remember Password");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 308, -1, -1));

        fpas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fpas.setForeground(new java.awt.Color(242, 242, 242));
        fpas.setText("Forget Password ?");
        fpas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fpas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpasMouseClicked(evt);
            }
        });
        jPanel2.add(fpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 307, -1, -1));

        LOGINBTN.setBackground(new java.awt.Color(244, 244, 244));
        LOGINBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGINBTN.setForeground(new java.awt.Color(102, 0, 102));
        LOGINBTN.setText("LOGIN");
        LOGINBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGINBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINBTNMouseClicked(evt);
            }
        });
        jPanel2.add(LOGINBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 369, 343, 37));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Don't have an account ?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 424, 219, -1));

        SIGNUPBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SIGNUPBTN.setForeground(new java.awt.Color(255, 255, 255));
        SIGNUPBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SIGNUPBTN.setText("Sign up");
        SIGNUPBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNUPBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNUPBTNMouseClicked(evt);
            }
        });
        jPanel2.add(SIGNUPBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 424, 117, -1));

        PASSWORDTb.setBackground(new java.awt.Color(102, 0, 102));
        PASSWORDTb.setFont(PASSWORDTb.getFont().deriveFont(PASSWORDTb.getFont().getSize()+2f));
        PASSWORDTb.setForeground(new java.awt.Color(255, 255, 255));
        PASSWORDTb.setBorder(null);
        jPanel2.add(PASSWORDTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, 30));

        ACCNUMTb.setBackground(new java.awt.Color(102, 0, 102));
        ACCNUMTb.setForeground(new java.awt.Color(255, 255, 255));
        ACCNUMTb.setBorder(null);
        jPanel2.add(ACCNUMTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 280, 30));

        unshow.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-eye-30.png")); // NOI18N
        unshow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unshowMouseClicked(evt);
            }
        });
        jPanel2.add(unshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 237, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 0, -1, 468));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\okk.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 40, 443, 340));

        BACKBTN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBTN1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button (8).png")); // NOI18N
        BACKBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BACKBTN1MouseEntered(evt);
            }
        });
        jPanel3.add(BACKBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 570, 80));

        BACKBTN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBTN2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button (7).png")); // NOI18N
        BACKBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BACKBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKBTN2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BACKBTN2MouseExited(evt);
            }
        });
        jPanel3.add(BACKBTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 570, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOGIN AS A USER");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 570, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITBTNMouseClicked
        System.exit(1);
    }//GEN-LAST:event_EXITBTNMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        PASSWORDTb.setEchoChar('*');
        unshow.setVisible(true);
        unshow.setEnabled(true);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void LOGINBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINBTNMouseClicked
        Connection con =null ;
        PreparedStatement pst = null;
        ResultSet Rs=null;
        if(ACCNUMTb.getText().isEmpty()||PASSWORDTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter Account and PIN ");
        }
        else
        {
            String query = "select * from accounttbl where AccNum = ? and PIN = ?";
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                pst = con.prepareStatement(query);
                pst.setString(1, ACCNUMTb.getText());
                pst.setString(2, PASSWORDTb.getText());
                Rs = pst.executeQuery();
                if(Rs.next())
                {
                    new MainMenu(Rs.getInt(1),2).setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, " Wrong Account Number Or PIN ");
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

    }//GEN-LAST:event_LOGINBTNMouseClicked

    private void SIGNUPBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNUPBTNMouseClicked
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SIGNUPBTNMouseClicked

    private void unshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unshowMouseClicked
        PASSWORDTb.setEchoChar((char)0);
        unshow.setVisible(false);
        unshow.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);
    }//GEN-LAST:event_unshowMouseClicked

    private void fpasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpasMouseClicked
        new forgetpassword(2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fpasMouseClicked

    private void BACKBTN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBTN1MouseEntered
        BACKBTN1.setVisible(false);
        BACKBTN2.setVisible(true);
    }//GEN-LAST:event_BACKBTN1MouseEntered

    private void BACKBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBTN2MouseClicked
        new CHOOSESERVICE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACKBTN2MouseClicked

    private void BACKBTN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBTN2MouseExited
        BACKBTN1.setVisible(true);
        BACKBTN2.setVisible(false);
    }//GEN-LAST:event_BACKBTN2MouseExited

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
            java.util.logging.Logger.getLogger(loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loguser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACCNUMTb;
    private javax.swing.JLabel BACKBTN1;
    private javax.swing.JLabel BACKBTN2;
    private javax.swing.JLabel EXITBTN;
    private javax.swing.JButton LOGINBTN;
    private javax.swing.JPasswordField PASSWORDTb;
    private javax.swing.JLabel SIGNUPBTN;
    private javax.swing.JLabel fpas;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel show;
    private javax.swing.JLabel unshow;
    // End of variables declaration//GEN-END:variables
}
