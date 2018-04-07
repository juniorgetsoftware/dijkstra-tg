package grafo.app;

public class Aresta implements Comparable<Aresta> {

	public Aresta(Vertice origem, Vertice destino, int peso) {
		this.origem = origem;
		this.destino = destino;
		this.peso = peso;
	}

	private int peso;
	private Vertice origem;
	private Vertice destino;
	private Aresta proximo;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

	public Aresta getProximo() {
		return proximo;
	}

	public void setProximo(Aresta proximo) {
		this.proximo = proximo;
	}

	@Override
	public int compareTo(Aresta o) {
		if (this.peso < o.peso)
			return -1;
		if (this.peso > o.peso)
			return 1;
		return 0;
	}
}
