package model;

import java.io.IOException;
import java.util.List;

public interface RegistroConcursantes {
    public void registrarConcursante(Concursante concursante) throws IOException;

    public List<String> cualesConcursosHay() throws IOException;
}
