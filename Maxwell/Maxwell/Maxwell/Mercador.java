import java.util.Scanner;

public class Mercador {

    public Mercador() {

    }

    public int verificarMoedas() {
        return Maxwell.getInstance().getMoedas();
    }

    public String verificarCidadeAnterior() {
        return Maxwell.getInstance().getCidadeAnterior();
    }

    public void trocarMoedasPorPoder(String resposta) {
        if (Maxwell.getInstance().getMoedas() < 5){
            if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("S")){
                System.out.println("Você perdeu uma moeda e ganhou um de limiar na jóia");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 1);
            }
            else if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("N")){
                System.out.println("Você perdeu uma moeda");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
            }
            else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("S")){
                System.out.println("Você perdeu uma moeda e ganhou dois de limiar na jóia");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 2);
            }
            else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("N")){
                System.out.println("Você ganhou duas moedas");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() + 2);
            }
        } else if (Maxwell.getInstance().getMoedas() >= 5){
            if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("S")){
                System.out.println("Você perdeu três moedas e ganhou dois de limiar na jóia");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 3);
                Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 2);
            }
            else if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("N")){
                System.out.println("Você peerdeu duas moedas");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 2);
            }
            else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("S")){
                System.out.println("Você perdeu uma moeda e ganhou três de limiar na jóia");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 3);
            }
            else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("N")){
                System.out.println("Você perdeu três moedas");
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 3);
            }
        }
    }

    public String informacoesMercador(){
        return "----------------------------------------------------------"
                + "\nOlá viajante!"
                + "\nVocê veio da Cidade: " + verificarCidadeAnterior()
                + "\nPara onde você deseja ir?";
    }
    public void trocaMercador(){
        System.out.println("Então você irá a " + Maxwell.getInstance().getProximaCidade().getNomeCidade());
        System.out.println("E você possui " + verificarMoedas() +" moedas");
        System.out.println("E você possui " + Maxwell.getInstance().getPoder() +" de poder");
        System.out.println("Gostaria de fazer uma troca? (S/N)");

        Scanner input = new Scanner(System.in);
        String resposta = input.nextLine().toUpperCase();
        while (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Somente S/N");
                    resposta = input.nextLine().toUpperCase();
                }
                if (resposta.equals("S")) {
                    System.out.println("Troca aceita!");
                    trocarMoedasPorPoder(resposta);
                } else if (resposta.equals("N")) {
                    System.out.println("Troca recusada!");
                    trocarMoedasPorPoder(resposta);
                }
        System.out.println("----------------------------------------------------------");
    }
    /* 
    @Override
    public String toString() {
        return "----------------------------------------------------------"
                + "\nOlá viajante!"
                + "\nVocê veio da Cidade: " + verificarCidadeAnterior()
                + "\nSeu Limite de Poder é de: " + Maxwell.getInstance().getLimitePoder()
                + "\nVocê possui " + trocarMoedasPorPoder() + " de poder" 
                + "\nVocê possui " + verificarMoedas() +" moedas"
                + "\nPara onde você deseja ir?"
                + "\n----------------------------------------------------------";
    }
    */
}
