package Ejercicios_en_clases.ej5_sistema_empleados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        Desarrollador dev1 = new Desarrollador("Daniel", 1000);
        Disenador disen1 = new Disenador("Oliver", 1000);
        SoporteTI sopor1 = new SoporteTI("Raekwon", 1000);

        empleados.add(dev1);
        empleados.add(disen1);
        empleados.add(sopor1);

        double totalSueldos = 0;

        for (Empleado e : empleados){
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Sueldo final: $" + e.calcularSueldo());
            System.out.println("-------------------------");
            totalSueldos += e.calcularSueldo();
        }

        System.out.println("Total a pagar por la empresa: $" + totalSueldos);
    }
}
