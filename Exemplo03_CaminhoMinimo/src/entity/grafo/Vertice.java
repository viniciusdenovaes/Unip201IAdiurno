package entity.grafo;

public class Vertice {
	
	int id;
	Coordenada coord;
	String nome;
	
	public Vertice(int id, Coordenada coord, String nome) {
		this.id = id;
		this.coord = coord;
		this.nome = nome;
	}
	
	

	public int getId() {
		return id;
	}



	public Coordenada getCoord() {
		return coord;
	}



	public String getNome() {
		return nome;
	}



	@Override
	public String toString() {
		return "Vertice (" + id + "): " + nome + " " + coord;
	}
	
	
	

}
