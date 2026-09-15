package Ejercicios_en_clases.ej5_sistema_empleados;

public class SoporteTI extends Empleado{
    public SoporteTI(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * 1.10;
    }
}
