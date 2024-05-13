package model;

import java.time.MonthDay;

public class CumpleEmpleados {
    private Empleados empleados;
    private NotificarPorEmail notificar;

    public CumpleEmpleados(Empleados empleados, NotificarPorEmail notificar) {
        this.empleados = empleados;
        this.notificar = notificar;
    }

    public void saludarPorCumpleanios(MonthDay mesDia) {
        var listaEmpleados = this.empleados.recuperarEmpleados();
        for (Empleado e : listaEmpleados) {
            if (e.EsTuCumple(mesDia)) {
                this.notificar.enviar(e.tuEmail(), "Feliz Cumpleaños ");
            }
        }

    }


}
