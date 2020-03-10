package teste;

import dao.Dao;
import entity.Tabuleiro;

public class TesteDAO {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		System.out.println(t);
	}
	

}
