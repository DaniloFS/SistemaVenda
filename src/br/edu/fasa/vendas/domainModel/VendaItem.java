/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author Danilo Fernandes
 */
public class VendaItem {
    
    private int codigo;
    private int venda;
    private int produto;
    private int quantidade;
    private float valorunitario;
    
    public VendaItem (){
        
    }
    
    public VendaItem ( int c, int v, int p, int q, float vu){
        codigo=c;
        venda=v;
        produto=p;
        quantidade=q;
        valorunitario=vu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
    
    
}
