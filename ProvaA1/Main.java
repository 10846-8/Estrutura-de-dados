package ProvaA1;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();
        
        lista.adicionaFim(10);
        lista.adicionaFim(30);
        lista.adicionaFim(20);
        System.out.println("Lista ordenada: "+lista.getLista()); // Resultado esperado: [10, 20, 30]
        
        lista.adicionaInicio(5);
        System.out.println("Adicionando 5 no ínicio: "+lista.getLista()); // Resultado esperado: [5, 10, 20, 30]
        
        lista.adicionaMeio(15, 4);
        System.out.println("Adicionando 15 na quarta posição: "+lista.getLista()); // Resultado esperado: [5, 10, 15, 20, 30]
        
        lista.removeFim();
        System.out.println("Removendo no final: "+lista.getLista()); // Resultado esperado: [5, 10, 15, 20]
        
        lista.removeInicio();
        System.out.println("Removendo no inicio: "+lista.getLista()); // Resultado esperado: [10, 15, 20]
        
        lista.removeMeio(1);
        System.out.println("Removendo no meio: "+lista.getLista()); // Resultado esperado: [10, 20]
        
        lista.adicionaFim(7);
        System.out.println("Adicionando 7 no final: "+lista.getLista()); // Resultado esperado: [7, 10, 20]
      
        lista.insertionSortDecrescente();
        System.out.println("Lista descrescente: "+lista.getLista()); // Resultado esperado: [20, 10, 7]
    }
}
