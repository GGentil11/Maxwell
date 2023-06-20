package Maxwell;

import java.util.ArrayList;

public class Cidade {
    String nomeCidade;
    boolean isMissao;
    private ArrayList<Aresta> arestasEntrada;
    private ArrayList<Aresta> arestasSaida;
    private boolean missaoAceita;

    public Cidade(String nomeCidade, boolean isMissao) {
        this.nomeCidade = nomeCidade;
        this.isMissao = isMissao;
        this.arestasEntrada = new ArrayList<Aresta>();
        this.arestasSaida = new ArrayList<Aresta>();
        this.missaoAceita = false;
    }

    public Cidade(Cidade cidade_adici) {
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public boolean isMissao() {
        return isMissao;
    }

    public void setMissao(boolean isMissao) {
        this.isMissao = isMissao;
    }

    public void adicionarArestaEntrada(Aresta aresta){
        this.arestasEntrada.add(aresta);
    }
    public ArrayList<Aresta> getArestasEntrada() {
        return arestasEntrada;
    }
     public void adicionarArestaSaida(Aresta aresta){
        this.arestasSaida.add(aresta);
    }

    public ArrayList<Aresta> getArestasSaida() {
        return arestasSaida;
    }
    public boolean isMissaoAceita() {
        return missaoAceita;
    }

    public void setMissaoAceita(boolean missaoAceita) {
        this.missaoAceita = missaoAceita;
    }
}
