package entity.grafo.matriz;

import java.util.HashSet;
import java.util.Set;

import entity.grafo.Grafo;
import entity.grafo.Vertice;

public class GrafoMatriz extends Grafo{
	
	int size;
	double[][] matriz;
	
	public GrafoMatriz(int aSize) {
		super();
		this.size = aSize;
		matriz = new double[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				matriz[i][j] = -1.0;
			}
		}
	}
	
	@Override
	public Set<Vertice> adjacentes(Vertice v) {
		Set<Vertice> verticesAdjacentes = new HashSet<>();
		for(int id=0; id<size; id++) {
			if(matriz[v.getId()][id]>0) {
				verticesAdjacentes.add(getVerticeById(id));
			}
		}
		return verticesAdjacentes;
	}
	
	@Override
	public void addAresta(Vertice v1, Vertice v2, double valor) {
		matriz[v1.getId()][v2.getId()] = valor;
		matriz[v2.getId()][v1.getId()] = valor;
	}

	@Override
	public double getCustoAresta(Vertice v1, Vertice v2) {
		return matriz[v1.getId()][v2.getId()];
	}

	@Override
	public boolean haveAresta(Vertice v1, Vertice v2) {
		return matriz[v1.getId()][v2.getId()] > 0 ? true: false;
	}

}
