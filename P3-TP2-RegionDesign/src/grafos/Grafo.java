package grafos;

import java.util.HashSet;
import java.util.Set;

public class Grafo
{
	// Representamos el grafo por su matriz de adyacencia
	 int vertices;
     int matrix[][];
	
	// La cantidad de vertices esta predeterminada desde el constructor
	public Grafo(int vertice) {
        this.vertices = vertice;
        matrix = new int[vertice][vertice];
    }
	
	public Grafo() {

	}

	public void agregarArista(int verticeOrigen, int verticeDestino, int peso) {

		verificarVertice(verticeOrigen);
		verificarVertice(verticeDestino);
		verificarDistintos(verticeOrigen, verticeDestino);

		//add edge
		matrix[verticeOrigen][verticeDestino]=peso;

		//add back edge for undirected graph
		matrix[verticeDestino][verticeOrigen] = peso;
	}
	
	   //get the vertex with minimum key which is not included in MST
    public int getVerticeValorMinimo(boolean [] mst, int [] key){
        int minKey = Integer.MAX_VALUE;
        int vertex = 0;
        for (int i = 0; i <vertices ; i++) {
            if(mst[i]==false && minKey>key[i]){
                minKey = key[i];
                vertex = i;
            }
        }
        return vertex;
    }

	
	// Eliminacion de aristas
	public void eliminarArista(int i, int j)
	{
		verificarVertice(i);
		verificarVertice(j);
		verificarDistintos(i, j);

		matrix[i][j] = 0;
		matrix[j][i] = 0;
	}

	// Informa si existe la arista especificada
	public int existeArista(int i, int j)
	{
		verificarVertice(i);
		verificarVertice(j);
		verificarDistintos(i, j);

		return matrix[i][j];
	}

	// Cantidad de vertices
	public int dimension()
	{
		return matrix.length;
	}
	
	public int[][] getMatriz(){
		return matrix;
	}
	
	// Vecinos de un vertice
	public Set<Integer> vecinos(int i)
	{
		verificarVertice(i);
		
		Set<Integer> ret = new HashSet<Integer>();
		for(int j = 0; j < this.dimension(); ++j) if( i != j )
		{
			if( this.existeArista(i,j) != 0 )
				ret.add(j);
		}
		
		return ret;		
	}
	
	// Verifica que sea un vertice valido
	private void verificarVertice(int i)
	{
		if( i < 0 )
			throw new IllegalArgumentException("El vertice no puede ser negativo: " + i);
		
		if( i >= matrix.length )
			throw new IllegalArgumentException("Los vertices deben estar entre 0 y |V|-1: " + i);
	}

	// Verifica que i y j sean distintos
	private void verificarDistintos(int i, int j)
	{
		if( i == j )
			throw new IllegalArgumentException("No se permiten loops: (" + i + ", " + j + ")");
	}
}
