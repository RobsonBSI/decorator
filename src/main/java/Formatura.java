public class Formatura  implements Buffet{
    private float custo;

    public Formatura(){}
    public Formatura(float custoEvento){
        this.custo= custoEvento;
    }


    @Override
    public String getProduto() {
        return "Salgado / Refrigerante / Cerveja";
    }

    @Override
    public float getCusto() {
        return custo;
    }
}
