
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

    public void buscaLargura() {
        ArrayList<Cidade> marcados = new ArrayList<>();
        ArrayList<Cidade> fila = new ArrayList<>();
        Cidade primeiro = this.vertices.get(0);
        marcados.add(primeiro);
        System.out.println(primeiro.getNomeCidade());
        fila.add(primeiro);

        while (fila.size() > 0) {
            Cidade visitada = fila.get(0);
            for (int i = 0; i < visitada.getArestasSaida().size(); i++) {
                Cidade proximo = visitada.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    System.out.println(primeiro.getNomeCidade());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
    //fução que faz a troca de cidade e atribui poder, cidade anterio e ciadade atual
    // provissorio logo iremos dividir essa funcionalidades

    public Cidade buscaCorreta(Cidade cidade) {
        Cidade percorre = cidade;
        ArrayList<Aresta> troca = new ArrayList<Aresta>();
        int num =0;
        int k = 1;
        System.out.println("Cidade Atual:  " + percorre.getNomeCidade() + "\n");
        // buscando nas lista de arresta de fim as referecias para a cidades que fazem fronteiras com a
        // cidade passada no metodo
        for (Aresta j : percorre.getArestasEntrada()) {
            System.out.println(k + ". " + j.getFim().getNomeCidade() + " - " + j.getPeso() + " de poder");
            troca.add(j);
            k++;
        }
        Scanner resposta = new Scanner(System.in);
        try {
            num = resposta.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
        }  
        // ecolhnedo uma cidade das enumeradas na tela
        percorre = troca.get(num - 1).getFim();
        Maxwell.getInstance().setProximaCidade(percorre);
        // atribuidao a cidade anterio aos atributos de maxwell
        Maxwell.getInstance().setCidadeAnterior(cidade.getNomeCidade());
        // atruibuindo o poder da cidade aos atributos de maxwell
        Maxwell.getInstance().setProximaCidadePoder(troca.get(num - 1).getPeso());
        Maxwell.getInstance().setPoder(Maxwell.getInstance().getPoder() + troca.get(num - 1).getPeso());
        return percorre;

    }

}