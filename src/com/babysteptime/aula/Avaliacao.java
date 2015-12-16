package com.babysteptime.aula;

import java.util.ArrayList;
public class Avaliacao {
	public ArrayList<Integer> Notas = new ArrayList<Integer>();
	
	public boolean inserirNota(int nota) {
		if(nota < 0)
			return false;
		
		if(nota > 10)
			return false;		
		
		Notas.add(nota);
		
		return true;
	}
}
