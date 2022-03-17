package Aula5;

import java.util.LinkedList;
import java.util.Queue;

public class Aula5 {

	public static void main(String[] args) {
//		1 - No método main de uma classe qualquer crie um objeto 
//		representando uma fila de números inteiros. Faça 
//		também as seguintes operações: 
//		a) inserir os números 10, 20, 30, 40, 50 
//		b) imprimir todos os números da lista; 
//		c) inserir o número 14; 
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
//	    A estrutura de ddos só pode permitir que a primeira pessoa registrada seja 
//	    a primeira pessoa a ser atendida.
//	    Mostre a execução da inserção, remoção e a cada operação de remoção ou inserção 
//	    exiba a estrutura de dados e seu tamanho atual.
	    
	    Queue<String> filaS = new LinkedList<>();
		
		filaS.add("Joao");
		System.out.println(filaS);
		System.out.println(filaS.size());
		filaS.add("André");
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
//	    Utilie uma estrutura ed dados para armazenar os carros que serão consertados, obedecendo
//	    a ordem de chegada dos veiculos.
//	    Mostre a execução da inserção, remoção e a cada operação de remoção ou inserção 
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
