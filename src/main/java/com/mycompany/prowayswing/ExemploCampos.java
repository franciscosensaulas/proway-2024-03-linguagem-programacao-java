/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prowayswing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author moc
 */
public class ExemploCampos extends javax.swing.JFrame {

    /**
     * Creates new form ExemploCampos
     */
    public ExemploCampos() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonProcessar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jLabelMesNascimento = new javax.swing.JLabel();
        jComboBoxMesNascimento = new javax.swing.JComboBox<>();
        jLabel4AnoNascimento = new javax.swing.JLabel();
        jSpinnerAnoNascimento = new javax.swing.JSpinner();
        jLabelAreaAtuacao = new javax.swing.JLabel();
        jCheckBoxAreaAtuacaoBackEnd = new javax.swing.JCheckBox();
        jCheckBoxAreaAtuacaoFrontEnd = new javax.swing.JCheckBox();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonSexoFeminino = new javax.swing.JRadioButton();
        jRadioButtonSexoMasculino = new javax.swing.JRadioButton();
        jLabelDescrição = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonCancelar = new javax.swing.JButton();
        jCheckBoxTermosAceite = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonApagar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonProcessar.setText("Processar");
        jButtonProcessar.setEnabled(false);
        jButtonProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcessarActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jLabelSobrenome.setText("Sobrenome");

        jLabelMesNascimento.setText("Mês nascimento");

        jComboBoxMesNascimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel4AnoNascimento.setText("Ano nascimento");

        jSpinnerAnoNascimento.setValue(2024);

        jLabelAreaAtuacao.setText("Área de atuação");

        jCheckBoxAreaAtuacaoBackEnd.setText("Back-end");

        jCheckBoxAreaAtuacaoFrontEnd.setText("Front-end");

        jLabelSexo.setText("Sexo");

        buttonGroup1.add(jRadioButtonSexoFeminino);
        jRadioButtonSexoFeminino.setText("Feminino");

        buttonGroup1.add(jRadioButtonSexoMasculino);
        jRadioButtonSexoMasculino.setText("Masculino");

