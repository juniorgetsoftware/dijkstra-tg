package grafo.app.util;

import java.util.ArrayList;

import grafo.app.Aresta;
import grafo.app.Grafo;
import grafo.app.Vertice;

public class GrafosUtil {

	public static int grausDoVertice(Grafo grafo, Vertice v1) {
		int graus = 0;
		for (int i = 0; i < grafo.getArestas().size(); i++) {
			if (v1 == grafo.getArestas().get(i).getOrigem() || v1 == grafo.getArestas().get(i).getDestino()) {
				graus++;
			}
		}
		return graus;
	}

	public static int numeroDeArestas(Grafo grafo) {
		return grafo.getArestas().size() / 2;
	}

	public static int numeroDeVertices(Grafo grafo) {
		return grafo.getVertices().size();
	}

	public static Aresta arestaPorVertices(Grafo grafo, Vertice v1, Vertice v2) {
		for (int i = 0; i < grafo.getArestas().size(); i++) {
			if (grafo.getArestas().get(i).getOrigem() == v1 && grafo.getArestas().get(i).getDestino() == v2) {
				return grafo.getArestas().get(i);
			}
		}
		return null;
	}

	public static ArrayList<Aresta> arestasPorVertices(Grafo grafo, ArrayList<Vertice> vertices) {
		ArrayList<Aresta> arestas = new ArrayList<>();
		for (int i = 1; i < vertices.size(); i++) {
			arestas.add(arestaPorVertices(grafo, vertices.get(i - 1), vertices.get(i)));
		}
		return arestas;
	}

	public static int distanciaEntreVertices(Grafo grafo, Vertice v1, Vertice v2) {
		return arestaPorVertices(grafo, v1, v2).getPeso();
	}

	public static String matrizAdjacencia(Grafo grafo) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < grafo.getVertices().size(); i++) {
			for (int j = 0; j < grafo.getVertices().size(); j++) {
				Aresta a = arestaPorVertices(grafo, grafo.getVertices().get(i), grafo.getVertices().get(j));
				if (a != null) {
					sb.append("1");
					sb.append(" | ");
				} else {
					sb.append("0");
					sb.append(" | ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String matrizIncidencia(Grafo grafo) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < grafo.getVertices().size(); i++) {
			for (int j = 0; j < grafo.getArestas().size(); j++) {
				if (grafo.getVertices().get(i) == grafo.getArestas().get(j).getOrigem()) {
					sb.append("-1");
					sb.append(" | ");
				} else if (grafo.getVertices().get(i) == grafo.getArestas().get(j).getDestino()) {
					sb.append("+1");
					sb.append(" | ");
				} else {
					sb.append(" 0");
					sb.append(" | ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
