/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.Date;

/**
 *
 * @author Danilo Fernandes
 */
public class Venda {
    private int codigo;
    private Cliente c = new Cliente ();
    private Date data;
    
    public Venda(){
        
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the c
     */
    public Cliente getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Cliente c) {
        this.c = c;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
    
    
}
