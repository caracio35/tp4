package model;

import java.time.MonthDay;
import java.util.List;

public class CumpleEmpleados {
    private Empleados empleados;
    private NotificarPorEmail notificar;

    public CumpleEmpleados(Empleados empleados, NotificarPorEmail notificar) {
        this.empleados = empleados;
        this.notificar = notificar;
    }

    public void saludarPorCumpleanios(MonthDay mesDia) {
        List<Empleado> listaEmpleados = this.empleados.recuperarEmpleados();
        for (Empleado e : listaEmpleados) {
            if (e.EsTuCumple(mesDia)) {
                this.notificar.enviar(e.tuEmail(), "Feliz Cumpleaños ");
            }
        }

    }

}
