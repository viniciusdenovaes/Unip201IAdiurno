package teste;

import dao.Dao;
import entity.Acao;
import entity.Estado;
import entity.Tabuleiro;

public class TesteAcao {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao("instances/inst01.in");
		dao.getInstance();
		Tabuleiro t = dao.getInstance();
		Estado e = new Estado(t);
		System.out.println(e);
		
		e.fazAcao(Acao.BAIXO);
		System.out.println(e);
		
		e.fazAcao(Acao.ESQUERDA);
		System.out.println(e);
		System.out.println(e.isAcaoPossivel(Acao.BAIXO));
		System.out.println(e.isAcaoPossivel(Acao.CIMA));
		System.out.println(e.isAcaoPossivel(Acao.ESQUERDA));
		System.out.println(e.isAcaoPossivel(Acao.DIREITA));
		
		e.fazAcao(Acao.DIREITA);
		e.fazAcao(Acao.DIREITA);
		System.out.println(e);
		System.out.println(e.isAcaoPossivel(Acao.BAIXO));
		System.out.println(e.isAcaoPossivel(Acao.CIMA));
		System.out.println(e.isAcaoPossivel(Acao.ESQUERDA));
		System.out.println(e.isAcaoPossivel(Acao.DIREITA));
		
		e.fazAcao(Acao.CIMA);
		System.out.println(e);
		
	}

}
