package teste;

import java.util.Collection;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;
import entity.utils.GeraFilhosMachine;

public class TestaGeraFilhosMachine {
	
	public static void main(String[] args) {
		testaFilhos();
	}
	
	static void testaFilhos() {
		Dao dao = new Dao("instances/s10a.txt");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado estado = new Estado(t);
		System.out.println(estado);
		GeraFilhosMachine gfm = new GeraFilhosMachine(estado);
		Collection<Estado> filhos = gfm.geraFilhos();
		Estado outroEstado = null;
		for(Estado e : filhos) {
			outroEstado = e;
			System.out.println(e);
		}
		
		System.out.println("Outros filhos do ultimo filho");
		gfm = new GeraFilhosMachine(outroEstado);
		filhos = gfm.geraFilhos();
		for(Estado e : filhos) {
			System.out.println(e);
		}
		
		
	}

}
