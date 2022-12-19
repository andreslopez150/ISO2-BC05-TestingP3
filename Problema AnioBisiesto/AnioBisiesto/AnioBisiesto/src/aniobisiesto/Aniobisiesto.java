
import java.util.*;


public class Aniobisiesto {
	static Scanner TECLADO = new Scanner (System.in);
	public static void main(String[] args) throws Exception {
		//String ntrada;
		int dia = 0, mes = 0, anio = 0;
		boolean esBisiesto;
		Fecha f = new Fecha();
		System.out.println("Introduce una fecha por teclado...");
		System.out.println("Dia: ");
				dia = introducirDato();
				f.setDia(dia);
		System.out.println("Mes: ");	
			mes = introducirDato();
			f.setMes(mes);
		System.out.println("Año: ");
			anio = introducirDato();
			f.setAnio(anio);
			
			f.toString();
		
		esBisiesto= calcularbisiesto(anio);
		if(esBisiesto){
			System.out.println("El año es bisiesto");
		
		}else{
			System.out.println("El año no es bisiesto");
		}
	
	
	}
	public static int introducirDato() throws Exception{
		int dato=0;
		try{
		 dato = TECLADO.nextInt();
		}
		catch(InputMismatchException i){
			System.out.println("Se ha introducido un valor no numerico, reinicie el programa");
			
		}
		return dato;
	}
	public static boolean calcularbisiesto(int anio){
		if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
			return true;
		}else{
			return false;
	
		}
	}

}
