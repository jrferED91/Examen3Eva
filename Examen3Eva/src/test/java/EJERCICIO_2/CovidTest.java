package EJERCICIO_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CovidTest {

	@Test
	void testCalcularPrioridadVacunacion() {
		
		int esperado = 2;
		int esperado2 = 3;
		int esperado3 = 1;
		
		Covid ob1 = new Covid ();
		
		int real = ob1.calcularPrioridadVacunacion(61, 1);
		int real2 = ob1.calcularPrioridadVacunacion(50, 1);
		int real3 = ob1.calcularPrioridadVacunacion(20, 1);
		
		Assertions.assertEquals(esperado, real);
		Assertions.assertEquals(esperado2, real2);
		Assertions.assertEquals(esperado3, real3);
		
	}
	
	

}
