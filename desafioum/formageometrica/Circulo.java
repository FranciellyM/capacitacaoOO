package desafioum.formageometrica;

public class Circulo extends FormaGeometrica {
    
    private final String NOME_FORMA = "Círculo";
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
        setCor("AZUL");
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public String getNomeDaForma() {
        return NOME_FORMA;
    }
    
    @Override
    public double calculaArea() {
        return 3.14 * raio * raio;
    }
}
