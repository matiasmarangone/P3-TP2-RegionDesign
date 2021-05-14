package arbolgeneradorminimo;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AGM {

	static String x = "";
	
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
	
	
	
	public static void guardarPesosGrafoArgentina(int[] array) {
		grafoArgentinaPesosUsuario[0][1] = array[0];
		grafoArgentinaPesosUsuario[1][0] = array[0];
		
		grafoArgentinaPesosUsuario[0][15] = array[1];
		grafoArgentinaPesosUsuario[15][0] = array[1];
		
		grafoArgentinaPesosUsuario[0][10] = array[2];
		grafoArgentinaPesosUsuario[10][0] = array[2];
		
		grafoArgentinaPesosUsuario[0][5] = array[3];
		grafoArgentinaPesosUsuario[5][0] = array[3];
		
		grafoArgentinaPesosUsuario[0][20] = array[4];
		grafoArgentinaPesosUsuario[20][0] = array[4];
		
		grafoArgentinaPesosUsuario[0][7] = array[5];
		grafoArgentinaPesosUsuario[7][0] = array[5];
		
		grafoArgentinaPesosUsuario[2][11] = array[6];
		grafoArgentinaPesosUsuario[11][2] = array[6];
		
		grafoArgentinaPesosUsuario[2][5] = array[7];
		grafoArgentinaPesosUsuario[5][2] = array[7];
		
		grafoArgentinaPesosUsuario[2][21] = array[8];
		grafoArgentinaPesosUsuario[21][2] = array[8];
		
		grafoArgentinaPesosUsuario[2][23] = array[9];
		grafoArgentinaPesosUsuario[23][2] = array[9];
		
		grafoArgentinaPesosUsuario[2][16] = array[10];
		grafoArgentinaPesosUsuario[16][2] = array[10];
		
		grafoArgentinaPesosUsuario[3][6] = array[11];
		grafoArgentinaPesosUsuario[6][3] = array[11];
		
		grafoArgentinaPesosUsuario[3][20] = array[12];
		grafoArgentinaPesosUsuario[20][3] = array[12];
		
		grafoArgentinaPesosUsuario[3][21] = array[13];
		grafoArgentinaPesosUsuario[21][3] = array[13];
		
		grafoArgentinaPesosUsuario[3][16] = array[14];
		grafoArgentinaPesosUsuario[16][3] = array[14];
		
		grafoArgentinaPesosUsuario[3][8] = array[15];
		grafoArgentinaPesosUsuario[8][3] = array[15];
		
		grafoArgentinaPesosUsuario[4][19] = array[16];
		grafoArgentinaPesosUsuario[19][4] = array[16];
		
		grafoArgentinaPesosUsuario[4][15] = array[17];
		grafoArgentinaPesosUsuario[15][4] = array[17];
		
		grafoArgentinaPesosUsuario[5][10] = array[18];
		grafoArgentinaPesosUsuario[10][5] = array[18];
		
		grafoArgentinaPesosUsuario[5][18] = array[19];
		grafoArgentinaPesosUsuario[18][5] = array[19];
		
		grafoArgentinaPesosUsuario[5][11] = array[20];
		grafoArgentinaPesosUsuario[11][5] = array[20];
		
		grafoArgentinaPesosUsuario[5][21] = array[21];
		grafoArgentinaPesosUsuario[21][5] = array[21];
		
		grafoArgentinaPesosUsuario[5][20] = array[22];
		grafoArgentinaPesosUsuario[20][5] = array[22];
		
		grafoArgentinaPesosUsuario[6][13] = array[23];
		grafoArgentinaPesosUsuario[13][6] = array[23];
		
		grafoArgentinaPesosUsuario[6][7] = array[24];
		grafoArgentinaPesosUsuario[7][6] = array[24];
		
		grafoArgentinaPesosUsuario[6][20] = array[25];
		grafoArgentinaPesosUsuario[20][6] = array[25];
		
		grafoArgentinaPesosUsuario[7][20] = array[26];
		grafoArgentinaPesosUsuario[20][7] = array[26];
		
		grafoArgentinaPesosUsuario[8][16] = array[27];
		grafoArgentinaPesosUsuario[16][8] = array[27];
		
		grafoArgentinaPesosUsuario[9][16] = array[28];
		grafoArgentinaPesosUsuario[16][9] = array[28];
		
		grafoArgentinaPesosUsuario[10][12] = array[29];
		grafoArgentinaPesosUsuario[12][10] = array[29];
		
		grafoArgentinaPesosUsuario[10][18] = array[30];
		grafoArgentinaPesosUsuario[18][10] = array[30];
		
		grafoArgentinaPesosUsuario[10][15] = array[31];
		grafoArgentinaPesosUsuario[15][10] = array[31];
		
		grafoArgentinaPesosUsuario[10][14] = array[32];
		grafoArgentinaPesosUsuario[14][10] = array[32];
		
		grafoArgentinaPesosUsuario[11][18] = array[33];
		grafoArgentinaPesosUsuario[18][11] = array[33];
		
		grafoArgentinaPesosUsuario[11][17] = array[34];
		grafoArgentinaPesosUsuario[17][11] = array[34];
		
		grafoArgentinaPesosUsuario[12][17] = array[35];
		grafoArgentinaPesosUsuario[17][12] = array[35];
		
		grafoArgentinaPesosUsuario[12][18] = array[36];
		grafoArgentinaPesosUsuario[18][12] = array[36];
		
		grafoArgentinaPesosUsuario[12][14] = array[37];
		grafoArgentinaPesosUsuario[14][12] = array[37];
		
		grafoArgentinaPesosUsuario[14][15] = array[38];
		grafoArgentinaPesosUsuario[15][14] = array[38];
		
		grafoArgentinaPesosUsuario[16][21] = array[39];
		grafoArgentinaPesosUsuario[21][16] = array[39];
		
		grafoArgentinaPesosUsuario[16][23] = array[40];
		grafoArgentinaPesosUsuario[23][16] = array[40];
		
		grafoArgentinaPesosUsuario[17][18] = array[41];
		grafoArgentinaPesosUsuario[18][17] = array[41];
		
		grafoArgentinaPesosUsuario[19][22] = array[42];
		grafoArgentinaPesosUsuario[22][19] = array[42];
		
		grafoArgentinaPesosUsuario[20][21] = array[43];
		grafoArgentinaPesosUsuario[21][20] = array[43];
		
		grafoArgentinaPesosUsuario[21][23] = array[44];
		grafoArgentinaPesosUsuario[23][21] = array[44];
		

		
	}
	
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
        for (int vertice = 0; vertice < 24; vertice++)   
            if (verticesVisitados[vertice] == false && pesos[vertice] < minimum_value) {   
                minimum_value = pesos[vertice];   
                minimum_index = vertice;   
            }   
    
        return minimum_index;   
    }   
	
   static void showMinimumSpanningTree(int verticesAGM[], int graphArray[][])   
    {   
        System.out.println("arista \t\t peso");   
        for (int j = 1; j < 24; j++)   
            System.out.println(verticesAGM[j] + "---" + j + "\t\t" + graphArray[j][verticesAGM[j]]);   
    }   
   
   
   static void mostrarAGM(int verticesAGM[], int graphArray[][], int reg_buscadas)   
   {   
	   
	   x = x.concat("arista \t\t peso" + "\r \n");
	   List<Integer> where = new ArrayList<Integer>();
 
       for (int j = 1; j < 24; j++) {   
    	   //x = x.concat(verticesAGM[j] + "---" + j + "\t\t" + graphArray[j][verticesAGM[j]]+ "\r \n");
    	   where.add(graphArray[j][verticesAGM[j]]);
       }
       
       Integer[] simpleArray = new Integer[ where.size() ];
       where.toArray( simpleArray );
       
       
       int temp;  
       for (int i = 0; i < simpleArray.length; i++)   
               {  
                   for (int j = i + 1; j < simpleArray.length; j++)   
                   {  
                       if (simpleArray[i] > simpleArray[j])   
                       {  
                           temp = simpleArray[i];  
                           simpleArray[i] = simpleArray[j];  
                           simpleArray[j] = temp;  
                       }  
                   }  
               }  
       
       System.out.println(Arrays.toString(simpleArray));
       
       Integer[] aristasParaEliminar = Arrays.copyOfRange(simpleArray, simpleArray.length-reg_buscadas-1, simpleArray.length);
       int aristasParaEliminarINT[] = new int[aristasParaEliminar.length];
       
       for(int i=0;i<aristasParaEliminar.length;i++) {
    	   aristasParaEliminarINT[i] = aristasParaEliminar[i].intValue();
       }

       for (int j = 1; j < 24; j++) {   
    	   int ex = graphArray[j][verticesAGM[j]];
    	   if(contains(aristasParaEliminarINT,ex)){
    		   // do nothing
    		   //x = x.concat("---Arista eliminada por peso maximo---" + "\r \n");
    	   }else {
    		   
    		   if(j%2==0){
    			   x = x.concat("\t" + verticesAGM[j] + "---" + j + "\t\t" + graphArray[j][verticesAGM[j]]+ "\r \n");
    		   }else {
    			   x = x.concat("\t" + verticesAGM[j] + "---" + j + "\t\t" + graphArray[j][verticesAGM[j]]);
    		   };
    		   
    		  
    	   };
    	   
    	   //where.add(graphArray[j][verticesAGM[j]]);
       }
       
       
       //x = a.toString();
   }  
   
   public static boolean contains(final int[] arr, final int key) {
	    return Arrays.stream(arr).anyMatch(i -> i == key);
	}
   
   public static String renderAGM() {
	   return x;
   }
	
   
   public static void arbolGeneradorMinimoUsuario(int reg_buscadas) {
	   arbolGeneradorMinimo(grafoArgentinaPesosUsuario, reg_buscadas);
   }
   
    public static void arbolGeneradorMinimo(int grafoMatrizAdyacencia[][], int reg_buscadas)   
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
            //System.out.println(verticeMinimo);
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
        //showMinimumSpanningTree(verticesAGM, grafoMatrizAdyacencia);  
        mostrarAGM(verticesAGM, grafoMatrizAdyacencia, reg_buscadas);
        
    }   
	
	public static void main(String[] args) 
	{
		//imprimir();
		//arbolGeneradorMinimo(grafoEjemplo);
		
	}
	
	
}
