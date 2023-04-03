public class CantinhoJapones extends BuffetDecorator {
    public CantinhoJapones(Buffet buffet) {
        super(buffet);
    }

    @Override
    public float getCustoPessoa() {
        return 250.0f;
    }

    @Override
    public String getProdutoEvento() {
        return "Comidas Japonesas";
    }
}
