package arbolgeneradorminimo;

public class AGM {

	static int[][] grafoArgentina = {
			{0,63,0,0,0,22,0,61,0,0,52,0,0,0,0,70,0,0,0,0,23,0,0,0},
			{63,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,58,0,0,0,0,0,69,0,0,0,0,45,0,0,0,0,28,0,20},
			{0,0,0,0,0,0,23,0,33,0,0,0,0,0,0,0,69,0,0,0,32,26,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,66,0,0,0,0},
			{22,0,58,0,0,0,0,0,0,0,44,35,0,0,0,0,0,0,55,0,69,39,0,0},
			{0,0,0,23,0,0,0,41,0,0,0,0,0,51,0,0,0,0,0,0,30,0,0,0},
			{61,0,0,0,0,0,41,0,0,0,0,0,0,0,0,0,0,0,0,0,46,0,0,0},
			{0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,0,50,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,49,0,0,0,0,0,0,0},
			{52,0,0,0,0,44,0,0,0,0,0,0,34,0,60,46,0,0,27,0,0,0,0,0},
			{0,0,69,0,0,35,0,0,0,0,0,0,0,0,0,0,0,55,69,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,34,0,0,0,61,0,0,69,30,0,0,0,0,0},
			{0,0,0,0,0,0,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,60,0,61,0,0,33,0,0,0,0,0,0,0,0},
			{70,0,0,0,70,0,0,0,0,0,46,0,0,0,33,0,0,0,0,0,0,0,0,0},
			{0,0,45,69,0,0,0,0,50,49,0,0,0,0,0,0,0,0,0,0,0,22,0,51},
			{0,0,0,0,0,0,0,0,0,0,0,55,69,0,0,0,0,0,32,0,0,0,0,0},
			{0,0,0,0,0,55,0,0,0,0,27,69,30,0,0,0,0,32,0,0,0,0,0,0},
			{0,0,0,0,66,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,38,0},
			{23,0,0,32,0,69,30,46,0,0,0,0,0,0,0,0,0,0,0,0,0,37,0,0},
			{0,0,28,26,0,39,0,0,0,0,0,0,0,0,0,0,22,0,0,0,37,0,0,54},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,38,0,0,0,0},
			{0,0,20,0,0,0,0,0,0,0,0,0,0,0,0,0,51,0,0,0,0,54,0,0},
	};
	
	
	static int[][] grafoEjemplo = {
			{0,4,0,0,0,0,0,8,0},
			{4,0,8,0,0,0,12,0,0},
			{0,8,0,6,0,4,0,0,3},
			{0,0,6,0,9,13,0,0,0},
			{0,0,0,9,0,10,0,0,0},
			{0,0,4,13,10,0,3,0,0},
			{0,0,0,0,0,3,0,1,5},
			{8,12,0,0,0,0,1,0,6},
			{0,0,3,0,0,0,5,6,0},

	};
	
	static int[][]grafoArgentinaAGM;
	
	static boolean[] verticesVisitados = new boolean[24];
	
	public static void imprimir() {
		for (int[] x : grafoArgentina)
		{
		   for (int y : x)
		   {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}

    static int findMinKeyvertice(int pesos[], Boolean verticesVisitados[])   
    {   
        // Initialize min value and its index  
        int minimum_index = -1;   
        int minimum_value = Integer.MAX_VALUE;  
          
        //iterate over all vertices to find minimum key-value vertice  
        for (int vertice = 0; vertice < 9; vertice++)   
            if (verticesVisitados[vertice] == false && pesos[vertice] < minimum_value) {   
                minimum_value = pesos[vertice];   
                minimum_index = vertice;   
            }   
    
        return minimum_index;   
    }   
	
   static void showMinimumSpanningTree(int verticesAGM[], int graphArray[][])   
    {   
        System.out.println("arista \t\t Weight");   
        for (int j = 1; j < 9; j++)   
            System.out.println(verticesAGM[j] + " <-> " + j + "\t \t" + graphArray[j][verticesAGM[j]]);   
    }   
	
    static void arbolGeneradorMinimo(int grafoMatrizAdyacencia[][])   
    {   
        // create array of size total number of vertices, i.e., countOfVertices for storing the MST  
    	//Este array va a contener los vertices seleccionados para el AGM de acuerdo al peso minimo.
    	//El array puede contener el mismo vertice varias veces ya que puede que tenga mas de un vecino con peso minimo
        int verticesAGM[] = new int[grafoMatrizAdyacencia.length];   
    
        // create pesos[] array for selecting an arista having minimum weight in cut
        //Este array va a contener los pesos minimos a medida que vamos recorriendo los vertices
        int pesos[] = new int[grafoMatrizAdyacencia.length];   
    
        // create verticesVisitados array of type boolean for representing the set of vertices included in MST   
        //este array booleano a medida que visitamos los vertices se pondra en true el indice correspondiente
        Boolean verticesVisitados[] = new Boolean[grafoMatrizAdyacencia.length];   
    
        // set the value of the pesos to infinite  
        //completamos el array de pesos con el valor maximo posible de integer
        //ponemos en falso todos los valores del array de vertices visitados ya que cuando lo creamos su valor por defecto es null
        for (int j = 0; j < grafoMatrizAdyacencia.length; j++) {   
            pesos[j] = Integer.MAX_VALUE;   
            verticesVisitados[j] = false;   
        }   
    
        // set value 0 to the 1st vertice because first vertes always include in MST.   
        pesos[0] = 0; // it select as first vertice   
        verticesAGM[0] = -1; // set first value of verticesAGM to -1 to make it root of MST   
    
        // The vertices in the MST will be equal to the countOfVertices   
        for (int i = 0; i < grafoMatrizAdyacencia.length - 1; i++) {   
            // select the vertice having minimum key and that is not added in the MST yet from the set of vertices   
            int verticeMinimo = findMinKeyvertice(pesos, verticesVisitados);   
            System.out.println(verticeMinimo);
            // Add the selected minimum key vertice to the verticesVisitados   
            verticesVisitados[verticeMinimo] = true;   
    
            // change the key value and the parent index of all the adjacent vertices of the selected vertice. The vertices that are not yet included in Minimum Spanning Tree are only considered.   
            for (int vertice = 0; vertice < grafoMatrizAdyacencia.length; vertice++)   
    
                // The value of the graphArray[arista][vertice] is non zero only for adjacent vertices of m verticesVisitados[vertice] is false for vertices not yet included in Minimum Spanning Tree   
                // when the value of the graphArray[arista][vertice] is smaller than key[vertice], we update the key  
                if (grafoMatrizAdyacencia[verticeMinimo][vertice] != 0 && verticesVisitados[vertice] == false && grafoMatrizAdyacencia[verticeMinimo][vertice] < pesos[vertice]) {   
                    verticesAGM[vertice] = verticeMinimo;   
                    pesos[vertice] = grafoMatrizAdyacencia[verticeMinimo][vertice];   
                }   
        }   
    
        // print the constructed Minimum Spanning Tree   
        showMinimumSpanningTree(verticesAGM, grafoMatrizAdyacencia);   
    }   
	
	public static void main(String[] args) 
	{
		//imprimir();
		arbolGeneradorMinimo(grafoEjemplo);
		
	}
	
	
}
