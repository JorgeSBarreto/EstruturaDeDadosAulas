package Aula3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] meuArray = new int[20];
		
		for(int i=0;i<meuArray.length;i++) {
			
			meuArray[i] = new Random().nextInt();
		}
		
		for(int i=0;i<meuArray.length;i++) {
			
			System.out.println(meuArray[i]);
		}
		
		/* 
		 Crie um array de tamanho 20, e popule ele com numeros aleatorios (ou sequenciais).
		 Exiba o tamanho do array;
		 O elemento na posição 14;
		 O ultimo elemento;
		 O primeiro elemento;
		 */
		
		
	}

}
