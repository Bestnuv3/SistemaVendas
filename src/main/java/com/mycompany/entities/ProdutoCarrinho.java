/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

/**
 *
 * @author ots
 */
public class ProdutoCarrinho extends Produto{
    private int quantidade;

    public ProdutoCarrinho() {
    }


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
        return Math.round((this.getValor() * this.quantidade) * 100.0) / 100.0;
    }
    
    public String toString(){
        return this.getNome() + " " + this.getQuantidade() + "x";
    }
}
