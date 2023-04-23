package Mediator;

public abstract class Colega {

    protected IMediador mediador;

    public IMediador getMediador()
    {
        return this.mediador;
    }

    public void setMediador( IMediador mediador )
    {
        this.mediador = mediador;
    }

    public void comunicar(String mensaje)
    {
        this.getMediador().enviar(mensaje, this);
    }

    // Método a implementar por las clases que hereden
    public abstract void recibir(String mensaje);
}
