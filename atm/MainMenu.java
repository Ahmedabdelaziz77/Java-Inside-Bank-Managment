/*
    Elzoz
 */
package atm;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }
    int MYACCNUM,qr;
    public MainMenu(int ACCNUM,int n) {
        initComponents();
        MYACCNUM=ACCNUM;
        ACCNUMLBL.setText(""+MYACCNUM);
        qr=n;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DepositBtn8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DepositBtn = new javax.swing.JButton();
        MINISTATEMENTBTN = new javax.swing.JButton();
        CHANGEPINBTN = new javax.swing.JButton();
        BALANCEBTN = new javax.swing.JButton();
        WITHDRAWBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LOGOUTBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DepositBtn7 = new javax.swing.JButton();
        ACCNUMLBL = new javax.swing.JLabel();
        BALANCEBTN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BANK OF EGYPT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Your Transaction");

        DepositBtn8.setBackground(new java.awt.Color(102, 0, 102));
        DepositBtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DepositBtn8.setForeground(new java.awt.Color(255, 255, 255));
        DepositBtn8.setText("X");
        DepositBtn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepositBtn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBtn8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepositBtn8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DepositBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Account Number :");

        DepositBtn.setBackground(new java.awt.Color(102, 0, 102));
        DepositBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DepositBtn.setForeground(new java.awt.Color(255, 255, 255));
        DepositBtn.setText("DEPOSIT");
        DepositBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepositBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBtnMouseClicked(evt);
            }
        });

        MINISTATEMENTBTN.setBackground(new java.awt.Color(102, 0, 102));
        MINISTATEMENTBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MINISTATEMENTBTN.setForeground(new java.awt.Color(255, 255, 255));
        MINISTATEMENTBTN.setText("MINI STATEMENT");
        MINISTATEMENTBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINISTATEMENTBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINISTATEMENTBTNMouseClicked(evt);
            }
        });

        CHANGEPINBTN.setBackground(new java.awt.Color(102, 0, 102));
        CHANGEPINBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CHANGEPINBTN.setForeground(new java.awt.Color(255, 255, 255));
        CHANGEPINBTN.setText("CHANGE PIN");
        CHANGEPINBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CHANGEPINBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGEPINBTNMouseClicked(evt);
            }
        });
        CHANGEPINBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHANGEPINBTNActionPerformed(evt);
            }
        });

        BALANCEBTN.setBackground(new java.awt.Color(102, 0, 102));
        BALANCEBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BALANCEBTN.setForeground(new java.awt.Color(255, 255, 255));
        BALANCEBTN.setText("BALANCE");
        BALANCEBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BALANCEBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BALANCEBTNMouseClicked(evt);
            }
        });

        WITHDRAWBTN.setBackground(new java.awt.Color(102, 0, 102));
        WITHDRAWBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WITHDRAWBTN.setForeground(new java.awt.Color(255, 255, 255));
        WITHDRAWBTN.setText("WITHDRAW");
        WITHDRAWBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WITHDRAWBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WITHDRAWBTNMouseClicked(evt);
            }
        });
        WITHDRAWBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWBTNActionPerformed(evt);
            }
        });

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

        LOGOUTBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LOGOUTBTN.setForeground(new java.awt.Color(102, 0, 102));
        LOGOUTBTN.setText("LOGOUT");
        LOGOUTBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGOUTBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTBTNMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("BANK OF EGYPT");

        DepositBtn7.setBackground(new java.awt.Color(102, 0, 102));
        DepositBtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DepositBtn7.setForeground(new java.awt.Color(255, 255, 255));
        DepositBtn7.setText("FAST CASH");
        DepositBtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepositBtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBtn7MouseClicked(evt);
            }
        });

        ACCNUMLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ACCNUMLBL.setForeground(new java.awt.Color(153, 0, 153));
        ACCNUMLBL.setText("??");

        BALANCEBTN1.setBackground(new java.awt.Color(102, 0, 102));
        BALANCEBTN1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BALANCEBTN1.setForeground(new java.awt.Color(255, 255, 255));
        BALANCEBTN1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\icons8-block-35.png")); // NOI18N
        BALANCEBTN1.setText("GET INFORMATIONS ");
        BALANCEBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BALANCEBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BALANCEBTN1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DepositBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WITHDRAWBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(BALANCEBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MINISTATEMENTBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHANGEPINBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DepositBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACCNUMLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(LOGOUTBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(BALANCEBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ACCNUMLBL))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHANGEPINBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WITHDRAWBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BALANCEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MINISTATEMENTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BALANCEBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LOGOUTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void DepositBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBtnMouseClicked
        new Deposit(MYACCNUM,qr).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_DepositBtnMouseClicked

    private void WITHDRAWBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WITHDRAWBTNMouseClicked
        new WITHDRAW(MYACCNUM,qr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WITHDRAWBTNMouseClicked

    private void BALANCEBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BALANCEBTNMouseClicked
        new BALANCE (MYACCNUM,qr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BALANCEBTNMouseClicked

    private void CHANGEPINBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGEPINBTNMouseClicked
        new CHANGEPIN(MYACCNUM,qr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CHANGEPINBTNMouseClicked

    private void DepositBtn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBtn8MouseClicked
        System.exit(1);
    }//GEN-LAST:event_DepositBtn8MouseClicked

    private void DepositBtn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBtn7MouseClicked
        new FASTCASH(MYACCNUM,qr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositBtn7MouseClicked

    private void MINISTATEMENTBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINISTATEMENTBTNMouseClicked
        new MINISTATMENT(MYACCNUM,qr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MINISTATEMENTBTNMouseClicked

    private void LOGOUTBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTBTNMouseClicked
        new CHOOSESERVICE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTBTNMouseClicked

    private void BALANCEBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BALANCEBTN1MouseClicked
         new CHOOSEUSER(Integer.valueOf(MYACCNUM),qr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BALANCEBTN1MouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACCNUMLBL;
    private javax.swing.JButton BALANCEBTN;
    private javax.swing.JButton BALANCEBTN1;
    private javax.swing.JButton CHANGEPINBTN;
    private javax.swing.JButton DepositBtn;
    private javax.swing.JButton DepositBtn7;
    private javax.swing.JButton DepositBtn8;
    private javax.swing.JButton LOGOUTBTN;
    private javax.swing.JButton MINISTATEMENTBTN;
    private javax.swing.JButton WITHDRAWBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
