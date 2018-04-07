package grafo.app.gui;

import javax.swing.JFrame;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		MainGUI gui = new MainGUI();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.add(new ConstroiGrafoGUI());
		gui.setSize(800, 500);
		gui.setExtendedState(MAXIMIZED_BOTH);
		gui.setLocationRelativeTo(null);
		gui.setVisible(true);
	}
}
