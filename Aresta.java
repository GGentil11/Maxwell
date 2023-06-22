
public class Aresta {
    private int peso;
    private Cidade inicio;
    private Cidade fim;
    
    public Aresta(int peso, Cidade inicio, Cidade fim){
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Cidade getInicio() {
        return inicio;
    }

    public void setInicio(Cidade inicio) {
        this.inicio = inicio;
    }

    public Cidade getFim() {
        return fim;
    }

    public void setFim(Cidade fim) {
        this.fim = fim;
    }
    
    
}
