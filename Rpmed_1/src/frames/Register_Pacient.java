/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import users.Patient;

/**
 *
 * @author Lucas
 */
public class Register_Pacient extends javax.swing.JFrame {

    /**
     * Creates new form Secretary
     */
    public Register_Pacient() {
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

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPatientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPatientRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPatientAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPatientEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPatientAddressNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPatientCpf = new javax.swing.JFormattedTextField();
        jPatientFone = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientNameActionPerformed(evt);
            }
        });
        getContentPane().add(jPatientName);
        jPatientName.setBounds(90, 50, 250, 30);

        jLabel1.setText("Nome Paciente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 60, 85, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 128, 653, 0);

        jLabel4.setText("RG");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 100, 70, 20);

        jLabel5.setText("CPF");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 100, 34, 20);

        jPatientRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientRgActionPerformed(evt);
            }
        });
        getContentPane().add(jPatientRg);
        jPatientRg.setBounds(90, 90, 90, 30);

        jLabel3.setText("Endereço");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 160, 85, 20);

        jPatientAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientAddressActionPerformed(evt);
            }
        });
        getContentPane().add(jPatientAddress);
        jPatientAddress.setBounds(90, 150, 190, 30);

        jLabel6.setText("Nº");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 150, 45, 30);

        jPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jPatientEmail);
        jPatientEmail.setBounds(90, 200, 160, 30);

        jLabel7.setText("E-mail");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 210, 70, 14);

        jPatientAddressNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientAddressNumberActionPerformed(evt);
            }
        });
        getContentPane().add(jPatientAddressNumber);
        jPatientAddressNumber.setBounds(320, 150, 110, 30);

        jLabel8.setText("Telefone");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 210, 70, 14);

        jToggleButton2.setText("Registrar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(360, 10, 80, 23);

        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(10, 10, 90, 23);

        try {
            jPatientCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPatientCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jPatientCpf);
        jPatientCpf.setBounds(250, 90, 90, 30);

        try {
            jPatientFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jPatientFone);
        jPatientFone.setBounds(320, 200, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientNameActionPerformed

    private void jPatientRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientRgActionPerformed

    private void jPatientAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientAddressActionPerformed

    private void jPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientEmailActionPerformed

    private void jPacitienAddressNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPacitienAddressNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPacitienAddressNumberActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String adress;
        Patient patient = new Patient();
        
        patient.setName(jPatientName.getText());
        patient.setRg(jPatientRg.getText());
        patient.setCpf(jPatientCpf.getText());
        patient.setFone(jPatientFone.getText());
        patient.setEmail(jPatientEmail.getText());
        adress = jPatientAddress+" "+jPatientAddressNumber;
        patient.setAdress(adress);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Pacient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jPatientAddress;
    private javax.swing.JTextField jPatientAddressNumber;
    private javax.swing.JFormattedTextField jPatientCpf;
    private javax.swing.JTextField jPatientEmail;
    private javax.swing.JFormattedTextField jPatientFone;
    private javax.swing.JTextField jPatientName;
    private javax.swing.JTextField jPatientRg;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
