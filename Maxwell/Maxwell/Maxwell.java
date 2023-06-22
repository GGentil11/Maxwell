
public class Maxwell {
    private static Maxwell instance;
    private int poder = 0;
    private int moedas = 3;
    private String cidadeAnterior;
    private int limitePoder = 7;
    private boolean isDead;
    private boolean missao_1;
    private boolean missao_2;
    private boolean missao_3;
    private Cidade cidadeAtual;
    private Cidade proximaCidade;
    private int proximaCidadePoder;

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

    // Transforma Maxwell em uma instância única para todo o código
    public static Maxwell getInstance() {
        if (instance == null) {

            instance = new Maxwell();
        }
        return instance;
    }

    public Cidade getCidadeAtual() {
        return cidadeAtual;
    }

    public void setCidadeAtual(Cidade cidadeAtual) {
        this.cidadeAtual = cidadeAtual;
    }

    public boolean isDead() {
        if (getInstance().getMoedas() <= 0) {
            System.out.println("Morreu por pela  moeda");
            return true;

        } else if (getInstance().getPoder() > getInstance().getLimitePoder()) {

            System.out.println("Morreu pelo poder");
            return true;
        }
        return false;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
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

    // função para verificar os atribustos de maxwell
    public void informacao() {
        System.out.println("Quantidade moedas :" + getMoedas());
        System.out.println("Quantidade Limite poder : " + getLimitePoder());
        System.out.println("Quantidade  poder :" + getPoder());
        System.out.println("Cidade anterior: " + getCidadeAnterior());
        System.out.println("Cidade Atual: " + getCidadeAtual());
    }
}