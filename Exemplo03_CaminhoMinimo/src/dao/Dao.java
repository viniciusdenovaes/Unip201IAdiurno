package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entity.grafo.Coordenada;
import entity.grafo.Grafo;
import entity.grafo.Vertice;
import entity.grafo.lista.GrafoLista;
import entity.grafo.matriz.GrafoMatriz;

public class Dao {
	
	private String path;
	
	public Dao(String aPath) {
		this.path = aPath;
	}
	
	public Grafo getInstance() {
		Grafo g = null;
		try {
			BufferedReader reader = 
					new BufferedReader(
							new FileReader(this.path));
			int sizeVertices = Integer.parseInt(reader.readLine());
			g = new GrafoLista();
			for(int i=0; i<sizeVertices; i++) {
				String linha = reader.readLine();
				String[] palavras = linha.split(" ");
				int id = i;
				String nome = palavras[0];
				double x = Double.parseDouble(palavras[1]);
				double y = Double.parseDouble(palavras[2]);
				Coordenada coord = new Coordenada(x, y);
				Vertice v = new Vertice(id, coord, nome);
				g.addVertice(v);
			}
			int sizeArestas = Integer.parseInt(reader.readLine());
			for(int i=0; i<sizeArestas; i++) {
				String linha = reader.readLine();
				String[] palavras = linha.split(" ");
				Vertice v1 = g.getVerticeByNome(palavras[0]);
				Vertice v2 = g.getVerticeByNome(palavras[1]);
				double valor = Double.parseDouble(palavras[2]); 
				g.addAresta(v1, v2, valor);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return g;
		
	}

}
