package teste;

import dao.Dao;
import entity.grafo.Grafo;
import estruturas.estados_abertos.Fila;
import estruturas.estados_abertos.FilaDePrioridade;
import estruturas.estados_abertos.Pilha;
import solver.Instance;
import solver.Solver;

public class TesteSolver {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/mapa.inst");
		Grafo g = dao.getInstance();
		Instance.initGrafo(g);
		Instance.setOrigem(g.getVerticeByNome("A"));
		Instance.setDestino(g.getVerticeByNome("B"));
		
		Solver s = new Solver();
//		s.solve(new Pilha());
//		s.solve(new Fila());
		s.solve(new FilaDePrioridade());
		System.out.println(s.getSolution());
		System.out.println("Iteracoes: " + s.getIteracoes());
		
		
	}

}
