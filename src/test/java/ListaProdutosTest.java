import com.mycompany.entities.Produto;
import com.mycompany.listaprodutos.ListaProdutos;
import java.util.ArrayList;
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
public class ListaProdutosTest {
    ListaProdutos lista;
    Produto p1, p2, p3;
    
    public ListaProdutosTest() {
    }
    
    @BeforeEach
    public void setUp() {
        lista = new ListaProdutos();
    }
    
    @Test
    void inicializarListaProdutosDeveRetornar3Produtos(){
        assertEquals(3, lista.produtos.size(), "A lista não foi inicializada corretamente");
    }
    
    @Test
    void funcaoGetInstance(){
        ListaProdutos listaI = ListaProdutos.getInstance();
        
        assertEquals(listaI, ListaProdutos.getInstance(), "A lista não foi instanciada corretamente");
    }
}
