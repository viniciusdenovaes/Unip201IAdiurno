package solver;

import entity.grafo.Grafo;
import entity.grafo.Vertice;

public class Instance {
	
	public static Grafo grafo = null;
	private static Vertice origem;
	private static Vertice destino;
	
	public static void initGrafo(Grafo aGrafo) {
		Instance.grafo = aGrafo;
	}
	
	public static void setOrigem(Vertice origem) {
		Instance.origem = origem;
	}
	public static Vertice getOrigem() {
		return Instance.origem;
	}
	public static void setDestino(Vertice destino) {
		Instance.destino = destino;
	}
	public static Vertice getDestino() {
		return Instance.destino;
	}

}





