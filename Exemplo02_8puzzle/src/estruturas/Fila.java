package estruturas;

import java.util.LinkedList;
import java.util.Queue;

import entity.Estado;

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
