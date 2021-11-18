package org.james;

public class Empleado {

    public float calculaSalarioBruto(String tipompleado, float ventasMes, float hExtras) throws EmpException
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
            if(hExtras == -1.000000)
            {
                throw new EmpException("las horas son negativas no es valido");
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
            throw new EmpException("El empleado es nulo es incorrecto");
            
        }

        return 0;
    }


    public  double calcularsalarioNeto(float salariobruto) throws EmpException
    {
        
        if(salariobruto<0)
        {
            throw new EmpException("quenota");
        }
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
        

        return 0;
    }


}
