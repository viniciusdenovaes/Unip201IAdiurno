package entity;

import java.util.Arrays;

public class Tabuleiro {
	
	public static final int N = 3;
	private int[][] elementos = new int[N][N];
	
	public Tabuleiro(int[][] aElementos) {
		this.elementos = aElementos;
	}
	
	public int get(int i, int j) {
		return elementos[i][j];
	}
	
	public void set(int i, int j, int valor) {
		elementos[i][j] = valor;
	}
	
	public Coordenada posicaoZero() {
		for(int i=0; i<elementos.length; i++) {
			for(int j=0; j<elementos[i].length; j++) {
				if(elementos[i][j]==0) {
					return new Coordenada(i, j);
				}
			}
		}
		return null;
	}
	
	public Tabuleiro deepCopy() {
		int[][] novoElementos = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				novoElementos[i][j] = this.elementos[i][j];
			}			
		}
		Tabuleiro novoTabuleiro = new Tabuleiro(novoElementos);
		return novoTabuleiro;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(elementos);
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
		Tabuleiro other = (Tabuleiro) obj;
		if (!Arrays.deepEquals(elementos, other.elementos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String res = "";
		
		res += "Tabuleiro: \n";
		for(int[] linha: elementos) {
			for(int elemento: linha) {
				res += elemento + " ";
			}
			res += "\n";
		}
		
		return res;
	}

}
