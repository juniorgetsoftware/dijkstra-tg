package grafo.app;

import java.util.ArrayList;

public class Vertice {

	public Vertice(String nome) {
		this.nome = nome;
	}

	private Vertice representante;
	private int rank;
	private String nome;
	private ArrayList<Aresta> arestas = new ArrayList<>();
	private ArrayList<Vertice> vizinhos = new ArrayList<>();

	public void addVizinho(Vertice v) {
		vizinhos.add(v);
	}

	public void addAresta(Aresta a) {
		this.arestas.add(a);
	}

	public ArrayList<Vertice> vizinhos() {
		return vizinhos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(ArrayList<Aresta> arestas) {
		this.arestas = arestas;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Vertice getRepresentante() {
		return representante;
	}

	public void setRepresentante(Vertice representante) {
		this.representante = representante;
	}
}
