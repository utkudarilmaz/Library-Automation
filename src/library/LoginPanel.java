package library;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginPanel extends javax.swing.JFrame {


    public LoginPanel() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solPanel = new javax.swing.JPanel();
        solYaziPanel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        sagPanel = new javax.swing.JPanel();
        sagYaziPanel = new javax.swing.JLabel();
        parolaPanel = new javax.swing.JLabel();
        numPanel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        parolaField = new javax.swing.JPasswordField();
        numaraField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        kaydolButton = new javax.swing.JButton();
        girisButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        solPanel.setBackground(new java.awt.Color(97, 212, 195));

        solYaziPanel.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        solYaziPanel.setForeground(new java.awt.Color(254, 254, 254));
        solYaziPanel.setText("Kitaplar Beynin Çocuklarıdır");

        iconLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        iconLabel.setForeground(java.awt.Color.lightGray);
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Library.png"))); // NOI18N

        jSeparator5.setBackground(java.awt.Color.white);
        jSeparator5.setForeground(java.awt.Color.white);
        jSeparator5.setAutoscrolls(true);
        jSeparator5.setOpaque(true);

        jSeparator6.setBackground(java.awt.Color.white);
        jSeparator6.setForeground(java.awt.Color.white);
        jSeparator6.setAutoscrolls(true);
        jSeparator6.setOpaque(true);

        javax.swing.GroupLayout solPanelLayout = new javax.swing.GroupLayout(solPanel);
        solPanel.setLayout(solPanelLayout);
        solPanelLayout.setHorizontalGroup(
            solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                        .addComponent(solYaziPanel)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                        .addGroup(solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconLabel))
                        .addGap(20, 20, 20))))
            .addGroup(solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                    .addContainerGap(64, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );
        solPanelLayout.setVerticalGroup(
            solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(solYaziPanel)
                .addGap(26, 26, 26)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                    .addContainerGap(338, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(139, 139, 139)))
        );

        getContentPane().add(solPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 480));

        sagPanel.setBackground(new java.awt.Color(36, 47, 65));
        sagPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sagYaziPanel.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        sagYaziPanel.setForeground(java.awt.Color.lightGray);
        sagYaziPanel.setText("Giriş Yap ya da Kaydol");
        sagPanel.add(sagYaziPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 71, -1, -1));

        parolaPanel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        parolaPanel.setForeground(java.awt.Color.lightGray);
        parolaPanel.setText("PAROLA");
        sagPanel.add(parolaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        numPanel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        numPanel.setForeground(java.awt.Color.lightGray);
        numPanel.setText("MÜŞTERİ NUMARASI");
        sagPanel.add(numPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jSeparator4.setBackground(java.awt.Color.white);
        jSeparator4.setForeground(java.awt.Color.white);
        jSeparator4.setAutoscrolls(true);
        jSeparator4.setOpaque(true);
        sagPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, 249, -1));

        parolaField.setBackground(new java.awt.Color(36, 47, 65));
        parolaField.setForeground(java.awt.Color.white);
        parolaField.setText("jPasswordField1");
        parolaField.setBorder(null);
        parolaField.setOpaque(false);
        parolaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                parolaFieldFocusGained(evt);
            }
        });
        sagPanel.add(parolaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 249, 26));

        numaraField.setBackground(new java.awt.Color(36, 47, 65));
        numaraField.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        numaraField.setForeground(java.awt.Color.white);
        numaraField.setText("Müşteri numaranızı giriniz");
        numaraField.setBorder(null);
        numaraField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numaraFieldMouseClicked(evt);
            }
        });
        sagPanel.add(numaraField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 250, 30));

        jSeparator7.setBackground(java.awt.Color.white);
        jSeparator7.setForeground(java.awt.Color.white);
        jSeparator7.setAutoscrolls(true);
        jSeparator7.setOpaque(true);
        sagPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 287, 249, -1));

        kaydolButton.setBackground(new java.awt.Color(252, 190, 27));
        kaydolButton.setForeground(new java.awt.Color(0, 0, 0));
        kaydolButton.setText("Kayıt Ol");
        kaydolButton.setBorder(null);
        kaydolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydolButtonActionPerformed(evt);
            }
        });
        sagPanel.add(kaydolButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 40));

        girisButton1.setBackground(new java.awt.Color(97, 212, 195));
        girisButton1.setForeground(new java.awt.Color(0, 0, 0));
        girisButton1.setText("Giriş Yap");
        girisButton1.setBorder(null);
        girisButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButton1ActionPerformed(evt);
            }
        });
        sagPanel.add(girisButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 40));

        getContentPane().add(sagPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 330, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numaraFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numaraFieldMouseClicked
        numaraField.setText("");
    }//GEN-LAST:event_numaraFieldMouseClicked

    private void parolaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_parolaFieldFocusGained
        parolaField.setText("");
    }//GEN-LAST:event_parolaFieldFocusGained

    private void kaydolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydolButtonActionPerformed
        KayitOl yeniKayit = new KayitOl();
        yeniKayit.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kaydolButtonActionPerformed

    private void girisButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButton1ActionPerformed
        Database database = new Database();
        String query="Select id,password from users where id="+numaraField.getText();
        boolean x=false;
        try{
            database.runDatabase();
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(query);
            while(database.result.next()){
                if (database.result.getString(1).equals(numaraField.getText()) && database.result.getString(2).equals(parolaField.getText())){
                   x=true;
                   Menu menu = new Menu(database.result.getString(1));
                   menu.setVisible(true);
                   setVisible(false); 
                }
            }if(!x){
                JOptionPane.showMessageDialog(null,"Girdiğiniz Kullanıcı Adı veya Parola Hatalı!");
            }
             
        }catch(SQLException ex){
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_girisButton1ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisButton1;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton kaydolButton;
    private javax.swing.JLabel numPanel;
    private javax.swing.JTextField numaraField;
    private javax.swing.JPasswordField parolaField;
    private javax.swing.JLabel parolaPanel;
    private javax.swing.JPanel sagPanel;
    private javax.swing.JLabel sagYaziPanel;
    private javax.swing.JPanel solPanel;
    private javax.swing.JLabel solYaziPanel;
    // End of variables declaration//GEN-END:variables
}
