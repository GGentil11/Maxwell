
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Grafo {
    private ArrayList<Cidade> vertices;
    private ArrayList<Aresta> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Cidade>();
        this.arestas = new ArrayList<Aresta>();
    }

    public void adicionarVertice(Cidade dado) {
        Cidade novoVertice = new Cidade(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(int peso, Cidade dadoInicio, Cidade dadoFim) {
        Cidade inicio = dadoInicio;
        Cidade fim = dadoFim;
        Aresta aresta = new Aresta(peso, inicio, fim);
        inicio.adicionarArestaEntrada(aresta);
        fim.adicionarArestaSaida(aresta);
        this.arestas.add(aresta);
    }
    // Realiza a busca em largura do grafo para determinar as cidades fronteiriças
    public Cidade buscaLargura(Cidade cidade) {
        Cidade percorre = cidade;
        ArrayList<Aresta> troca = new ArrayList<Aresta>();
        int num =0;
        int k = 1;
        Maxwell.getInstance().setCidadeAtual(percorre);
        System.out.println("Cidade Atual: " + percorre.getNomeCidade() + "\n");
        // Demonstra as cidades que fazem fronteira com a atual e permite a sua escolha
        for (Aresta j : percorre.getArestasEntrada()) {
            System.out.println(k + ". " + j.getFim().getNomeCidade() + " - " + j.getPeso() + " de poder");
            troca.add(j);
            k++;
        }
        Scanner resposta = new Scanner(System.in);
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite o número correspondente ao seu destino: ");
                num = resposta.nextInt();
                if (num > 0 && num <= k-1) {
                    entradaValida = true;
                } else {
                    System.out.println("Número fora do intervalo válido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida.");
                resposta.nextLine();
            }
        } while (!entradaValida);
        percorre = troca.get(num - 1).getFim();

        /* Atruibuindo a próxima cidade(com o poder), a cidade anterior 
        e o poder aos atributos do Maxwell */
        Maxwell.getInstance().setProximaCidade(percorre);
        Maxwell.getInstance().setCidadeAnterior(cidade.getNomeCidade());
        Maxwell.getInstance().setProximaCidadePoder(troca.get(num - 1).getPeso());
        int poderAtualizado = Maxwell.getInstance().getPoder() + troca.get(num - 1).getPeso();
        if (poderAtualizado < 0){
            Maxwell.getInstance().setPoder(0);
        }
        else{
            Maxwell.getInstance().setPoder(poderAtualizado);
        }
        return percorre;
    }
}