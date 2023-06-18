package Maxwell;
public class Mercador{
    public int verificarMoedas() {
        return Maxwell.getInstance().getMoedas();
    }
    public String verificarCidadeAnterior(){
        return Maxwell.getInstance().getCidadeAnterior();
    }
    public int trocarMoedasPorPoder() {
        int moedasTotais = Maxwell.getInstance().getMoedas();
        int poderAtualizado = Maxwell.getInstance().getPoder() + moedasTotais;
        int limitePoder = Maxwell.getInstance().getLimitePoder();

        // Verificar se o poder atualizado ultrapassa o limite de poder
        if (poderAtualizado > limitePoder) {
            poderAtualizado = limitePoder;
        }

        int moedasatuais =  Maxwell.getInstance().getMoedas() - poderAtualizado;
        Maxwell.getInstance().setMoedas(moedasatuais);

        // Atualizar o poder
        Maxwell.getInstance().setPoder(poderAtualizado);

        return poderAtualizado;
    }

    @Override
    public String toString() {
        return "Olá viajante!Seu poder atual é de: " + trocarMoedasPorPoder() + "Suas Moedas são de : " + verificarMoedas() + ", Você veio da Cidade: " + verificarCidadeAnterior();
    }

}