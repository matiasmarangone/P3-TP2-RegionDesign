package arbolgeneradorminimo;

import grafos.Grafo;


class ResultSet{
	// will store the vertex(parent) from which the current vertex will reached
	int parent;
	// will store the weight for printing the MST weight
	int weight;
}

public class ArbolGeneradorMinimo {

	static boolean[] verticesVisitados;
	static ResultSet[] resultSet;
	static int regiones_buscadas;
	
	//Variable usada para brindarle a la interfaz una version en String del AGM con las regiones buscadas
	static String arbol_y_regiones = "";
	
	//static int cantidadAristas;
	//static Grafo grafoTest;
	//static int vertices = grafoTest.dimension();


	//Grafo vacio, donde se guardaran los pesos ingresados por el usuario a través de la interfaz
	static Grafo grafoArgentinaPesosUsuario = new Grafo(24);

	
	public static String renderAGM() {
		return arbol_y_regiones;
	}
	
	public static void primMST(Grafo grafoTest){

		//grafoTest = f;

		verticesVisitados = new boolean[grafoTest.dimension()];
		resultSet = new ResultSet[grafoTest.dimension()];
		int [] key = new int[grafoTest.dimension()];

		//Initialize all the keys to infinity and
		//initialize resultSet for all the vertices
		for (int i = 0; i <grafoTest.dimension() ; i++) {
			key[i] = Integer.MAX_VALUE;
			resultSet[i] = new ResultSet();
		}

		//start from the vertex 0
		key[0] = 0;
		resultSet[0] = new ResultSet();
		resultSet[0].parent = -1;

		//create MST
		for (int i = 0; i <grafoTest.dimension() ; i++) {

			//get the vertex with the minimum key
			int vertex = grafoTest.getVerticeValorMinimo(verticesVisitados, key);

			//include this vertex in MST
			verticesVisitados[vertex] = true;

			//iterate through all the adjacent vertices of above vertex and update the keys
			for (int j = 0; j <grafoTest.dimension() ; j++) {
				//check of the edge
				if(grafoTest.getMatriz()[vertex][j]>0){
					//check if this vertex 'j' already in mst and
					//if no then check if key needs an update or not
					if(verticesVisitados[j]==false && grafoTest.getMatriz()[vertex][j]<key[j]){
						//update the key
						key[j] = grafoTest.getMatriz()[vertex][j];
						//update the result set
						resultSet[j].parent = vertex;
						resultSet[j].weight = key[j];
						//cantidadAristas++;
					}
				}
			}
		}
		//print mst
		printMST(resultSet, grafoTest);
	}



	public static void printMST(ResultSet[] resultSet, Grafo grafoTest){
		int total_min_weight = 0;
		arbol_y_regiones = arbol_y_regiones.concat("Arbol Generador Minimo de Grafo G: " + "\r \n");
		//System.out.println("Arbol Generador Minimo de Grafo G: ");
		for (int i = 1; i <grafoTest.dimension() ; i++) {
			/*
			 * System.out.println( "Arista: " + i + " - " + resultSet[i].parent + " peso: "
			 * + resultSet[i].weight );
			 */
			
			if(i%2==0) {
				arbol_y_regiones = arbol_y_regiones.concat("Arista: " + i + " - " + resultSet[i].parent +
						" peso: " + resultSet[i].weight + "\r \n");
			}
			else {
				arbol_y_regiones = arbol_y_regiones.concat("Arista: " + i + " - " + resultSet[i].parent +
						" peso: " + resultSet[i].weight + "\t  |");
			}			
			
			
			total_min_weight += resultSet[i].weight;
		}
		//System.out.println("Peso total del Arbol : " + total_min_weight);
		
		arbol_y_regiones = arbol_y_regiones.concat("\r \n Peso total del Arbol : " + total_min_weight);
	}

	public static void arbolGeneradorMinimoUsuario(int regiones, int[] pesosIngresados) {
		//esta funcion se llama desde la interfaz recibiendo la cantidad de regiones buscadas y todos los pesos de las aristas ingresados por el usuario
		// Guarda todos los pesos en un array y luego usa la funcion privada de generar AGM
		
		regiones_buscadas = regiones;
		
		guardarPesosGrafoArgentina(pesosIngresados);
		
		
		primMST(grafoArgentinaPesosUsuario);

	}

