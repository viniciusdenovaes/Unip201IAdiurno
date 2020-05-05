package teste;

import dao.Dao;
import entity.grafo.Grafo;

public class TesteDao {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao("instances/mapa.inst");
		Grafo g = dao.getInstance();
		
		System.out.println(g);
		
	}

}
