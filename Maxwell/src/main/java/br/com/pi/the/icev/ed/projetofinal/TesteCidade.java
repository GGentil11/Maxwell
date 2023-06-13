package br.com.pi.the.icev.ed.projetofinal;

public class TesteCidade {
    private Grafo grafo = new Grafo();
    private void inicializarCidades() {
        Cidade ubud = new Cidade("Ubud", false);
        Cidade kingdomOfLegmod = new Cidade("Kingdom of Legmod", false);
        Cidade principalityOfNekikh = new Cidade("Principality of Nekikh", false);
        Cidade principalityOfGritesthr = new Cidade("Principality of Gritesthr", false);
        Cidade protectorateOfDogrove = new Cidade("Protectorate of Dogrove", false);
        Cidade kingdomOfLastwatch = new Cidade("Kingdom of Lastwatch", false);
        Cidade grandDuchyOfSmalia = new Cidade("Grand Duchy of Smalia", false);
        Cidade kingdomOfOldcalia = new Cidade("Kingdom of Oldcalia", false);
        Cidade defalsia = new Cidade("Defalsia", true);
        Cidade kingdomOfKalb = new Cidade("Kingdom of Kalb", true);
        Cidade principalityOfKarhora = new Cidade("Principality of Karhora", false);
        Cidade aymarLeague = new Cidade("Aymar League", false);
        Cidade nargumun = new Cidade("Nargumun", false);
        Cidade vulneseEmpire = new Cidade("Vulnese Empire", true);
        Cidade bun = new Cidade("Bun", false);
        Cidade chandirSultinate = new Cidade("Chandir Sultinate", false);
        Cidade principalityOfKasya = new Cidade("Principality of Kasya", false);

        grafo.adicionarVertice(ubud);
        grafo.adicionarVertice(kingdomOfLegmod);
        grafo.adicionarVertice(principalityOfNekikh);
        grafo.adicionarVertice(principalityOfGritesthr);
        grafo.adicionarVertice(protectorateOfDogrove);
        grafo.adicionarVertice(kingdomOfLastwatch);
        grafo.adicionarVertice(grandDuchyOfSmalia);
        grafo.adicionarVertice(kingdomOfOldcalia);
        grafo.adicionarVertice(defalsia);
        grafo.adicionarVertice(kingdomOfKalb);
        grafo.adicionarVertice(principalityOfKarhora);
        grafo.adicionarVertice(aymarLeague);
        grafo.adicionarVertice(nargumun);
        grafo.adicionarVertice(vulneseEmpire);
        grafo.adicionarVertice(bun);
        grafo.adicionarVertice(chandirSultinate);
        grafo.adicionarVertice(principalityOfKasya);

        //Saída das cidades
        //Ubud
        grafo.adicionarAresta(2.0, ubud, kingdomOfLegmod);
        grafo.adicionarAresta(1.0, ubud, principalityOfNekikh);
        //Principality of Nekikh
        grafo.adicionarAresta(0.0, principalityOfNekikh, ubud);
        grafo.adicionarAresta(2.0, principalityOfNekikh, kingdomOfLegmod);
        grafo.adicionarAresta(5.0, principalityOfNekikh, principalityOfGritesthr);
        //Kingdom of Legmod
        grafo.adicionarAresta(0.0, kingdomOfLegmod, ubud);
        grafo.adicionarAresta(1.0, kingdomOfLegmod, principalityOfNekikh);
        grafo.adicionarAresta(5.0, kingdomOfLegmod, principalityOfGritesthr);
        grafo.adicionarAresta(3.0, kingdomOfLegmod, protectorateOfDogrove);
        grafo.adicionarAresta(4.0, kingdomOfLegmod, kingdomOfOldcalia);
        //Principality of Gritesthr
        grafo.adicionarAresta(1.0, principalityOfGritesthr, principalityOfNekikh);
        grafo.adicionarAresta(2.0, principalityOfGritesthr, kingdomOfLegmod);
        grafo.adicionarAresta(2.0, principalityOfGritesthr, protectorateOfDogrove);
        grafo.adicionarAresta(-2.0, principalityOfGritesthr, kingdomOfLastwatch);
        //Protectorate of Drogove
        grafo.adicionarAresta(5.0, protectorateOfDogrove, principalityOfGritesthr);
        grafo.adicionarAresta(2.0, protectorateOfDogrove, kingdomOfLegmod);
        grafo.adicionarAresta(4.0, protectorateOfDogrove, kingdomOfOldcalia);
        grafo.adicionarAresta(-2.0, protectorateOfDogrove, kingdomOfLastwatch);
        //Kingdom of Lastwatch
        grafo.adicionarAresta(5.0, kingdomOfLastwatch, principalityOfGritesthr);
        grafo.adicionarAresta(3.0, kingdomOfLastwatch, protectorateOfDogrove);
        grafo.adicionarAresta(4.0, kingdomOfLastwatch, kingdomOfOldcalia);
        grafo.adicionarAresta(1.0, kingdomOfLastwatch, grandDuchyOfSmalia);
        //Grand Duchy of Smalia
        grafo.adicionarAresta(2.0, grandDuchyOfSmalia, kingdomOfLastwatch);
        grafo.adicionarAresta(4.0, grandDuchyOfSmalia, kingdomOfOldcalia);
        //Kingdom of Oldcalia
        grafo.adicionarAresta(1.0, kingdomOfOldcalia, grandDuchyOfSmalia);
        grafo.adicionarAresta(-2.0, kingdomOfOldcalia, kingdomOfLastwatch);
        grafo.adicionarAresta(3.0, kingdomOfOldcalia, protectorateOfDogrove);
        grafo.adicionarAresta(2.0, kingdomOfOldcalia, kingdomOfLegmod);
        grafo.adicionarAresta(2.0, kingdomOfOldcalia, kingdomOfKalb);
        grafo.adicionarAresta(1.0, kingdomOfOldcalia, aymarLeague);
        grafo.adicionarAresta(-3.0, kingdomOfOldcalia, defalsia);
        //Defalsia
        grafo.adicionarAresta(4.0, defalsia, kingdomOfOldcalia);
        grafo.adicionarAresta(1.0, defalsia, aymarLeague);
        //Kingdom of Kalb
        grafo.adicionarAresta(4.0, kingdomOfKalb, kingdomOfOldcalia);
        grafo.adicionarAresta(0.0, kingdomOfKalb, vulneseEmpire);
        grafo.adicionarAresta(1.0, kingdomOfKalb, aymarLeague);
        //Aymar League
        grafo.adicionarAresta(-3.0, aymarLeague, defalsia);
        grafo.adicionarAresta(4.0, aymarLeague, kingdomOfOldcalia);
        grafo.adicionarAresta(2.0, aymarLeague, kingdomOfKalb);
        grafo.adicionarAresta(0.0, aymarLeague, vulneseEmpire);
        grafo.adicionarAresta(1.0, aymarLeague, chandirSultinate);
        grafo.adicionarAresta(5.0, aymarLeague, bun);
        grafo.adicionarAresta(0.0, aymarLeague, nargumun);
        grafo.adicionarAresta(-2.0, aymarLeague, principalityOfKarhora);
        //Pirncipality of Karhora
        grafo.adicionarAresta(1.0, principalityOfKarhora, aymarLeague);
        grafo.adicionarAresta(0.0, principalityOfKarhora, nargumun);
        //Nargumun
        grafo.adicionarAresta(-2.0, nargumun, principalityOfKarhora);
        grafo.adicionarAresta(1.0, nargumun, aymarLeague);
        grafo.adicionarAresta(5.0, nargumun, bun);
        //Bun
        grafo.adicionarAresta(0.0, bun, nargumun);
        grafo.adicionarAresta(1.0, bun, aymarLeague);
        grafo.adicionarAresta(1.0, bun, chandirSultinate);
        //Chandir Sultinate
        grafo.adicionarAresta(5.0, chandirSultinate, bun);
        grafo.adicionarAresta(1.0, chandirSultinate, aymarLeague);
        grafo.adicionarAresta(0.0, chandirSultinate, vulneseEmpire);
        grafo.adicionarAresta(-7.0, chandirSultinate, principalityOfKasya);
        //Vulnese Empire
        grafo.adicionarAresta(1.0, vulneseEmpire, chandirSultinate);
        grafo.adicionarAresta(1.0, vulneseEmpire, aymarLeague);
        grafo.adicionarAresta(0.0, vulneseEmpire, kingdomOfKalb);
        //Principality of Kasya
        grafo.adicionarAresta(1.0, principalityOfKasya, chandirSultinate);
    }
}
