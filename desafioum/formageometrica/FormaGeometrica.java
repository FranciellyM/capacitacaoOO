package desafioum.formageometrica;

public abstract class FormaGeometrica implements IForma {

    private String cor;

    protected void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }
    
}
