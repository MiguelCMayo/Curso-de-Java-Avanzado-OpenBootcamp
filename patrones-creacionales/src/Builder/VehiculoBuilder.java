package Builder;

public class VehiculoBuilder implements IBuilder{

    private String marca;
    private String  tipo;
    private String motor;
    private int puertas;

    public VehiculoBuilder withMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoBuilder withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public VehiculoBuilder withMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public VehiculoBuilder withPuertas(int puertas) {
        this.puertas = puertas;
        return this;
    }

    @Override
    public Vehiculo build() {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca(this.marca);
        vehiculo.setTipo(this.tipo);
        vehiculo.setMotor(this.motor);
        vehiculo.setPuertas(this.puertas);
        return vehiculo;
    }
}