        jLabelDescrição.setText("Descrição");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jCheckBoxTermosAceite.setText("Eu concordo com os termos de acordo");
        jCheckBoxTermosAceite.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxTermosAceiteItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Mês Nascimento", "Ano Nascimento", "Área Atuação", "Sexo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonApagar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel4AnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jSpinnerAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxAreaAtuacaoBackEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jRadioButtonSexoFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxAreaAtuacaoFrontEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jRadioButtonSexoMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonProcessar))
                            .addComponent(jCheckBoxTermosAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonApagar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelSobrenome)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMesNascimento)
                            .addComponent(jLabel4AnoNascimento))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAreaAtuacao)
                            .addComponent(jLabelSexo))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxAreaAtuacaoBackEnd)
                            .addComponent(jRadioButtonSexoFeminino))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxAreaAtuacaoFrontEnd)
                            .addComponent(jRadioButtonSexoMasculino))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDescrição)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jCheckBoxTermosAceite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonProcessar)
                            .addComponent(jButtonCancelar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcessarActionPerformed
        // get => obter algo;
        // set => definir algo

        // Obter o nome que o usuário digitou do campo de texto(jTextField1)
        String nome = jTextFieldNome.getText();
        // Obter o sobrenome que o usuário digitou do campo de texto(jTextField2)
        String sobrenome = jTextFieldSobrenome.getText();

        // Obter o mês de nascimento selecionado do comboBox
        String mesNascimento = (String) jComboBoxMesNascimento.getSelectedItem();
        int anoNascimento = Integer.parseInt(jSpinnerAnoNascimento.getValue().toString());
        String sexo = "";
        if (jRadioButtonSexoFeminino.isSelected() == true) {
            sexo = "Feminino";
        } else if (jRadioButtonSexoMasculino.isSelected() == true) {
            sexo = "Masculino";
        }

        boolean ehBackEnd = jCheckBoxAreaAtuacaoBackEnd.isSelected();
        boolean ehFrontEnd = jCheckBoxAreaAtuacaoFrontEnd.isSelected();
        String descricao = jTextAreaDescricao.getText();
        String nomeCompleto = nome + " " + sobrenome;

        String areaAtuacao = "Full Stack";
        if (ehBackEnd == true && ehFrontEnd == false) {
            areaAtuacao = "Back-End";
        } else if (ehBackEnd == false && ehFrontEnd == true) {
            areaAtuacao = "Front-End";
        }

        var modeloTabela = (DefaultTableModel) jTable1.getModel();

        modeloTabela.addRow(new Object[]{
            nome,
            sobrenome,
            mesNascimento,
            anoNascimento,
            areaAtuacao,
            sexo,
            descricao
        });
        salvarNoExcel();

        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
    }//GEN-LAST:event_jButtonProcessarActionPerformed

    private void salvarNoExcel() {
        var modelo = (DefaultTableModel) jTable1.getModel();

        try (Workbook excel = new XSSFWorkbook()) {
            Sheet planilha = excel.createSheet("Colaboradores");

            Row linhaCabecalho = planilha.createRow(0);
            linhaCabecalho.createCell(0).setCellValue("Nome");
            linhaCabecalho.createCell(1).setCellValue("Sobrenome");
            linhaCabecalho.createCell(2).setCellValue("Mês Nascimento");
            linhaCabecalho.createCell(3).setCellValue("Ano Nascimento");
            linhaCabecalho.createCell(4).setCellValue("Área de Atuação");
            linhaCabecalho.createCell(5).setCellValue("Sexo");
            linhaCabecalho.createCell(6).setCellValue("Descrição");
            // Pegar o modelo da tabela

            // Percorrer cada uma das linhas da tabela
            for (var i = 0; i < modelo.getRowCount(); i++) {
                // Obter o nome do produto da linha iterada
                String nome = modelo.getValueAt(i, 0).toString();
                String sobrenome = modelo.getValueAt(i, 1).toString();
                String mesNascimento = modelo.getValueAt(i, 2).toString();
                String anoNascimento = modelo.getValueAt(i, 3).toString();
                String areaAtuacao = modelo.getValueAt(i, 4).toString();
                String sexo = modelo.getValueAt(i, 5).toString();
                String descricao = modelo.getValueAt(i, 6).toString();
                // Criar uma linha na planilha
                Row linha = planilha.createRow(i + 1);
                // Criar uma célula definindo o nome do produto da linha iterada
                linha.createCell(0).setCellValue(nome);
                linha.createCell(1).setCellValue(sobrenome);
                linha.createCell(2).setCellValue(mesNascimento);
                linha.createCell(3).setCellValue(anoNascimento);
                linha.createCell(4).setCellValue(areaAtuacao);
                linha.createCell(5).setCellValue(sexo);
                linha.createCell(6).setCellValue(descricao);
            }

            // Obter o caminho da pasta da área de trabalho do usuário
            var caminhoDesktop = Paths.get(
                    System.getProperty("user.home"), "Desktop");
            // Obter o caminho do arquivo do excel que será importado
            var caminhoArquivo = caminhoDesktop.resolve("example.xlsx");

            FileOutputStream arquivoSaida = new FileOutputStream(caminhoArquivo.toFile());
            excel.write(arquivoSaida);
            arquivoSaida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getTextoBoolean(boolean value) {
        if (value == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    private void jCheckBoxTermosAceiteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxTermosAceiteItemStateChanged
        boolean termosDeAcordoAceitos = jCheckBoxTermosAceite.isSelected();

        if (termosDeAcordoAceitos == true) {
            jButtonProcessar.setEnabled(true);
        } else {
            jButtonProcessar.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxTermosAceiteItemStateChanged

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setText("");
        jTextFieldSobrenome.setText("");
        jTextAreaDescricao.setText("");

        jCheckBoxAreaAtuacaoBackEnd.setSelected(false);
        jCheckBoxAreaAtuacaoFrontEnd.setSelected(false);
        jCheckBoxTermosAceite.setSelected(false);

        // Remover a selação do radio button
        buttonGroup1.clearSelection();

        jSpinnerAnoNascimento.setValue(2024);
        // Definir o indice 0 dos itens do mês de nascimento, ou seja, janeiro.
        jComboBoxMesNascimento.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        var modelo = (DefaultTableModel) jTable1.getModel();
        var indiceLinhaSelecionada = jTable1.getSelectedRow();
        modelo.removeRow(indiceLinhaSelecionada);
        salvarNoExcel();
    }//GEN-LAST:event_jButtonApagarActionPerformed

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
            java.util.logging.Logger.getLogger(ExemploCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExemploCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExemploCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExemploCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploCampos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonProcessar;
    private javax.swing.JCheckBox jCheckBoxAreaAtuacaoBackEnd;
    private javax.swing.JCheckBox jCheckBoxAreaAtuacaoFrontEnd;
    private javax.swing.JCheckBox jCheckBoxTermosAceite;
    private javax.swing.JComboBox<String> jComboBoxMesNascimento;
    private javax.swing.JLabel jLabel4AnoNascimento;
    private javax.swing.JLabel jLabelAreaAtuacao;
    private javax.swing.JLabel jLabelDescrição;
    private javax.swing.JLabel jLabelMesNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JRadioButton jRadioButtonSexoFeminino;
    private javax.swing.JRadioButton jRadioButtonSexoMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerAnoNascimento;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
