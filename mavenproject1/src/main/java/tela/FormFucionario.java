
package tela;

import controle.TipoFuncionarioControle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FormFucionario extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public FormFucionario() {
        initComponents();
        habilitarbotoes(true);
        habilitarCampos(false);
        campoID.setEnabled(false);
        
         tabelaFuncionario.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e){
           atualizarRegistro();
       }
       
   });
         
    }
    
    //metodo para habilitar e desabilitar botoes no formulario
    public void habilitarbotoes (boolean estado){
        bNovo.setEnabled(estado);
        bAlterar.setEnabled(estado);
        bExcluir.setEnabled(estado);
        
        bSalvar.setEnabled(!estado);
        bCancelar.setEnabled(!estado);
    }
     //metodo para habilitar e desabilitar acesso ao campos de edição
    public void habilitarCampos(boolean estado){
        campoNome.setEnabled(estado);
        campoSalario.setEnabled(estado);
        campoCpf.setEnabled(estado);
        caixaCargo.setEnabled(estado);
    }
    //metodo para limpar campos do formulario
    public void limpacampos(){
        campoNome.setText("");
        campoCpf.setText("");
        campoSalario.setText(""); 
    }
    //Instancia da classe que esta em outro package para ter acesso a manipular os dados.
    TipoFuncionarioControle tfc = new TipoFuncionarioControle();
    
    
    //metodo para pegar os dados que foi digitado nos campos do form para mandar a uma metodo SALVARCONTROLE que esta dentro da classe instanciada
    public void salvamentoFunci(){
        
        tfc.salvarControle(campoID.getText() , campoNome.getText() , campoCpf.getText() , caixaCargo.getSelectedItem().toString() , campoSalario.getText());
    }
    
    // Metodo para pegar Consultar o produto de uma classe de outro package e colocar na minha tabela
    public void consultarproduto(){
        
        DefaultTableModel tabelaProd = (DefaultTableModel) tabelaFuncionario.getModel();
        tfc.consultarControle(campoConsulta.getText() , tabelaProd);
        
    }
    
    //metodo usado para atualizar os registros que foi clicado na tabela e setados nos campos 
     public void atualizarRegistro(){
        campoID.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0) .toString());
        campoNome.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 1) .toString());
        campoCpf.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 2) .toString());
        caixaCargo.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 3) .toString());
        campoSalario.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 4) .toString());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpnButtons = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bNovo = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        pngCadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caixaCargo = new javax.swing.JComboBox<>();
        campoCpf = new javax.swing.JTextField();
        campoSalario = new javax.swing.JTextField();
        jpnPesquisa = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoConsulta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        botaoConsultar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setTitle("Funcionario");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\zecas\\OneDrive\\Área de Trabalho\\WS COM VSCODE\\Img\\logo_pequena.png")); // NOI18N

        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bAlterar.setText("Alterar");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bFechar.setText("Fechar");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonsLayout = new javax.swing.GroupLayout(jpnButtons);
        jpnButtons.setLayout(jpnButtonsLayout);
        jpnButtonsLayout.setHorizontalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnButtonsLayout.createSequentialGroup()
                        .addComponent(bNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bFechar))
                    .addGroup(jpnButtonsLayout.createSequentialGroup()
                        .addComponent(bSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnButtonsLayout.setVerticalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnButtonsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnButtonsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bNovo)
                            .addComponent(bAlterar)
                            .addComponent(bExcluir)
                            .addComponent(bFechar))
                        .addGap(35, 35, 35)
                        .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSalvar)
                            .addComponent(bCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("ID:");

        jLabel3.setText("Nome:");

        campoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDActionPerformed(evt);
            }
        });

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel5.setText("Salario:");

        jLabel6.setText("C-P-F");

        caixaCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo na Empresa", "Gerente", "Caixa", "Repositor", "Padeiro", "Confeiteiro", "Serv.Gerais", "Embalador", "Segurança", "Conferente" }));
        caixaCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCargoActionPerformed(evt);
            }
        });

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        campoSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pngCadastroLayout = new javax.swing.GroupLayout(pngCadastro);
        pngCadastro.setLayout(pngCadastroLayout);
        pngCadastroLayout.setHorizontalGroup(
            pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pngCadastroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(pngCadastroLayout.createSequentialGroup()
                            .addComponent(campoID, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addGap(31, 31, 31)))
                    .addComponent(jLabel6)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNome)
                    .addGroup(pngCadastroLayout.createSequentialGroup()
                        .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(pngCadastroLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5))
                            .addGroup(pngCadastroLayout.createSequentialGroup()
                                .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(caixaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pngCadastroLayout.setVerticalGroup(
            pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pngCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pngCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pngCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pngCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caixaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnPesquisa.setBackground(new java.awt.Color(0, 240, 240));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Consulta:");

        campoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConsultaActionPerformed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Salario", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(tabelaFuncionario);

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPesquisaLayout = new javax.swing.GroupLayout(jpnPesquisa);
        jpnPesquisa.setLayout(jpnPesquisaLayout);
        jpnPesquisaLayout.setHorizontalGroup(
            jpnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPesquisaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jpnPesquisaLayout.setVerticalGroup(
            jpnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPesquisaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar)
                    .addComponent(botaoLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pngCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pngCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaCargoActionPerformed

    
    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        // TODO add your handling code here:
        habilitarbotoes(false);
        habilitarCampos(true);
        campoNome.requestFocus();
        
        limpacampos();
    }//GEN-LAST:event_bNovoActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
       // colocando os metodos criados para que quando clicado no botao alterar sejam ativados
        habilitarbotoes(false);
        habilitarCampos(true);
        campoNome.requestFocus();// requerindo foco do campo descrição isso garanti que quando clico no botao alterar me leve direto ao campo
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
        limpacampos();
        
        habilitarCampos(false);
        habilitarbotoes(true);
        
        if (JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?" , "confirmação" , JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
           limpacampos();
           tfc.excluirControle(Integer.parseInt(campoID.getText()));
        }
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        // TODO add your handling code here:
        habilitarbotoes(true);
        habilitarCampos(false);
        salvamentoFunci();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        limpacampos();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConsultaActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void campoSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalarioActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        // TODO add your handling code here:
        consultarproduto();
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) tabelaFuncionario.getModel()).setRowCount(0);
    }//GEN-LAST:event_botaoLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bSalvar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JComboBox<String> caixaCargo;
    private javax.swing.JTextField campoConsulta;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnButtons;
    private javax.swing.JPanel jpnPesquisa;
    private javax.swing.JPanel pngCadastro;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables
}
