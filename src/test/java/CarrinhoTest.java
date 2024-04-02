/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.listaprodutos.Carrinho;
import com.mycompany.sistemavendas.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alunolages
 */
public class CarrinhoTest {
    
    public Carrinho carrinho;
    
    public CarrinhoTest() {
    }
    
    @BeforeEach
    public void setUp() {
        carrinho = Carrinho.getInstance();
        carrinho.clearProdutos();
    }
    
    @Test
    public void testaInicializacaoDoCarrinho(){
        double total = this.carrinho.getTotal();
        int sizeListaProdutos = this.carrinho.getProdutos().size();
        
        assertEquals(0.0, total, "Total não foi iniciado como zero");
        assertEquals(0, sizeListaProdutos,"Lista não foi iniciada com zero elementos");
    }
    
    @Test
    public void adicaoDeUmProdutoNoCarrrinho(){
        double precoProduto = 2440.50;
        Produto produto = new Produto("Notebook",precoProduto);
        this.carrinho.addProduto(produto, 1);
        
        assertEquals(2440.50, this.carrinho.getTotal(), "Total não foi modificado ao adicionar um produto na lista");
        assertEquals(1, this.carrinho.getProdutos().size(),"O novo produto não foi cadastrado no carrinho");
    }
}
