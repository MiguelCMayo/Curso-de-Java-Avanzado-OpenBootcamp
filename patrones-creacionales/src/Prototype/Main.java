package Prototype;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona(74999999,35);
        Persona p2 = p1.clone();

        // hemos clonado en el objeto p2 los datos de la Persona p1 , por tanto p2
        // tiene como dni 74999999 y una edad de 35
        // a continuación vamos a cambiar el dni de p1

        p1.dni = 25454345;

        System.out.println("Datos Persona p1: DNI:" + p1.dni + " Edad:" + p1.edad);
        System.out.println("Datos Persona p2 clon: DNI:" + p2.dni + " Edad:" + p2.edad);

    }
}
