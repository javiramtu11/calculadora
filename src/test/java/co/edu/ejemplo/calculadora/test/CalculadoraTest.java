package co.edu.ejemplo.calculadora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ejemplo.calculadora.CalculadoraLogic;

public class CalculadoraTest {

	public static final Integer Valor1 = 10;
	public static final Integer Valor2 = 5;
	
	
	@Test
	public void sumar() {

		try {
			Integer resultado = CalculadoraLogic.sumar(Valor1, Valor2);
			System.out.println("La suma es: "+ resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void restar() {
		try {
			Integer resultado = CalculadoraLogic.restar(Valor1, Valor2);
			System.out.println("La resta es: "+ resultado);
			//assertNull(resultado);

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void multiplicar() {
		try {
			Integer resultado = CalculadoraLogic.multiplicar(Valor1, Valor2);
			System.out.println("La multiplicacion es: "+ resultado);

		} catch (Exception e) {
			e.printStackTrace();
		}	}
	
	@Test
	public void dividir() {
		try {
			Integer resultado = CalculadoraLogic.dividir(Valor1, Valor2);
			System.out.println("La division es: "+ resultado);
			//assertNull(resultado);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	}

}
