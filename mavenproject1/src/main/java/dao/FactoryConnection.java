
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//classe que e a fabrica de conexão com o meu banco de dados 
public class FactoryConnection {
    private static final String url = "jdbc:mysql://localhost:3306/mercado?verifyservercertificate=false&useSSL=true";
    private static final String usuario = "root";
    private  static final String senha = "12345678";
    
    //criando um metodo que posso chama-lo em outras classes para poder conectar com o meu banco de dados
    public static Connection getConexao() {
        
        Connection con = null;
        try {
             
             con = DriverManager.getConnection(url, usuario, senha);
             //JOptionPane.showMessageDialog(null, "conectado com sucesso");
             
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco de dados:" + erro);
        }
       
        
        return con;

    }
}
