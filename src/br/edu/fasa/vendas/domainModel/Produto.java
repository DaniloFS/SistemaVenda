/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author Danilo Fernandes
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private float valor;
    private int estoque;
  
    public Produto (){
        
    }
    
    public Produto (int c, String n, float v, int e){
        
        codigo=c;
        nome=n;
        valor=v;
        estoque=e;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
   
    
}
