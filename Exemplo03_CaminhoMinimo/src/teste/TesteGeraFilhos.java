package teste;

import java.util.List;

import dao.Dao;
import entity.grafo.Caminho;
import entity.grafo.Grafo;
import solver.Instance;
import solver.estrutura_estados.Estado;

public class TesteGeraFilhos {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao("instances/mapa.inst");
		Grafo g = dao.getInstance();
		Instance.initGrafo(g);
		Instance.setOrigem(g.getVerticeByNome("A"));
		Instance.setDestino(g.getVerticeByNome("B"));
		
		Caminho c = new Caminho(Instance.getOrigem());
		Estado estado = new Estado(c);
		
		List<Estado> filhos = estado.geraFilhos();
		
		Estado filhoAleatorio = null;
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		filhos = filhoAleatorio.geraFilhos();
		
		for(Estado f: filhos) {
			System.out.println(f);
			filhoAleatorio = f;
		}
		
		
		
		

		
	}

}
