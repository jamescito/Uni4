package org.james;

public class App 
{
    public static void main( String[] args )  {
        Empleado em= new Empleado();
        System.out.println("El salario bruto del vendedor es: "+ em.calculaSalarioBruto("vendedor",2000,8));
        
    /*  Empleado emp= new Empleado();
        System.out.println("El salario bruto del encargado es: "+ emp.calculaSalarioBruto("Encargado",0,8));
*/
        
    }
}