	public static void guardarPesosGrafoArgentina(int[] array) {
		grafoArgentinaPesosUsuario.getMatriz()[0][1] = array[0];
		grafoArgentinaPesosUsuario.getMatriz()[1][0] = array[0];

		grafoArgentinaPesosUsuario.getMatriz()[0][15] = array[1];
		grafoArgentinaPesosUsuario.getMatriz()[15][0] = array[1];

		grafoArgentinaPesosUsuario.getMatriz()[0][10] = array[2];
		grafoArgentinaPesosUsuario.getMatriz()[10][0] = array[2];

		grafoArgentinaPesosUsuario.getMatriz()[0][5] = array[3];
		grafoArgentinaPesosUsuario.getMatriz()[5][0] = array[3];

		grafoArgentinaPesosUsuario.getMatriz()[0][20] = array[4];
		grafoArgentinaPesosUsuario.getMatriz()[20][0] = array[4];

		grafoArgentinaPesosUsuario.getMatriz()[0][7] = array[5];
		grafoArgentinaPesosUsuario.getMatriz()[7][0] = array[5];

		grafoArgentinaPesosUsuario.getMatriz()[2][11] = array[6];
		grafoArgentinaPesosUsuario.getMatriz()[11][2] = array[6];

		grafoArgentinaPesosUsuario.getMatriz()[2][5] = array[7];
		grafoArgentinaPesosUsuario.getMatriz()[5][2] = array[7];

		grafoArgentinaPesosUsuario.getMatriz()[2][21] = array[8];
		grafoArgentinaPesosUsuario.getMatriz()[21][2] = array[8];

		grafoArgentinaPesosUsuario.getMatriz()[2][23] = array[9];
		grafoArgentinaPesosUsuario.getMatriz()[23][2] = array[9];

		grafoArgentinaPesosUsuario.getMatriz()[2][16] = array[10];
		grafoArgentinaPesosUsuario.getMatriz()[16][2] = array[10];

		grafoArgentinaPesosUsuario.getMatriz()[3][6] = array[11];
		grafoArgentinaPesosUsuario.getMatriz()[6][3] = array[11];

		grafoArgentinaPesosUsuario.getMatriz()[3][20] = array[12];
		grafoArgentinaPesosUsuario.getMatriz()[20][3] = array[12];

		grafoArgentinaPesosUsuario.getMatriz()[3][21] = array[13];
		grafoArgentinaPesosUsuario.getMatriz()[21][3] = array[13];

		grafoArgentinaPesosUsuario.getMatriz()[3][16] = array[14];
		grafoArgentinaPesosUsuario.getMatriz()[16][3] = array[14];

		grafoArgentinaPesosUsuario.getMatriz()[3][8] = array[15];
		grafoArgentinaPesosUsuario.getMatriz()[8][3] = array[15];

		grafoArgentinaPesosUsuario.getMatriz()[4][19] = array[16];
		grafoArgentinaPesosUsuario.getMatriz()[19][4] = array[16];

		grafoArgentinaPesosUsuario.getMatriz()[4][15] = array[17];
		grafoArgentinaPesosUsuario.getMatriz()[15][4] = array[17];

		grafoArgentinaPesosUsuario.getMatriz()[5][10] = array[18];
		grafoArgentinaPesosUsuario.getMatriz()[10][5] = array[18];

		grafoArgentinaPesosUsuario.getMatriz()[5][18] = array[19];
		grafoArgentinaPesosUsuario.getMatriz()[18][5] = array[19];

		grafoArgentinaPesosUsuario.getMatriz()[5][11] = array[20];
		grafoArgentinaPesosUsuario.getMatriz()[11][5] = array[20];

		grafoArgentinaPesosUsuario.getMatriz()[5][21] = array[21];
		grafoArgentinaPesosUsuario.getMatriz()[21][5] = array[21];

		grafoArgentinaPesosUsuario.getMatriz()[5][20] = array[22];
		grafoArgentinaPesosUsuario.getMatriz()[20][5] = array[22];

		grafoArgentinaPesosUsuario.getMatriz()[6][13] = array[23];
		grafoArgentinaPesosUsuario.getMatriz()[13][6] = array[23];

		grafoArgentinaPesosUsuario.getMatriz()[6][7] = array[24];
		grafoArgentinaPesosUsuario.getMatriz()[7][6] = array[24];

		grafoArgentinaPesosUsuario.getMatriz()[6][20] = array[25];
		grafoArgentinaPesosUsuario.getMatriz()[20][6] = array[25];

		grafoArgentinaPesosUsuario.getMatriz()[7][20] = array[26];
		grafoArgentinaPesosUsuario.getMatriz()[20][7] = array[26];

		grafoArgentinaPesosUsuario.getMatriz()[8][16] = array[27];
		grafoArgentinaPesosUsuario.getMatriz()[16][8] = array[27];

		grafoArgentinaPesosUsuario.getMatriz()[9][16] = array[28];
		grafoArgentinaPesosUsuario.getMatriz()[16][9] = array[28];

		grafoArgentinaPesosUsuario.getMatriz()[10][12] = array[29];
		grafoArgentinaPesosUsuario.getMatriz()[12][10] = array[29];

		grafoArgentinaPesosUsuario.getMatriz()[10][18] = array[30];
		grafoArgentinaPesosUsuario.getMatriz()[18][10] = array[30];

		grafoArgentinaPesosUsuario.getMatriz()[10][15] = array[31];
		grafoArgentinaPesosUsuario.getMatriz()[15][10] = array[31];

		grafoArgentinaPesosUsuario.getMatriz()[10][14] = array[32];
		grafoArgentinaPesosUsuario.getMatriz()[14][10] = array[32];

		grafoArgentinaPesosUsuario.getMatriz()[11][18] = array[33];
		grafoArgentinaPesosUsuario.getMatriz()[18][11] = array[33];

		grafoArgentinaPesosUsuario.getMatriz()[11][17] = array[34];
		grafoArgentinaPesosUsuario.getMatriz()[17][11] = array[34];

		grafoArgentinaPesosUsuario.getMatriz()[12][17] = array[35];
		grafoArgentinaPesosUsuario.getMatriz()[17][12] = array[35];

		grafoArgentinaPesosUsuario.getMatriz()[12][18] = array[36];
		grafoArgentinaPesosUsuario.getMatriz()[18][12] = array[36];

		grafoArgentinaPesosUsuario.getMatriz()[12][14] = array[37];
		grafoArgentinaPesosUsuario.getMatriz()[14][12] = array[37];

		grafoArgentinaPesosUsuario.getMatriz()[14][15] = array[38];
		grafoArgentinaPesosUsuario.getMatriz()[15][14] = array[38];

		grafoArgentinaPesosUsuario.getMatriz()[16][21] = array[39];
		grafoArgentinaPesosUsuario.getMatriz()[21][16] = array[39];

		grafoArgentinaPesosUsuario.getMatriz()[16][23] = array[40];
		grafoArgentinaPesosUsuario.getMatriz()[23][16] = array[40];

		grafoArgentinaPesosUsuario.getMatriz()[17][18] = array[41];
		grafoArgentinaPesosUsuario.getMatriz()[18][17] = array[41];

		grafoArgentinaPesosUsuario.getMatriz()[19][22] = array[42];
		grafoArgentinaPesosUsuario.getMatriz()[22][19] = array[42];

		grafoArgentinaPesosUsuario.getMatriz()[20][21] = array[43];
		grafoArgentinaPesosUsuario.getMatriz()[21][20] = array[43];

		grafoArgentinaPesosUsuario.getMatriz()[21][23] = array[44];
		grafoArgentinaPesosUsuario.getMatriz()[23][21] = array[44];


	}

