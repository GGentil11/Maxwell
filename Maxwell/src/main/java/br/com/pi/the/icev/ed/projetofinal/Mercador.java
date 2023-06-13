package br.com.pi.the.icev.ed.projetofinal;

public class Mercador extends Maxwell{

    public int verificarMoedas() {
        return getMoedas();
    }
    public String verificarCidadeAnterior(){
        return getCidadeAnterior();
    }
    public int trocarMoedasPorPoder() {
        int moedasTotais = getMoedas();
        int poderAtualizado = getPoder() + moedasTotais;
        int limitePoder = getLimitePoder();

        // Verificar se o poder atualizado ultrapassa o limite de poder
        if (poderAtualizado > limitePoder) {
            poderAtualizado = limitePoder;
        }

       int moedasatuais =  getMoedas() - poderAtualizado;
       setMoedas(moedasatuais);

        // Atualizar o poder
        setPoder(poderAtualizado);

        return poderAtualizado;
    }

    @Override
    public String toString() {
        return "Olá viajante!Seu poder atual é de: " + trocarMoedasPorPoder() + "Suas Moedas são de : " + verificarMoedas() + ", Você veio da Cidade: " + verificarCidadeAnterior();
    }

}
