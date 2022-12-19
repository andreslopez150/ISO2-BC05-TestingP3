package aniobisiesto;

import java.util.*;


public class AnioBisiesto {
	static Scanner TECLADO = new Scanner (System.in);
	public static void main(String[] args) throws Exception {
		//String ntrada;
		int dia = 0, mes = 0, anio = 0;
		fecha f;
		System.out.println("Introduce una fecha por teclado...");
		System.out.println("Dia: ");
		try {
			dia = TECLADO.nextInt();
			mes = TECLADO.nextInt();
			anio = TECLADO.nextInt();
			f = new fecha();
			f.setDia(dia);
			f.setMes(mes);
			f.setAnio(anio);
			f.toString();
		}catch(Exception e) {
			System.out.println("Los datos introducidos no son válidos");
		}
		
		
	}

}

