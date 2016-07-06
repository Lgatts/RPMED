package frames;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import process.DisplayList;
import process.Functions;
import users.Doctor;

public class ViewDoctors extends javax.swing.JFrame {

    private static String idToEdit;
    private DisplayList display = new DisplayList();
    private List<users.Doctor> doctors = new ArrayList<users.Doctor>();

    private users.Doctor selectedDoctor;

    public Doctor getSelectedDoctor() {
        return selectedDoctor;
    }

    public ViewDoctors() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RPMed - Médico(a)s");

        jTabEdit.setEnabledAt(2, false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuRight = new javax.swing.JPopupMenu();
        jDetails = new javax.swing.JMenuItem();
        jTabEdit = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSalvar = new javax.swing.JButton();
        jTextNomeDoctor = new javax.swing.JTextField();
        jTextEmailDoctor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFoneDoctor = new javax.swing.JFormattedTextField();
        jTextCpfDoctor = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDoctors = new javax.swing.JList<>();
        jEditar = new javax.swing.JButton();
        jDelet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSaveEditDoctor = new javax.swing.JButton();
        jEditDoctorCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jEditDoctorEmail = new javax.swing.JTextField();
        jEditDoctorName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jEditDoctorFone = new javax.swing.JFormattedTextField();
        jToggleButton2 = new javax.swing.JToggleButton();

        jDetails.setText("Ver Detalhes");
        jDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDetailsActionPerformed(evt);
            }
        });
        jMenuRight.add(jDetails);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabEdit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabEditStateChanged(evt);
            }
        });

        jLabel1.setText("Nome:*");

        jLabel2.setText("Email:");

        jLabel3.setText("Fone:");

        jSalvar.setText("Salvar");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF:");

        try {
            jTextFoneDoctor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTextCpfDoctor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFoneDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCpfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextEmailDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jTextNomeDoctor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNomeDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextEmailDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFoneDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextCpfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jSalvar))
                .addContainerGap())
        );

        jTabEdit.addTab("Adicionar", jPanel1);

        jListDoctors.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListDoctorsFocusGained(evt);
            }
        });
        jListDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListDoctorsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListDoctors);

        jEditar.setText("Editar");
        jEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarActionPerformed(evt);
            }
        });

        jDelet.setText("Deletar");
        jDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jDelet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabEdit.addTab("Listar", jPanel2);

        jSaveEditDoctor.setText("Salvar");
        jSaveEditDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveEditDoctorActionPerformed(evt);
            }
        });

        try {
            jEditDoctorCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("CPF:");

        jLabel6.setText("Nome:*");

        jLabel7.setText("Email:");

        jLabel8.setText("Fone:");

        try {
            jEditDoctorFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jToggleButton2.setText("Voltar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSaveEditDoctor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jEditDoctorFone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEditDoctorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jEditDoctorEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jEditDoctorName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEditDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jEditDoctorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditDoctorFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jEditDoctorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jSaveEditDoctor))
                .addContainerGap())
        );

        jTabEdit.addTab("Editar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabEdit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        User back = new User();
        back.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarActionPerformed
              
        users.Doctor doctor = doctors.get(jListDoctors.getSelectedIndex()); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
        idToEdit = doctor.id;

        jEditDoctorEmail.setText(doctor.email);
        jEditDoctorCpf.setText(doctor.cpf);
        jEditDoctorFone.setText(doctor.fone);
        jEditDoctorName.setText(doctor.name);

        jTabEdit.setSelectedIndex(2);
        jTabEdit.setEnabledAt(2, true);
        jTabEdit.setEnabledAt(0, false);
        jTabEdit.setEnabledAt(1, false);


    }//GEN-LAST:event_jEditarActionPerformed

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        if (jTextNomeDoctor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios! (*)");
        } else {
            try {
                String filePath = Functions.VerifyFile("doctors.txt", true);

                PrintWriter pwDoctor = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));

                pwDoctor.println(UUID.randomUUID().toString());
                pwDoctor.println(jTextEmailDoctor.getText());
                pwDoctor.println(jTextNomeDoctor.getText());
                pwDoctor.println(jTextFoneDoctor.getText());
                pwDoctor.println(jTextCpfDoctor.getText());

                pwDoctor.close();

                jTextEmailDoctor.setText("");
                jTextNomeDoctor.setText("");
                jTextFoneDoctor.setText("");
                jTextCpfDoctor.setText("");

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jTabEditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabEditStateChanged
        String path = Functions.VerifyFile("doctors.txt", false);
        if (path != null) {

            if (jTabEdit.getSelectedIndex() == 1) {

                jTabEdit.requestFocus();

                jDelet.setEnabled(false);
                jEditar.setEnabled(false);

                display.createElement("doctors.txt");
                display.createListModel(jListDoctors);

            } else {
                display.clearList();
            }
        } else if (jTabEdit.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cadastro", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jTabEditStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        User back = new User();
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSaveEditDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveEditDoctorActionPerformed
        List<String> contentToEdit = new ArrayList();

        contentToEdit.add(idToEdit);
        contentToEdit.add(jEditDoctorEmail.getText());
        contentToEdit.add(jEditDoctorName.getText());
        contentToEdit.add(jEditDoctorFone.getText());
        contentToEdit.add(jEditDoctorCpf.getText());

        Functions.Edit("doctors.txt", contentToEdit, idToEdit);//editando o arquivo que chama users.txt com o conteudo da aba edit

        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jSaveEditDoctorActionPerformed

    private void jDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletActionPerformed

        doctors = display.getDoctors();
        users.Doctor doctor = doctors.get(jListDoctors.getSelectedIndex());
        idToEdit = doctor.id;

        Functions.Delete("doctors.txt", 5, idToEdit);

        display.clearList();
        display.createElement("doctors.txt");
        display.createListModel(jListDoctors);
    }//GEN-LAST:event_jDeletActionPerformed

    private void jListDoctorsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListDoctorsFocusGained
        jDelet.setEnabled(true);
        jEditar.setEnabled(true);
    }//GEN-LAST:event_jListDoctorsFocusGained

    private void jListDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListDoctorsMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)) {
            jMenuRight.setVisible(false);
            if (evt.getClickCount() == 2) {
                jMenuRight.setVisible(false);
                int index = jListDoctors.locationToIndex(evt.getPoint());

                selectedDoctor = display.getDoctors().get(index); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
                idToEdit = selectedDoctor.id;

                jEditDoctorEmail.setText(selectedDoctor.email);
                jEditDoctorCpf.setText(selectedDoctor.cpf);
                jEditDoctorFone.setText(selectedDoctor.fone);
                jEditDoctorName.setText(selectedDoctor.name);

                jTabEdit.setSelectedIndex(2);
                jTabEdit.setEnabledAt(2, true);
                jTabEdit.setEnabledAt(0, false);
                jTabEdit.setEnabledAt(1, false);

            }
        }
        if (SwingUtilities.isRightMouseButton(evt)) {

            int index = jListDoctors.locationToIndex(evt.getPoint());
            jListDoctors.setSelectedIndex(index);
            jMenuRight.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
            jMenuRight.setVisible(true);
            display.getDoctors();    
            selectedDoctor = display.getDoctors().get(index);

        }     
    }//GEN-LAST:event_jListDoctorsMouseClicked

    private void jDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDetailsActionPerformed
       new DoctorsDetails(this).setVisible(true);
       jMenuRight.setVisible(false);
    }//GEN-LAST:event_jDetailsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jDelet;
    private javax.swing.JMenuItem jDetails;
    private javax.swing.JFormattedTextField jEditDoctorCpf;
    private javax.swing.JTextField jEditDoctorEmail;
    private javax.swing.JFormattedTextField jEditDoctorFone;
    private javax.swing.JTextField jEditDoctorName;
    private javax.swing.JButton jEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListDoctors;
    private javax.swing.JPopupMenu jMenuRight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jSalvar;
    private javax.swing.JButton jSaveEditDoctor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabEdit;
    private javax.swing.JFormattedTextField jTextCpfDoctor;
    private javax.swing.JTextField jTextEmailDoctor;
    private javax.swing.JFormattedTextField jTextFoneDoctor;
    private javax.swing.JTextField jTextNomeDoctor;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
