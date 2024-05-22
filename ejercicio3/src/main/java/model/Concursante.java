package model;

public class Concursante {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private int idConcurso;

    public Concursante(String nombre, String apellido, String dni, String telefono, String email, int idConcurso) {

        validarDatos(nombre, apellido, dni, telefono, email);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.idConcurso = idConcurso;
    }

    private void validarDatos(String nombre, String apellido, String dni, String telefono, String email) {
        if (nombre == null || nombre.isEmpty()) {
            throw new RuntimeException("El nombre no puede estar vacio");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new RuntimeException("El apellido no puede estar vacio");
        }
        if (dni == null || dni.isEmpty()) {
            throw new RuntimeException("El dni no puede estar vacio");
        }
        if (telefono == null || telefono.isEmpty()) {
            throw new RuntimeException("El telefono no puede estar vacio");
        }
        if (email == null || email.isEmpty()) {
            throw new RuntimeException("El email no puede estar vacio");
        }
    }

    private boolean checkEmail(String email) {
        return email.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
    }

    private boolean validarTelefono(String telefono) {
        return telefono.matches("\\d{4}-\\d{6}");
    }
}
