package desafioum.formageometrica;

public class Quadrado extends FormaGeometrica {

    private final String NOME_FORMA = "Quadrado";
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
        setCor("AMARELO");
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public String getNomeDaForma() {
        return NOME_FORMA;
    }
    
    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
