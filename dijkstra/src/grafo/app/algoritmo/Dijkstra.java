package grafo.app.algoritmo;

import static grafo.app.util.GrafosUtil.distanciaEntreVertices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import grafo.app.Grafo;
import grafo.app.Vertice;

public class Dijkstra {

	private ArrayList<Vertice> vertices;
	private Map<Vertice, Double> distancias = new HashMap<>();
	private Map<Vertice, Vertice> predecessores = new HashMap<>();
	private Grafo grafo;
	private Vertice origem;
	private Vertice destino;
	
	private void encontrarMenorCaminho() {
		for (Vertice vertice : grafo.getCloneVertices()) {
			distancias.put(vertice, Double.POSITIVE_INFINITY);
		}
		distancias.put(origem, 0d);
		while (!vertices.isEmpty()) {
			Vertice u = encontrarMenor(vertices);
			ArrayList<Vertice> adjacentesAU = u.vizinhos();
			vertices.remove(u);
			for (Vertice v : adjacentesAU) {
				double distanciaEntreVerticesUeV = distanciaEntreVertices(grafo, u, v);
				if (distancias.get(v) > distancias.get(u) + distanciaEntreVerticesUeV) {
					distancias.put(v, distancias.get(u) + distanciaEntreVerticesUeV);
					predecessores.put(v, u);
				}
			}
		}
	}

	private Vertice encontrarMenor(ArrayList<Vertice> vertexes) {
		Vertice menor = null;
		for (Vertice vertex : vertexes) {
			if (menor == null) {
				menor = vertex;
			} else {
				if (distancia(vertex) < distancia(menor)) {
					menor = vertex;
				}
			}
		}
		return menor;
	}

	private double distancia(Vertice destino) {
		Double distancia = distancias.get(destino);
		if (distancia == null) {
			return Double.POSITIVE_INFINITY;
		} else {
			return distancia;
		}
	}

	public LinkedList<Vertice> menorCaminho() {
		this.vertices = grafo.getCloneVertices();
		encontrarMenorCaminho();
		LinkedList<Vertice> path = new LinkedList<Vertice>();
		Vertice passo = destino;
		if (predecessores.get(passo) == null) {
			return null;
		}
		path.add(passo);
		while (predecessores.get(passo) != null) {
			passo = predecessores.get(passo);
			path.add(passo);
		}
		Collections.reverse(path);
		return path;
	}

	public Map<Vertice, Double> getDistancia() {
		return distancias;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

}