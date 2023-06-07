public class Cidade {
    String nomeCidade;
    boolean isMissao;

    public Cidade (String nomeCidade, boolean isMissao){
        this.nomeCidade = nomeCidade;
        this.isMissao = isMissao;
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
}
