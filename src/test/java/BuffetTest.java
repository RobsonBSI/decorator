import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class BuffetTest {
    @Test
    void deveRetornarCustoFormatura() {
        Buffet buffet = new Formatura(1000.0f);

        assertEquals(1000.0f, buffet.getCusto());
    }

    @Test
    void deveRetornarCustoFormaturaComCantinhoMineiro() {
        Buffet buffet = new CantinhoMineiro(new Formatura(1000.0f));

        assertEquals(1100.0f, buffet.getCusto());
    }
    @Test
    void deveRetornarCustoFormaturaComCantinhoJapones() {
        Buffet buffet = new CantinhoJapones(new Formatura(1000.0f));

        assertEquals(1250.0f, buffet.getCusto());
    }

    @Test
    void deveRetornarCustoFormaturaComBarDrinks() {
        Buffet buffet = new BarDrinks(new Formatura(1000.0f));

        assertEquals(1100.0f, buffet.getCusto());
    }
    @Test
    void deveRetornarCustoFormaturaCompleta() {
        Buffet buffet = new CantinhoJapones(new BarDrinks(new CantinhoMineiro(new Formatura(1000.0f))));

        assertEquals(1450.0f, buffet.getCusto());
    }
    @Test
    void deveRetornarProdutosFormatura(){
        Buffet buffet = new Formatura();

        assertEquals("Salgado / Refrigerante / Cerveja", buffet.getProduto());
    }
    @Test
    void deveRetornarProdutosFormaturaComCantinhoMineiro(){
        Buffet buffet = new CantinhoMineiro(new Formatura());

        assertEquals("Salgado / Refrigerante / Cerveja / Cantinho Mineiro", buffet.getProduto());
    }
    @Test
    void deveRetornarProdutosFormaturaComCantinhoJapones(){
        Buffet buffet = new CantinhoJapones (new Formatura());

        assertEquals("Salgado / Refrigerante / Cerveja / Comidas Japonesas", buffet.getProduto());
    }
    @Test
    void deveRetornarProdutosFormaturaComBarDrinks(){
        Buffet buffet = new BarDrinks (new Formatura());

        assertEquals("Salgado / Refrigerante / Cerveja / Bar de Drinks", buffet.getProduto());
    }
    @Test
    void deveRetornarProdutosFormaturaCompleto(){
        Buffet buffet = new BarDrinks (new CantinhoMineiro(new CantinhoJapones(new Formatura())));

        assertEquals("Salgado / Refrigerante / Cerveja / Comidas Japonesas / Cantinho Mineiro / Bar de Drinks", buffet.getProduto());
    }

}