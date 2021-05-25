package arbolgeneradorminimo;

import static org.junit.Assert.*;

import org.junit.Test;

import grafos.Grafo;

public class ArbolTest {
	
	public boolean todosTrue(boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			  if (!arr[i])
				  return false;
			}
			return true;
	}

	@Test
	public void cantidadDeVerticesTest() {
		
		int vertices =6;
		   Grafo graph = new Grafo(vertices);
		   graph.agregarArista(0, 1, 4); graph.agregarArista(0, 2, 3);
		   graph.agregarArista(1, 2, 1); graph.agregarArista(1, 3, 2);
		   graph.agregarArista(2, 3, 4); graph.agregarArista(3, 4, 2);
		   graph.agregarArista(4, 5, 6);
		ArbolGeneradorMinimo.regiones_buscadas = 2;
		ArbolGeneradorMinimo.primMST(graph);
		assertEquals(ArbolGeneradorMinimo.resultSet.length, graph.dimension());
		
	}

	@Test
	public void verticesVisitadosTest() {

		int vertices =6;
		Grafo graph = new Grafo(vertices);
		graph.agregarArista(0, 1, 4); graph.agregarArista(0, 2, 3);
		graph.agregarArista(1, 2, 1); graph.agregarArista(1, 3, 2);
		graph.agregarArista(2, 3, 4); graph.agregarArista(3, 4, 2);
		graph.agregarArista(4, 5, 6);

		ArbolGeneradorMinimo.primMST(graph);

		assertTrue(todosTrue(ArbolGeneradorMinimo.verticesVisitados));
	}
	
	@Test
	public void cantidadDeAristasTest() {

		int vertices =6;
		Grafo graph = new Grafo(vertices);
		graph.agregarArista(0, 1, 4); graph.agregarArista(0, 2, 3);
		graph.agregarArista(1, 2, 1); graph.agregarArista(1, 3, 2);
		graph.agregarArista(2, 3, 4); graph.agregarArista(3, 4, 2);
		graph.agregarArista(4, 5, 6);
		ArbolGeneradorMinimo.regiones_buscadas = 2;
		ArbolGeneradorMinimo.primMST(graph);

		assertEquals(ArbolGeneradorMinimo.resultSet.length-1, graph.dimension()-1);
	}

}
