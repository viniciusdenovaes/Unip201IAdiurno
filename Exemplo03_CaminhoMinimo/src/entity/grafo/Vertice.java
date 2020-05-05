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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Vertice other = (Vertice) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vertice (" + id + "): " + nome + " " + coord;
	}
	
	
	

}
