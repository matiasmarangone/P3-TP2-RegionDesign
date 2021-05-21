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
	
      //static Grafo grafoTest;
      //static int vertices = grafoTest.dimension();
	
	static int[][] grafoArgentinaPesosUsuario = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};
	
	

	
 public static void primMST(Grafo grafoTest){
	 		
	 		//grafoTest = f;
	 
	 		verticesVisitados = new boolean[grafoTest.dimension()];
            ResultSet[] resultSet = new ResultSet[grafoTest.dimension()];
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
                        }
                    }
                }
            }
            //print mst
            printMST(resultSet, grafoTest);
        }

     
	
	 public static void printMST(ResultSet[] resultSet, Grafo grafoTest){
         int total_min_weight = 0;
         System.out.println("Minimum Spanning Tree: ");
         for (int i = 1; i <grafoTest.dimension() ; i++) {
             System.out.println("Edge: " + i + " - " + resultSet[i].parent +
                     " key: " + resultSet[i].weight);
             total_min_weight += resultSet[i].weight;
         }
         System.out.println("Total minimum key: " + total_min_weight);
     }

    public static void main(String[] args) {
        
    	
    	int vertices = 24;
        Grafo graph = new Grafo(vertices);
		
		
		/*
		 * graph.agregarArista(0, 1, 4); graph.agregarArista(0, 2, 3);
		 * graph.agregarArista(1, 2, 1); graph.agregarArista(1, 3, 2);
		 * graph.agregarArista(2, 3, 4); graph.agregarArista(3, 4, 2);
		 * graph.agregarArista(4, 5, 6);
		 */
		 
		 
		
		
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




