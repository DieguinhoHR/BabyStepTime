package com.babysteptime.aula;

import java.util.ArrayList;
public class Avaliacao {
	public ArrayList<Integer> Notas = new ArrayList<Integer>(tamanhoDoVetor);
	private static int tamanhoDoVetor = 3;
	
	private int Media = 0;
	
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
		
		Media = 0;
		
		for (Integer integer : Notas) 
			Media += integer;
		
		Media = Media / Notas.size(); 
		
		return Media;
	}

	public String obterStatus() {
		
		if(Media >= 7)
			return "Aprovado";
		
		return "";
	}
}
