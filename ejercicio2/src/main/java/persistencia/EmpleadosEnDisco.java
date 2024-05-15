package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

import model.Empleado;
import model.Empleados;

public class EmpleadosEnDisco implements Empleados {
    public List<Empleado> recuperarEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("empleados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0].trim();
                String apellido = partes[1].trim();
                String email = partes[2].trim();
                String[] fechaNacParts = partes[3].trim().split("/");
                int mes = Integer.parseInt(fechaNacParts[1]);
                int dia = Integer.parseInt(fechaNacParts[2]);
                MonthDay fechaNac = MonthDay.of(mes, dia);
                Empleado empleado = new Empleado(nombre, apellido, email, fechaNac);
                listaEmpleados.add(empleado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaEmpleados;
    }
}
