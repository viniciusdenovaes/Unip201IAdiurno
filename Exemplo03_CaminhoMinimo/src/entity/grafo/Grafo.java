package entity.grafo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

abstract public class Grafo {
	
	Map<Integer, Vertice> vertices;
	Map<String, Vertice> verticesNomes;
	
	public Grafo() {
		vertices = new TreeMap<>();
		verticesNomes = new TreeMap<>();
	}
	
	public void addVertice(Vertice v) {
		vertices.put(v.getId(), v);
		verticesNomes.put(v.getNome(), v);
	}
	
	public Vertice getVerticeByNome(String nome) {
		return verticesNomes.get(nome);
	}
	
	public Vertice getVerticeById(int id) {
		return vertices.get(id);
	}
	
	abstract public Set<Vertice> adjacentes(Vertice v);
	
	abstract public void addAresta(Vertice v1, Vertice v2, double valor);
	abstract public double getCustoAresta(Vertice v1, Vertice v2);
	abstract public boolean haveAresta(Vertice v1, Vertice v2);
	
	public int getSize() {
		return this.vertices.size();
	}

	@Override
	public String toString() {
		String res = "Grafo:\n";
		for(int id=0; id<vertices.size(); id++) {
			Vertice v = vertices.get(id);
			res += v + "\n";
			for(int j=0; j<vertices.size(); j++) {
				if(haveAresta(getVerticeById(id), getVerticeById(j))) {
					double valorAresta = getCustoAresta(getVerticeById(id), getVerticeById(j));
					res += "\t" + vertices.get(j).getNome() + ": " + valorAresta + "\n";
				}
			}
		}
		return res;
		
	}


	

}
