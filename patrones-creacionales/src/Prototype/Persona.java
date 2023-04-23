package Prototype;

public class Persona implements Cloneable{

    public int dni, edad;

    public Persona( int dni, int edad){
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public Persona clone() {
        try {
            Persona clone = (Persona) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
