package org.james;

public class Empleado  {

    String nombre, apellido, cedula, tipo_empleado;
    float horas_extras, ventasM, salarioBase = 0;
    float s_base1 = 0;
    float s_bruto = 0;
    float s_neto = 0;
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

    float venta(float ventam,float salariob,float h_e){

        if(ventam >= 1000 && ventasM <=1499){
            s_base1 = salariob + 100;
            salar_h = h_e * 20;
            s_bruto = s_base1 + salar_h;
        }
        if(ventam>= 1500){
            s_base1 = salariob + 200;
            salar_h = h_e * 20;
            s_bruto = s_base1 + salar_h;
        }
        return s_bruto;
    }

    float SalarioNeto(float salario_bruto){

        if(salario_bruto < 0 ){
            throw new RuntimeException("Este salario es menor de 0");
        }
        
        if(salario_bruto < 1000){
            s_neto = salario_bruto;
        }
        else if (salario_bruto >= 1000 && salario_bruto<1500){
            retencion = (float) 0.16;
            s_neto = salario_bruto - retencion;
        }
        else if (salario_bruto >= 1500){
            retencion =(float) 0.18;
            s_neto = salario_bruto - retencion;
        }

        return s_neto;
    }



}
