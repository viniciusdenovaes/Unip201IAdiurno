package estruturas.estados_abertos;

import entity.Estado;

public interface EstadoAbertos {
	
	public void push(Estado estado);
	public Estado pop();
	public int size();

}
