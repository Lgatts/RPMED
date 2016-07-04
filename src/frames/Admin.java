package frames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.swing.JOptionPane;
import process.Functions;

public class Admin extends javax.swing.JFrame {

    private static String emailToEdit;

    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RPMed - Usuário(a)s");
        jTabEdit.setEnabledAt(2, false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabEdit = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButSaveAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeUser = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabelMail = new javax.swing.JLabel();
        jTextFieldEmailUser = new javax.swing.JTextField();
        jComboBoxTipeUser = new javax.swing.JComboBox<>();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsers = new javax.swing.JList<>();
        jButDel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPasswordFieldPasswordEdit = new javax.swing.JPasswordField();
        jTextFieldEmailUserEdit = new javax.swing.JTextField();
        jLabelUserMailEdit = new javax.swing.JLabel();
        jTextFieldUserNameEdit = new javax.swing.JTextField();
        jLabelEditUser = new javax.swing.JLabel();
        jLabelPasswordEdit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jEditType = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jEditSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabEdit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabEditStateChanged(evt);
            }
        });

        jButSaveAdd.setText("Salvar");
        jButSaveAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSaveAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:*");

        jLabelNomeUser.setText("Nome:*");

        jLabelMail.setText("E-mail:*");

        jComboBoxTipeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Médico", "Secretária" }));

        jLabelPassword.setText("Senha:*");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jComboBoxTipeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelNomeUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword)
                            .addComponent(jLabelMail))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(237, 237, 237)
                        .addComponent(jButSaveAdd))
                    .addComponent(jTextFieldEmailUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeUser)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelMail)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButSaveAdd)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTabEdit.addTab("Adicionar", jPanel1);

        jButEdit.setText("Editar");
        jButEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEditActionPerformed(evt);
            }
        });

        jListUsers.setToolTipText("");
        jScrollPane1.setViewportView(jListUsers);

        jButDel.setText("Deletar");
        jButDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButDel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButDel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabEdit.addTab("Listar", jPanel2);

        jLabelUserMailEdit.setText("E-mail:*");

        jLabelEditUser.setText("Nome:*");

        jLabelPasswordEdit.setText("Senha:*");

        jLabel2.setText("Tipo:*");

        jEditType.setText("nada");

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jEditSave.setText("Salvar");
        jEditSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEditType))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelEditUser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldUserNameEdit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelUserMailEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldEmailUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelPasswordEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jEditSave))
                                .addComponent(jPasswordFieldPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jEditType))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditUser)
                    .addComponent(jTextFieldUserNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserMailEdit)
                    .addComponent(jTextFieldEmailUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPasswordEdit)
                    .addComponent(jPasswordFieldPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditSave)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTabEdit.addTab("Editar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void jButSaveAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSaveAddActionPerformed
        if (jTextFieldEmailUser.getText().trim().equals("") || txtUserName.getText().trim().equals("") || jPasswordFieldPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios! (*)");
        } else {
            try {
                String filePath = Functions.VerifyFile("users.txt", true);
                String filePathNames = Functions.VerifyFile("usersNames.txt", true);

                PrintWriter pwUser = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));
                PrintWriter pwUserNames = new PrintWriter(new BufferedWriter(new FileWriter(filePathNames, true)));

                pwUser.println(jTextFieldEmailUser.getText());
                pwUser.println(txtUserName.getText());
                pwUser.println(jPasswordFieldPassword.getPassword());

                switch (jComboBoxTipeUser.getSelectedItem().toString()) {
                    case "Administrador":
                        pwUser.println("Admin");
                        break;
                    case "Médico":
                        pwUser.println("Medic");
                        break;
                    case "Secretária":
                        pwUser.println("Secretary");
                }

                pwUserNames.println(jTextFieldEmailUser.getText());

                pwUser.close();
                pwUserNames.close();

                jTextFieldEmailUser.setText("");
                txtUserName.setText("");
                jPasswordFieldPassword.setText("");
                jComboBoxTipeUser.setSelectedItem("Administrador");
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }
    }//GEN-LAST:event_jButSaveAddActionPerformed

    private void jButEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEditActionPerformed

        String name, email, password, type;

        jTabEdit.setSelectedIndex(2);
        jTabEdit.setEnabledAt(2, true);
        jTabEdit.setEnabledAt(0, false);
        jTabEdit.setEnabledAt(1, false);

        try {
            String filePath = Functions.VerifyFile("users.txt", false);

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String emailSelected = jListUsers.getSelectedValue();
            do {
                email = br.readLine();
                name = br.readLine();
                password = br.readLine();
                type = br.readLine();
            } while (!(email.equals(emailSelected)));

            jTextFieldUserNameEdit.setText(name);
            jTextFieldEmailUserEdit.setText(email);

            emailToEdit = email;

            jPasswordFieldPasswordEdit.setText(password);
            jEditType.setText(type);

        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButEditActionPerformed

    private void jButDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelActionPerformed
        
        emailToEdit = jListUsers.getSelectedValue();
        
        Functions.Delete("users.txt",4, emailToEdit);
        Functions.Delete("usersNames.txt",1, emailToEdit);
        process.Functions.createListModel("usersNames.txt", this.jListUsers);
    }//GEN-LAST:event_jButDelActionPerformed

    private void jTabEditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabEditStateChanged
        if (jTabEdit.getSelectedIndex() == 1) {
            process.Functions.createListModel("usersNames.txt", this.jListUsers);//Listar quando a tab do listar for selecionada
        }
    }//GEN-LAST:event_jTabEditStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login back = new Login();
        back.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Login back = new Login();
        back.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jEditSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditSaveActionPerformed

        List<String> contentToEdit = new ArrayList();

        String password = "";//Essa parte é necessario porque o campo de password retorna um arrya de chars e deve ser convertido para string dessa forma
        char[] passwordArray = jPasswordFieldPasswordEdit.getPassword();

        for (int i = 0; i < passwordArray.length; i++) {
            password = password + passwordArray[i];
        }

        contentToEdit.add(jTextFieldEmailUserEdit.getText());
        contentToEdit.add(jTextFieldUserNameEdit.getText());
        contentToEdit.add(password);
        contentToEdit.add(jEditType.getText());

        Functions.Edit("users.txt", contentToEdit, emailToEdit);//editando o arquivo que chama users.txt com o conteudo da aba edit

        contentToEdit.clear();
        contentToEdit.add(jTextFieldEmailUserEdit.getText());

        Functions.Edit("usersNames.txt", contentToEdit, emailToEdit); //editando o conteudo do arquivo usersNames que é utilizando para atualizar a lista

        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);


    }//GEN-LAST:event_jEditSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDel;
    private javax.swing.JButton jButEdit;
    private javax.swing.JButton jButSaveAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxTipeUser;
    private javax.swing.JButton jEditSave;
    private javax.swing.JLabel jEditType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEditUser;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNomeUser;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPasswordEdit;
    private javax.swing.JLabel jLabelUserMailEdit;
    private javax.swing.JList<String> jListUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabEdit;
    private javax.swing.JTextField jTextFieldEmailUser;
    private javax.swing.JTextField jTextFieldEmailUserEdit;
    private javax.swing.JTextField jTextFieldUserNameEdit;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
