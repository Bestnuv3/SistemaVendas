/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.entities.Produto;
import com.mycompany.entities.ProdutoCarrinho;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julia
 */
public class ProdutoCarrinhoTest {
    ProdutoCarrinho produtoCarrinho1, produtoCarrinho2;
    Produto produto1, produto2;
    
    public ProdutoCarrinhoTest() {
    }
  
    @BeforeEach
    public void setUp() {
        produto1 = new Produto("Produto1", 50);
        produto2 = new Produto("Produto2", 25);
        produtoCarrinho1 = new ProdutoCarrinho(2, produto1);
        produtoCarrinho2 = new ProdutoCarrinho(1, produto2);
    }
    
    @Test
    public void pegarValorTotal(){
        double totalEsperado = 100;
        
        assertEquals(totalEsperado, produtoCarrinho1.getValorTotal());
    }
    
    @Test
    public void pegarQuantidades(){
        produtoCarrinho1.setQuantidade(2);
        
        assertEquals(2, produtoCarrinho1.getQuantidade());
    }

    @Test
    public void testaConversaoToString(){
        produtoCarrinho1.setQuantidade(2);
        assertEquals("Produto1 2x", produtoCarrinho1.toString());
    }
    
    @Test
    public void testaConversaoToStringQuandoEntidadeVazia(){
        ProdutoCarrinho novoProdutoCarrinho = new ProdutoCarrinho();
        assertEquals(" 0x", novoProdutoCarrinho.toString());
    }
}
