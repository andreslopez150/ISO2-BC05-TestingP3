package AnioBisiesto;
public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	
	

	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}


	public int getDia() {
		return dia;
	}

	

	public int getMes() {
		return mes;
	}

	

	public int getAnio() {
		return anio;
	}

	public void setDia(int dia) throws Exception {
		if(dia <= 0 || dia > 31) {
	        throw new NumberFormatException("El número no puede ser mayor que 31");
	    }
	    this.dia = dia;
		
	}

	

	public void setMes(int mes) throws Exception{
		
		 if(mes <= 0 || mes > 12) {
		        throw new NumberFormatException("El número no puede ser mayor que 12");
		    }
		    this.mes = mes;
	}

	

	public void setAnio(int anio) throws Exception{
		
		 if(anio <= 0) {
		        throw new NumberFormatException("El número no puede ser menor que 0");
		    }
		    this.anio = anio;
	}


	
	
	
	
	

}
