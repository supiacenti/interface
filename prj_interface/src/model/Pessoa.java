package model;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String n, int i) {
        this.setNome(n);
        this.setIdade(i);
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
