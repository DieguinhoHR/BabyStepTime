package com.babysteptime.aula;

public class Avaliacao {
	public boolean inserirPrimeiraNota(int nota) {
		if (nota > 0 && nota <= 10)
			return true;
		return false;
	}

}
