package solver;

import java.util.List;

import entity.grafo.Caminho;
import estruturas.estados_abertos.EstadoAbertos;
import solver.estrutura_estados.Estado;

public class Solver {
	
	Estado inicial;
	Estado solucao;
	
	public Solver() {
		inicial = new Estado(new Caminho(Instance.getOrigem()));
	}
	
	public void solve(EstadoAbertos ea) {
		ea.push(inicial);
		while(ea.size()>0) {
			Estado estado = ea.pop();
			if(estado.isObjetivo()) {
				solucao = estado;
				return;
			}
			List<Estado> filhos = estado.geraFilhos();
			for(Estado filho: filhos) {
				ea.push(filho);
			}
		}
		
	}
	
	public Estado getSolution() {
		return solucao;
	}
	

}
