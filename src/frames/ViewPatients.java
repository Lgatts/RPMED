/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import users.Patient;

/**
 *
 * @author Lucas
 */
public class ViewPatients extends javax.swing.JFrame {

    /**
     * Creates new form Register_Pacients
     */
    private DisplayList display = new DisplayList();
    private List<users.Patient> patients = new ArrayList<users.Patient>();
    private static String idToEdit;

    users.Patient selectedPatient;

    public Patient getSelectedPatient() {
        return selectedPatient;
    }

    public ViewPatients() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RPMed - Pacientes");

        jTabEdit.setEnabledAt(2, false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuRight = new javax.swing.JPopupMenu();
        jDetails = new javax.swing.JMenuItem();
        jTabEdit = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPatientName = new javax.swing.JTextField();
        jPatientEmail = new javax.swing.JTextField();
        jPatientAdress = new javax.swing.JTextField();
        jPatientAdressNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        jPatientCpf = new javax.swing.JFormattedTextField();
        jPatientFone = new javax.swing.JFormattedTextField();
        jPatientRg = new javax.swing.JFormattedTextField();
        jTabList = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPatients = new javax.swing.JList<>();
        jEditar = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jEditSavePatients = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jEditPatientName = new javax.swing.JTextField();
        jEditPatientEmail = new javax.swing.JTextField();
        jEditPatientAdress = new javax.swing.JTextField();
        jEditPatientAdressNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jEditPatientCpf = new javax.swing.JFormattedTextField();
        jEditPatientFone = new javax.swing.JFormattedTextField();
        jEditPatientRg = new javax.swing.JFormattedTextField();

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

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:*");

        jLabel2.setText("RG:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Fone:");

        jLabel7.setText("Nº:");

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        try {
            jPatientCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jPatientFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jPatientRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPatientAdress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPatientEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPatientFone)
                            .addComponent(jPatientAdressNumber)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPatientRg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPatientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPatientRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jPatientFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPatientAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPatientAdressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Voltar)
                    .addComponent(jButton1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabEdit.addTab("Adicionar", jPanel1);

        jListPatients.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListPatientsFocusGained(evt);
            }
        });
        jListPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPatientsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListPatients);

        jEditar.setText("Editar");
        jEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarActionPerformed(evt);
            }
        });

        jDelete.setText("Deletar");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDelete))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jTabListLayout = new javax.swing.GroupLayout(jTabList);
        jTabList.setLayout(jTabListLayout);
        jTabListLayout.setHorizontalGroup(
            jTabListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabListLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jTabListLayout.setVerticalGroup(
            jTabListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabListLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabEdit.addTab("Listar", jTabList);

        jEditSavePatients.setText("Salvar");
        jEditSavePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditSavePatientsActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:*");

        jLabel9.setText("RG:");

        jLabel10.setText("E-mail:");

        jLabel11.setText("Endereço:");

        jLabel12.setText("CPF:");

        jLabel13.setText("Fone:");

        jLabel14.setText("Nº:");

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        try {
            jEditPatientCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jEditPatientFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jEditPatientRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jEditPatientRg, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jEditPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jEditPatientAdress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEditPatientEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addComponent(jButton3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(30, 30, 30)
                                        .addComponent(jEditPatientAdressNumber))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jEditPatientFone, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jEditSavePatients)))
                        .addComponent(jEditPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jEditPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jEditPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditPatientRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jEditPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jEditPatientFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jEditPatientAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jEditPatientAdressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jEditSavePatients))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabEdit.addTab("Editar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jTabEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jPatientName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios! (*)");
        } else {
            try {
                String filePath = Functions.VerifyFile("patients.txt", true);

                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));

                pw.println(UUID.randomUUID().toString());
                pw.println(jPatientName.getText());
                pw.println(jPatientRg.getText());
                pw.println(jPatientCpf.getText());
                pw.println(jPatientFone.getText());
                pw.println(jPatientEmail.getText());
                pw.println(jPatientAdress.getText());
                pw.println(jPatientAdressNumber.getText());

                jPatientName.setText("");
                jPatientRg.setText("");
                jPatientCpf.setText("");
                jPatientFone.setText("");
                jPatientEmail.setText("");
                jPatientAdress.setText("");
                jPatientAdressNumber.setText("");

                pw.close();

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jEditSavePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditSavePatientsActionPerformed
        List<String> contentToEdit = new ArrayList();
        contentToEdit.add(idToEdit);
        contentToEdit.add(jEditPatientName.getText());
        contentToEdit.add(jEditPatientRg.getText());
        contentToEdit.add(jEditPatientCpf.getText());
        contentToEdit.add(jEditPatientAdress.getText());
        contentToEdit.add(jEditPatientAdressNumber.getText());
        contentToEdit.add(jEditPatientFone.getText());

        Functions.Edit("patients.txt", contentToEdit, idToEdit);//editando o arquivo que chama users.txt com o conteudo da aba edit

        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jEditSavePatientsActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        User back = new User();
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabEdit.setSelectedIndex(1);
        jTabEdit.setEnabledAt(2, false);
        jTabEdit.setEnabledAt(0, true);
        jTabEdit.setEnabledAt(1, true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarActionPerformed
        patients = display.getPatients(); // Busca a lista de users criadas para listar         
        users.Patient patient = patients.get(jListPatients.getSelectedIndex()); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
        idToEdit = patient.id;

        jEditPatientName.setText(patient.name);
        jEditPatientRg.setText(patient.rg);
        jEditPatientCpf.setText(patient.cpf);
        jEditPatientFone.setText(patient.fone);
        jEditPatientEmail.setText(patient.email);
        jEditPatientAdress.setText(patient.adress);
        jEditPatientAdressNumber.setText(patient.adressNumber);

        jTabEdit.setSelectedIndex(2);
        jTabEdit.setEnabledAt(2, true);
        jTabEdit.setEnabledAt(0, false);
        jTabEdit.setEnabledAt(1, false);


    }//GEN-LAST:event_jEditarActionPerformed

    private void jTabEditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabEditStateChanged
        String path = Functions.VerifyFile("patients.txt", false);
        if (path != null) {
            if (jTabEdit.getSelectedIndex() == 1) {
                jTabEdit.requestFocus();

                jDelete.setEnabled(false);
                jEditar.setEnabled(false);

                display.createElement("patients.txt");
                display.createListModel(jListPatients);

            } else {
                display.clearList();
            }
        } else if (jTabEdit.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cadastro", "Erro", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_jTabEditStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        User back = new User();
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        patients = display.getPatients();
        users.Patient patient = patients.get(jListPatients.getSelectedIndex());
        idToEdit = patient.id;

        Functions.Delete("patients.txt", 8, idToEdit);

        display.clearList();
        display.createElement("patients.txt");
        display.createListModel(jListPatients);
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jListPatientsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListPatientsFocusGained
        jDelete.setEnabled(true);
        jEditar.setEnabled(true);
    }//GEN-LAST:event_jListPatientsFocusGained

    private void jListPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPatientsMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)) {
            jMenuRight.setVisible(false);
            if (evt.getClickCount() == 2) {
                jMenuRight.setVisible(false);
                int index = jListPatients.locationToIndex(evt.getPoint());

                selectedPatient = display.getPatients().get(index); //busca na lista de usuário o com o mesmo index da jList para usar seus dados
                idToEdit = selectedPatient.id;

                jEditPatientEmail.setText(selectedPatient.email);
                jEditPatientCpf.setText(selectedPatient.cpf);
                jEditPatientFone.setText(selectedPatient.fone);
                jEditPatientName.setText(selectedPatient.name);
                jEditPatientRg.setText(selectedPatient.rg);
                jEditPatientAdress.setText(selectedPatient.adress);
                jEditPatientAdressNumber.setText(selectedPatient.adressNumber);

                jTabEdit.setSelectedIndex(2);
                jTabEdit.setEnabledAt(2, true);
                jTabEdit.setEnabledAt(0, false);
                jTabEdit.setEnabledAt(1, false);

            }
        }
        if (SwingUtilities.isRightMouseButton(evt)) {

            int index = jListPatients.locationToIndex(evt.getPoint());
            jListPatients.setSelectedIndex(index);
            jMenuRight.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
            jMenuRight.setVisible(true);            
            selectedPatient = display.getPatients().get(index);

        }
    }//GEN-LAST:event_jListPatientsMouseClicked

    private void jDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDetailsActionPerformed
       new PatientDetails(this).setVisible(true);
       jMenuRight.setVisible(false);
    }//GEN-LAST:event_jDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jDelete;
    private javax.swing.JMenuItem jDetails;
    private javax.swing.JTextField jEditPatientAdress;
    private javax.swing.JTextField jEditPatientAdressNumber;
    private javax.swing.JFormattedTextField jEditPatientCpf;
    private javax.swing.JTextField jEditPatientEmail;
    private javax.swing.JFormattedTextField jEditPatientFone;
    private javax.swing.JTextField jEditPatientName;
    private javax.swing.JFormattedTextField jEditPatientRg;
    private javax.swing.JButton jEditSavePatients;
    private javax.swing.JButton jEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListPatients;
    private javax.swing.JPopupMenu jMenuRight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jPatientAdress;
    private javax.swing.JTextField jPatientAdressNumber;
    private javax.swing.JFormattedTextField jPatientCpf;
    private javax.swing.JTextField jPatientEmail;
    private javax.swing.JFormattedTextField jPatientFone;
    private javax.swing.JTextField jPatientName;
    private javax.swing.JFormattedTextField jPatientRg;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabEdit;
    private javax.swing.JPanel jTabList;
    // End of variables declaration//GEN-END:variables
}
