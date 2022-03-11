package Aula4_1;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> fila = new ArrayList();
		
		fila.add(12);
		fila.add(8);
		fila.add(3);
		fila.add(10);
		fila.add(0);
		fila.add(15);
		fila.add(18);

		System.out.println(fila);
		
		fila.remove(0);
		System.out.println(fila);
		

	}

}
