package teste;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;

public class TesteEstado {
	
	public static void main(String[] args) {
		testaValidoEmCelulaValor();
	}
	
	static void testaValidoEmCelulaValor() {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		System.out.println("em 0 0 valor 5: " + 
				e.isValidoEmCelulaValor(0, 0, 5));
		System.out.println("em 0 0 valor 8: " + 
				e.isValidoEmCelulaValor(0, 0, 8));
		System.out.println("em 0 0 valor 1: " + 
				e.isValidoEmCelulaValor(0, 0, 1));
		System.out.println("em 0 0 valor 3: " + 
				e.isValidoEmCelulaValor(0, 0, 3));
		
	}
	
	static void testaCopiaEstado() {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		Estado e1 = e.deepCopy();
		e1.setCell(0, 0, 9);
		
		Estado e2 = e.deepCopy();
		e2.setCell(1, 2, 7);
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		
	}
	
	static void testaValidoQuadrante() {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		
		System.out.println(e);
		System.out.println(e.isValidoQuadranteDaCelula(8, 4));

		e.setCell(8, 4, 2);
		System.out.println(e);
		System.out.println(e.isValidoQuadranteDaCelula(8, 4));

	}

	static void testaValidoColuna() {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		
		System.out.println(e);
		System.out.println(e.isValidoColuna(0));

		e.setCell(0, 0, 8);
		System.out.println(e);
		System.out.println(e.isValidoColuna(0));

	}

	static void testaValidoLinha() {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		
		System.out.println(e);
		System.out.println(e.isValidoLinha(0));

		e.setCell(0, 0, 5);
		System.out.println(e);
		System.out.println(e.isValidoLinha(0));

	}

}
