package desafioum.formageometrica;

public class Triangulo implements FormaGeometrica {

    private final String NOME_FORMA = "Triângulo";
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public String getNomeDaForma() {
        return NOME_FORMA;
    }
    
    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }
}
