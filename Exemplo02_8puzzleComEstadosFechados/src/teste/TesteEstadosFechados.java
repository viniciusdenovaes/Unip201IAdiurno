package teste;

import dao.Dao;
import entity.Acao;
import entity.Estado;
import entity.Tabuleiro;
import estruturas.estados_fechados.EstadosFechados;

public class TesteEstadosFechados {
	
	public static void main(String[] args) {
		Dao dao = new Dao("instances/inst01_100.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		Estado e1 = e.deepCopy();
		e.fazAcao(Acao.BAIXO);
		e.fazAcao(Acao.CIMA);
		Estado e2 = e.deepCopy();
		System.out.println(e1);
		System.out.println(e2);
		
		EstadosFechados ef = new EstadosFechados();
		ef.add(e);
		System.out.println(ef.contains(e));
		System.out.println(ef.contains(e1));
		System.out.println(ef.contains(e2));
		
	}

}
