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
import users.Secretary;

public class ViewSecretaries extends javax.swing.JFrame {

    private DisplayList display = new DisplayList();
    private List<users.Secretary> secretaries = new ArrayList<users.Secretary>();
    private static String idToEdit;

    private users.Secretary selectedSecretary;

    public Secretary getSelectedSecretary() {
        return selectedSecretary;
    }

    public ViewSecretaries() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RPMed - Secretária(o)s");

        jTabEdit.setEnabledAt(2, false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuRight = new javax.swing.JPopupMenu();
        jDetails = new javax.swing.JMenuItem();
        jTabEdit = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNomeSecretaries = new javax.swing.JTextField();
        jTextEmailSecretaries = new javax.swing.JTextField();
        jTextFoneSecretaries = new javax.swing.JFormattedTextField();
        jTextCpfSecretaries = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSecretaries = new javax.swing.JList<>();
        jEditar = new javax.swing.JButton();
        jDeletSecretary = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jEditSecretaryName = new javax.swing.JTextField();
        jEditSecretaryEmail = new javax.swing.JTextField();
        jEditSecretaryFone = new javax.swing.JFormattedTextField();
        jEditSecretaryCpf = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jEditSaveSecretary = new javax.swing.JButton();

        jDetails.setText("Ver detalhes");
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

        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:*");

        jLabel2.setText("E-mail:");

        jLabel3.setText("Fone:");

        jLabel4.setText("CPF:");

        try {
            jTextFoneSecretaries.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTextCpfSecretaries.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton1)
                                    .addComponent(jTextNomeSecretaries, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(jTextEmailSecretaries, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFoneSecretaries, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextCpfSecretaries, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextNomeSecretaries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextEmailSecretaries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextCpfSecretaries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFoneSecretaries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jToggleButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabEdit.addTab("Adicionar", jPanel1);

        jListSecretaries.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListSecretariesFocusGained(evt);
            }
        });
        jListSecretaries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSecretariesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListSecretaries);

        jEditar.setText("Editar");
        jEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarActionPerformed(evt);
            }
        });

        jDeletSecretary.setText("Deletar");
        jDeletSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletSecretaryActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDeletSecretary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jDeletSecretary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        jTabEdit.addTab("Listar", jPanel2);

        jLabel5.setText("Nome:*");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Fone:");

        try {
            jEditSecretaryFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jEditSecretaryCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("CPF:");

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jEditSaveSecretary.setText("Salvar");
        jEditSaveSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditSaveSecretaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEditSaveSecretary))
                    .addComponent(jEditSecretaryEmail)
                    .addComponent(jEditSecretaryName)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jEditSecretaryFone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jEditSecretaryCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jEditSecretaryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jEditSecretaryEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEditSecretaryFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEditSecretaryCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditSaveSecretary)
                    .addComponent(jButton4))
                .addGap(29, 29, 29))
        );

        jTabEdit.addTab("Editar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTabEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarActionPerformed

        secretaries = display.getSecretaries(); // Busca a lista de users criadas para listar         
        users.Secretary secretary = secretaries.get(jListSecretaries.getSelectedIndex()); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
        idToEdit = secretary.id;

        jTabEdit.setSelectedIndex(2);
        jTabEdit.setEnabledAt(2, true);
        jTabEdit.setEnabledAt(0, false);
        jTabEdit.setEnabledAt(1, false);

        idToEdit = secretary.id;
        jEditSecretaryEmail.setText(secretary.email);
        jEditSecretaryName.setText(secretary.name);
        jEditSecretaryFone.setText(secretary.fone);
        jEditSecretaryCpf.setText(secretary.cpf);


    }//GEN-LAST:event_jEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextEmailSecretaries.getText().trim().equals("") || jTextNomeSecretaries.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios! (*)");
        } else {
            try {
                String filePath = Functions.VerifyFile("secretaries.txt", true);

                PrintWriter pwSecretaries = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));

                pwSecretaries.println(UUID.randomUUID().toString());
                pwSecretaries.println(jTextEmailSecretaries.getText());
                pwSecretaries.println(jTextNomeSecretaries.getText());
                pwSecretaries.println(jTextFoneSecretaries.getText());
                pwSecretaries.println(jTextCpfSecretaries.getText());

                pwSecretaries.close();

                jTextNomeSecretaries.setText("");
                jTextEmailSecretaries.setText("");
                jTextFoneSecretaries.setText("");
                jTextCpfSecretaries.setText("");

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabEditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabEditStateChanged

        String path = Functions.VerifyFile("secretaries.txt", false);
        if (path != null) {

            if (jTabEdit.getSelectedIndex() == 1) {
                jTabEdit.requestFocus();

                jDeletSecretary.setEnabled(false);
                jEditar.setEnabled(false);

                display.createElement("secretaries.txt");
                display.createListModel(jListSecretaries);

            } else {
                display.clearList();
            }
        } else if (jTabEdit.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cadastro", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jTabEditStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        User back = new User();
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jEditSaveSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditSaveSecretaryActionPerformed
        List<String> contentToEdit = new ArrayList();

        contentToEdit.add(idToEdit);
        contentToEdit.add(jEditSecretaryEmail.getText());
        contentToEdit.add(jEditSecretaryName.getText());
        contentToEdit.add(jEditSecretaryFone.getText());
        contentToEdit.add(jEditSecretaryCpf.getText());

        Functions.Edit("secretaries.txt", contentToEdit, idToEdit);//editando o arquivo que chama users.txt com o conteudo da aba edit

        contentToEdit.clear();
        contentToEdit.add(jEditSecretaryEmail.getText());

        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jEditSaveSecretaryActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jDeletSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletSecretaryActionPerformed
        secretaries = display.getSecretaries();
        users.Secretary secretary = secretaries.get(jListSecretaries.getSelectedIndex());
        idToEdit = secretary.id;

        Functions.Delete("secretaries.txt", 5, idToEdit);

        display.clearList();
        display.createElement("secretaries.txt");
        display.createListModel(jListSecretaries);

    }//GEN-LAST:event_jDeletSecretaryActionPerformed

    private void jListSecretariesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListSecretariesFocusGained
        jEditar.setEnabled(true);
        jDeletSecretary.setEnabled(true);
    }//GEN-LAST:event_jListSecretariesFocusGained

    private void jDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDetailsActionPerformed
        new SecretaryDetails(this).setVisible(true);
        jMenuRight.setVisible(false);
    }//GEN-LAST:event_jDetailsActionPerformed

    private void jListSecretariesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSecretariesMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)) {
            jMenuRight.setVisible(false);
            if (evt.getClickCount() == 2) {
                jMenuRight.setVisible(false);
                int index = jListSecretaries.locationToIndex(evt.getPoint());

                selectedSecretary = display.getSecretaries().get(index); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
                idToEdit = selectedSecretary.id;

                jEditSecretaryEmail.setText(selectedSecretary.email);
                jEditSecretaryCpf.setText(selectedSecretary.cpf);
                jEditSecretaryFone.setText(selectedSecretary.fone);
                jEditSecretaryName.setText(selectedSecretary.name);

                jTabEdit.setSelectedIndex(2);
                jTabEdit.setEnabledAt(2, true);
                jTabEdit.setEnabledAt(0, false);
                jTabEdit.setEnabledAt(1, false);

            }    
        }
        if (SwingUtilities.isRightMouseButton(evt)) {

            int index = jListSecretaries.locationToIndex(evt.getPoint());
            jListSecretaries.setSelectedIndex(index);
            jMenuRight.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
            jMenuRight.setVisible(true);
            display.getSecretaries();
            selectedSecretary = display.getSecretaries().get(index);

        } 
    }//GEN-LAST:event_jListSecretariesMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSecretaries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jDeletSecretary;
    private javax.swing.JMenuItem jDetails;
    private javax.swing.JButton jEditSaveSecretary;
    private javax.swing.JFormattedTextField jEditSecretaryCpf;
    private javax.swing.JTextField jEditSecretaryEmail;
    private javax.swing.JFormattedTextField jEditSecretaryFone;
    private javax.swing.JTextField jEditSecretaryName;
    private javax.swing.JButton jEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListSecretaries;
    private javax.swing.JPopupMenu jMenuRight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabEdit;
    private javax.swing.JFormattedTextField jTextCpfSecretaries;
    private javax.swing.JTextField jTextEmailSecretaries;
    private javax.swing.JFormattedTextField jTextFoneSecretaries;
    private javax.swing.JTextField jTextNomeSecretaries;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
