package solver;

import java.util.List;

import entity.Acao;
import entity.Estado;
import estruturas.EstadoAbertos;

public class Solver {
	
	private Estado estadoInicial;
	private Estado estadoObjetivo;
	
	private int contagemIteracoes = 0;
	
	public Solver(Estado aEstadoInicial) {
		this.estadoInicial = aEstadoInicial;
	}
	
	public void solve(EstadoAbertos ea) {
		this.contagemIteracoes = 0;
		
		ea.push(estadoInicial);
		
		while(ea.size()>0) {
			Estado estado = ea.pop();
			this.contagemIteracoes++;
			System.out.println("Iteracoes: " + this.contagemIteracoes);
			System.out.println("Nota do estado: " + HeuristicaDeAvaliacao.PecasForaDoLugar(estado));
			System.out.println("Em solver, testando estado: " + estado);
			if(estado.isObjetivo()) {
				this.estadoObjetivo = estado;
				return;
			}
			List<Estado> filhos = estado.geraFilhos();
			for(Estado e: filhos) {
				ea.push(e);
			}
		}
		
	}
	
	public Estado getEstadoObjetivo() {
		return this.estadoObjetivo;
	}
	
	public List<Acao> getSolution() {
		return this.estadoObjetivo.getCaminhoDeAcoes();
	}
	
	public int getContagemIteracoes() {
		return this.contagemIteracoes;
	}

}
