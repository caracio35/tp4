package model;

import java.time.MonthDay;

public class Empleado {
    private String nombre;
    private String apellido;
    private String email;
    private MonthDay fechaNac;

    public Empleado(String nombre, String apellido, String email, MonthDay fechaNac) {
        this.apellido = apellido;
        this.email = email;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public boolean EsTuCumple(MonthDay mesDia) {
        return this.fechaNac.equals(mesDia);
    }

    public String tuEmail() {
        return this.email;
    }
}
