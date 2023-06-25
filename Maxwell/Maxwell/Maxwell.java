
public class Maxwell {
    private static Maxwell instancia;
    private boolean isDead;
    private boolean isGanhou;

    private int poder = 0;
    private int moedas = 3;
    private int limitePoder = 7;
    private String cidadeAnterior;  
    private boolean missao_1;
    private boolean missao_2;
    private boolean missao_3;
    private boolean emMissao;
    private Cidade cidadeAtual;
    private Cidade proximaCidade;
    private int proximaCidadePoder;

    // Transforma Maxwell em uma instância única para todo o código
    public static Maxwell getInstance() {
        if (instancia == null) {
            instancia = new Maxwell();
        }
        return instancia;
    }
    // Verifica se Maxwell chegou ao seu destino e determina a recompensa
    public boolean isGanhou() {
        if (proximaCidade.getNomeCidade().equals("Nargumun")){
            if (getMoedas() > 10){
                System.out.println("Parabéns por carregar a jóia até seu destino!");
                System.out.println("Você foi nomeado Rei de Nargumun!");
            } else if (getMoedas() >= 6){
                System.out.println("Parabéns por carregar a jóia até seu destino!");
                System.out.println("Você foi nomeado Lorde de Nargumun!");
            }
            else{
                System.out.println("Parabéns por carregar a jóia até seu destino!");
                System.out.println("Você foi nomeado Servo da Coroa de Nargumun!");
            }
            return true;
        }
        return false;
    }

    public void setGanhou(boolean isGanhou) {
        this.isGanhou = isGanhou;
    }
    // Verifica se Maxwell morreu conforme as regras do jogo
    public boolean isDead() {
        if (getInstance().getMoedas() <= 0) {
            System.out.println("Você ficou sem moedas. Tente novamente");
            return true;

        } else if (getInstance().getPoder() > getInstance().getLimitePoder()) {

            System.out.println("Seu poder excedeu o limite da joia e Maxwell não aguentou. Tente novamente");
            return true;
        }
        return false;
    }

    //Getters e Setters dos atributos restantes
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public int getProximaCidadePoder() {
        return proximaCidadePoder;
    }

    public void setProximaCidadePoder(int proximaCidadePoder) {
        this.proximaCidadePoder = proximaCidadePoder;
    }

    public Cidade getProximaCidade() {
        return proximaCidade;
    }

    public void setProximaCidade(Cidade proximaCidade) {
        this.proximaCidade = proximaCidade;
    }

    public Cidade getCidadeAtual() {
        return cidadeAtual;
    }

    public void setCidadeAtual(Cidade cidadeAtual) {
        this.cidadeAtual = cidadeAtual;
    }

    public int getLimitePoder() {
        return limitePoder;
    }

    public void setLimitePoder(int limitePoder) {
        this.limitePoder = limitePoder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poderAtualizado) {
        this.poder = poderAtualizado;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedasatuais) {
        this.moedas = moedasatuais;
    }

    public String getCidadeAnterior() {
        return cidadeAnterior;
    }

    public void setCidadeAnterior(String cidadeAnterior) {
        this.cidadeAnterior = cidadeAnterior;
    }

    public boolean isMissao_1() {
        return missao_1;
    }

    public void setMissao_1(boolean missao_1) {
        this.missao_1 = missao_1;
    }

    public boolean isMissao_2() {
        return missao_2;
    }

    public void setMissao_2(boolean missao_2) {
        this.missao_2 = missao_2;
    }

    public boolean isMissao_3() {
        return missao_3;
    }

    public void setMissao_3(boolean missao_3) {
        this.missao_3 = missao_3;
    }

    public boolean isEmMissao() {
        return emMissao;
    }
    public void setEmMissao(boolean emMissao) {
        this.emMissao = emMissao;
    }
    
}