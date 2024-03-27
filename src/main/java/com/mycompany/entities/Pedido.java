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
    private final List<Produto> listaProdutos;
    private double valorTotal = 0.0;
    private FormaDePagamento formaDePagamento;
    
    public Pedido (){
        this.listaProdutos = new ArrayList<>();
    }

    public List<Produto> getListaProdutos() {
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
    
    public void adicionarProduto(Produto novoProduto){
        this.listaProdutos.add(novoProduto);
    }
    
    public boolean removeProdutoByName(String name){
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equals(name)){
                return listaProdutos.remove(produto);
            }
        }
        
        return false;
    }
    
    public boolean editProduto(Produto produtoEditado){
        try {
            Produto produto = getProdutoByName(produtoEditado.getNome());
            int produtoIndex = this.listaProdutos.indexOf(produto);
            this.listaProdutos.set(produtoIndex, produtoEditado);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public double getValorTotal() {
        return valorTotal;
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
}
