package Maxwell;

import java.util.Scanner;

public class Missoes{;
    public static void verificarMissao(Cidade cidade){
        if(cidade.isMissao()){
            System.out.println("A cidade " + cidade.getNomeCidade() + "possui uma missão.");
            if (cidade.isMissaoAceita()) {
                System.out.println("Você já aceitou essa missão anteriormente.");
                return;
            }
            else if (cidade.getNomeCidade().equals("Kingdom of Kalb")){
                System.out.println("Missão: Vá até a cidade de Grand Duchy of Smalia e receba as Luvas do Poder.");
                System.out.println("Prêmio:\n ->2 Moedas de transporte\n ->O limiar de poder da joia aumenta em 2 pontos");
                System.out.println("Prêmio por aceitar a missão:\n ->4 Moedas de transporte");

                System.out.println("Deseja aceitar? (S/N)");
                Scanner input = new Scanner(System.in);
                String resposta = input.nextLine().toUpperCase();

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

                input.close();
            }  
            else if (cidade.getNomeCidade().equals("Defalsia")){
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

                input.close();
            }  
            else if (cidade.getNomeCidade().equals("Vulnese Empire")){
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

                input.close();
            }  
        }   
    }
    public static void completarMissao(Cidade cidade){
        if (cidade.getNomeCidade().equals("Grand Duchy of Smalia") && (Maxwell.getInstance().isMissao_1())){
            System.out.println("Parabéns por Completar a missão");
            System.out.println("Prêmio:\n ->2 Moedas de transporte\n ->O limiar de poder da joia aumenta em 2 pontos");

            Maxwell.getInstance().setMissao_1(false);
            //Definir as recompensas
            int moedasTotais = Maxwell.getInstance().getMoedas() + 2;
            Maxwell.getInstance().setMoedas(moedasTotais);
            int novoLimite = Maxwell.getInstance().getLimitePoder() + 2;
            Maxwell.getInstance().setLimitePoder(novoLimite);    
        }

        else if (cidade.getNomeCidade().equals("Principality of Kasya") && (Maxwell.getInstance().isMissao_2())){
            System.out.println("Parabéns por Completar a missão");
            System.out.println("Prêmio:\n ->3 Moedas de transporte\n ->O limiar de poder da joia aumenta em 1 pontos");

            Maxwell.getInstance().setMissao_2(false);
            //Definir as recompensas
            int moedasTotais = Maxwell.getInstance().getMoedas() + 3;
            Maxwell.getInstance().setMoedas(moedasTotais);
            int novoLimite = Maxwell.getInstance().getLimitePoder() + 1;
            Maxwell.getInstance().setLimitePoder(novoLimite);       
        }

        else if (cidade.getNomeCidade().equals("Ubud") && (Maxwell.getInstance().isMissao_3())){
            System.out.println("Parabéns por Completar a missão");
            System.out.println("Prêmio:\n ->10 Moedas de transporte\n ->O limiar de poder da joia cai em 4 pontos");

            Maxwell.getInstance().setMissao_3(false);
            //Definir as recompensas
            int moedasTotais = Maxwell.getInstance().getMoedas() + 10;
            Maxwell.getInstance().setMoedas(moedasTotais);
            int novoLimite = Maxwell.getInstance().getLimitePoder() - 4;
            Maxwell.getInstance().setLimitePoder(novoLimite);       
        }
    }
}   

