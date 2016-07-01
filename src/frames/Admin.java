package frames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RPMed - Usuário(a)s");

        URL doctorsDataURL = ViewDoctors.class.getResource("/data/userNames.txt");
        process.Functions.createListModel(doctorsDataURL,this.jListUsers);
        
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
        jPanel2 = new javax.swing.JPanel();
        jButEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsers = new javax.swing.JList<>();
        jButDel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPasswordFieldPasswordEdit = new javax.swing.JPasswordField();
        jTextFieldEmailUserEdit = new javax.swing.JTextField();
        jLabelUserMailEdit = new javax.swing.JLabel();
        jTextFieldUserNameEdit = new javax.swing.JTextField();
        jLabelEditUser = new javax.swing.JLabel();
        jLabelPasswordEdit = new javax.swing.JLabel();
        jButSaveEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlblType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButSaveAdd.setText("Salvar");
        jButSaveAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSaveAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        jLabelNomeUser.setText("Nome:");

        jLabelMail.setText("E-mail:");

        jComboBoxTipeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Médico", "Secretaria" }));

        jLabelPassword.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jButSaveAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxTipeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButSaveAdd)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButDel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(45, 45, 45))
        );

        jTabEdit.addTab("Listar", jPanel2);

        jLabelUserMailEdit.setText("E-mail:");

        jLabelEditUser.setText("Nome:");

        jLabelPasswordEdit.setText("Senha:");

        jButSaveEdit.setText("Salvar");
        jButSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSaveEditActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jlblType.setText("Not found");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblType))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelEditUser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldUserNameEdit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelPasswordEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordFieldPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButSaveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelUserMailEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldEmailUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlblType))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditUser)
                    .addComponent(jTextFieldUserNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserMailEdit)
                    .addComponent(jTextFieldEmailUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPasswordEdit)
                    .addComponent(jPasswordFieldPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSaveEdit))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabEdit.addTab("Editar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabEdit)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButSaveAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSaveAddActionPerformed
        try {
            URL usersDataURL = Admin.class.getResource("/data/users.txt");
            URL userNamesDataURL = Admin.class.getResource("/data/usersNames.txt");
            
            PrintWriter pwUser = new PrintWriter(new BufferedWriter(new FileWriter(usersDataURL.getPath(), true)));
            PrintWriter pwUserNames = new PrintWriter(new BufferedWriter(new FileWriter(userNamesDataURL.getPath(), true)));
//            PrintWriter pwUser = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Yury Alencar\\Documents\\NetBeansProjects\\rpmed\\RPMED\\src\\data\\users.txt", true)));
//            PrintWriter pwUserNames = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Yury Alencar\\Documents\\NetBeansProjects\\rpmed\\RPMED\\src\\data\\userNames.txt", true)));

            pwUser.println(jTextFieldEmailUser.getText());
            pwUser.println(txtUserName.getText());
            pwUser.println(jPasswordFieldPassword.getPassword());
            pwUser.println(jComboBoxTipeUser.getSelectedItem().toString());

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
    }//GEN-LAST:event_jButSaveAddActionPerformed

    private void jButEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEditActionPerformed
        String name, email, password, type;
        jTabEdit.setSelectedIndex(2);

        try {
            URL usersDataURL = Admin.class.getResource("/data/users.txt");
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Yury Alencar\\Documents\\NetBeansProjects\\rpmed\\RPMED\\src\\data\\users.txt"));
            BufferedReader br = new BufferedReader(new FileReader(usersDataURL.getPath()));
            String emailSelected = jListUsers.getSelectedValue();
            do {
                email = br.readLine();
                name = br.readLine();
                password = br.readLine();
                type = br.readLine();
            } while (!(email.equals(emailSelected)));

            jTextFieldUserNameEdit.setText(name);
            jTextFieldEmailUserEdit.setText(email);
            jPasswordFieldPasswordEdit.setText(password);
            jlblType.setText(type);

        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButEditActionPerformed

    private void jButSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSaveEditActionPerformed

    }//GEN-LAST:event_jButSaveEditActionPerformed

    private void jButDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelActionPerformed

    }//GEN-LAST:event_jButDelActionPerformed

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
    private javax.swing.JButton jButSaveEdit;
    private javax.swing.JComboBox<String> jComboBoxTipeUser;
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
    private javax.swing.JLabel jlblType;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
