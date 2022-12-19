package aniobisiesto;

public class fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public void Fecha(int dia, int mes, int anio) throws Exception {
		this.setDia(dia);
		this.setMes(mes);
		this.setAnio(anio);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) throws Exception {
		try {
			if(dia <= 0 || dia > 31) {
				Exception e;
			}
			this.dia = dia;
		}catch(Exception e) {
			System.out.println("El dia introducido no existe...");
		}
		
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws Exception{
		
		try {
			if(mes <= 0 || mes > 12) {
				Exception e;
			}
			this.mes = mes;
		}catch(Exception e) {
			System.out.println("El dia introducido no existe...");
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) throws Exception{
		
		try {
			if(anio <= 0) {
				Exception e;
			}
			this.anio = anio;
		}catch(Exception e) {
			System.out.println("El dia introducido no existe...");
		}
	}

	@Override
	public String toString() {
		return "fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
	

}
