package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
	@Test
    public void edadIncorrecta() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 21, -5);
        Assert.assertEquals(0, tarifaF);
    }
	
	@Test
    public void menorDeEdad() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 21, 16);
        Assert.assertEquals(19000, tarifaF);
    }
	
	@Test
    public void sinDescEdad() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 21, 50);
        Assert.assertEquals(20000, tarifaF);
    }
	
	@Test
    public void terceraEdad() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 21, 66);
        Assert.assertEquals(18400, tarifaF);
    }
	
	@Test
    public void diasIncorrecta() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, -5, 50);
        Assert.assertEquals(0, tarifaF);
    }
	
	@Test
    public void descDias() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 15, 50);
        Assert.assertEquals(17000, tarifaF);
    }
	
	@Test
    public void sinDescDias() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 21, 50);
        Assert.assertEquals(20000, tarifaF);
    }
	
	@Test
    public void tarifaIncorrecta() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(-20000, 21, 50);
        Assert.assertEquals(0, tarifaF);
    }
	
	@Test
    public void sinDesc() {
        double tarifaF = CalculadorDescuentos.calculoTarifa(20000, 21, 50);
        Assert.assertEquals(20000, tarifaF);
    }
}