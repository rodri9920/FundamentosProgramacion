
package tarealogin;

import java.awt.Color;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        this.setBackground(Color.BLUE);
        this.setSize(401, 328);
        jlbWelcome.setVisible(false);
        jlbError.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbID = new javax.swing.JLabel();
        jlbPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jlbError = new javax.swing.JLabel();
        jlbWelcome = new javax.swing.JLabel();
        jlbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jlbID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbID.setText("Usuario");
        getContentPane().add(jlbID);
        jlbID.setBounds(50, 60, 70, 20);

        jlbPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbPassword.setText("Contraseña");
        getContentPane().add(jlbPassword);
        jlbPassword.setBounds(50, 100, 100, 22);

        btnLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setActionCommand("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(130, 240, 150, 31);

        txtID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(170, 60, 150, 28);

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(170, 100, 150, 30);

        jlbError.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbError.setText("Su informacion no es valida");
        getContentPane().add(jlbError);
        jlbError.setBounds(50, 60, 270, 70);

        jlbWelcome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbWelcome.setText("Bienvenido");
        getContentPane().add(jlbWelcome);
        jlbWelcome.setBounds(50, 60, 270, 70);

        jlbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarealogin/Background.jpg"))); // NOI18N
        getContentPane().add(jlbBackground);
        jlbBackground.setBounds(0, 0, 400, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(txtID.getText().endsWith("hola")){
            txtID.setVisible(false);
            jlbID.setVisible(false);
            jlbPassword.setVisible(false);
            txtPassword.setVisible(false);
            jlbWelcome.setVisible(true);
        }else{
            txtID.setVisible(false);
            jlbID.setVisible(false);
            jlbPassword.setVisible(false);
            txtPassword.setVisible(false);
            jlbError.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jlbBackground;
    private javax.swing.JLabel jlbError;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbWelcome;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
