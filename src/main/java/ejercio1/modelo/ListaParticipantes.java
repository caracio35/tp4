package ejercio1.modelo;

import java.util.ArrayList;
import ejercio1.modelo.Participante;

public interface ListaParticipantes {

    public abstract void addParticipante(ejercio1.modelo.Participante p) ;

    public abstract Participante recuperarParticipante(Participante p) ;
    public abstract ArrayList<Participante> getParticipantes();
}
