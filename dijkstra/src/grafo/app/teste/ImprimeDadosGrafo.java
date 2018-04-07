package grafo.app.teste;

import static grafo.app.Orientacao.ORIENTADO;

import java.util.ArrayList;

import grafo.app.Grafo;
import grafo.app.Vertice;
import grafo.app.algoritmo.Dijkstra;
import grafo.app.builder.DijkstraBuilder;

public class ImprimeDadosGrafo {
	
	public static void main(String[] args) {

		Grafo grafo = new Grafo("G", ORIENTADO);

		Vertice v1 = grafo.addVertice("V1");
		Vertice v2 = grafo.addVertice("V2");
		Vertice v3 = grafo.addVertice("V3");
		Vertice v4 = grafo.addVertice("V4");
		Vertice v5 = grafo.addVertice("V5");
		Vertice v6 = grafo.addVertice("V6");

		grafo.addAresta(v1, v2, 2);
		grafo.addAresta(v1, v3, 1);

		grafo.addAresta(v2, v4, 3);
		grafo.addAresta(v2, v5, 4);

		grafo.addAresta(v3, v4, 2);
		grafo.addAresta(v3, v5, 6);

		grafo.addAresta(v4, v6, 7);

		grafo.addAresta(v5, v6, 8);

		Dijkstra d = new DijkstraBuilder().encontrarMenorCaminhoDoGrafo(grafo).de(v1).ate(v6).executar();

		System.out.println();
		ArrayList<Vertice> caminho = new ArrayList<>(d.menorCaminho());
		for (Vertice vertice : caminho) {
			System.out.print(vertice.getNome() + " -> ");
		}
		
		System.out.println("\n");
		
		for (Vertice vertice : grafo.getVertices()) {
			System.out.print(vertice.getNome()+" ");
		}
	}

}
