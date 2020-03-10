package entity.utils;

import java.util.ArrayList;
import java.util.Collection;

import entity.*;
import entity.Tabuleiro.Coordenada;

public class GeraFilhosMachine {
	
	Estado estadoPai;
	
	public GeraFilhosMachine(Estado aEstadoPai) {
		this.estadoPai = aEstadoPai;
	}
	
	public Collection<Estado> geraFilhos(){
		Collection<Estado> filhos = new ArrayList<>();
		
		Coordenada espaco = estadoPai.getProximoVazio();
		for(int numero = 1; numero <=9; numero++) {
			Estado filho = estadoPai.deepCopy();
			if(filho.isValidoEmCelulaValor(espaco.i, espaco.j, numero)) {
				filho.setCell(espaco.i, espaco.j, numero);
				filhos.add(filho);
			}
		}
		return filhos;
	}

}
