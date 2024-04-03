/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaprodutos;

import com.mycompany.entities.ProdutoCarrinho;
import com.mycompany.entities.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ots
 */
public final class Carrinho {
    private static Carrinho instance;
    private List<ProdutoCarrinho> produtos;
    private double total;
    
    public Carrinho(){
        this.produtos = new ArrayList<>();
        this.total = 0.0;
    }
    
    public ProdutoCarrinho addProduto(Produto produto, int quantidade) throws Exception{
        if (quantidade < 1) throw new Exception("A quantidade não deve ser menor que 1.");
        if (produto.getValor() < 0) throw new Exception("O preço do produto não pode ser menor que 0.");
        ProdutoCarrinho produtoCarrinho = new ProdutoCarrinho(quantidade, produto);
        this.produtos.add(produtoCarrinho);
        this.total += produtoCarrinho.getValorTotal();
        return produtoCarrinho;
    }
    
    public void removerProduto(ProdutoCarrinho produto) {
        this.produtos.remove(produto);
        this.total -= produto.getValorTotal();
    }
    
    public void removerProduto(int index) {
        ProdutoCarrinho produto = this.produtos.remove(index);
        this.total -= produto.getValorTotal();
    }

    public List<ProdutoCarrinho> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoCarrinho> produtos) {
        this.produtos = produtos;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public static Carrinho getInstance() {
        if (instance == null) {
            instance = new Carrinho();
        }
        return instance;
    }

    public void clearProdutos() {
        this.produtos.clear();
        this.total = 0.0;
    }
}
