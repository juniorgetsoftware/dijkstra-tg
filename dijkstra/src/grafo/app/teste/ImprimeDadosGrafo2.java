package grafo.app.teste;

import static grafo.app.Orientacao.ORIENTADO;

import java.util.ArrayList;

import grafo.app.Grafo;
import grafo.app.Vertice;
import grafo.app.algoritmo.Dijkstra;
import grafo.app.builder.DijkstraBuilder;
import grafo.app.util.GrafosUtil;

public class ImprimeDadosGrafo2 {
	public static void main(String[] args) {

		Grafo grafo = new Grafo("G", ORIENTADO);

		Vertice v1 = grafo.addVertice("V1");
		Vertice v2 = grafo.addVertice("V2");
		Vertice v3 = grafo.addVertice("V3");
		Vertice v4 = grafo.addVertice("V4");
		Vertice v5 = grafo.addVertice("V5");
		Vertice v6 = grafo.addVertice("V6");
		Vertice v7 = grafo.addVertice("V7");

		grafo.addAresta(v1, v2, 2);
		grafo.addAresta(v1, v3, 3);
		grafo.addAresta(v1, v4, 5);

		grafo.addAresta(v2, v3, 4);
		grafo.addAresta(v2, v5, 1);

		grafo.addAresta(v3, v5, 3);
		grafo.addAresta(v3, v6, 4);

		grafo.addAresta(v4, v6, 2);
		grafo.addAresta(v4, v7, 3);

		grafo.addAresta(v5, v6, 4);
		grafo.addAresta(v5, v7, 7);

		grafo.addAresta(v6, v7, 3);

		Dijkstra d = new DijkstraBuilder().encontrarMenorCaminhoDoGrafo(grafo).de(v1).ate(v7).executar();
		ArrayList<Vertice> caminho = new ArrayList<>(d.menorCaminho());
		caminho.forEach(v -> System.out.print("-> " + v.getNome()));

		System.out.println("\n\n");

		System.out.println(GrafosUtil.matrizIncidencia(grafo));
		System.out.println("\n\n");
		System.out.println(GrafosUtil.matrizAdjacencia(grafo));

	}

}
