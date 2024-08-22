/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas;

/**
 *
 * @author saera
 */
public class modul9 extends javax.swing.JFrame {

    /**
     * Creates new form modul9
     */
    public modul9() {
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

        eNormal = new javax.swing.JTextField();
        eAngka = new javax.swing.JTextField();
        eHari = new javax.swing.JTextField();
        lNormal = new javax.swing.JLabel();
        lAngka = new javax.swing.JLabel();
        lHari = new javax.swing.JLabel();
        spinNormal = new javax.swing.JSpinner();
        spinAngka = new javax.swing.JSpinner();
        spinHari = new javax.swing.JSpinner();
        lTanggal = new javax.swing.JLabel();
        spinTanggal = new javax.swing.JSpinner();
        eTanggal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNormalActionPerformed(evt);
            }
        });

        eAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eAngkaActionPerformed(evt);
            }
        });

        lNormal.setText("Normal");

        lAngka.setText("Angka");

        lHari.setText("Hari");

        spinNormal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinNormalStateChanged(evt);
            }
        });

        spinAngka.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        spinAngka.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinAngkaStateChanged(evt);
            }
        });

        spinHari.setModel(new javax.swing.SpinnerListModel(new String[] {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"}));
        spinHari.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinHariStateChanged(evt);
            }
        });

        lTanggal.setText("Tanggal");

        spinTanggal.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1724214188261L), null, null, java.util.Calendar.DAY_OF_MONTH));
        spinTanggal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinTanggalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNormal)
                    .addComponent(spinNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAngka))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lHari)
                    .addComponent(spinHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eHari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTanggal)
                            .addComponent(spinTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(eTanggal))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHari)
                    .addComponent(lAngka)
                    .addComponent(lNormal)
                    .addComponent(lTanggal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNormalActionPerformed

    private void spinAngkaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinAngkaStateChanged
        // TODO add your handling code here
        eAngka.setText(spinAngka.getValue().toString());
    }//GEN-LAST:event_spinAngkaStateChanged

    private void spinNormalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinNormalStateChanged
        // TODO add your handling code here:
        eNormal.setText(spinNormal.getValue().toString());
    }//GEN-LAST:event_spinNormalStateChanged

    private void spinHariStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinHariStateChanged
        // TODO add your handling code here:
        eHari.setText(spinHari.getValue().toString());
    }//GEN-LAST:event_spinHariStateChanged

    private void spinTanggalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinTanggalStateChanged
        // TODO add your handling code here:
        eTanggal.setText(spinTanggal.getValue().toString());
    }//GEN-LAST:event_spinTanggalStateChanged

    private void eAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eAngkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eAngkaActionPerformed

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
            java.util.logging.Logger.getLogger(modul9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eAngka;
    private javax.swing.JTextField eHari;
    private javax.swing.JTextField eNormal;
    private javax.swing.JTextField eTanggal;
    private javax.swing.JLabel lAngka;
    private javax.swing.JLabel lHari;
    private javax.swing.JLabel lNormal;
    private javax.swing.JLabel lTanggal;
    private javax.swing.JSpinner spinAngka;
    private javax.swing.JSpinner spinHari;
    private javax.swing.JSpinner spinNormal;
    private javax.swing.JSpinner spinTanggal;
    // End of variables declaration//GEN-END:variables
}
