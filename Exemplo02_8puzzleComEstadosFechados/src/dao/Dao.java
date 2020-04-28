package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entity.Tabuleiro;

public class Dao {
	
	private String path;
	
	public Dao(String aPath) {
		this.path = aPath;
	}
	
	public Tabuleiro getInstance() {
		int N = Tabuleiro.N;
		int[][] elementos = new int[N][N];
		try {
			
			BufferedReader csvReader = 
					new BufferedReader(
							new FileReader(this.path));
			String row;
			for(int i=0; i<Tabuleiro.N; i++) {
				row = csvReader.readLine();
				String[] cells = row.split(" ");
				for(int j=0; j<Tabuleiro.N; j++) {
					int valor = Integer.parseInt(cells[j]);
					elementos[i][j] = valor;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return new Tabuleiro(elementos);
		
	}

}
