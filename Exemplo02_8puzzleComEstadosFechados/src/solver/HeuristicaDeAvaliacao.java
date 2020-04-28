package solver;

import entity.Estado;

public class HeuristicaDeAvaliacao {
	
	public static int PecasForaDoLugar(Estado estado) {
		int pecas = 0;
		
		if(estado.get(0, 0)!=1) pecas++;
		if(estado.get(0, 1)!=2) pecas++;
		if(estado.get(0, 2)!=3) pecas++;
		if(estado.get(1, 2)!=4) pecas++;
		if(estado.get(2, 2)!=5) pecas++;
		if(estado.get(2, 1)!=6) pecas++;
		if(estado.get(2, 0)!=7) pecas++;
		if(estado.get(1, 0)!=8) pecas++;
		
		return pecas;
	}

}
