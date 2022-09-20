package pqTrabajo;

import javax.swing.*;
import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
      /*
      S
      Main, aplica los Metodos Sugeridos en la actividad
       */
       Scanner scn = new Scanner(System.in);
       int a;
       //!a. Lea nombre, apellidos, salario base y antigüedad para crear un objeto Empleado.
        Empleado empleado1 = new Empleado("Juana","Gomez","Cruz",5,2500);
       // ?b. Lea nombre, apellidos, salario base y antigüedad para crear un objeto Mecanico.
        Mecanico mecanico1 = new Mecanico("Raul Antonio","De la Cruz","Hernandez",10,5000);
       // ?c. Lea un monto por servicios prestados y asígnelo al empleado.
        System.out.println("\nIngresa monto por servicios prestados por Empleado: "+empleado1.getNombre());
        a =scn.nextInt();
        empleado1.incrementarMontoServicios(a);

        //?d. Lea un monto por servicios prestados y asígnelo al mecánico.
        System.out.println("Ingresa monto por servicios prestados por Mecanico: "+mecanico1.getNombre());
        scn.reset();
        a =scn.nextInt();
        mecanico1.incrementarMontoServicios(a);
       //?e. Mostrar el monto por servicios prestados del empleado y del mecánico.
        System.out.println("Empleado: "+empleado1.getNombre()
                +"\n Monto generado: "+empleado1.getMontoServiciosGenerados());
        System.out.println("Mecanico: "+mecanico1.getNombre()
                +"\n Monto generado: "+mecanico1.getMontoServiciosGenerados());
        //?f. Lea un segundo monto por servicios prestados y asígnelo al empleado.
        System.out.println("Ingresa monto por servicios prestados empleado: "+empleado1.getNombre());
        a =scn.nextInt();
        empleado1.incrementarMontoServicios(a);

        // ?g. Lea un segundo monto por servicios prestados y asígnelo al mecánico.
        System.out.println("Ingresa monto por servicios prestados Mecanico: "+mecanico1.getNombre());
        scn.reset();
        a =scn.nextInt();
        mecanico1.incrementarMontoServicios(a);
        //?h. Mostrar el monto final por servicios prestados del empleado y del mecánico.
        System.out.println("Empleado: "+empleado1.getNombre()
                +"\n Monto generado: "+empleado1.getMontoServiciosGenerados());
        System.out.println("Mecanico: "+mecanico1.getNombre()
                +"\n Monto generado: "+mecanico1.getMontoServiciosGenerados());
        //?i. Calcular la prima de antigüedad del empleado y del mecánico y mostrar el valor de cada uno.
        empleado1.calcularPrimaAntiguedad();
        System.out.println("\nEmpleado:"+empleado1.getNombre()+"La prima de antiguedad es de:"+empleado1.getPrimaAntiguedad());
        mecanico1.calcularPrimaAntiguedad();
        System.out.println("\nMecanico:"+mecanico1.getNombre()+"La prima de antiguedad es de:"+mecanico1.getPrimaAntiguedad());
        empleado1.calcularComision();
        //?j. Calcular la comisión del empleado y del mecánico y mostrar su valor de cada uno
        empleado1.calcularComision();
        System.out.println("\nEmpleado:"+empleado1.getNombre()+"La comision es de:"+empleado1.getComision());
        mecanico1.calcularComision();
        System.out.println("\nMecanico:"+mecanico1.getNombre()+"La comision es de:"+mecanico1.getComision());

        mecanico1.mostrarEmpleado();
        empleado1.mostrarEmpleado();
        scn.close();
        System.exit(-1);
    }
}
