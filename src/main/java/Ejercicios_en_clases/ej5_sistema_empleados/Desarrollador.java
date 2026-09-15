package Ejercicios_en_clases.ej5_sistema_empleados;

public class Desarrollador extends Empleado{
    public Desarrollador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * 1.20;
    }
}
