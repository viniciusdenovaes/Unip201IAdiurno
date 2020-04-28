package entity;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	private Tabuleiro tabuleiro;
	private List<Acao> caminhoDeAcoes;
	private int nivel = 0;
	
	public Estado(Tabuleiro aTabuleiro) {
		this.tabuleiro = aTabuleiro;
		this.caminhoDeAcoes = new ArrayList<Acao>();
	}
	
	public int get(int i, int j) {
		return tabuleiro.get(i, j);
	}
	
	public List<Acao> getCaminhoDeAcoes() {
		return this.caminhoDeAcoes;
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public boolean isAcaoPossivel(Acao acao) {
		Coordenada c0 = tabuleiro.posicaoZero();
		int i0 = c0.i;
		int j0 = c0.j;
		if(acao==Acao.CIMA     && i0==0)             {return false;}
		if(acao==Acao.BAIXO    && i0==Tabuleiro.N-1) {return false;}
		if(acao==Acao.ESQUERDA && j0==0)             {return false;}
		if(acao==Acao.DIREITA  && j0==Tabuleiro.N-1) {return false;}
		
		return true;
	}
	
	public void fazAcao(Acao acao) {
		
		this.nivel++;
		
		this.caminhoDeAcoes.add(acao);
		
		Coordenada c0 = tabuleiro.posicaoZero();
		int i0 = c0.i;
		int j0 = c0.j;
		int i = -10;
		int j = -10;
		
		if(acao==Acao.CIMA)     { i = i0-1; j = j0;}
		if(acao==Acao.BAIXO)    { i = i0+1; j = j0;}
		if(acao==Acao.ESQUERDA) { i = i0;   j = j0-1;}
		if(acao==Acao.DIREITA)  { i = i0;   j = j0+1;}
		
		tabuleiro.set(i0, j0, tabuleiro.get(i, j)); 
		tabuleiro.set(i, j, 0);
	}
	
	public boolean isObjetivo() {
		
		if(tabuleiro.get(1, 1)!=0) return false;
		if(tabuleiro.get(0, 0)!=1) return false;
		if(tabuleiro.get(0, 1)!=2) return false;
		if(tabuleiro.get(0, 2)!=3) return false;
		if(tabuleiro.get(1, 2)!=4) return false;
		if(tabuleiro.get(2, 2)!=5) return false;
		if(tabuleiro.get(2, 1)!=6) return false;
		if(tabuleiro.get(2, 0)!=7) return false;
		if(tabuleiro.get(1, 0)!=8) return false;
		
		return true;
	}
	
	public List<Estado> geraFilhos(){
		
		List<Estado> filhos = new ArrayList<>();
		
		for(Acao acao: Acao.values()) {
			if(this.isAcaoPossivel(acao)) {
				Estado novoEstado = this.deepCopy();
				novoEstado.fazAcao(acao);
				filhos.add(novoEstado);
			}
		}
		return filhos;
	}
	
	public Estado deepCopy() {
		Tabuleiro novoTabuleiro = this.tabuleiro.deepCopy();
		Estado novoEstado = new Estado(novoTabuleiro);
		novoEstado.nivel = this.nivel;
		for(Acao acao: caminhoDeAcoes) {
			novoEstado.caminhoDeAcoes.add(acao);
		}
		return novoEstado;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tabuleiro == null) ? 0 : tabuleiro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (tabuleiro == null) {
			if (other.tabuleiro != null)
				return false;
		} else if (!tabuleiro.equals(other.tabuleiro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String res = "";
		
		res += "Estado (nivel " + nivel + "): \n";
		res += "Caminho de Acoes: [";
		for(Acao acao: caminhoDeAcoes) res += acao + ", ";
		res += "]\n";
		res += tabuleiro;
		
		return res;
	}


}
