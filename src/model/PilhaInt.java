/**
 * 
 */
package model;

/**
 * @author Lucas Batista
 * 23 de mar. de 2024
 */
public class PilhaInt {
	No topo;
	
	public boolean isEmpty() {
		if (topo != null){
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int e){
		No elemento = new No();
		elemento.dado = e;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.err.println("Não há elementos para desempilhar");
		} 
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	
	}
	
	public int top() {
		if (isEmpty()) {
			System.err.println("Não há elementos na pilha");
		} 
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (isEmpty()) {
			System.err.println("Pilha vazia");
		} else {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
}
