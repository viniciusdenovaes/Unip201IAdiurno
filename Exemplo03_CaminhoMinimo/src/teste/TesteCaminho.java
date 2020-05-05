package teste;

import dao.Dao;
import entity.grafo.Caminho;
import entity.grafo.Grafo;
import solver.Instance;

public class TesteCaminho {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao("instances/mapa.inst");
		Grafo g = dao.getInstance();
		Instance.initGrafo(g);
		
		Caminho c = new Caminho(g.getVerticeByNome("A"));
		System.out.println(c);
		c.addVertice(g.getVerticeByNome("S"));
		c.addVertice(g.getVerticeByNome("F"));
		System.out.println(c);
		
		
	}

}