	public static void main(String[] args) {





		/*
		 * int vertices =6; Grafo graph = new Grafo(vertices); graph.agregarArista(0, 1,
		 * 4); graph.agregarArista(0, 2, 3); graph.agregarArista(1, 2, 1);
		 * graph.agregarArista(1, 3, 2); graph.agregarArista(2, 3, 4);
		 * graph.agregarArista(3, 4, 2); graph.agregarArista(4, 5, 6);
		 */




		int vertices = 24; Grafo graph = new Grafo(vertices);

		graph.agregarArista(0,1,0); graph.agregarArista(0,15,1);
		graph.agregarArista(0,10,2); graph.agregarArista(0,5,3);
		graph.agregarArista(0,20,4); graph.agregarArista(0,7,5);
		graph.agregarArista(2,11,6); graph.agregarArista(2,5,7);
		graph.agregarArista(2,21,8); graph.agregarArista(2,23,9);
		graph.agregarArista(2,16,10); graph.agregarArista(3,6,11);
		graph.agregarArista(3,20,12); graph.agregarArista(3,21,13);
		graph.agregarArista(3,16,14); graph.agregarArista(3,8,15);
		graph.agregarArista(4,19,16); graph.agregarArista(4,15,17);
		graph.agregarArista(5,10,18); graph.agregarArista(5,18,19);
		graph.agregarArista(5,11,20); graph.agregarArista(5,21,21);
		graph.agregarArista(5,20,22); graph.agregarArista(6,13,23);
		graph.agregarArista(6,7,24); graph.agregarArista(6,20,25);
		graph.agregarArista(7,20,26); graph.agregarArista(8,16,27);
		graph.agregarArista(9,16,28); graph.agregarArista(10,12,29);
		graph.agregarArista(10,18,30); graph.agregarArista(10,15,31);
		graph.agregarArista(10,14,32); graph.agregarArista(11,18,33);
		graph.agregarArista(11,17,34); graph.agregarArista(12,17,35);
		graph.agregarArista(12,18,36); graph.agregarArista(12,14,37);
		graph.agregarArista(14,15,38); graph.agregarArista(16,21,39);
		graph.agregarArista(16,23,40); graph.agregarArista(17,18,41);
		graph.agregarArista(19,22,42); graph.agregarArista(20,21,43);
		graph.agregarArista(21,23,44);


		primMST(graph);
	}

}




