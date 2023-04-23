package Usuarios;

import java.util.ArrayList;

public class Usuarios {

    private ArrayList<UsuarioModel> usuarios = new ArrayList();

    public void añadirUsuario(String nombre, String apellido, int edad, boolean puedeConducir){
        UsuarioModel usuario = new UsuarioModel();
        usuario.nombre = nombre;
        usuario.apellido = apellido;
        usuario.edad = edad;
        usuario.puedeConducir = puedeConducir;

        usuarios.add(usuario);
    }

    //QUEDARIA ASI
    public void añadirUsuario2(UsuarioModel usuario){

        usuarios.add(usuario);
    }
}
