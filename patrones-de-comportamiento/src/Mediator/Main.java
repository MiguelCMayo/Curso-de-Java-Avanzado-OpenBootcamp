package Mediator;

public class Main {

    public static void main(String[] args) {

        // Crear el objeto centralizador de la comunicación
        Mediador mediador = new Mediador();
        // Crear los objetos que participarán en la comunicación
        Colega colega1 = new ColegaConcreto1( mediador );
        Colega colega2 = new ColegaConcreto2( mediador );
        Colega colega3 = new ColegaConcreto3( mediador );
        // Agregarlos al objeto centralizador
        mediador.agregarColega( colega1 );
        mediador.agregarColega( colega2 );
        mediador.agregarColega( colega3 );
        // Provocar un cambio en un uno de los elementos
        colega2.comunicar("ColegaConcreto2 ha cambiado!");
    }
}
