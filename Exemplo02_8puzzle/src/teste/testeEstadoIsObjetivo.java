package teste;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;

public class testeEstadoIsObjetivo {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/inst01.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		System.out.println(e.isObjetivo());
		
		dao = new Dao("instances/inst02.in");
		dao.getInstance();
		t = dao.getInstance();
		e = new Estado(t);
		System.out.println(e);
		
		System.out.println(e.isObjetivo());
	}

}
