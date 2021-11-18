package org.james;

public class Empleado {

    float calculaSalarioBruto(String tipompleado, float ventasMes, float hExtras) throws EmpException
    {


        if(tipompleado == "vendedor")
        {
            float salarioM = 1000;
            float Salariototal = 0 ;
            float horas;
            float vendedor;

            if(ventasMes >= 1000)
            {
                Salariototal= salarioM + 100;
            }
            if(ventasMes >= 1500)
            {
                Salariototal = salarioM + 200;
            }
            
            if(ventasMes == -1.000000)
            {
                // try{
                throw new EmpException("El salario es menor que cero no es valido");
                // }
                // catch(EmpException e ){
                //     System.out.println(e.toString());
                // }
                
            }
            if(hExtras == -1.0)
            {
                throw new IllegalArgumentException("las horas son negativas no es valido");
            }
            
            
            

            horas = hExtras * 20;
            vendedor = Salariototal + horas;
            return vendedor;

            

        }
        else if(tipompleado ==("Encargado"))
        {
            float salarioM = 1500;
            float Salariototal = 0 ;
            float horas;
            float encargado;

            if(ventasMes < 1000)
            {

                horas = hExtras * 20;
                return salarioM + horas;
            }
            if(ventasMes >= 1000)
            {
                Salariototal= salarioM + 100;
            }
            if(ventasMes >= 1500)
            {
                Salariototal = salarioM + 200;
            }


            horas = hExtras * 20;
            encargado = Salariototal + horas;
            return encargado;
        }

        if (tipompleado==null)
        {
            throw new IllegalArgumentException("El empleado es nulo es incorrecto");
            
        }

        return 0;
    }


    double calcularsalarioNeto(float salariobruto)
    {
        

        if(salariobruto < 1000)
        {
            return salariobruto;
        }
        if(salariobruto >=1000 && salariobruto <1500)
        {
           return salariobruto - (salariobruto * 0.16);
        }
        if(salariobruto>1500)
        {
            return salariobruto - (salariobruto * 0.18);

        }
        if(salariobruto==-1)
            {
                throw new IllegalArgumentException("las horas son negativas no es valido");
            }

        return 0;
    }


}
