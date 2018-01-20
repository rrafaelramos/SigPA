/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.psc.sigpa.apresentacao;

import br.edu.ifnmg.tads.psc.sigpa.aplicacao.ConverterData;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.Endereco;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.EnderecoRepositorio;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.Funcionario;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.RepositorioBuilder;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.Sexo;
import br.edu.ifnmg.tads.psc.sigpa.aplicacao.ViolacaoRegraNegocioException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ananda
 */
public class cadastroFuncionario extends javax.swing.JInternalFrame {

    FuncionarioRepositorio funcionarios;
    EnderecoRepositorio endereco;
    
    Endereco e;
    Funcionario f;
   
    public cadastroFuncionario() throws ClassNotFoundException {
        initComponents();
        e = new Endereco();
        f = new Funcionario();
        endereco=RepositorioBuilder.getEnderecoRepositorio();
        funcionarios = RepositorioBuilder.getFuncionarioRepositorio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_rg = new javax.swing.JTextField();
        txt_cpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dataNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_masculino = new javax.swing.JRadioButton();
        btn_feminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_rua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_uf = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_cep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_admissao = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Nome");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        jLabel3.setText("RG");

        txt_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rgActionPerformed(evt);
            }
        });

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpfActionPerformed(evt);
            }
        });

        jLabel4.setText("Data Nas.");

        try {
            txt_dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dataNascimentoActionPerformed(evt);
            }
        });

        jLabel5.setText("Sexo");

        btn_masculino.setText("M");
        btn_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masculinoActionPerformed(evt);
            }
        });

        btn_feminino.setText("F");

        jLabel6.setText("Email");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefone");

        jLabel8.setText("Rua");

        txt_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ruaActionPerformed(evt);
            }
        });

        jLabel9.setText("Nº");

        jLabel10.setText("Bairro");

        txt_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bairroActionPerformed(evt);
            }
        });

        jLabel11.setText("Cidade");

        jLabel12.setText("UF");

        cb_uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel13.setText("CEP");

        jLabel14.setText("Data Admissão");

        try {
            txt_admissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_admissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_admissaoActionPerformed(evt);
            }
        });

        jLabel15.setText("Cargo");

        txt_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cargoActionPerformed(evt);
            }
        });

        jLabel16.setText("Salário");

        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });

        jLabel17.setText("Tipo");

        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel18.setText("Usename");

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        jLabel19.setText("Senha");

        txt_senha.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(1, 1, 1)
                            .addComponent(btn_masculino)
                            .addGap(18, 18, 18)
                            .addComponent(btn_feminino))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                    .addGap(16, 16, 16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9)
                                            .addGap(4, 4, 4)
                                            .addComponent(txt_numero)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_telefone))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_cidade)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(4, 4, 4)
                                .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(3, 3, 3)
                                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_salario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_admissao, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tipo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btn_masculino)
                    .addComponent(btn_feminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_admissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rgActionPerformed

    private void txt_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpfActionPerformed

    private void txt_dataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dataNascimentoActionPerformed

    private void btn_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_masculinoActionPerformed

    private void txt_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ruaActionPerformed

    private void txt_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bairroActionPerformed

    private void txt_admissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_admissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admissaoActionPerformed

    private void txt_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cargoActionPerformed

    private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioActionPerformed

    private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            preencherParametros();
        } catch (ViolacaoRegraNegocioException ex) {
            Logger.getLogger(cadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(cadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        salvar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_feminino;
    private javax.swing.JRadioButton btn_masculino;
    private javax.swing.JComboBox<String> cb_uf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txt_admissao;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JFormattedTextField txt_dataNascimento;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void preencherParametros() throws ViolacaoRegraNegocioException, ParseException {
    f.setCpf(txt_cpf.getText());
    f.setRg(txt_rg.getText());
    f.setNome(txt_nome.getText());
    f.setEmail(txt_email.getText());
    f.setTelefone(txt_telefone.getText());
    
    if(btn_masculino.isSelected())
    {
        f.setSexo(Sexo.Masculino);
    }else
    {
        f.setSexo(Sexo.Feminino);
    }
    
    f.setDataAdmissao(ConverterData.FormatarData(txt_admissao.getText()));
    f.setNascimento(ConverterData.FormatarData(txt_dataNascimento.getText()));
    f.setCargo(txt_cargo.getText());
    f.setSalario (new Long (txt_salario.getText()));
    f.setUserName(txt_username.getText());
    f.setPassword(new String (txt_senha.getPassword()));
    f.setTipo(new Integer (txt_tipo.getText()));
    f.setEndereco(e);
    e.setRua(txt_rua.getText());
    e.setNumero(new Integer(txt_numero.getText()));
    e.setBairro(txt_bairro.getText());
    e.setCidade(txt_cidade.getText());
    e.setUf((String) cb_uf.getSelectedItem());
    e.setCep(txt_cep.getText());
    
    }


    private void salvar() {
        
        if (endereco.Salvar(e) && (funcionarios.Salvar(f))){
            JOptionPane.showMessageDialog(rootPane, "Funcionario cadastrado com sucesso!");
        } else{
            
            JOptionPane.showMessageDialog(rootPane, "NÃO FOI POSSIVEL FAZER O CADASTRO!");
        }
    }
    
    


}
