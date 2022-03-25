package Aula6;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;
public class Aula6 {
	public static void main(String[] args) {
		//Fila se comportando como pilha
        Queue<Integer> minhaFila = new LinkedList();
		Random ale = new Random();
		for(int i=0;i<10;i++) {
			int n = ale.nextInt(40);
			minhaFila.add(n);
		}
		System.out.println(minhaFila);
		Queue<Integer> aux =new LinkedList();
		int tam = minhaFila.size()-1;
		for (int j=0;j<tam;j++) {
			int n = minhaFila.poll();
			aux.add(n);
		}
		
		minhaFila.poll();
		minhaFila = aux;
		System.out.println(minhaFila);
	
	}

}
