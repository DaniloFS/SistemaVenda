/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author Danilo Fernandes
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    
    public Cliente (){
        
    }
    public Cliente (int c, String n){
        
        codigo=c;
        nome=n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
