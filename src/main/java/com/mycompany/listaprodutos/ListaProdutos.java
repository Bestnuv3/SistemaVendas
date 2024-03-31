/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaprodutos;

import com.mycompany.sistemavendas.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ots
 */
public final class ListaProdutos {
    private static ListaProdutos instance;
    public List<Produto> produtos;
    
    private ListaProdutos(){
        this.produtos = new ArrayList<>();
        this.produtos.add(new Produto("Notebook", 2400));
        this.produtos.add(new Produto("iPhone 12", 5000));
        this.produtos.add(new Produto("Monitor", 400));
    }
    
    public static ListaProdutos getInstance() {
        if (instance == null) {
            instance = new ListaProdutos();
        }
        return instance;
    }
}
