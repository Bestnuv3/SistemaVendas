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
    
    public void adicionarProduto(Produto novoProduto){
        this.listaProdutos.add(novoProduto);
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
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
