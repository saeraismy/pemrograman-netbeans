/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author saera
 */
public class modul2 extends javax.swing.JFrame {

    /**
     * Creates new form modul2
     */
    public modul2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NIM = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        eNIM = new javax.swing.JTextField();
        eNama = new javax.swing.JTextField();
        bClear = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        Alamat = new javax.swing.JLabel();
        eAlamat = new javax.swing.JTextField();
        bJLabel = new javax.swing.JButton();
        bJTextField = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        eNoTelp = new javax.swing.JTextField();
        bJOptionPane = new javax.swing.JButton();
        lNama = new javax.swing.JLabel();
        lNIM = new javax.swing.JLabel();
        lAlamat = new javax.swing.JLabel();
        tNIM = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tAlamat = new javax.swing.JTextField();
        tNoTelp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NIM.setText("NIM");

        Nama.setText("Nama");

        eNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNIMActionPerformed(evt);
            }
        });

        eNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNamaActionPerformed(evt);
            }
        });

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        Alamat.setText("Alamat");

        bJLabel.setText("Muncul JLabel");
        bJLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJLabelActionPerformed(evt);
            }
        });

        bJTextField.setText("Muncul JTextField ");
        bJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("No Telp");

        bJOptionPane.setText("Muncul JOptionPane");
        bJOptionPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJOptionPaneActionPerformed(evt);
            }
        });

        tNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNIMActionPerformed(evt);
            }
        });

        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIM)
                            .addComponent(Nama)
                            .addComponent(Alamat)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eNIM)
                            .addComponent(eNama)
                            .addComponent(eAlamat)
                            .addComponent(eNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(bClear)
                        .addGap(74, 74, 74)
                        .addComponent(bExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bJLabel)
                        .addGap(31, 31, 31)
                        .addComponent(bJTextField)
                        .addGap(48, 48, 48)
                        .addComponent(bJOptionPane))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNIM)
                            .addComponent(lNama)
                            .addComponent(lAlamat))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNIM)
                            .addComponent(tNama)
                            .addComponent(tAlamat)
                            .addComponent(tNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                        .addGap(35, 35, 35)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIM)
                    .addComponent(eNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alamat)
                    .addComponent(eAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bExit)
                    .addComponent(bClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bJLabel)
                    .addComponent(bJTextField)
                    .addComponent(bJOptionPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lNIM)
                        .addGap(18, 18, 18)
                        .addComponent(lAlamat)
                        .addGap(18, 18, 18)
                        .addComponent(lNama)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNIMActionPerformed

    private void eNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNamaActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        eNIM.setText(""); 
        eNama.setText(""); 
        eAlamat.setText("");
        tNoTelp.setText("");
        
        lNIM.setText(""); 
        lNama.setText(""); 
        lAlamat.setText("");
        
        tNIM.setText(""); 
        tNama.setText(""); 
        tAlamat.setText("");
        tNoTelp.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_bExitActionPerformed

    private void bJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJTextFieldActionPerformed
        // TODO add your handling code here:
        String nim = eNIM.getText();
        String nama = eNama.getText();
        String alamat = eAlamat.getText();
        String notelp = eNoTelp.getText();
        
        // Clear the text fields
        eNIM.setText(""); 
        eNama.setText(""); 
        eAlamat.setText("");
        eNoTelp.setText("");
        
        tNIM.setText(nim);
        tNama.setText(nama);
        tAlamat.setText(alamat);
        tNoTelp.setText(notelp);
        
    }//GEN-LAST:event_bJTextFieldActionPerformed

    private void bJOptionPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJOptionPaneActionPerformed
        // TODO add your handling code here:
        String nim = eNIM.getText();
        String nama = eNama.getText();
        String alamat = eAlamat.getText();
        String notelp = eNoTelp.getText();
        
        // Clear the text fields
        eNIM.setText(""); 
        eNama.setText(""); 
        eAlamat.setText("");
        
        // Tampilkan NIM dan Nama di JOptionPane
        JOptionPane.showMessageDialog(this, "NIM: " + nim + "\nNama: " + nama);
    }//GEN-LAST:event_bJOptionPaneActionPerformed

    private void bJLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJLabelActionPerformed
        // TODO add your handling code here:
        String nim = eNIM.getText();
        String nama = eNama.getText();
        String alamat = eAlamat.getText();
        
        eNIM.setText(""); 
        eNama.setText(""); 
        eAlamat.setText("");
        
        lNIM.setText("NIM : "+nim);
        lNama.setText("Nama : "+nama);
        lAlamat.setText("Alamat : "+alamat);
    }//GEN-LAST:event_bJLabelActionPerformed

    private void tNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNIMActionPerformed

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

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
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel NIM;
    private javax.swing.JLabel Nama;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bJLabel;
    private javax.swing.JButton bJOptionPane;
    private javax.swing.JButton bJTextField;
    private javax.swing.JTextField eAlamat;
    private javax.swing.JTextField eNIM;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField eNoTelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lAlamat;
    private javax.swing.JLabel lNIM;
    private javax.swing.JLabel lNama;
    private javax.swing.JTextField tAlamat;
    private javax.swing.JTextField tNIM;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNoTelp;
    // End of variables declaration//GEN-END:variables
}
