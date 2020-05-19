package solver.heuristicas_avaliacao;

import entity.grafo.Grafo;
import entity.grafo.Vertice;
import solver.Instance;
import solver.estrutura_estados.Estado;

public class HeuristicaDeAvaliacao {
	
	public static double h(Estado e) {
		Vertice ultimo = e.getCaminho().getFinal();
		Vertice destino = Instance.getDestino();
		double distancia = Grafo.distanciaEuclidiana(ultimo, destino);
		return distancia;
		//return 0;
	}
	
	
	public static double g(Estado e) {
		return e.getCaminho().getCusto();
	}
	
	public static double f(Estado e) {
		return g(e)+h(e);
	}

}
