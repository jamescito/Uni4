package org.james;

public class Empleado  {

    String nombre, apellido, cedula, tipo_empleado;
    float horas_extras, ventasM, salarioBase = 0;
    float salario_base1 = 0;
    float salario_bruto = 0;
    float salario_neto = 0;
    float salar_h = 0;
    float retencion = 0;


    float CalcularSalarioBruto(String tipo_empleado,float ventasM, float horas_extras) {

            if (tipo_empleado == "vendedor") {
                
                salarioBase = 1000;
                return venta(ventasM, salarioBase, horas_extras);
            } else if (tipo_empleado == "encargado") {
                salarioBase = 1500;
                System.out.println();
                return venta(ventasM, salarioBase, horas_extras);
            }

        return 0;
    }

    float venta(float dd,float we,float as){
        
        return 0;
    }



}
