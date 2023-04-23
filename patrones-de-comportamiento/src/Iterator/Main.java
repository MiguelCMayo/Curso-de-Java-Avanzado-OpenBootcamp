package Iterator;

public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();

        usuarios.crear(new Usuario("uno",36));
        usuarios.crear(new Usuario("dos",36));
        usuarios.crear(new Usuario("tres",36));
        usuarios.crear(new Usuario("cuatro",36));

        while (usuarios.haymas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }

        usuarios.crear(new Usuario("cinco",36));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario es: " + usuario.getNombre());

        usuarios.reinicia();

        while (usuarios.haymas()){
            usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }




    }

}
