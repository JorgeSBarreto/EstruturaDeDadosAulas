package Aula5;

import java.util.LinkedList;
import java.util.Queue;

public class Aula5 {

	public static void main(String[] args) {
//		1 - No m�todo main de uma classe qualquer crie um objeto 
//		representando uma fila de n�meros inteiros. Fa�a 
//		tamb�m as seguintes opera��es: 
//		a) inserir os n�meros 10, 20, 30, 40, 50 
//		b) imprimir todos os n�meros da lista; 
//		c) inserir o n�mero 14; 
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(10);
		fila.add(20);
		fila.add(30);
		fila.add(40);
	    fila.add(50);
	    
	    System.out.println(fila);
		
	    fila.add(14);
	    
	    System.out.println(fila);
//	    
//	    2 - Crie uma estrutura de dados que permita inserir nomes de pessoas.
//	    A estrutura de ddos s� pode permitir que a primeira pessoa registrada seja 
//	    a primeira pessoa a ser atendida.
//	    Mostre a execu��o da inser��o, remo��o e a cada opera��o de remo��o ou inser��o 
//	    exiba a estrutura de dados e seu tamanho atual.
	    
	    Queue<String> filaS = new LinkedList<>();
		
		filaS.add("Joao");
		System.out.println(filaS);
		System.out.println(filaS.size());
		filaS.add("Andr�");
		System.out.println(filaS);
		System.out.println(filaS.size());
		filaS.add("Rosemberg");
		System.out.println(filaS);
		System.out.println(filaS.size());
		filaS.add("Kalina");
		System.out.println(filaS);
		System.out.println(filaS.size());
		filaS.add("Filipe");
		System.out.println(filaS);
		System.out.println(filaS.size());
	    filaS.poll();
	    System.out.println(filaS);
	    System.out.println(filaS.size());
	    filaS.add("Gustavo");
	    System.out.println(filaS);
	    System.out.println(filaS.size());
	    filaS.poll();
	    System.out.println(filaS);
	    System.out.println(filaS.size());
	    
//	    3 - Uma oficina mecanica precisa organizar a lista de tarefas de conserto dos carros.
//	    Utilie uma estrutura ed dados para armazenar os carros que ser�o consertados, obedecendo
//	    a ordem de chegada dos veiculos.
//	    Mostre a execu��o da inser��o, remo��o e a cada opera��o de remo��o ou inser��o 
//	    exiba a lista dos carros e seu tamanho atual. 
	    
 Queue<String> filaC = new LinkedList<>();
		
		filaC.add("Celta");
		System.out.println(filaC);
		System.out.println(filaC.size());
		filaC.add("Fusca");
		System.out.println(filaC);
		System.out.println(filaC.size());
		filaC.add("Brasilia");
		System.out.println(filaC);
		System.out.println(filaC.size());
		filaC.add("Kadet");
		System.out.println(filaC);
		System.out.println(filaC.size());
		filaC.add("Voyage");
		System.out.println(filaC);
		System.out.println(filaC.size());
	    filaC.poll();
	    System.out.println(filaC);
	    System.out.println(filaC.size());
	    filaC.add("D20");
	    System.out.println(filaC);
	    System.out.println(filaC.size());
	    filaC.poll();
	    System.out.println(filaC);
	    System.out.println(filaC.size());
	    
	    
	    
	}

}
