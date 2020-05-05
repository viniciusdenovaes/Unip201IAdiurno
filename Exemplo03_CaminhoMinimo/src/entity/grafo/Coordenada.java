package entity.grafo;

public class Coordenada {
	
	double x, y;
	
	public Coordenada(double aX, double aY) {
		this.x = aX;
		this.y = aY;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
