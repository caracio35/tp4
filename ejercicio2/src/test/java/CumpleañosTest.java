import model.CumpleEmpleados;
import model.Empleado;
import model.Empleados;
import model.NotificarPorEmail;
import org.junit.jupiter.api.Test;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

;

public class CumpleañosTest {

    @Test
    public void test() {
        var empleados = new Empleados() {

            @Override
            public List<Empleado> recuperarEmpleados() {
                return List.of(
                        new Empleado("jose", "nocito", "nocito@gmail.com", MonthDay.of(2, 8)),
                        new Empleado("clara", "nocito", "cNocito@gmail.com", MonthDay.of(1, 25)),
                        new Empleado("paula", "calvo", "pCalvo@gmail.com", MonthDay.of(5, 20)));
            }
        };
        var email = new NotificarPorEmail() {

            private List<String> aQuienesLesEnvieMail = new ArrayList<>();

            public void enviar(String email, String mensaje) {
                this.aQuienesLesEnvieMail.add(email);
            }

            public boolean contiene(String email) {
                return this.aQuienesLesEnvieMail.contains(email);
            }
        };
        var cumple = new CumpleEmpleados(empleados, email);
        cumple.saludarPorCumpleanios(MonthDay.of(1, 25));
        assertTrue(email.contiene("cNocito@gmail.com"));
        assertFalse(email.contiene("nocito@gmail.com") || email.contiene("pCalvo@gmail.com"));
    }

}
