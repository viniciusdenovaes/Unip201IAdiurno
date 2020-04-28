package teste;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;
import estruturas.Fila;
import estruturas.Pilha;
import solver.SolverSudoku;

public class TesteSolverSudoku {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao("instances/s12a.txt");
		dao.getInstance();
		Tabuleiro tabuleiro = dao.getInstance();
		Estado estadoInicial = new Estado(tabuleiro);
		System.out.println("Estado inicial: ");
		System.out.println(estadoInicial);
		
		SolverSudoku ss = new SolverSudoku(estadoInicial);
		
		// Busca em largura 
		ss.solve(new Fila());
		Estado solucaoLargura = ss.getSolution();
		int logBuscaEmLargura = ss.getLog();
		
		// Busca em profundidade 
		ss.solve(new Pilha());
		Estado solucaoProfundidade = ss.getSolution();
		int logBuscaEmProfundidade = ss.getLog();
		
		System.out.println("Solucao em Largura: ");
		System.out.println(solucaoLargura);
		
		System.out.println("Solucao em Profundidade: ");
		System.out.println(solucaoProfundidade);
		
		System.out.println("Numero de estados em Largura: " + logBuscaEmLargura);
		System.out.println("Numero de estados em Profundidade: " + logBuscaEmProfundidade);
		
	}

}
