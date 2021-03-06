package org.james;



import org.junit.Rule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class EmpleadoTest{

    @Test
    public void empleado() throws EmpException
    {
        Empleado vend = new Empleado();
        Assert.assertEquals(1360.0, vend.calculaSalarioBruto("vendedor", 2000,8), 0.001);
        Assert.assertEquals(1260.0, vend.calculaSalarioBruto("vendedor", 1500,3), 0.001);
        Assert.assertEquals(1100.0, vend.calculaSalarioBruto("vendedor",(float) 1499.99f,0), 0.001);
    }


    @Test
    public void Encargado() throws EmpException
    {
        Empleado en = new Empleado();
        Assert.assertEquals(1760.0, en.calculaSalarioBruto("Encargado", 1250,8), 0.001);
        Assert.assertEquals(1600.0, en.calculaSalarioBruto("Encargado", 1000,0), 0.001);
        Assert.assertEquals(1560.0, en.calculaSalarioBruto("Encargado", 999.99f,3), 0.001);
        Assert.assertEquals(1500.0, en.calculaSalarioBruto("Encargado", 500,0), 0.001);
        Assert.assertEquals(1660.0, en.calculaSalarioBruto("Encargado", 0,8), 0.001);
    }
    @Test
    public void Neto() throws EmpException
    {
        
        Empleado nt = new Empleado();
        Assert.assertEquals(1050, nt.calcularsalarioNeto(1250),0.001);
        Assert.assertEquals(1640, nt.calcularsalarioNeto(2000),0.001);
        Assert.assertEquals(1259.9916, nt.calcularsalarioNeto(1499.99f),0.001);
        Assert.assertEquals(840, nt.calcularsalarioNeto(1000),0.001);
        Assert.assertEquals(999.99, nt.calcularsalarioNeto(999.99f),0.001);
        Assert.assertEquals(0, nt.calcularsalarioNeto(0),0.001);
        //Assert.assertEquals(exc, nt.calcularsalarioNeto(-1),0.001);



    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void quenota() throws EmpException
    {
        exception.expect(EmpException.class);
        exception.expectMessage("El salario es menor que cero no es valido");

        Empleado emp= new Empleado();
        emp.calculaSalarioBruto("vendedor", -1,8);

    }

    
    @Test
    public void quenota1() throws EmpException
    {
        exception.expect(EmpException.class);
        exception.expectMessage("las horas son negativas no es valido");

        Empleado emp= new Empleado();
        emp.calculaSalarioBruto("vendedor", 1500,-1);

    }

    @Test
    public void quenota2() throws EmpException
    {
        exception.expect(EmpException.class);
        exception.expectMessage("El empleado es nulo es incorrecto");

        Empleado emp= new Empleado();
        emp.calculaSalarioBruto(null, 1500,-1);
    }

    
    @Test
    public void snetoo() throws EmpException
    {
        exception.expect(EmpException.class);
        exception.expectMessage("quenota");

        Empleado em= new Empleado();
        em.calcularsalarioNeto(-1);
    }
    

}
