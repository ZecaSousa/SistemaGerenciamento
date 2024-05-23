
package dao;


import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.TipoProdutoModelo;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

//classe que denomina da interface DAO para pegar os mesmos metodos da minha classe
public class TipoProdutoDao implements InterfaceDao{ 
    
    //criando minhas variaveis para poder manipular elas porsteriormente
    String sql;
    PreparedStatement stm;// comando prorpio do MYSQL que serve para preparar uma declaração 
    ResultSet resultado;// comando proprio do MYSQL que serve para buscar um resultado de uma pesquisa ao banco
    
    @Override
    public void salvarDao(Object... valor) {
        //Instanciando metodo de uma classe para poder acessar ela posteriomente que por sua vez recebe a ordem de objeto de valor 0
        TipoProdutoModelo tpm = (TipoProdutoModelo) valor[0]; 
        
        //descobrir se e uma inclusao ou alteracao
        if (tpm.getId() == 0){
            sql = "INSERT INTO produto (descricao, estoque, custo, preco) values (?, ?, ?, ?)";
            //settando que caso o id for 0 ele vai mandar um comando para o banco de dados.
        } else{
            sql = "UPDATE produto SET descricao=? , estoque=?, custo=?, preco=? WHERE idproduto=?";
            //settando que caso o id for diferente de 0 ele vai mandar um comando para o banco de dados.
        }
        
          try {// para trabalhar com o banco de dados precisamos fazer tratamento do meu codigo para manipular o banco 
              //preparando conexao com o banco para manipular os dados
            stm = FactoryConnection.getConexao().prepareStatement(sql);
            
            stm.setString(1, tpm.getDescricao());
            stm.setString(2, tpm.getEstoque());
            stm.setString(3, tpm.getCusto());
            stm.setString(4, tpm.getValor());
            //as siglas de stm e para preparar essa declaração pro banco de dados
            
            if (tpm.getId()>0) stm.setInt(5, tpm.getId());
            // para o banco de dados fazer um update e o valor 5 significa para o where do if funcionario
            
            stm.execute();//executar a preparação para o banco de dados
            stm.close();// executar um encerramento para o banco de dados
            
              JOptionPane.showMessageDialog(null, "Registro gravado");
            
        } catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null, "erro" + e);
        }
        
    }

    @Override
    public void excluirDao(int id) { //metodo para realizar a exlusao de algum dado do meu banco
        sql = "DELETE FROM produto WHERE idproduto=?";
        
        try {// no meu banco a chave primaria
            // excluido o id automaticamente ele exclui tudo relacionado a ele
            stm = FactoryConnection.getConexao().prepareStatement(sql);
            
            stm.setInt(1, id);
            
            
            
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso");
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "ocorreu um erro de Exclusão de resgistro" + e);
        }
    }

    @Override
    public void carregarComboBoxDao() throws SQLException {
        
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        // metodo utilizado para fazer uma consulta ao banco e retornar a minha tabela
        //criando um tipo da tabela
        DefaultTableModel tabela = (DefaultTableModel) valor[1];// minha tabela tem o valor do objeto de 1
        sql = "select * from mercado.produto WHERE descricao LIKE '%" + (String) valor[0] + "%'";// meu campo consulta tem o valor de tabela 0
        stm = FactoryConnection.getConexao().prepareStatement(sql);// pegando a conexão com o meu factory connection
        resultado =  stm.executeQuery();// executando a consulta com base no tratamento stm
        
        while(resultado.next()) {// enquanto tiver um novo resultado ele busca e adiciona eles de acordo com minha ordem na tabela
            
            tabela.addRow(new Object[] {resultado.getObject("idproduto"),resultado.getObject("descricao"), resultado.getObject("custo"), resultado.getObject("preco"), resultado.getObject("estoque")});
             
        }
        stm.close();
    }
    

    
}
