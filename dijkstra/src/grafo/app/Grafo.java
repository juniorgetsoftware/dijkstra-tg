package grafo.app;

import java.util.ArrayList;

public class Grafo {

	public Grafo(String nome, Orientacao orientacao) {
		this.nome = nome;
		this.orientacao = orientacao;
	}

	private ArrayList<Vertice> vertices = new ArrayList<>();
	private ArrayList<Aresta> arestas = new ArrayList<>();
	private Orientacao orientacao;
	private String nome;

	public void addVertice(Vertice vertice) {
		this.vertices.add(vertice);
	}

	public Vertice addVertice(String nome) {
		Vertice vertice = new Vertice(nome);
		vertices.add(vertice);
		return vertice;
	}

	public void addAresta(Aresta aresta) {
		this.arestas.add(addAresta(aresta.getOrigem(), aresta.getDestino(), aresta.getPeso()));
	}

	public Aresta addAresta(Vertice v1, Vertice v2, int peso) {
		Aresta aresta = new Aresta(v1, v2, peso);
		v1.addVizinho(v2);
		arestas.add(aresta);
//		if (orientacao == Orientacao.NAO_ORIENTADO) {
//			Aresta arestaAux = new Aresta(v2, v1, peso);
//			arestas.add(arestaAux);
//			v2.addVizinho(v1);
//		}
		return aresta;
	}

	public ArrayList<Vertice> getVertices() {
		return vertices;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Vertice> getCloneVertices() {
		return (ArrayList<Vertice>) vertices.clone();
	}

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Aresta> getCloneArestas() {
		return (ArrayList<Aresta>) arestas.clone();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Orientacao getOrientacao() {
		return orientacao;
	}

}
