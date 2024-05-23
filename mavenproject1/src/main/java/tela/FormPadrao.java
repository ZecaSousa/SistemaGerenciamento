
package tela;

import controle.TipoProdutoControle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



 public  class FormPadrao extends javax.swing.JInternalFrame {

    //criando metodos abstratos que serão implementado pela classe filhas
    
     
    //metodo construtor

    public FormPadrao() {
        //Meu metodo principal.
        //Settando metodos que criei para fazer suas funções especificas
        initComponents();
        jtfID.setEnabled(false); //Função do campo ID para colocar que a condição dele e que nao pode ser ativado.
        habilitarBotoes(true);
        habilitarCampo(false);
        
        
        // metodo que ele faz a função de que quando clicado com o mouse no item especifico da lista ele deve ser implementado no metodo descrito
   tabelaProduto.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e){
           atualizarRegistro(); //chamada do metdo atualizar registro quer criei mais abaixo.
       }
       
   });
    }
    
    //metodo para habilitar e desabilitar botoes no formulario
    public void habilitarBotoes(boolean estado){
        jNovo.setEnabled(estado);
        jAlterar.setEnabled(estado);
        jExcluir.setEnabled(estado);
        
        jSalvar.setEnabled(!estado);
        jCancelar.setEnabled(!estado); 
    }
    
    //metodo para habilitar e desabilitar acesso ao campos de edição
    public void habilitarCampo(boolean estado){
        jtfDescricao.setEnabled(estado);
        jtfCusto.setEnabled(estado);
        jtfPreco.setEnabled(estado);
        jtfEstoque.setEnabled(estado);
    }
    
    //metodo para limpar campos do formulario
    public void limpacampos(){
        jtfDescricao.setText("");
        jtfCusto.setText("");
        jtfPreco.setText("");
        jtfEstoque.setText(""); 
    }
    
    //Instancia da classe que esta em outro package para ter acesso a manipular os dados.
     TipoProdutoControle tpc = new TipoProdutoControle();
     
    //metodo para pegar os dados que foi digitado nos campos do form para mandar a uma metodo SALVARCONTROLE que esta dentro da classe instanciada 
    public void salvamento (){
        
        tpc.salvarControle(jtfID.getText() , jtfDescricao.getText() , jtfCusto.getText() , jtfPreco.getText() , jtfEstoque.getText());
        
    }
    
    // Metodo para pegar Consultar o produto de uma classe de outro package e colocar na minha tabela
    public void consultarproduto(){
        DefaultTableModel tabelaProd = (DefaultTableModel) tabelaProduto.getModel();
        tpc.consultarControle(jtfConsulta.getText() , tabelaProd); //Pegando os metodo que foi digitado no campo de consulta e concatenar com a tabela produto
        
    }
    //metodo usado para atualizar os registros que foi clicado na tabela e setados nos campos 
    public void atualizarRegistro(){
        jtfID.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0) .toString());
        jtfDescricao.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 1) .toString());
        jtfCusto.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 2) .toString());
        jtfPreco.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 3) .toString());
        jtfEstoque.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 4) .toString());
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jpnCadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfEstoque = new javax.swing.JTextField();
        jtfCusto = new javax.swing.JTextField();
        jtfPreco = new javax.swing.JTextField();
        jpnBotoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNovo = new javax.swing.JButton();
        jAlterar = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();
        jFechar = new javax.swing.JButton();
        jSalvar = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jpnConsulta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtfConsulta = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jtfLimpar = new javax.swing.JButton();
        jConsulta = new javax.swing.JButton();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setTitle("Produtos");

        jLabel2.setText("ID");

        jLabel3.setText("Descrição:");

        jtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDActionPerformed(evt);
            }
        });

        jtfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescricaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Custo:");

        jLabel5.setText("Preço:");

        jLabel6.setText("Estoque:");

        jtfCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCustoActionPerformed(evt);
            }
        });

        jtfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnCadastroLayout = new javax.swing.GroupLayout(jpnCadastro);
        jpnCadastro.setLayout(jpnCadastroLayout);
        jpnCadastroLayout.setHorizontalGroup(
            jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jtfID, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jtfCusto))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnCadastroLayout.createSequentialGroup()
                        .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpnCadastroLayout.setVerticalGroup(
            jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jNovo.setMnemonic('n');
        jNovo.setText("Novo ");
        jNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNovoActionPerformed(evt);
            }
        });

        jAlterar.setMnemonic('a');
        jAlterar.setText("Alterar");
        jAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarActionPerformed(evt);
            }
        });

        jExcluir.setMnemonic('e');
        jExcluir.setText("Excluir");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        jFechar.setMnemonic('f');
        jFechar.setText("Fechar");
        jFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharActionPerformed(evt);
            }
        });

        jSalvar.setMnemonic('s');
        jSalvar.setText("Salvar");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jCancelar.setMnemonic('c');
        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\zecas\\OneDrive\\Área de Trabalho\\WS COM VSCODE\\Img\\logo_pequena.png")); // NOI18N

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBotoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBotoesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnBotoesLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnBotoesLayout.createSequentialGroup()
                                .addComponent(jNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jExcluir))
                            .addGroup(jpnBotoesLayout.createSequentialGroup()
                                .addComponent(jSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCancelar)))
                        .addGap(140, 140, 140)))
                .addComponent(jFechar)
                .addContainerGap())
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBotoesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnBotoesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNovo)
                            .addComponent(jAlterar)
                            .addComponent(jExcluir)
                            .addComponent(jFechar))
                        .addGap(27, 27, 27)
                        .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSalvar)
                            .addComponent(jCancelar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpnConsulta.setBackground(new java.awt.Color(0, 240, 240));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Consulta:");

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descricao", "Custo", "Preco", "Estoque"
            }
        ));
        tabelaProduto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaProdutoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tabelaProduto);

        jtfLimpar.setText("Limpar");
        jtfLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLimparActionPerformed(evt);
            }
        });

        jConsulta.setText("Consultar");
        jConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtfConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(jConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfLimpar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfLimpar)
                    .addComponent(jConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpnCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarActionPerformed
        // colocando os metodos criados para que quando clicado no botao alterar sejam ativados
        habilitarBotoes(false);
        habilitarCampo(true);
        jtfDescricao.requestFocus(); // requerindo foco do campo descrição isso garanti que quando clico no botao alterar me leve direto ao campo
    }//GEN-LAST:event_jAlterarActionPerformed

    private void jFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jFecharActionPerformed

    private void jNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNovoActionPerformed
        // TODO add your handling code here:
        habilitarBotoes(false);
        habilitarCampo(true);
        
        limpacampos();
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jNovoActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        // TODO add your handling code here:
        limpacampos();
        
       habilitarCampo(false);
        habilitarBotoes(true);
        
        if (JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?" , "confirmação" , JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
           limpacampos();
           tpc.excluirControle(Integer.parseInt(jtfID.getText()));
        }
    }//GEN-LAST:event_jExcluirActionPerformed

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        // TODO add your handling code here:
        habilitarBotoes(true);
        habilitarCampo(false);
        salvamento();  
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        // TODO add your handling code here:
        habilitarBotoes(true);
        habilitarCampo(false);
        limpacampos();
    }//GEN-LAST:event_jCancelarActionPerformed

    private void jtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDActionPerformed

    private void jtfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescricaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfDescricaoActionPerformed

    private void jtfCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCustoActionPerformed

    private void jtfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecoActionPerformed

    private void tabelaProdutoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaProdutoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaProdutoAncestorAdded

    private void jConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaActionPerformed
        // TODO add your handling code here:
        consultarproduto();
        
    }//GEN-LAST:event_jConsultaActionPerformed

    private void jtfLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLimparActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) tabelaProduto.getModel()).setRowCount(0);
        
    }//GEN-LAST:event_jtfLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAlterar;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jConsulta;
    private javax.swing.JButton jExcluir;
    private javax.swing.JButton jFechar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jNovo;
    private javax.swing.JButton jSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel jpnBotoes;
    public javax.swing.JPanel jpnCadastro;
    private javax.swing.JPanel jpnConsulta;
    private javax.swing.JTextField jtfConsulta;
    private javax.swing.JTextField jtfCusto;
    public javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfEstoque;
    public javax.swing.JTextField jtfID;
    private javax.swing.JButton jtfLimpar;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
