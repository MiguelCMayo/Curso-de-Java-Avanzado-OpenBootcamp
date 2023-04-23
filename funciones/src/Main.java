import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // CASO 1
        boolean mayor = esMayor(4,2);
        //Quedaria en una linea asi:
        boolean esmayor2 = 4 > 2 ? true : false;


        //CASO 2
        System.out.println(esLaborable(7));
        System.out.println(esLaborable2(2));

        //CASO 4
        System.out.println(sumarInfinitamente(2,5,8,6,4,32,2,9));







    }
    //CASO 1
    private static boolean esMayor(int a, int b) {
        if(a > b){
            return true;
        }
        return false;
    }


    //CASO 2


    public static boolean esLaborable(int dia) {
        switch (dia) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
            case 7:
                return false;
            default:
                return false;
        }

    }
    //QUEDARIA ASI:
    public static boolean esLaborable2(int dia1){
        return (dia1 > 0 && dia1 < 6);
    }


    //CASO 3: FUNCION MODANICA (SOLO UN PARAMETRO)
    public static int sumarNumeros(int []numeros){
        int resultado = 0;

        for(int numero: numeros){
            resultado += numero;
        }
        return resultado;
    }
    //QUEDARIA ASI
    public static int sumarNumeros2(int []numeros) {
        return Arrays.stream(numeros).reduce(0, (a, b) -> a + b);
    }


    //CASO 4:
    public static int sumarInfinitamente(int ...numeros) {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

}