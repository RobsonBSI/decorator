public class BarDrinks extends BuffetDecorator{
    public BarDrinks(Buffet buffet) {
        super(buffet);
    }

    @Override
    public float getCustoPessoa() {
        return 100.0f;
    }

    @Override
    public String getProdutoEvento() {
        return "Bar de Drinks";
    }
}
