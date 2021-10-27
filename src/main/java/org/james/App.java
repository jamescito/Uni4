package org.james;

public class App 
{
    public static void main( String[] args )  {
        Empleado e = new Empleado();
        e.nombre="james";
        e.apellido="reyes";
        e.cedula="610-2304-2323G";
        e.tipo_empleado="vendedor";
        e.horas_extras = 5;
        e.ventasM = 1000;

        System.out.println(e.CalcularSalarioBruto("vendedor",2000,8));
    }
}
