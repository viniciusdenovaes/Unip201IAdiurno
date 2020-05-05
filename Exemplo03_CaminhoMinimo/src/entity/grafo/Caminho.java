package entity.grafo;

import java.util.ArrayList;
import java.util.List;

import solver.Instance;

public class Caminho {
	
	List<Vertice> vertices;
	double custo = 0;
	
	public Caminho(Vertice inicial) {
		vertices = new ArrayList<>();
		vertices.add(inicial);
		custo = 0;
	}
	
	public void addVertice(Vertice v) {
		
		Vertice ultimoVertice = getFinal();
		double custoNovaAresta = Instance.grafo.getCustoAresta(ultimoVertice, v);
		custo += custoNovaAresta;
		
		vertices.add(v);
	}
	
	public Vertice getInicial() {
		return vertices.get(0);
	}
	
	public Vertice getFinal() {
		return vertices.get(vertices.size()-1);
	}
	
	public boolean contains(Vertice v) {
		return vertices.contains(v);
	}
	
	public double getCusto() {
		return this.custo;
	}
	
	public Caminho deepCopy() {
		Caminho novo = new Caminho(this.getInicial());
		for(int i=1; i< vertices.size(); i++) {
			novo.addVertice(vertices.get(i));
		}
		return novo;
	}

	@Override
	public String toString() {
		String res = "Caminho(" + getCusto() + ") [";
		for(Vertice v: vertices) {
			res += v.getNome() + ", ";
		}
		res += "]";
		
		return res;
	}
	
	
	
	
	

}
