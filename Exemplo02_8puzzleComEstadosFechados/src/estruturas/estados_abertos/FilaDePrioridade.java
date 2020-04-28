package estruturas.estados_abertos;

import java.util.Comparator;
import java.util.PriorityQueue;

import entity.Estado;
import solver.HeuristicaDeAvaliacao;

public class FilaDePrioridade implements EstadoAbertos{
	
	PriorityQueue<Estado> fila = new PriorityQueue<>(
			new Comparator<Estado>() {
				@Override
				public int compare(Estado e1, Estado e2) {
					int nota01 = HeuristicaDeAvaliacao.PecasForaDoLugar(e1) + e1.getNivel();
					int nota02 = HeuristicaDeAvaliacao.PecasForaDoLugar(e2) + e2.getNivel();
					return Integer.compare(nota01, nota02);
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
