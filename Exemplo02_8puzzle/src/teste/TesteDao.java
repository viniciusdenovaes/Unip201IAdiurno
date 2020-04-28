package teste;

import dao.Dao;
import entity.Tabuleiro;

public class TesteDao {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/inst01.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		System.out.println(t);
	}

}
