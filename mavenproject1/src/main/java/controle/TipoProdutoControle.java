
package controle;

import dao.TipoProdutoDao;
import interfaces.InterfaceControle;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TipoProdutoModelo;

//classe que denomina da interface controle para pegar os mesmos metodos da minha classe interfaceControle
public class TipoProdutoControle implements InterfaceControle{
    
    TipoProdutoModelo tpm = new TipoProdutoModelo(); //Instanciando metodo de uma classe para poder acessar ela posteriomente
    TipoProdutoDao tpd = new TipoProdutoDao();//Instanciando metodo de uma classe para poder acessar ela posteriomente
    
    @Override
    // metodo utilizado para criar uma conexão entre classes e colocando condições para ser enviado
    // esse metodo ele chama utiliza um objeto de valor desconhecido que so e efetivado posteriormente 
    public void salvarControle(Object... valor) {
        // uma condição que caso o id seja zerado ele vai setar e enviar meu comando para outra classe que armazena as informações 
        // o id tem como inicial o valor 0 pois e o primero campo setado no meu forms
        if ("".equals(valor[0])) {
            tpm.setId(0);
               
        }else{ // caso contrario ele vai pegar o valor de um campo textfield e transformalo para um tipo int
            tpm.setId (Integer.parseInt (valor[0]. toString()));
             
        }
        
        tpm.setDescricao((String) valor[1]);
        tpm.setCusto((String) valor[2]);
        tpm.setValor((String) valor[3]);
        tpm.setEstoque((String) valor[4]);
        //setando os meus dados obtidos pelo meu form para uma classe que tem os setters e os getters
        
        //enviando as informações para DAO
        tpd.salvarDao(tpm);
        
    }

    @Override
    
    //metodo de exclusao de dados que e apenas exigido o meu id
    public void excluirControle(int id) {
    tpd.excluirDao(id);
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
            tpd.consultarDao(valor);
        } catch (SQLException ex) {
            Logger.getLogger(TipoProdutoControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        
        
        
    }

    
}
