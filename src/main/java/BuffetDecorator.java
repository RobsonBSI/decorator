public  abstract  class BuffetDecorator implements Buffet{
    private Buffet buffet;
    public String produto;

    public  BuffetDecorator(Buffet buffet){
        this.buffet= buffet;
    }

    public Buffet getBuffet() {
        return buffet;
    }

    public void setBuffet(Buffet buffet) {
        this.buffet = buffet;
    }
    public abstract float getCustoPessoa();
    public float getCusto() {
        return this.buffet.getCusto() + this.getCustoPessoa();
    }

    public abstract String getProdutoEvento();

    public String getProduto() {
        return this.buffet.getProduto() + "/" + this.getProdutoEvento();
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
