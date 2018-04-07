package grafo.app.trabalho;

import grafo.app.Grafo;
import grafo.app.Orientacao;
import grafo.app.Vertice;

public class DadosChicagoGrandCanyon {

	private Grafo grafo;

	public DadosChicagoGrandCanyon() {

		grafo = new Grafo("Caminho Mínimo", Orientacao.ORIENTADO);

		Vertice v1 = grafo.addVertice("1 Chicago");
		Vertice v2 = grafo.addVertice("2 Peoria,Illinois");
		Vertice v3 = grafo.addVertice("3 Springfield.Illinois");
		Vertice v4 = grafo.addVertice("4 St.Louis,Missouri");
		Vertice v5 = grafo.addVertice("5 Poplar Bluff, Missouri");
		Vertice v6 = grafo.addVertice("6 Hannibal,Missouri");
		Vertice v7 = grafo.addVertice("7 Jefferson City.Missouri");
		Vertice v8 = grafo.addVertice("8 Little Rock, Arkansas");
		Vertice v9 = grafo.addVertice("9 Springfield,Missouri");
		Vertice v10 = grafo.addVertice("10 Des Moines, Iowa");
		Vertice v11 = grafo.addVertice("11 Ft.Smith,Arkansas");
		Vertice v12 = grafo.addVertice("12 Kansas City");
		Vertice v13 = grafo.addVertice("13 Ft.Scott,Kansas");
		Vertice v14 = grafo.addVertice("14 St.Joseph,Missouri");
		Vertice v15 = grafo.addVertice("15 Tulsa,Oklahoma");
		Vertice v16 = grafo.addVertice("16 Omaha,Nebraska");
		Vertice v17 = grafo.addVertice("17 Beatrice,Nebraska");
		Vertice v18 = grafo.addVertice("18 Wichita,Kansas");
		Vertice v19 = grafo.addVertice("19 Oklahoma City, Oklahoma");
		Vertice v20 = grafo.addVertice("20 Great Bend, Kansas");
		Vertice v21 = grafo.addVertice("21 Phillipsburg.Kansas");
		Vertice v22 = grafo.addVertice("22 Grand Island, Nebraska");
		Vertice v23 = grafo.addVertice("23 Dodge City, Kansas");
		Vertice v24 = grafo.addVertice("24 Guymon,Oklahoma");
		Vertice v25 = grafo.addVertice("25 North Platte, Nebraska");
		Vertice v26 = grafo.addVertice("26 Amarillo,Texas");
		Vertice v27 = grafo.addVertice("27 Kit Carson, Colorado");
		Vertice v28 = grafo.addVertice("28 Tucumcari, New Mexico");
		Vertice v29 = grafo.addVertice("29 Raton, New Mexico");
		Vertice v30 = grafo.addVertice("30 Pueblo, Colorado");
		Vertice v31 = grafo.addVertice("31 Denver,Colorado");
		Vertice v32 = grafo.addVertice("32 Santa Fe, New Mexico");
		Vertice v33 = grafo.addVertice("33 Albuquerque. New Mexico");
		Vertice v34 = grafo.addVertice("34 Durango,Colorado");
		Vertice v35 = grafo.addVertice("35 Grand Junction, Colorado");
		Vertice v36 = grafo.addVertice("36 Gallup, New Mexico");
		Vertice v37 = grafo.addVertice("37 Green River, Utah");
		Vertice v38 = grafo.addVertice("38 Flagstaff.Arizona");
		Vertice v39 = grafo.addVertice("39 Mt. Carmel Junction, Utah");
		Vertice v40 = grafo.addVertice("40 Grand Canyon");

		grafo.addAresta(v1, v1, 0);
		grafo.addAresta(v1, v2, 220);
		grafo.addAresta(v1, v3, 255);
		grafo.addAresta(v1, v10, 460);
		grafo.addAresta(v2, v1, 220);
		grafo.addAresta(v2, v2, 0);
		grafo.addAresta(v2, v3, 105);
		grafo.addAresta(v2, v6, 240);
		grafo.addAresta(v2, v10, 360);
		grafo.addAresta(v2, v16, 510);
		grafo.addAresta(v3, v1, 255);
		grafo.addAresta(v3, v2, 105);
		grafo.addAresta(v3, v3, 0);
		grafo.addAresta(v3, v4, 130);
		grafo.addAresta(v3, v6, 165);
		grafo.addAresta(v4, v3, 130);
		grafo.addAresta(v4, v4, 0);
		grafo.addAresta(v4, v5, 240);
		grafo.addAresta(v4, v6, 180);
		grafo.addAresta(v4, v7, 195);
		grafo.addAresta(v4, v9, 315);
		grafo.addAresta(v4, v12, 340);
		grafo.addAresta(v5, v4, 240);
		grafo.addAresta(v5, v5, 0);
		grafo.addAresta(v5, v8, 300);
		grafo.addAresta(v5, v9, 310);
		grafo.addAresta(v6, v2, 240);
		grafo.addAresta(v6, v3, 165);
		grafo.addAresta(v6, v4, 180);
		grafo.addAresta(v6, v6, 0);
		grafo.addAresta(v6, v7, 165);
		grafo.addAresta(v6, v10, 360);
		grafo.addAresta(v6, v12, 285);
		grafo.addAresta(v6, v14, 285);
		grafo.addAresta(v7, v4, 195);
		grafo.addAresta(v7, v6, 165);
		grafo.addAresta(v7, v7, 0);
		grafo.addAresta(v7, v9, 225);
		grafo.addAresta(v7, v13, 255);
		grafo.addAresta(v8, v5, 300);
		grafo.addAresta(v8, v8, 0);
		grafo.addAresta(v8, v9, 330);
		grafo.addAresta(v8, v11, 225);
		grafo.addAresta(v9, v4, 315);
		grafo.addAresta(v9, v5, 310);
		grafo.addAresta(v9, v7, 225);
		grafo.addAresta(v9, v8, 330);
		grafo.addAresta(v9, v9, 0);
		grafo.addAresta(v9, v10, 505);
		grafo.addAresta(v9, v12, 255);
		grafo.addAresta(v9, v15, 220);
		grafo.addAresta(v9, v18, 360);
		grafo.addAresta(v10, v1, 460);
		grafo.addAresta(v10, v2, 360);
		grafo.addAresta(v10, v6, 360);
		grafo.addAresta(v10, v9, 505);
		grafo.addAresta(v10, v10, 0);
		grafo.addAresta(v10, v12, 280);
		grafo.addAresta(v10, v16, 200);
		grafo.addAresta(v11, v8, 225);
		grafo.addAresta(v11, v11, 0);
		grafo.addAresta(v11, v13, 330);
		grafo.addAresta(v11, v15, 210);
		grafo.addAresta(v11, v19, 270);
		grafo.addAresta(v12, v4, 340);
		grafo.addAresta(v12, v6, 285);
		grafo.addAresta(v12, v9, 255);
		grafo.addAresta(v12, v10, 280);
		grafo.addAresta(v12, v12, 0);
		grafo.addAresta(v12, v13, 150);
		grafo.addAresta(v12, v14, 70);
		grafo.addAresta(v12, v18, 200);
		grafo.addAresta(v12, v20, 270);
		grafo.addAresta(v12, v27, 585);
		grafo.addAresta(v13, v7, 255);
		grafo.addAresta(v13, v11, 330);
		grafo.addAresta(v13, v12, 150);
		grafo.addAresta(v13, v13, 0);
		grafo.addAresta(v13, v15, 195);
		grafo.addAresta(v13, v18, 210);
		grafo.addAresta(v14, v6, 285);
		grafo.addAresta(v14, v12, 70);
		grafo.addAresta(v14, v14, 0);
		grafo.addAresta(v14, v16, 255);
		grafo.addAresta(v14, v17, 195);
		grafo.addAresta(v14, v21, 300);
		grafo.addAresta(v15, v9, 220);
		grafo.addAresta(v15, v11, 210);
		grafo.addAresta(v15, v13, 195);
		grafo.addAresta(v15, v15, 0);
		grafo.addAresta(v15, v16, 590);
		grafo.addAresta(v15, v18, 230);
		grafo.addAresta(v15, v19, 105);
		grafo.addAresta(v16, v2, 510);
		grafo.addAresta(v16, v10, 220);
		grafo.addAresta(v16, v14, 255);
		grafo.addAresta(v16, v15, 590);
		grafo.addAresta(v16, v16, 0);
		grafo.addAresta(v16, v17, 110);
		grafo.addAresta(v16, v22, 190);
		grafo.addAresta(v17, v14, 195);
		grafo.addAresta(v17, v16, 110);
		grafo.addAresta(v17, v17, 0);
		grafo.addAresta(v17, v18, 275);
		grafo.addAresta(v17, v22, 170);
		grafo.addAresta(v18, v9, 360);
		grafo.addAresta(v18, v12, 200);
		grafo.addAresta(v18, v13, 210);
		grafo.addAresta(v18, v15, 230);
		grafo.addAresta(v18, v17, 275);
		grafo.addAresta(v18, v18, 0);
		grafo.addAresta(v18, v19, 195);
		grafo.addAresta(v18, v20, 170);
		grafo.addAresta(v18, v23, 210);
		grafo.addAresta(v18, v24, 345);
		grafo.addAresta(v19, v11, 270);
		grafo.addAresta(v19, v15, 105);
		grafo.addAresta(v19, v18, 195);
		grafo.addAresta(v19, v19, 0);
		grafo.addAresta(v19, v23, 360);
		grafo.addAresta(v19, v26, 345);
		grafo.addAresta(v20, v12, 270);
		grafo.addAresta(v20, v18, 170);
		grafo.addAresta(v20, v20, 0);
		grafo.addAresta(v20, v21, 165);
		grafo.addAresta(v20, v23, 120);
		grafo.addAresta(v20, v30, 465);
		grafo.addAresta(v21, v14, 300);
		grafo.addAresta(v21, v20, 165);
		grafo.addAresta(v21, v21, 0);
		grafo.addAresta(v21, v22, 160);
		grafo.addAresta(v21, v31, 390);
		grafo.addAresta(v22, v16, 190);
		grafo.addAresta(v22, v17, 170);
		grafo.addAresta(v22, v21, 160);
		grafo.addAresta(v22, v22, 0);
		grafo.addAresta(v22, v23, 375);
		grafo.addAresta(v22, v25, 190);
		grafo.addAresta(v23, v18, 210);
		grafo.addAresta(v23, v19, 360);
		grafo.addAresta(v23, v20, 120);
		grafo.addAresta(v23, v22, 375);
		grafo.addAresta(v23, v23, 0);
		grafo.addAresta(v23, v24, 150);
		grafo.addAresta(v23, v25, 340);
		grafo.addAresta(v23, v30, 360);
		grafo.addAresta(v24, v18, 345);
		grafo.addAresta(v24, v23, 150);
		grafo.addAresta(v24, v24, 0);
		grafo.addAresta(v24, v26, 150);
		grafo.addAresta(v24, v28, 260);
		grafo.addAresta(v24, v29, 255);
		grafo.addAresta(v25, v22, 190);
		grafo.addAresta(v25, v23, 340);
		grafo.addAresta(v25, v25, 0);
		grafo.addAresta(v25, v31, 360);
		grafo.addAresta(v26, v19, 345);
		grafo.addAresta(v26, v24, 150);
		grafo.addAresta(v26, v26, 0);
		grafo.addAresta(v26, v27, 360);
		grafo.addAresta(v26, v28, 175);
		grafo.addAresta(v26, v29, 285);
		grafo.addAresta(v27, v12, 285);
		grafo.addAresta(v27, v26, 360);
		grafo.addAresta(v27, v27, 0);
		grafo.addAresta(v27, v31, 210);
		grafo.addAresta(v28, v24, 260);
		grafo.addAresta(v28, v26, 175);
		grafo.addAresta(v28, v28, 0);
		grafo.addAresta(v28, v32, 260);
		grafo.addAresta(v28, v33, 230);
		grafo.addAresta(v29, v24, 255);
		grafo.addAresta(v29, v26, 285);
		grafo.addAresta(v29, v29, 0);
		grafo.addAresta(v29, v30, 150);
		grafo.addAresta(v29, v32, 255);
		grafo.addAresta(v29, v34, 435);
		grafo.addAresta(v30, v20, 465);
		grafo.addAresta(v30, v23, 360);
		grafo.addAresta(v30, v29, 150);
		grafo.addAresta(v30, v30, 0);
		grafo.addAresta(v30, v31, 180);
		grafo.addAresta(v30, v34, 435);
		grafo.addAresta(v30, v35, 480);
		grafo.addAresta(v31, v21, 390);
		grafo.addAresta(v31, v25, 360);
		grafo.addAresta(v31, v27, 210);
		grafo.addAresta(v31, v30, 180);
		grafo.addAresta(v31, v31, 0);
		grafo.addAresta(v31, v34, 580);
		grafo.addAresta(v31, v35, 420);
		grafo.addAresta(v32, v28, 260);
		grafo.addAresta(v32, v29, 255);
		grafo.addAresta(v32, v32, 0);
		grafo.addAresta(v32, v33, 75);
		grafo.addAresta(v32, v34, 330);
		grafo.addAresta(v33, v28, 230);
		grafo.addAresta(v33, v32, 75);
		grafo.addAresta(v33, v33, 0);
		grafo.addAresta(v33, v34, 300);
		grafo.addAresta(v33, v36, 185);
		grafo.addAresta(v34, v29, 435);
		grafo.addAresta(v34, v30, 435);
		grafo.addAresta(v34, v31, 580);
		grafo.addAresta(v34, v32, 330);
		grafo.addAresta(v34, v33, 300);
		grafo.addAresta(v34, v34, 0);
		grafo.addAresta(v34, v35, 300);
		grafo.addAresta(v34, v36, 260);
		grafo.addAresta(v34, v37, 320);
		grafo.addAresta(v35, v30, 480);
		grafo.addAresta(v35, v31, 420);
		grafo.addAresta(v35, v34, 300);
		grafo.addAresta(v35, v35, 0);
		grafo.addAresta(v35, v37, 180);
		grafo.addAresta(v36, v33, 185);
		grafo.addAresta(v36, v34, 260);
		grafo.addAresta(v36, v36, 0);
		grafo.addAresta(v36, v37, 450);
		grafo.addAresta(v36, v38, 260);
		grafo.addAresta(v37, v34, 320);
		grafo.addAresta(v37, v35, 180);
		grafo.addAresta(v37, v36, 450);
		grafo.addAresta(v37, v37, 0);
		grafo.addAresta(v37, v39, 480);
		grafo.addAresta(v38, v36, 260);
		grafo.addAresta(v38, v38, 0);
		grafo.addAresta(v38, v39, 330);
		grafo.addAresta(v38, v40, 110);
		grafo.addAresta(v39, v37, 480);
		grafo.addAresta(v39, v38, 330);
		grafo.addAresta(v39, v39, 0);
		grafo.addAresta(v39, v40, 150);
		grafo.addAresta(v40, v38, 110);
		grafo.addAresta(v40, v39, 150);
		grafo.addAresta(v40, v40, 0);

	}

	public Grafo getGrafo() {
		return grafo;
	}

	/*
	 * 1 Chicago (0.0) 
	 * 3 Springfield.Illinois (255.0) 
	 * 6 Hannibal,Missouri (420.0) 
	 * 12 Kansas City (705.0) 
	 * 20 Great Bend, Kansas (975.0) 
	 * 23 Dodge City, Kansas (1095.0) 
	 * 24 Guymon,Oklahoma (1245.0) 
	 * 28 Tucumcari, New Mexico (1505.0) 
	 * 33 Albuquerque. New Mexico (1735.0) 
	 * 36 Gallup, New Mexico (1920.0) 
	 * 38 Flagstaff.Arizona (2180.0) 
	 * 40 Grand Canyon (2290.0)
	 */

}
