package entity.grafo;

import java.util.Map;
import java.util.TreeMap;

public class GrafoMatriz extends Grafo{
	
	Map<Integer, Vertice> vertices;
	int size;
	double[][] matriz;
	
	public GrafoMatriz(int aSize) {
		this.size = aSize;
		matriz = new double[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				matriz[i][j] = -1.0;
			}
		}
		vertices = new TreeMap<>();
	}
	
	public void addVertice(Vertice v) {
		vertices.put(v.getId(), v);
	}
	
	public void addAresta(Vertice v1, Vertice v2, double valor) {
		matriz[v1.getId()][v2.getId()] = valor;
		matriz[v2.getId()][v1.getId()] = valor;
	}
	
	@Override
	public String toString() {
		String res = "Grafo:\n";
		for(int id=0; id<vertices.size(); id++) {
			Vertice v = vertices.get(id);
			res += v + "\n";
			for(int j=0; j<vertices.size(); j++) {
				if(matriz[id][j]>0) {
					res += "\t" + vertices.get(j).getNome() + ": " + matriz[id][j] + "\n";
				}
			}
		}
		return res;
		
	}

}
