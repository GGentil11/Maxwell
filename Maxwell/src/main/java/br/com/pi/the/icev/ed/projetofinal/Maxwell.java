package br.com.pi.the.icev.ed.projetofinal;

public class Maxwell {
    private int poder;
    private int moedas;
    private String cidadeAnterior;
    private int limiar;
    private  int limitePoder;

    public int getLimiar() {
        return limiar;
    }

    public void setLimiar(int limiar) {
        this.limiar = limiar;
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
    public  String getCidadeAnterior() {
        return cidadeAnterior;
    }
    public void setCidadeAnterior(String cidadeAnterior) {
        this.cidadeAnterior = cidadeAnterior;
    } 
}
