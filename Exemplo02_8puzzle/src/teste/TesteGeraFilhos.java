package teste;

import java.util.*;

import dao.Dao;
import entity.Estado;
import entity.Tabuleiro;

public class TesteGeraFilhos {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/inst01.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		List<Estado> filhos = e.geraFilhos();
		
		Estado umFilho = null;
		for(Estado f: filhos) {
			System.out.println(f);
			umFilho = f;
		}
		
		filhos = umFilho.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
		}
		
		

	}

}
