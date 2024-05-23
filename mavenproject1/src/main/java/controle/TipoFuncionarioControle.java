
package controle;

import dao.TipoFuncionarioDao;
import interfaces.InterfaceControle;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TipoFuncionarioModelo;

//classe que denomina da interface controle para pegar os mesmos metodos da minha classe interfaceControle
public class TipoFuncionarioControle implements InterfaceControle{
    TipoFuncionarioModelo tfm = new TipoFuncionarioModelo();//Instanciando metodo de uma classe para poder acessar ela posteriomente
    TipoFuncionarioDao tfd = new TipoFuncionarioDao();//Instanciando metodo de uma classe para poder acessar ela posteriomente

    @Override
    // metodo utilizado para criar uma conexão entre classes e colocando condições para ser enviado
    // esse metodo ele chama utiliza um objeto de valor desconhecido que so e efetivado posteriormente 
    public void salvarControle(Object... valor) {
        // uma condição que caso o id seja zerado ele vai setar e enviar meu comando para outra classe que armazena as informações 
        // o id tem como inicial o valor 0 pois e o primero campo setado no meu forms
        if("".equals(valor[0])){
            tfm.setId(0);
        }else{// caso contrario ele vai pegar o valor de um campo textfield e transformalo para um tipo int
            tfm.setId (Integer.parseInt (valor[0]. toString()));
        }
        
        //setando os meus dados obtidos pelo meu form para uma classe que tem os setters e os getters
        
        tfm.setNome((String)valor[1]);
        tfm.setCpf((String) valor[2]);
        tfm.setCargo((String) valor[3]);
        tfm.setSalario((String) valor[4]);
        
        //enviando as informações para DAO
        tfd.Salvardaofunc(tfm);
        
       
    }

    @Override
    //metodo de exclusao de dados que e apenas exigido o meu id
    public void excluirControle(int id) {
        tfd.excluirDao(id);
    }

    @Override
    public void carregarComboBox() {
      
    }

    @Override
    // metodo de consulta de dados com a classe form
    public void consultarControle(Object... valor) {
        // e necessario fazer um tratamento do meu codigo pois eu estou trabalhando com banco de dados
        //o tratamento ele serve para criar como ex uma codição que se caso esteja tudo certo ele prossiga caso contrario me da um erro SQL
        try {
            tfd.consultarDao(valor);
        } catch (SQLException ex) {
            Logger.getLogger(TipoProdutoControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
