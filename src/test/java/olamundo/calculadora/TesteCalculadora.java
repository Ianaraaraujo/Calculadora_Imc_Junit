package olamundo.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadora {
	
	@Test
	public void testeSomar() {
		Calculadora calc = new Calculadora();
		Assert.assertEquals(3.0, calc.somar(2.0, 1.0), 0.0);
	}
	@Test
	public void testeMultiplicar() {
		Calculadora calc = new Calculadora();
		Assert.assertEquals(4.0, calc.multiplicar(2.0, 2.0), 0.0);
	}@Test
	public void testeSubtrair() {
		Calculadora calc = new Calculadora();
		Assert.assertEquals(1.0, calc.subtrair(2.0, 1.0), 0.0);
	}@Test
	public void testeDividir() {
		Calculadora calc = new Calculadora();
		Assert.assertEquals(2.0, calc.dividir(8.0, 4.0), 0.0);
	}
	
}
