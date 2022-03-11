package Aula4;


public class aula4 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.tamanho(10);
		fila.imprimir();
		fila.enfileirar(8);
		fila.enfileirar(1);
		fila.enfileirar(3);
		fila.enfileirar(5);
		fila.enfileirar(7);
		fila.imprimir();
		fila.desenfileirar();
		fila.imprimir();

	}

}
