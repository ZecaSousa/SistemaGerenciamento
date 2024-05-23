
package modelo;

import javax.swing.JOptionPane;

//Classe que armazena os meus dados para integrar o DAO
public class TipoFuncionarioModelo {
    private int id;
    private String nome;
    private String cpf;
    private String cargo;
    private String salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
       
        this.salario = salario;
    }

    
    
    
}
