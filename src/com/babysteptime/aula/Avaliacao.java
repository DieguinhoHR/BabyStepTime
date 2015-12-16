package com.babysteptime.aula;

public class Avaliacao {
	public boolean inserirPrimeiraNota(int nota) {
		if(nota < 0)
			return false;
		
		if(nota > 10)
			return false;		
		
		return true;
	}
}
