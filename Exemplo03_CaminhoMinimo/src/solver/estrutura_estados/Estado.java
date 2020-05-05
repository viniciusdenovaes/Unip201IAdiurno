package solver.estrutura_estados;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entity.grafo.Caminho;
import entity.grafo.Vertice;
import solver.Instance;

public class Estado {
	
	Caminho caminho;

	public Estado(Caminho caminho) {
		this.caminho = caminho;
	}

	public Caminho getCaminho() {
		return caminho;
	}
	
	public void addVertice(Vertice v) {
		this.caminho.addVertice(v);
	}
	
	public boolean isObjetivo() {
		return 
				this.caminho.getInicial().equals(Instance.getOrigem()) &&
				this.caminho.getFinal().  equals(Instance.getDestino());
	}
	
	public List<Estado> geraFilhos(){
		List<Estado> filhos = new ArrayList<>();
		
		Vertice ultimoVertice = caminho.getFinal();
		Set<Vertice> verticesAdjacentes = Instance.grafo.adjacentes(ultimoVertice);
		for(Vertice v: verticesAdjacentes) {
			if(!caminho.contains(v)) {
				Estado filho = deepCopy();
				filho.addVertice(v);
				filhos.add(filho);
			}
		}
		
		return filhos;
	}
	
	public Estado deepCopy() {
		Caminho novoCaminho = this.caminho.deepCopy();
		Estado novo = new Estado(novoCaminho);
		return novo;
	}

	@Override
	public String toString() {
		return "Estado: " + caminho;
	}
	
	

}
