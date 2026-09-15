package Ejercicios_en_clases.ej5_sistema_empleados;

public class Disenador extends Empleado {
    public Disenador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * 1.15;
    }
}
