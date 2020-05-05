package estruturas.estados_abertos;

import java.util.LinkedList;
import java.util.Queue;

import solver.estrutura_estados.Estado;

public class Fila implements EstadoAbertos{
	
	Queue<Estado> elementos = new LinkedList<>();

	@Override
	public void push(Estado estado) {
		elementos.add(estado);
	}

	@Override
	public Estado pop() {
		return elementos.poll();
	}

	@Override
	public int size() {
		return elementos.size();
	}

}
