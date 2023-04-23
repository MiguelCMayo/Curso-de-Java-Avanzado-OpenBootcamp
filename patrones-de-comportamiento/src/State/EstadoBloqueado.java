package State;

public class EstadoBloqueado extends Estado{

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear: movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Abrir camara: La camara esta bloqueada. Desbloquea el movil antes";
    }

    @Override
    public String hacerfoto() {
        return "Hacer foto: La camara esta bloqueada. Desbloquea el movil antes";
    }
}
