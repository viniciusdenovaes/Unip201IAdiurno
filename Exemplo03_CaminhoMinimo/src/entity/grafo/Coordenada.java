package entity.grafo;

public class Coordenada {
	
	int x, y;
	
	public Coordenada(int aX, int aY) {
		this.x = aX;
		this.y = aY;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
