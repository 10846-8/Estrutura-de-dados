package ProvaA1;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();
        
        //Adicionando números
        lista.adicionaNoFim(10);
        lista.adicionaNoFim(30);
        lista.adicionaNoFim(20);
        System.out.println(lista.getLista()); // [10, 20, 30]
        
        lista.adicionaNoInicio(5);
        System.out.println(lista.getLista()); // [5, 10, 20, 30]
        
        lista.adicionaNoMeio(15, 4);
        System.out.println(lista.getLista()); // [5, 10, 15, 20, 30]
        
        lista.removeNoFim();
        System.out.println(lista.getLista()); // [5, 10, 15, 20]
        
        lista.removeNoInicio();
        System.out.println(lista.getLista()); // [10, 15, 20]
        
        lista.removeNoMeio(1);
        System.out.println(lista.getLista()); // [10, 20]
        
        lista.adicionaNoFim(7);
        System.out.println(lista.getLista()); // [5, 10, 20]
    }
}
