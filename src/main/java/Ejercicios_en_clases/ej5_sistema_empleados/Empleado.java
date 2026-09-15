package Ejercicios_en_clases.ej5_sistema_empleados;

public class Empleado {
    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }

    public double calcularSueldo(){
        return sueldoBase;
    }
}
