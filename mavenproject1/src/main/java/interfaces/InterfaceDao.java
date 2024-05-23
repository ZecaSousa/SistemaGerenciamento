
package interfaces;

import java.sql.SQLException;


public interface InterfaceDao {
    // o controle vai esta preparado para receber uma lista de valores que nao sabe a quantidade
    public void salvarDao(Object... valor);
    public void excluirDao(int id);
    public void carregarComboBoxDao()throws SQLException;
    public void consultarDao(Object... valor) throws SQLException;
}
