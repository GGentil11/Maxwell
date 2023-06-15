package br.com.pi.the.icev.ed.projetofinal;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public void busca_largura() {
        ArrayList<Cidade> marcados = new ArrayList<>();
        ArrayList<Cidade> fila = new ArrayList<>();
        Cidade primeiro = this.vertices.get(0);
        marcados.add(primeiro);
        System.out.println(primeiro.getNomeCidade());
        fila.add(primeiro);

        while (fila.size() > 0) {
            Cidade vistado = fila.get(0);
            for (int i = 0; i < vistado.getArestasSaida().size(); i++) {
                Cidade proximo = vistado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    System.out.println(primeiro.getNomeCidade());
                    fila.add(proximo);
                }
            }
            fila.remove(0);

        }

    }

    public void busca_corrreta(Cidade c) {
        Cidade pecorre = c;
        ArrayList<Cidade> troca = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int num = 0;

        while (true) {
            int k = 1;
            System.out.println("Cidade Atual:  " + pecorre.getNomeCidade() + "\n");
            for (Aresta j : pecorre.getArestasEntrada()) {
                System.out.println(k + ". " + j.getFim().getNomeCidade());
                troca.add(j.getFim());
                k++;
            }
            num = entrada.nextInt();
            pecorre = troca.get(num - 1);
            troca.clear();

        }

    }

}
