package entity.grafo.lista;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import entity.grafo.Grafo;
import entity.grafo.Vertice;

public class GrafoLista extends Grafo {
	
	Map<Integer, Map<Integer, Double>> arestas;

	public GrafoLista() {
		super();
		this.arestas = new TreeMap<>();
	}
	
	@Override
	public void addVertice(Vertice v) {
		super.addVertice(v);
		arestas.put(v.getId(), new TreeMap<>());
	}
	

	@Override
	public void addAresta(Vertice v1, Vertice v2, double valor) {
		addArestaDirecionada(v1, v2, valor);
		addArestaDirecionada(v2, v1, valor);
	}

	private void addArestaDirecionada(Vertice v1, Vertice v2, double valor) {
		Map<Integer, Double> adjacencia = arestas.get(v1.getId());
		adjacencia.put(v2.getId(), valor);
		
	}
	
	@Override
	public Set<Vertice> adjacentes(Vertice v) {
		Set<Vertice> verticesAdjacentes = new HashSet<>();
		Map<Integer, Double> adjacencia = arestas.get(v.getId());
		for(int id: adjacencia.keySet()) {
			verticesAdjacentes.add(getVerticeById(id));
		}
		return verticesAdjacentes;
	}
	


	@Override
	public double getCustoAresta(Vertice v1, Vertice v2) {
		Map<Integer, Double> adjacentes = arestas.get(v1.getId());
		double valor = adjacentes.getOrDefault(v2.getId(), -1.0);
		return valor;
	}

	@Override
	public boolean haveAresta(Vertice v1, Vertice v2) {
		Map<Integer, Double> adjacentes = arestas.get(v1.getId());
		return adjacentes.containsKey(v2.getId());
	}


}
