/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.entities.Produto;
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
public class ProdutoTest {
    public Produto produto1;
    public ProdutoTest() {
    }

    @BeforeEach
    public void setUp() {
        produto1 = new Produto();
    }
    
    @Test
    public void settarNomeDeProduto(){
        produto1.setNome("Produto11");
        
        assertEquals("Produto11", produto1.getNome(), "Nome do produto não foi trocado corretamente");
    }
    
    @Test
    public void testGetNome() {
        Produto produto = new Produto("Teste", 10.0);
        assertEquals("Teste", produto.getNome());
    }
    
    @Test
    public void testSetNomeChangesValue() {
        Produto produto = new Produto("Initial", 20.0);
        produto.setNome("Changed");
        assertEquals("Changed", produto.getNome());
    }
}
