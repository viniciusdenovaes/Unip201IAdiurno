package estruturas.estados_abertos;

import solver.estrutura_estados.Estado;

public interface EstadoAbertos {
	
	public void push(Estado estado);
	public Estado pop();
	public int size();

}
