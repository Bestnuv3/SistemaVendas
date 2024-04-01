/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

import com.mycompany.sistemavendas.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author othavio
 */
public class Pedido {
    private final List<ProdutoCarrinho> listaProdutos;
    private double valorTotal = 0.0;
    private int numeroParcelas = 1;
    private FormaDePagamento formaDePagamento;
    
    public Pedido (List<ProdutoCarrinho> listaProdutos){
        this.listaProdutos = listaProdutos;
    }

    public List<ProdutoCarrinho> getListaProdutos() {
        return listaProdutos;
    }
    
    public Produto getProdutoByName(String name){
        Produto produtoRetornado = null;
        
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equals(name)){
                return produto;
            }
        }
        
        return produtoRetornado;
    }
    
    public void adicionarProduto(ProdutoCarrinho novoProduto){
        this.listaProdutos.add(novoProduto);
        this.valorTotal += novoProduto.getValor();
    }
    
    public boolean removeProdutoByName(String name){
        for (ProdutoCarrinho produto : listaProdutos) {
            if (produto.getNome().equals(name)){
                this.valorTotal -= produto.getValor();
                return listaProdutos.remove(produto);
            }
        }
        
        return false;
    }
    
    public double getValorParcela(){
        return Math.round((valorTotal / numeroParcelas) * 100.0) / 100.0;
    }

    public double getValorTotal() {
        return Math.round(valorTotal * 100.0) / 100.0;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
    
    
}
