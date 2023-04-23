package Mediator;

public class ColegaConcreto3 extends Colega{

    public ColegaConcreto3(IMediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
    public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto1: " + mensaje );
    }
}
