package Maxwell;

import java.util.ArrayList;
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

    public void adicionarAresta(Double peso, Cidade dadoInicio, Cidade dadoFim) {
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
    public void buscaCorreta(Cidade cidade) {
        Cidade percorre = cidade;
        ArrayList<Cidade> troca = new ArrayList<Cidade>();
        int num = 0;

        while (true) {
            int k = 1;
            System.out.println("Cidade Atual:  " + percorre.getNomeCidade() + "\n");
            for (Aresta j : percorre.getArestasEntrada()) {
                System.out.println(k + ". " + j.getFim().getNomeCidade());
                troca.add(j.getFim());
                k++;
            }
            Scanner resposta = new Scanner(System.in);
            num = resposta.nextInt();
            percorre = troca.get(num - 1);
            troca.clear();
        }
    }
}