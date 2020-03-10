package entity;

import java.util.Set;
import java.util.TreeSet;

import entity.Tabuleiro.Coordenada;

public class Estado {
	
	Tabuleiro tabuleiro;
	
	public Estado(Tabuleiro aTabuleiro) {
		this.tabuleiro = aTabuleiro;
	}
	
	public void setCell(int i, int j, int valor) {
		tabuleiro.setCell(i, j, valor);
	}
	
	public boolean isObjetivo() {
		for(int i=0; i<Tabuleiro.N; i++) {
			for(int j=0; j<Tabuleiro.N; j++) {
				if(tabuleiro.getCell(i, j)==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Coordenada getProximoVazio() {
		for(int i=0; i<Tabuleiro.N; i++) {
			for(int j=0; j<Tabuleiro.N; j++) {
				if(tabuleiro.getCell(i, j)==0) {
					return new Coordenada(i, j);
				}
			}
		}
		return null;
	}
	
	public boolean isValidoEmCelulaValor(int i, int j, int valor) {
		Estado copy = this.deepCopy();
		copy.setCell(i, j, valor);
		if(!copy.isValidoLinha(i)) return false;
		if(!copy.isValidoColuna(j)) return false;
		if(!copy.isValidoQuadranteDaCelula(i, j)) return false;
		
		return true;
		
	}
	
	public boolean isValidoLinha(int i) {
		Set<Integer> incluidos = new TreeSet<>();
		for(int j=0; j<Tabuleiro.N; j++) {
			int valor = this.tabuleiro.getCell(i, j);
			if(valor!=0) {
				if(incluidos.contains(valor))
					return false;
				incluidos.add(valor);
			}
		}
		return true;
	}
	
	public boolean isValidoColuna(int j) {
		Set<Integer> incluidos = new TreeSet<>();
		for(int i=0; i<Tabuleiro.N; i++) {
			int valor = this.tabuleiro.getCell(i, j);
			if(valor!=0) {
				if(incluidos.contains(valor))
					return false;
				incluidos.add(valor);
			}
		}
		return true;
	}
	
	public boolean isValidoQuadranteDaCelula(int r, int c) {
		int k = r/3;
		int l = c/3;
		Set<Integer> incluidos = new TreeSet<>();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				int valor = this.tabuleiro.getCell(3*k+i, 3*l+j);
				if(valor!=0) {
					if(incluidos.contains(valor))
						return false;
					incluidos.add(valor);
				}
			}
		}
		return true;
	}
	
	public Estado deepCopy() {
		Tabuleiro copyTabuleiro = this.tabuleiro.deepCopy();
		Estado copy = new Estado(copyTabuleiro);
		return copy;
	}
	
	@Override
	public String toString() {
		String res = "Estado: \n";
		res += this.tabuleiro;
		return res;
	}

}
