package estruturas.estados_fechados;

import java.util.HashSet;
import java.util.Set;

import entity.Estado;

public class EstadosFechados {
	//log(n): n = 1000, log(n) = 10, n = 1000000, log(n) = 100
	Set<Estado> fechados = new HashSet<Estado>();
	
	public void add(Estado estado) {
		fechados.add(estado);
	}
	
	public boolean contains(Estado estado) {
		return fechados.contains(estado);
	} 

}
