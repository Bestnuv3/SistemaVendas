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
    public void adicaoDeUmProdutoNoCarrrinhoComQuantidadeUm() throws Exception{
        double precoProduto = 2440.50;
        Produto produto = new Produto("Notebook",precoProduto);
        this.carrinho.addProduto(produto, 1);
        
        assertEquals(2440.50, this.carrinho.getTotal(), "Total não foi modificado ao adicionar um produto na lista");
        assertEquals(1, this.carrinho.getProdutos().size(),"O novo produto não foi cadastrado no carrinho");
    }
    
    @Test
    public void erroAoAdicionarQuantidadeNegativa(){
        double precoProduto = 2440.50;
        Produto produto = new Produto("Notebook",precoProduto);
        
        Exception excecao = assertThrows(Exception.class,
                            () -> 
                            this.carrinho.addProduto(produto, -1));
        assertEquals("A quantidade não deve ser menor que 1.",
                        excecao.getMessage());
    }
    
    @Test
    public void adicaoDeUmProdutoNoCarrrinhoComQuantidadeDois() throws Exception{
        double precoProduto = 2440.50;
        int quantidadeProduto = 2;
        Produto produto = new Produto("Notebook",precoProduto);
        this.carrinho.addProduto(produto, quantidadeProduto);
        
        assertEquals(precoProduto * quantidadeProduto, this.carrinho.getTotal(), "Total não foi modificado corretamente ao adicionar o produto com uma quantidade maior que 1");
    }
    
    @Test
    public void adicaoDeVariosProdutosNoCarrrinhoComQuantidadeUm() throws Exception{
        double precoProduto1 = 2440.50;
        double precoProduto2 = 20000.00;
        double precoProduto3 = 10000.00;
        Produto produto = new Produto("Notebook",precoProduto1);
        Produto produto1 = new Produto("Macbook",precoProduto2);
        Produto produto2 = new Produto("PC gamer",precoProduto3);
        this.carrinho.addProduto(produto, 1);
        this.carrinho.addProduto(produto1, 1);
        this.carrinho.addProduto(produto2, 1);
        
        double expectedTotal = precoProduto1 + precoProduto2 + precoProduto3;
        assertEquals(expectedTotal, this.carrinho.getTotal(), "Total não foi modificado ao adicionar vários produtos na lista");
    }
    
    @Test
    public void adicaoDeVariosProdutosNoCarrrinhoComQuantidadeVariada() throws Exception{
        double precoProduto1 = 2440.50;
        double precoProduto2 = 20000.00;
        double precoProduto3 = 10000.00;
        int quantidadeProduto1 = 2;
        int quantidadeProduto2 = 1;
        int quantidadeProduto3 = 3;
        Produto produto = new Produto("Notebook",precoProduto1);
        Produto produto1 = new Produto("Macbook",precoProduto2);
        Produto produto2 = new Produto("PC gamer",precoProduto3);
        this.carrinho.addProduto(produto, quantidadeProduto1);
        this.carrinho.addProduto(produto1, quantidadeProduto2);
        this.carrinho.addProduto(produto2, quantidadeProduto3);
        
        double expectedTotal = (precoProduto1 * quantidadeProduto1) + (precoProduto2 * quantidadeProduto2) + (precoProduto3 * quantidadeProduto3);
        assertEquals(expectedTotal, this.carrinho.getTotal(), "Total não foi modificado ao adicionar vários produtos na lista com uma quantidade maior que 1");
    }
}
