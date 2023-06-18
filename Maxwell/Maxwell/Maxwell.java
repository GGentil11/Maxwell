package Maxwell;

public class Maxwell {
    private static Maxwell instance;
    private int poder;
    private int moedas;
    private String cidadeAnterior;
    private int limitePoder;
    private boolean missao_1;
    private boolean missao_2;
    private boolean missao_3;

    private Maxwell() {
    }

    public static Maxwell getInstance() {
        if (instance == null) {
            instance = new Maxwell();
        }
        return instance;
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

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
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
} 