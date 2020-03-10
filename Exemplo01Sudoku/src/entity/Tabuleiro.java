package entity;

public class Tabuleiro {
	
	static public final int N = 9;
	private int[][] cells = new int[N][N];
	
	public Tabuleiro() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				this.cells[i][j] = 0;
			}
		}
	}
	
	public Tabuleiro(int[][] aCells) {
		this.cells = aCells;
	}
	
	public void setCell(int i, int j, int valor) {
		this.cells[i][j] = valor;
	}
	
	public int getCell(int i, int j) {
		return this.cells[i][j];
	}
	
	public Tabuleiro deepCopy() {
		Tabuleiro copy = new Tabuleiro();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				copy.cells[i][j] = this.cells[i][j];
			}
		}
		return copy;
	}
	
	@Override
	public String toString() {
		String res = "\n";
		for(int i=0; i<N; i++) {
//			if(i%3==0) {
//				for(int l=0; l<20; l++)
//					res+="-";
//				res+="\n";
//			}
			for(int j=0; j<N; j++) {
//				if(j%3==0) res+="|";
				res += this.cells[i][j] + " ";
			}
			res += "\n";
		}
		return res;
	}
	
	static public class Coordenada {
		public int i;
		public int j;
		public Coordenada(int aI, int aJ) {
			this.i = aI;
			this.j = aJ;
		}
	}

}
