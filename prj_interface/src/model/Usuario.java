package model;

import javax.swing.JOptionPane;

public class Usuario extends Pessoa implements Imprimivel, Seguranca{
    private String nomeusuario;
    private String senha;

    public Usuario(String nu, String s, String n, int i) {
        super(n, i);
        this.setNomeusuario(nu);
        this.setSenha(s);
    }
    
    public String getNomeusuario() {
        return nomeusuario;
    }
    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String formatoString(){
        String r = "Nome: " + super.getNome()
                + nlin + "Idade: " + super.getIdade()
                + nlin + "Usuário: " + this.getNomeusuario()
                + nlin + "Senha: " + this.getSenha();
        return r;
    }
   
    @Override
    public void formatoSystemOut(){
        String r = "Nome: " + super.getNome()
                + nlin + "Idade: " + super.getIdade()
                + nlin + "Usuário: " + this.getNomeusuario()
                + nlin + "Senha: " + this.getSenha();
        System.out.println(r);
    }
    
    @Override
    public boolean validar(){
        if(this.getNomeusuario().equals("") || this.getSenha().equals("")){
            JOptionPane.showMessageDialog(null, "Informe um nome de usuário ou senha válido.");
            super.setNome("");
            super.setIdade(0);
            this.setNomeusuario("");
            this.setSenha("");
            return false;
        } else
            return true;
    }
    
    public boolean res(){
        String r = "";
        
        if(super.getNome().equals(r) || super.getIdade() < 0 || this.getNomeusuario().equals(r)
                || this.getSenha().equals(r)){
            return false;
        } else 
            return true;        
    }
}
