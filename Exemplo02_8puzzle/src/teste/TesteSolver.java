package teste;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;
import estruturas.Fila;
import estruturas.FilaDePrioridade;
import estruturas.Pilha;
import solver.Solver;

public class TesteSolver {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/inst01_100.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		Solver solver = new Solver(e);
//		solver.solve(new Fila());
//		solver.solve(new Pilha());
		solver.solve(new FilaDePrioridade());
		Estado estadoObjetivo = solver.getEstadoObjetivo();
		
		System.out.println(estadoObjetivo);
		System.out.println("Solucao: " + solver.getSolution());
		System.out.println("Iteracoes: " + solver.getContagemIteracoes());

	}

}
