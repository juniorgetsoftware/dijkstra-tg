package grafo.app.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import javax.swing.JPanel;

import grafo.app.Aresta;
import grafo.app.Grafo;
import grafo.app.Vertice;
import grafo.app.algoritmo.Dijkstra;
import grafo.app.builder.DijkstraBuilder;
import grafo.app.trabalho.DadosChicagoGrandCanyon;
import grafo.app.util.GrafosUtil;

public class ConstroiGrafoGUI extends JPanel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		Grafo grafo = new DadosChicagoGrandCanyon().getGrafo();

		Graphics2D g1 = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		Font font = new Font("Times", Font.BOLD, 12);
		FontRenderContext f2 = g1.getFontRenderContext();

		final int TAMANHO_DO_VERTICE = 30;

		Map<Aresta, Line2D> as = new HashMap<>();
		Map<Vertice, Ellipse2D> vs = new HashMap<>();

		Map<Aresta, TextLayout> tsa = new HashMap<>();
		Map<Vertice, TextLayout> tsv = new HashMap<>();

		ArrayList<Vertice> vertices = grafo.getVertices();
		ArrayList<Aresta> arestas = grafo.getArestas();

		for (int i = 0; i < vertices.size(); i++) {

			Vertice v = vertices.get(i);

			int ex1 = getWidth() / 16 + +new Random().nextInt(1100);
			int ey1 = getHeight() / 16 + new Random().nextInt(600);

			Ellipse2D.Double e = new Ellipse2D.Double(ex1, ey1, TAMANHO_DO_VERTICE, TAMANHO_DO_VERTICE);
			g1.setColor(Color.BLACK);
			vs.put(v, e);
		}

		// GUARDANDO ARESTAS
		for (int i = 0; i < arestas.size(); i++) {

			Aresta a = arestas.get(i);

			int x1 = (int) vs.get(a.getOrigem()).getCenterX();
			int y1 = (int) vs.get(a.getOrigem()).getCenterY();

			int x2 = (int) vs.get(a.getDestino()).getCenterX();
			int y2 = (int) vs.get(a.getDestino()).getCenterY();

			Line2D.Double linha = new Line2D.Double(x1, y1, x2, y2);
			as.put(a, linha);
		}

		// DESENHA AS ARESTAS
		Font font2 = new Font("Times", Font.BOLD, 16);
		Font font3 = new Font("Times", Font.PLAIN, 10);
		for (int i = 0; i < arestas.size(); i++) {
			Aresta a = arestas.get(i);
			Line2D linha = as.get(a);
			BasicStroke b = new BasicStroke(2);
			g1.setStroke(b);
			g1.setColor(Color.LIGHT_GRAY);
			g1.draw(linha);

			g1.setColor(Color.RED);
			TextLayout t = new TextLayout("" + a.getPeso(), font3, f2);
			tsa.put(a, t);
			// t.draw(g1, (float) (linha.getX1() + linha.getX2()) / 2, (float)
			// (linha.getY1() + linha.getY2()) / 2);
		}

		// DESENHA OS VERTICES
		for (int i = 0; i < vertices.size(); i++) {
			Vertice v = vertices.get(i);

			g1.setColor(Color.LIGHT_GRAY);
			Ellipse2D e = vs.get(v);
			g1.fill(e);

			g1.setColor(Color.BLACK);
			g1.drawOval((int) e.getX(), (int) e.getY(), TAMANHO_DO_VERTICE, TAMANHO_DO_VERTICE);

			g1.setColor(Color.BLACK);
			TextLayout t = new TextLayout(v.getNome().substring(0, 2), font, f2);
			tsv.put(v, t);
			t.draw(g1, (float) e.getCenterX() - 7, (float) e.getCenterY() + 6);

		}

		// DADOS CAMINHO MINIMO
		Vertice orogem = vertices.get(0);
		Vertice destino = vertices.get(vertices.size() - 1);

		Dijkstra d = new DijkstraBuilder().encontrarMenorCaminhoDoGrafo(grafo).de(orogem).ate(destino).executar();
		LinkedList<Vertice> caminho = d.menorCaminho();

		// ARESTAS DO MELHOR CAMINHO
		ArrayList<Aresta> arestasCaminho = GrafosUtil.arestasPorVertices(grafo, new ArrayList<>(caminho));
		for (int i = 0; i < arestasCaminho.size(); i++) {
			Aresta a = arestasCaminho.get(i);
			Line2D linha = as.get(a);
			BasicStroke b = new BasicStroke(3);
			g1.setStroke(b);
			g1.setColor(Color.BLACK);
			g1.draw(linha);

			g1.setColor(Color.BLACK);
			TextLayout t = new TextLayout(String.valueOf(a.getPeso()), font2, f2);
			tsa.put(a, t);
			// t.draw(g1, (float) (linha.getX1() + linha.getX2()) / 2, (float)
			// (linha.getY1() + linha.getY2()) / 2);
		}

		// VERTICES - CAMINHO MINIMO APLICADO
		for (int i = 0; i < caminho.size(); i++) {
			Vertice v = caminho.get(i);

			if (i == 0 || i == caminho.size() - 1) {
				g1.setColor(Color.BLUE);
			} else {
				g1.setColor(Color.RED);
			}

			Ellipse2D e = vs.get(v);
			g1.fill(e);

			g1.setColor(Color.BLACK);
			g1.drawOval((int) e.getX(), (int) e.getY(), TAMANHO_DO_VERTICE, TAMANHO_DO_VERTICE);

			g1.setColor(Color.BLACK);
			TextLayout t = new TextLayout(v.getNome().substring(0, 2), font, f2);
			// t.draw(g1, (float) e.getCenterX() - 6, (float) e.getCenterY() +
			// 6);
			tsv.put(v, t);
		}

		// DESENHA TEXTO DAS ARESTAS
		for (int i = 0; i < arestas.size(); i++) {
			Aresta a = arestas.get(i);
			TextLayout t = tsa.get(a);

			if (arestasCaminho.contains(a)) {
				g1.setColor(Color.BLACK);
			} else {
				g1.setColor(Color.BLUE);
			}
			Line2D linha = as.get(a);

			t.draw(g1, (float) (linha.getX1() + linha.getX2()) / 2, (float) (linha.getY1() + linha.getY2()) / 2);
		}

		// DESENHA TEXTO DOS VÉRTICES
		vertices = new ArrayList<>(caminho);
		for (int i = 0; i < vertices.size(); i++) {
			Vertice v = vertices.get(i);
			TextLayout t = tsv.get(v);

			g1.setColor(Color.GREEN);

			Ellipse2D e = vs.get(v);
			t.draw(g1, (float) e.getCenterX() - 7, (float) e.getCenterY() + 6);
		}

		g.dispose();
		g1.dispose();

	}

}