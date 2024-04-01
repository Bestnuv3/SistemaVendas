/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

import com.mycompany.sistemavendas.Produto;

/**
 *
 * @author ots
 */
public class ProdutoCarrinho extends Produto{
    private int quantidade;


    public ProdutoCarrinho(int quantidade, Produto produto) {
        super(produto.getNome(), produto.getValor());
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getValorTotal() {
        return this.getValor() * this.quantidade;
    }
    
    public String toString(){
        return this.getNome() + " " + this.getQuantidade() + "x";
    }
}
