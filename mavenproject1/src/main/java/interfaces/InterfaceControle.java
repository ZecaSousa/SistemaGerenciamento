package interfaces;


public interface InterfaceControle {
    // Classe que esta preparando para receber uma lista de valores que nao sabe a quantidade
    public void salvarControle(Object... valor);
    public void excluirControle(int id);
    public void consultarControle(Object... valor);
    public void carregarComboBox();
    
    
}
