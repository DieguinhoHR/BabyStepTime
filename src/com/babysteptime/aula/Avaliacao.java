package com.babysteptime.aula;

import java.util.ArrayList;
public class Avaliacao {
	public ArrayList<Integer> Notas = new ArrayList<Integer>(3);
	private static int tamanhoDoVetor = 3;
	
	public boolean inserirNota(int nota) {
		if(Notas.size() >= tamanhoDoVetor)
			return false;
		
		if(nota < 0)
			return false;
		
		if(nota > 10)
			return false;		
		
		Notas.add(nota);
		return true;
	}

	public int calcularMedia() {	
		int somaNotas = 0;
		
		for (Integer integer : Notas) 
			somaNotas += integer;
		
		return somaNotas / Notas.size();
	}
}
