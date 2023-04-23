package Builder;

public class Main {
    public static void main(String[] args) {

        Vehiculo builder = new VehiculoBuilder()
                .withMarca("Audi")
                .withMotor("Diesel")
                .withTipo("A5")
                .withPuertas(4)
                .build();

        System.out.println("Marca: " + builder.getMarca());
        System.out.println("Motor: " + builder.getMotor());
        System.out.println("Tipo: " + builder.getTipo());
        System.out.println("Puertas: " + builder.getPuertas());

    }
}
