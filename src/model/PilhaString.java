/**
 * 
 */
package model;

/**
 * @author Lucas Batista
 * 23 de mar. de 2024
 */
public class PilhaString {
	No1 topo;
	
	public boolean isEmpty() {
		if (topo != null){
			return true;
		} else {
			return false;
		}
	}
	
	public void push(String e){
		No1 elemento = new No1();
		elemento.dado = e;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public String pop() {
		if (isEmpty()) {
			System.err.println("Não há elementos para desempilhar");
		} 
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	
	}
	
	public String top() {
		if (isEmpty()) {
			System.err.println("Não há elementos na pilha");
		} 
		String valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (isEmpty()) {
			System.err.println("Pilha vazia");
		} else {
			No1 auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
}
