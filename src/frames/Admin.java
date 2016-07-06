package frames;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import process.DisplayList;
import process.Functions;

public class Admin extends javax.swing.JFrame {

    private static String idToEdit;
    private DisplayList display = new DisplayList();
    private List<users.User> users = new ArrayList<users.User>();

    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RPMed - Administrador");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsers = new javax.swing.JList<>();
        jButDel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButEdit = new javax.swing.JButton();
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
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
                            .addComponent(jTextFieldEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMail)
                    .addComponent(jTextFieldEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
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

        jListUsers.setToolTipText("");
        jListUsers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListUsersFocusGained(evt);
            }
        });
        jListUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListUsersMouseClicked(evt);
            }
        });
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

        jButEdit.setText("Editar");
        jButEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEditActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButDel)
                            .addComponent(jButEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButDel, jButEdit});

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditUser)
                    .addComponent(jTextFieldUserNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        String filePath;

        if (jTextFieldEmailUser.getText().trim().equals("") || txtUserName.getText().trim().equals("") || jPasswordFieldPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios! (*)");
        } else {

            try {
                if (jComboBoxTipeUser.getSelectedItem().toString() == "Administrador") {
                    filePath = Functions.VerifyFile("admins.txt", true);
                } else {
                    filePath = Functions.VerifyFile("users.txt", true);
                }
                PrintWriter pwUser = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));
                pwUser.println(UUID.randomUUID().toString());
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

                pwUser.close();

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

    private void jButDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelActionPerformed

        users = display.getUsers();
        jListUsers.getSelectedIndex(); // O index da lista é compativel com o index do JList
        users.User user = users.get(jListUsers.getSelectedIndex());
        idToEdit = user.id;

        if (user.type.equals("Admin")) {
            Functions.Delete("admins.txt", 5, idToEdit);
        } else {
            Functions.Delete("users.txt", 5, idToEdit);
        }

        display.clearList();
        display.createElement("users.txt");
        display.createListModel(jListUsers);

    }//GEN-LAST:event_jButDelActionPerformed

    private void jTabEditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabEditStateChanged

        String path = Functions.VerifyFile("users.txt", false);

        if (path != null) {
            if (jTabEdit.getSelectedIndex() == 1) {

                jButDel.setEnabled(false);
                jButEdit.setEnabled(false);

                display.createElement("users.txt");
                display.createListModel(jListUsers);

                jTabEdit.requestFocus();

            } else {
                display.clearList();
            }
        } else if (jTabEdit.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cadastro", "Erro", JOptionPane.PLAIN_MESSAGE);
            display.clearList();
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
        contentToEdit.add(idToEdit);
        contentToEdit.add(jTextFieldEmailUserEdit.getText());
        contentToEdit.add(jTextFieldUserNameEdit.getText());
        contentToEdit.add(password);

        switch (jEditType.getText()) {
            case "Administrador":
                contentToEdit.add("Admin");
                break;
            case "Médico":
                contentToEdit.add("Medic");
                break;
            case "Secretária":
                contentToEdit.add("Secretary");
                break;
        }

        if (jEditType.getText().equals("Administrador")) {
            Functions.Edit("admins.txt", contentToEdit, idToEdit);//editando o arquivo que chama admin.txt com o conteudo da aba edit
        } else {
            Functions.Edit("users.txt", contentToEdit, idToEdit);//editando o arquivo que chama users.txt com o conteudo da aba edit
        }

        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);

    }//GEN-LAST:event_jEditSaveActionPerformed

    private void jListUsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListUsersFocusGained
        jButDel.setEnabled(true);
        jButEdit.setEnabled(true);
    }//GEN-LAST:event_jListUsersFocusGained

    private void jListUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListUsersMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)) {
            if (evt.getClickCount() == 2) {
                int index = jListUsers.locationToIndex(evt.getPoint());

                users.User user = display.getUsers().get(index); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
                idToEdit = user.id;

                jTextFieldEmailUserEdit.setText(user.email);
                jTextFieldUserNameEdit.setText(user.name);
                jPasswordFieldPasswordEdit.setText(user.password);

                switch (user.type) {
                    case "Admin":
                        jEditType.setText("Administrador");
                        break;
                    case "Medic":
                        jEditType.setText("Médico");
                        break;
                    case "Secretary":
                        jEditType.setText("Secretária");
                        break;
                }

                jTabEdit.setSelectedIndex(2);
                jTabEdit.setEnabledAt(2, true);
                jTabEdit.setEnabledAt(0, false);
                jTabEdit.setEnabledAt(1, false);

            }
        }
    }//GEN-LAST:event_jListUsersMouseClicked

    private void jButEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEditActionPerformed
        // Busca a lista de users criadas para listar         
        users.User user = display.getUsers().get(jListUsers.getSelectedIndex()); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
        idToEdit = user.id;

        jTextFieldEmailUserEdit.setText(user.email);
        jTextFieldUserNameEdit.setText(user.name);
        jPasswordFieldPasswordEdit.setText(user.password);

        switch (user.type) {
            case "Admin":
                jEditType.setText("Administrador");
                break;
            case "Medic":
                jEditType.setText("Médico");
                break;
            case "Secretary":
                jEditType.setText("Secretária");
                break;
        }

        jTabEdit.setSelectedIndex(2);
        jTabEdit.setEnabledAt(2, true);
        jTabEdit.setEnabledAt(0, false);
        jTabEdit.setEnabledAt(1, false);
    }//GEN-LAST:event_jButEditActionPerformed

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
