package model;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Produto implements Imprimivel, Seguranca {
    private String descricao;
    private int quantidade;

    public Produto(String desc, int quant) {
        this.setDescricao(desc);
        this.setQuantidade(quant);
        validar();
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 
    
    @Override
    public String formatoString(){
        String r = "Descrição: " + this.getDescricao();
        r += nlin + "Quantidade: " + this.getQuantidade();
        return r;
    }
   
    @Override
    public void formatoSystemOut(){
        String r = "Descrição: " + this.getDescricao();
        r += nlin + "Quantidade: " + this.getQuantidade();
        System.out.println(r);
    }
    
    @Override
    public boolean validar(){
        if(this.quantidade < 0){
            JOptionPane.showMessageDialog(null, "Informe uma quantidade válida.");
            this.setQuantidade(0);
            this.setDescricao("");
            return false;
        } else if (this.descricao.equals("") || this.descricao.length() < 3){
            JOptionPane.showMessageDialog(null, "Informe uma descrição válida.");
            this.setDescricao("");
            this.setQuantidade(0);
            return false;
        } else
            return true;
    }
}
