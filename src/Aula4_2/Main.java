package Aula4_2;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Joao");
		fila.add("André");
		fila.add("Rosemberg");
		fila.add("Kalina");
	    fila.add("Filipe");
	    fila.add("Gustavo");
		System.out.println(fila);
		String objetoRemovido = fila.poll();
		System.out.println(objetoRemovido);
	    System.out.println(fila.size());
	    fila.poll();
	    System.out.println(fila.size());
	    fila.add("Ryan");
	    System.out.println(fila);
	    System.out.println(fila.size());
	    
	    
		
		
		
	}

}
