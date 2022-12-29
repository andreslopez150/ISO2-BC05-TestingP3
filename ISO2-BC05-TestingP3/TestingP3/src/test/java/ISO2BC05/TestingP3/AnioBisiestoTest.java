package ISO2BC05.TestingP3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import AnioBisiesto.Aniobisiesto;
import AnioBisiesto.Fecha;

public class AnioBisiestoTest {

	Aniobisiesto anio;
	
	

	@Test
	public void testCalcularBisiesto() {
		// Primero, creamos una instancia de la clase AnioBisiesto
		Aniobisiesto anioBisiesto = new Aniobisiesto();

		// Luego, probamos el método calcularBisiesto() con varios años diferentes
		Aniobisiesto.calcularbisiesto(2000);
		Aniobisiesto.calcularbisiesto(2004);
		Aniobisiesto.calcularbisiesto(1900);
		Aniobisiesto.calcularbisiesto(2003);
		Aniobisiesto.calcularbisiesto(-1);
		Aniobisiesto.calcularbisiesto(1500);
		Aniobisiesto.calcularbisiesto(-3404);
	}

	@Test
	public void testSetDia() throws Exception {
		// Primero, creamos una instancia de la clase Fecha
		int dia = 0, mes = 0, anio = 0;
		Fecha fecha = new Fecha(dia, mes, anio);

		// Luego, probamos el método setDia() con varios valores de entrada
		fecha.setDia(1);
		assertEquals(1, fecha.getDia());
		fecha.setDia(15);
		assertEquals(15, fecha.getDia());
		fecha.setDia(31);
		assertEquals(31, fecha.getDia());
		fecha.setDia(30);
		assertEquals(30, fecha.getDia());
		fecha.setDia(12);
		assertEquals(12, fecha.getDia());
		fecha.setDia(4);
		assertEquals(4, fecha.getDia());
		fecha.setDia(7);
		assertEquals(7, fecha.getDia());

		// Verificamos que se lanza la excepción NumberFormatException cuando se
		// proporciona un valor inválido
		// assertThrows(NumberFormatException.class, () -> fecha.setDia(32));
		// assertThrows(NumberFormatException.class, () -> fecha.setDia(0));
		// assertThrows(NumberFormatException.class, () -> fecha.setDia(-1));
	}

	@Test
	public void testSetMes() throws Exception {
		// Primero, creamos una instancia de la clase Fecha
		int dia = 0, mes = 0, anio = 0;
		Fecha fecha = new Fecha(dia, mes, anio);

		// Luego, probamos el método setMes() con varios valores de entrada
		fecha.setMes(1);
		assertEquals(1, fecha.getMes());
		fecha.setMes(6);
		assertEquals(6, fecha.getMes());
		fecha.setMes(12);
		assertEquals(12, fecha.getMes());
		fecha.setMes(2);
		assertEquals(2, fecha.getMes());
		fecha.setMes(3);
		assertEquals(3, fecha.getMes());
		
		
		

		// Verificamos que se lanza la excepción NumberFormatException cuando se
		// proporciona un valor inválido
		// assertThrows(NumberFormatException.class, () -> fecha.setMes(13));
		// assertThrows(NumberFormatException.class, () -> fecha.setMes(0));
		// assertThrows(NumberFormatException.class, () -> fecha.setMes(-1));
	}

	@Test
	public void testSetAnio() throws Exception {
		int dia = 0, mes = 0, anio = 0;
		Fecha fecha = new Fecha(dia, mes, anio);
		
		fecha.setAnio(2020);
		assertEquals(2020, fecha.getAnio());
		fecha.setAnio(2002);
		assertEquals(2002, fecha.getAnio());

		

	}
}
