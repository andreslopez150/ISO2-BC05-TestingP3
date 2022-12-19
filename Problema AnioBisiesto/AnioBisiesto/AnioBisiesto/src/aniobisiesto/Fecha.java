
public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public void Fecha() throws Exception {
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
				throw new NumberFormatException("El número no puede ser mayor que 31");
            }
			this.dia = dia;
			
		}catch(Exception e) {
			System.out.println("El dia no es correcto, reinica el programa");
			System.exit(0);
		}
		
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws Exception{
		
		try {
			if(mes <= 0 || mes > 12) {
				throw new NumberFormatException("El número no puede ser mayor que 12");
			}
			this.mes = mes;
		}catch(Exception e) {
			System.out.println("El mes no es correcto, reinica el programa");
			System.exit(0);
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) throws Exception{
		
		try {
			if(anio <= 0) {
				throw new NumberFormatException("El número no puede ser menor que 0");
			}
			this.anio = anio;
		}catch(Exception e) {
			System.out.println("El año no es correcto, reinica el programa");
			System.exit(0);
		}
	}

	
	public String toString() {
		System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + anio);
		return "fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
	

}
