package teste;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;
import solver.HeuristicaDeAvaliacao;

public class TestePecasForaDoLugar {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao("instances/inst02.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		System.out.println(HeuristicaDeAvaliacao.PecasForaDoLugar(e));
		
		
	}

}
