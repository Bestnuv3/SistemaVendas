
import com.mycompany.entities.Pedido;
import com.mycompany.entities.ProdutoCarrinho;
import com.mycompany.entities.Produto;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julia
 */
public class PedidoTest {
    public List<ProdutoCarrinho> lista;
    public Pedido pedido, pedidoEsperado;
    public Produto produto1, produto2, produto3;
    public ProdutoCarrinho pC1, pC2, pC3;
    public List<ProdutoCarrinho> listaEsperada;
    
    public PedidoTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        lista = new ArrayList<ProdutoCarrinho>();
        produto1 = new Produto("Produto1", 0.5);
        produto2 = new Produto("Produto2", 100.00);
        produto3 = new Produto("Produto3", 55.55);
        
        pC1 = new ProdutoCarrinho(1, produto1);
        pC2 = new ProdutoCarrinho(1, produto2);
        pC3 = new ProdutoCarrinho(2, produto3);
        
        lista.add(pC1);
        lista.add(pC2);
        
        pedido = new Pedido(lista);
    }

    @Test
    public void remocaoDeUmProdutoPeloNomeNosPedidos()throws Exception{
        listaEsperada = new ArrayList<ProdutoCarrinho>();
        listaEsperada.add(pC2);
        
        pedido.removeProdutoByName("Produto1");

        assertEquals(listaEsperada, pedido.getListaProdutos(), "A Lista Esperada é diferente da Lista resultante");
    }
    
    @Test
    public void valorTotalDeveSer105Com65(){
        double totalEsperado = 155.65;
        
        assertEquals(totalEsperado, pedido.getValorTotal(), "O valor Total Esperado é diferente do Valor Total resultante");
    }
    
    @Test
    public void adicaoDeUmProdutoNosPedidos(){
        listaEsperada = new ArrayList<ProdutoCarrinho>();
        listaEsperada.add(pC1);
        listaEsperada.add(pC2);
        listaEsperada.add(pC3);
        
        pedido.adicionarProduto(pC3);
        
        assertEquals(listaEsperada, pedido.getListaProdutos(), "A Lista Esperada é diferente da Lista resultante");
    }
    
    @Test
    public void pegarProdutoPeloNomeDeveResultarProduto1(){
        Produto produtoEsperado = pC1;
        
        assertEquals(produtoEsperado, pedido.getProdutoByName("Produto1"), "O Produto Esperado é diferente do Produto resultante");
    }
}
