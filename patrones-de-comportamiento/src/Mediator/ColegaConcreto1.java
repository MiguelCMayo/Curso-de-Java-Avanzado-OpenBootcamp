package Mediator;

public class ColegaConcreto1 extends Colega{

    public ColegaConcreto1(IMediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
    public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto1: " + mensaje );
    }
}
