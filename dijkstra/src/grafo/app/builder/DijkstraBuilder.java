package grafo.app.builder;

import grafo.app.Grafo;
import grafo.app.Vertice;
import grafo.app.algoritmo.Dijkstra;

public class DijkstraBuilder {

	private Dijkstra dijkstra;

	public DijkstraBuilder() {
		dijkstra = new Dijkstra();
	}

	public DijkstraBuilder encontrarMenorCaminhoDoGrafo(Grafo grafo) {
		dijkstra.setGrafo(grafo);
		return this;
	}

	public DijkstraBuilder de(Vertice origem) {
		dijkstra.setOrigem(origem);
		return this;
	}

	public DijkstraBuilder ate(Vertice destino) {
		dijkstra.setDestino(destino);
		return this;
	}

	public Dijkstra executar() {
		return dijkstra;
	}

}
