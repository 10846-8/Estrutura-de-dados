package ProvaA1;

import java.util.LinkedList;

public class ListaOrdenada{
    private LinkedList<Integer> lista;

    public ListaOrdenada() {
        lista = new LinkedList<Integer>();
    }

    public void adicionaInicio(int valor) {
        lista.addFirst(valor);
        insertionSort();
    }

    public void adicionaFim(int valor) {
        lista.addLast(valor);
        insertionSort();
    }

    public void adicionaMeio(int valor, int posicao) {
        lista.add(posicao, valor);
        insertionSort();
    }

    public void removeInicio() {
        lista.removeFirst();
    }

    public void removeFim() {
        lista.removeLast();
    }

    public void removeMeio(int posicao) {
        lista.remove(posicao);
    }

    public void insertionSort() {
        int tamanho = lista.size();
        for (int i = 1; i < tamanho; i++) {
            int aux = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j) > aux) {
                lista.set(j + 1, lista.get(j));
                j = j - 1;
            }
            lista.set(j + 1, aux);
        }
    }
    
    public void insertionSortDecrescente() {
    	int tamanho = lista.size();
    	for(int i = 1; i < tamanho; i++) {
    		int aux = lista.get(i);
    		int j = i -1;
    		
    		while (j >= 0 && lista.get(j) < aux) {
    			lista.set(j + 1, lista.get(j));
    			j--;
    		}
    		lista.set(j + 1, aux);
    	}
    }

    public LinkedList<Integer> getLista() {
        return lista;
    }
}
