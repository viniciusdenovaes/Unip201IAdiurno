package estruturas.estados_abertos;

import java.util.Comparator;
import java.util.PriorityQueue;

import solver.estrutura_estados.Estado;
import solver.heuristicas_avaliacao.HeuristicaDeAvaliacao;

public class FilaDePrioridade implements EstadoAbertos{
	
	PriorityQueue<Estado> fila = new PriorityQueue<>(
			new Comparator<Estado>() {
				@Override
				public int compare(Estado e1, Estado e2) {
					double nota01 = HeuristicaDeAvaliacao.f(e1);
					double nota02 = HeuristicaDeAvaliacao.f(e2);
					return Double.compare(nota01, nota02);
				}
			});

	@Override
	public void push(Estado estado) {
		fila.add(estado);
	}

	@Override
	public Estado pop() {
		return fila.poll();
	}

	@Override
	public int size() {
		return fila.size();
	}

}
