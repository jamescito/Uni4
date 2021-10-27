package org.james;

public class App 
{
    public static void main( String[] args )  {
        Empleado emp = new Empleado();
        emp.nombre="";
        emp.apellido="";
        emp.cedula="";
        emp.tipo_empleado="vendedor";
        emp.horas_extras = 5;
        emp.ventasM = 1000;

        System.out.println(emp.CalcularSalarioBruto("vendedor",2000,8));
    }
}
