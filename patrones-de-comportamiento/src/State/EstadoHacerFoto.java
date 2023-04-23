package State;

public class EstadoHacerFoto extends Estado{

    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "la camara ya la habias abierto";
    }

    @Override
    public String hacerfoto() {
        return "la foto se ha hecho";
    }
}
