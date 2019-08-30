package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    CalculadorDescuentos cal = new CalculadorDescuentos();
    @Test
    public void deberiaSerUnaTarifaInvalida(){
        
        Assert.assertEquals(-1700.0,(cal.calculoTarifa(-2000,25,40)),0.0); 
        Assert.assertEquals(0,(cal.calculoTarifa(0,25,40)),0.0); 
        Assert.assertEquals(0.85,(cal.calculoTarifa(1,25,40)),0.0); 
        //Assert.assertEquals(950.0, (cal.calculoTarifa(1000,0,11)),0.0);
    }
    @Test
    public void deberiaSerUnaEdadInvalida(){
        
        Assert.assertEquals(48000.0,(cal.calculoTarifa(60000,25,-45)),0.0);
        Assert.assertEquals(57000.0,(cal.calculoTarifa(60000,0,-1)),0.0);
        Assert.assertEquals(60000.0,(cal.calculoTarifa(60000,20,-66)),0.0);
        
    }
    @Test
    public void deberiaAplicarDescuentoMenorDeEdad(){
     
        Assert.assertEquals(57000.0,(cal.calculoTarifa(60000,15,17)),0.0);
        Assert.assertEquals(28500.0,(cal.calculoTarifa(30000,19,16)),0.0);
        Assert.assertEquals(42750.0,(cal.calculoTarifa(45000,18,0)),0.0);
        Assert.assertEquals(28500.0,(cal.calculoTarifa(30000,5,1)),0.0);

    }
    @Test
    public void deberiaPermitirCalcularTarifa(){
        System.out.println(cal.calculoTarifa(60000,25,5)+"...........");
        Assert.assertEquals(48000.0,(cal.calculoTarifa(60000,25,5)),0.0);
        Assert.assertEquals(51000.0,(cal.calculoTarifa(60000,29,18)),0.0);
        Assert.assertEquals(57000.0,(cal.calculoTarifa(60000,18,17)),0.0);
        Assert.assertEquals(60000.0,(cal.calculoTarifa(60000,5,35)),0.0);    
        Assert.assertEquals(55200.0,(cal.calculoTarifa(60000,5,68)),0.0);
        Assert.assertEquals(46200.0,(cal.calculoTarifa(60000,35,68)),0.0);
        Assert.assertEquals(60000.0,(cal.calculoTarifa(60000,5,64)),0.0);
    }
    @Test
    public void deberiaPermitirDescuentoMayorDeEdad(){
        System.out.println(cal.calculoTarifa(60000,10,67)+"......#.#....");
        Assert.assertEquals(51000.0,(cal.calculoTarifa(60000,25,65)),0.0);
        Assert.assertEquals(55200.0,(cal.calculoTarifa(60000,19,66)),0.0);
        Assert.assertEquals(55200.0,(cal.calculoTarifa(60000,10,67)),0.0);
        
    }
    @Test 
    public void deberiaNoTenerDescuento(){
        Assert.assertEquals(60000.0,(cal.calculoTarifa(60000,18,35)),0.0);
        Assert.assertEquals(60000.0,(cal.calculoTarifa(60000,14,59)),0.0);
        Assert.assertEquals(60000.0,(cal.calculoTarifa(60000,5,34)),0.0);
    }
    
    
}
