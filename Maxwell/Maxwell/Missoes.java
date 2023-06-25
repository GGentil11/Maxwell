
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Missoes {
    ;
    public static void verificarMissao(Cidade cidade) {
        // Verificar se a cidade possui alguma missão
        if (cidade.isMissao()) {
            System.out.println("A cidade " + cidade.getNomeCidade() + " possui uma missão.");
            // Verificar se a missão ja foi aceita e mostrar a missão
            if (cidade.isMissaoAceita()) {
                System.out.println("Você já aceitou essa missão anteriormente.");
                return;
            } else if (cidade.getNomeCidade().equals("Kingdom of Kalb")) {
                System.out.println("Missão: Vá até a cidade de Grand Duchy of Smalia e receba as Luvas do Poder.");
                System.out.println("Prêmio:\n ->2 Moedas de transporte\n ->O limiar de poder da joia aumenta em 2 pontos");
                System.out.println("Prêmio por aceitar a missão:\n ->4 Moedas de transporte");

                System.out.println("Deseja aceitar? (S/N)");
                Scanner input = new Scanner(System.in);
                String resposta = input.nextLine().toUpperCase();
                System.out.println(resposta);
                while (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Somente S/N");
                    resposta = input.nextLine().toUpperCase();
                }
                if (resposta.equals("S")) {
                    System.out.println("Missão aceita!");
                    Maxwell.getInstance().setMissao_1(true);
                    cidade.setMissaoAceita(true);

                } else if (resposta.equals("N")) {
                    System.out.println("Missão recusada!");
                }
            } else if (cidade.getNomeCidade().equals("Defalsia")) {
                System.out.println("Missão: Vá até a cidade de Principality of Kasya e receba as Botas do Poder.");
                System.out.println("Prêmio:\n ->3 Moedas de transporte\n ->O limiar de poder da joia aumenta em 1 pontos");
                System.out.println("Prêmio por aceitar a missão:\n ->6 Moedas de transporte");

                System.out.println("Deseja aceitar? (S/N)");
                Scanner input = new Scanner(System.in);
                String resposta = input.nextLine().toUpperCase();
                while (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Somente S/N");
                    resposta = input.nextLine().toUpperCase();
                }
                if (resposta.equals("S")) {
                    System.out.println("Missão aceita!");
                    Maxwell.getInstance().setMissao_2(true);
                    cidade.setMissaoAceita(true);
                } else if (resposta.equals("N")) {
                    System.out.println("Missão recusada!");
                }
            } else if (cidade.getNomeCidade().equals("Vulnese Empire")) {
                System.out.println("Missão: Vá até a cidade de Ubud e receba a Glória dos Retornados.");
                System.out.println("Prêmio:\n ->10 Moedas de transporte\n ->O limiar de poder da joia cai em 4 pontos");
                System.out.println("Prêmio por aceitar a missão:\n ->1 Moedas de transporte");

                System.out.println("Deseja aceitar? (S/N)");
                Scanner input = new Scanner(System.in);
                String resposta = input.nextLine().toUpperCase();
                while (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Somente S/N");
                    resposta = input.nextLine().toUpperCase();
                }

                if (resposta.equals("S")) {
                    System.out.println("Missão aceita!");
                    Maxwell.getInstance().setMissao_3(true);
                    cidade.setMissaoAceita(true);
                } else if (resposta.equals("N")) {
                    System.out.println("Missão recusada!");
                }
            }
        }
    }

    public static void completarMissao(Cidade cidade) {
        // Verificar se chegou no objeetivo de alguma missão e se está ativa
        if (cidade.getNomeCidade().equals("Grand Duchy of Smalia") && (Maxwell.getInstance().isMissao_1())) {
            System.out.println("Parabéns por Completar a missão");
            System.out.println("Prêmio:\n ->2 Moedas de transporte\n ->O limiar de poder da joia aumenta em 2 pontos");

            Maxwell.getInstance().setMissao_1(false);
            // Definir as recompensas
            int moedasTotais = Maxwell.getInstance().getMoedas() + 2;
            Maxwell.getInstance().setMoedas(moedasTotais);
            int novoLimite = Maxwell.getInstance().getLimitePoder() + 2;
            Maxwell.getInstance().setLimitePoder(novoLimite);
        }
        else if (cidade.getNomeCidade().equals("Principality of Kasya") && (Maxwell.getInstance().isMissao_2())) {
            System.out.println("Parabéns por Completar a missão");
            System.out.println("Prêmio:\n ->3 Moedas de transporte\n ->O limiar de poder da joia aumenta em 1 pontos");

            Maxwell.getInstance().setMissao_2(false);
            // Definir as recompensas
            int moedasTotais = Maxwell.getInstance().getMoedas() + 3;
            Maxwell.getInstance().setMoedas(moedasTotais);
            int novoLimite = Maxwell.getInstance().getLimitePoder() + 1;
            Maxwell.getInstance().setLimitePoder(novoLimite);
        }
        else if (cidade.getNomeCidade().equals("Ubud") && (Maxwell.getInstance().isMissao_3())) {
            System.out.println("Parabéns por Completar a missão");
            System.out.println("Prêmio:\n ->10 Moedas de transporte\n ->O limiar de poder da joia cai em 4 pontos");

            Maxwell.getInstance().setMissao_3(false);
            // Definir as recompensas
            int moedasTotais = Maxwell.getInstance().getMoedas() + 10;
            Maxwell.getInstance().setMoedas(moedasTotais);
            int novoLimite = Maxwell.getInstance().getLimitePoder() - 4;
            Maxwell.getInstance().setLimitePoder(novoLimite);
        }
    }
    public static void mostrarMissoesAtivas() {
        List<String> missoesAtivas = new ArrayList<>();
        // Caso a missão esteja ativa, adicionar na ArrayList
        if (Maxwell.getInstance().isMissao_1()) {
            missoesAtivas.add("Vá até a cidade de Grand Duchy of Smalia");
        }

        if (Maxwell.getInstance().isMissao_2()) {
            missoesAtivas.add("Vá até a cidade de Principality of Kasya");
        }

        if (Maxwell.getInstance().isMissao_3()) {
            missoesAtivas.add("Vá até a cidade de Ubud");
        }
        // Verifica a Arraylist e imprime as missões ativas
        if (missoesAtivas.isEmpty()) {
            System.out.println("Nenhuma missão ativa no momento.");
        } else {
            System.out.println("Missões Ativas:");
            for (String missao : missoesAtivas) {
                System.out.println("- " + missao);
            }
        }
    }
}