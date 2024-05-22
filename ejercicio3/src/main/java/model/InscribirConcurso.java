package model;

import java.io.IOException;
import java.util.List;

public class InscribirConcurso {
    private RegistroConcursantes registroConcursante;

    public InscribirConcurso(RegistroConcursantes registroConcursante) {
        this.registroConcursante = registroConcursante;
    }

    public List<String> cualesConcursosHay() throws IOException {
        return registroConcursante.cualesConcursosHay();
    }

    public void registrarConcursante(Concursante concursante) throws IOException {
        registroConcursante.registrarConcursante(concursante);
    }
}
