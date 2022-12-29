package AnioBisiesto;

import java.util.*;

public class Aniobisiesto {
	static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		int dia = 0, mes = 0, anio = 0;

		Fecha f = new Fecha(dia, mes, anio);
		System.out.println("Introduce una fecha por teclado...");
		System.out.println("Dia: ");
		dia = TECLADO.nextInt();
		f.setDia(dia);
		System.out.println("Mes: ");
		mes = TECLADO.nextInt();
		f.setMes(mes);
		System.out.println("Año: ");
		anio = TECLADO.nextInt();
		f.setAnio(anio);
		
		

		calcularbisiesto(anio);

	}

	public static void calcularbisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("El año no es bisiesto");
		}
		{
			
		}

	}

}
