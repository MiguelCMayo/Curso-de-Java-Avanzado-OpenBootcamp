package State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear: el movil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Abrir camara: La camara ya estaba abierta";
    }

    @Override
    public String hacerfoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "La foto se va a disparar ya";
    }
}
