/*
    Elzoz
 */
package atm;
import javax.swing.*;
import java.sql.*;

public class sign extends javax.swing.JFrame {

    public sign() {
        initComponents();
        SIGNINBTN2.setVisible(false);
        show1.setVisible(false);
        show2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LOGINBTN1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SIGNUPBTN2 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        accnum = new javax.swing.JTextField();
        unshow2 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        unshow1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        EXITBTN = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        SIGNINBTN2 = new javax.swing.JLabel();
        SIGNINBTN1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\lastsign.png")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SignUp");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 415, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hello! let's get started");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 415, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-user-48.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("___________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 287, 42));

        show1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-blind-30.png")); // NOI18N
        show1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel2.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        LOGINBTN1.setBackground(new java.awt.Color(244, 244, 244));
        LOGINBTN1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGINBTN1.setForeground(new java.awt.Color(102, 0, 102));
        LOGINBTN1.setText("SIGNUP");
        LOGINBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGINBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINBTN1MouseClicked(evt);
            }
        });
        jPanel2.add(LOGINBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 343, 37));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("I'm already a member !");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 210, -1));

        SIGNUPBTN2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SIGNUPBTN2.setForeground(new java.awt.Color(255, 255, 255));
        SIGNUPBTN2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SIGNUPBTN2.setText("Sign In");
        SIGNUPBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNUPBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNUPBTN2MouseClicked(evt);
            }
        });
        jPanel2.add(SIGNUPBTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 117, -1));

        password1.setBackground(new java.awt.Color(102, 0, 102));
        password1.setFont(password1.getFont().deriveFont(password1.getFont().getSize()+2f));
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setBorder(null);
        jPanel2.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 280, 20));

        accnum.setBackground(new java.awt.Color(102, 0, 102));
        accnum.setForeground(new java.awt.Color(255, 255, 255));
        accnum.setBorder(null);
        jPanel2.add(accnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, 20));

        unshow2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-eye-30.png")); // NOI18N
        unshow2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unshow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unshow2MouseClicked(evt);
            }
        });
        jPanel2.add(unshow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        password2.setBackground(new java.awt.Color(102, 0, 102));
        password2.setFont(password2.getFont().deriveFont(password2.getFont().getSize()+2f));
        password2.setForeground(new java.awt.Color(255, 255, 255));
        password2.setBorder(null);
        jPanel2.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("___________________________________________________________");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 287, 42));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("___________________________________________________________");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 287, 42));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 242, 242));
        jLabel13.setText("Password Confirmation");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        show2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-blind-30.png")); // NOI18N
        show2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });
        jPanel2.add(show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        unshow1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-eye-30.png")); // NOI18N
        unshow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unshow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unshow1MouseClicked(evt);
            }
        });
        jPanel2.add(unshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(242, 242, 242));
        jLabel14.setText("AccNum");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("___________________________________________________________");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 287, 42));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-phone-35.png")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-address-35.png")); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("___________________________________________________________");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 287, 42));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(242, 242, 242));
        jLabel19.setText("Phone");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        name.setBackground(new java.awt.Color(102, 0, 102));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, 20));

        address.setBackground(new java.awt.Color(102, 0, 102));
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(null);
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 280, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(242, 242, 242));
        jLabel20.setText("Address");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("___________________________________________________________");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 300, 42));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-id-35.png")); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        phone.setBackground(new java.awt.Color(102, 0, 102));
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setBorder(null);
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 280, 20));

        EXITBTN.setBackground(new java.awt.Color(102, 0, 102));
        EXITBTN.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        EXITBTN.setForeground(new java.awt.Color(102, 0, 102));
        EXITBTN.setText("X");
        EXITBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Already hava an account?");

        SIGNINBTN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIGNINBTN2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button (1).png")); // NOI18N
        SIGNINBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNINBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNINBTN2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SIGNINBTN2MouseExited(evt);
            }
        });

        SIGNINBTN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIGNINBTN1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button.png")); // NOI18N
        SIGNINBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNINBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SIGNINBTN1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(EXITBTN)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(127, 127, 127))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SIGNINBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SIGNINBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EXITBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SIGNINBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIGNINBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(246, 246, 246))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Clear()
    {
        name.setText("");
        password1.setText("");
        password2.setText("");
        phone.setText("");
        address.setText("");
        accnum.setText("");
    }
    private void SIGNINBTN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNINBTN1MouseEntered
        SIGNINBTN1.setVisible(false);
        SIGNINBTN2.setVisible(true);
    }//GEN-LAST:event_SIGNINBTN1MouseEntered

    private void SIGNINBTN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNINBTN2MouseExited
       SIGNINBTN1.setVisible(true);
        SIGNINBTN2.setVisible(false);
    }//GEN-LAST:event_SIGNINBTN2MouseExited

    private void SIGNINBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNINBTN2MouseClicked
        new log().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SIGNINBTN2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jPanel3MouseClicked
    Connection con ;
    PreparedStatement pst ;
    ResultSet Rs ;
    private void LOGINBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINBTN1MouseClicked
        if(name.getText().isEmpty()||password1.getText().isEmpty()||password2.getText().isEmpty()||phone.getText().isEmpty()||address.getText().isEmpty()||accnum.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"MISSING INFORMATION");
        }
        else if(! password1.getText().equals(password2.getText())){
            JOptionPane.showMessageDialog(null,"Password and PasswordConfirmation is different ");
        }
        else{
                 con =null;
                 pst =null;
                 Rs =null;
                 String query;
                 query = "INSERT INTO employee (name, password, accnum,phone, address,balance)  VALUES ( ?, ?, ?, ? , ? , ? )";
                 try{ 
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"atmdb"+"?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                        pst = con.prepareStatement(query);
                        pst.setString(1, name.getText() );
                        pst.setString(2,password1.getText());
                        pst.setString(3, accnum.getText() );
                        pst.setString(4,phone.getText());
                        pst.setString(5, address.getText() );
                        pst.setInt(6,0);
                        int row=pst.executeUpdate();
                        if( row == 1)
                        {
                            JOptionPane.showMessageDialog(null, " Welcome (: ");
                            new log().setVisible(true);
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
    }//GEN-LAST:event_LOGINBTN1MouseClicked

    private void SIGNUPBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNUPBTN2MouseClicked
        new log().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SIGNUPBTN2MouseClicked

    private void unshow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unshow1MouseClicked
        password1.setEchoChar((char)0);
        unshow1.setVisible(false);
        unshow1.setEnabled(false);
        show1.setVisible(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_unshow1MouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        password1.setEchoChar('*');
        unshow1.setVisible(true);
        unshow1.setEnabled(true);
        show1.setVisible(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        password2.setEchoChar('*');
        unshow2.setVisible(true);
        unshow2.setEnabled(true);
        show2.setVisible(false);
        show2.setEnabled(false);
    }//GEN-LAST:event_show2MouseClicked

    private void unshow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unshow2MouseClicked
        password2.setEchoChar((char)0);
        unshow2.setVisible(false);
        unshow2.setEnabled(false);
        show2.setVisible(true);
        show2.setEnabled(true);
    }//GEN-LAST:event_unshow2MouseClicked

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
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EXITBTN;
    private javax.swing.JButton LOGINBTN1;
    private javax.swing.JLabel SIGNINBTN1;
    private javax.swing.JLabel SIGNINBTN2;
    private javax.swing.JLabel SIGNUPBTN2;
    private javax.swing.JTextField accnum;
    private javax.swing.JTextField address;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    private javax.swing.JLabel unshow1;
    private javax.swing.JLabel unshow2;
    // End of variables declaration//GEN-END:variables
}
