package Maxwell;

public class Aresta {
    private Double peso;
    private Cidade inicio;
    private Cidade fim;
    
    public Aresta(Double peso, Cidade inicio, Cidade fim){
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
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
