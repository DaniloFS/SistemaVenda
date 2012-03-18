/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author Danilo Fernandes
 */
public class Venda {
    private int codigo;
    private int cliente;
    private String data;
    
    public Venda(){
        
    }
    public Venda (int c,int cl, String d){
         
        codigo=c;
        cliente=cl;
        data=d;
        
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
