public class CantinhoMineiro extends BuffetDecorator{

    public CantinhoMineiro(Buffet buffet) {
        super(buffet);
    }

    @Override
    public float getCustoPessoa() {
        return 100.0f;
    }

    @Override
    public String getProdutoEvento() {
        return "Cantinho Mineiro";
    }
}
