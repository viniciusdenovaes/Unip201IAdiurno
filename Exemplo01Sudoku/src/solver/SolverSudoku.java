package solver;

import java.util.Collection;
import java.util.List;

import entity.Estado;
import estruturas.EstadoAbertos;

public class SolverSudoku {
	
	private Estado estadoInicial;
	private Estado solucao;
	
	private int log;
	
	public SolverSudoku(Estado aEstadoInicial) {
		this.estadoInicial = aEstadoInicial;
		this.solucao = null;
		
	}
	
	public void solve(EstadoAbertos aEa) {
		
		EstadoAbertos ea = aEa;
		ea.push(estadoInicial);
		
		log = 0;
		
		while(ea.size()>0) {
			Estado estado = ea.pop();
			if(estado.isObjetivo()) {
				this.solucao = estado;
				return;
			}
			GeraFilhosMachine gfm = new GeraFilhosMachine(estado);
			Collection<Estado> filhos = gfm.geraFilhos();
			for(Estado filho: filhos) {
				log += 1;
				ea.push(filho);
			}
		}
	}
	
	public Estado getSolution() {
		return this.solucao;
	}
	
	public int getLog() {
		return this.log;
	}

}
