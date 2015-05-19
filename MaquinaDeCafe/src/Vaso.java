
public class Vaso {
	
	private int cantidadVasos;
	private int contenido;

	public Vaso() {
		// TODO Auto-generated constructor stub
	}

	public Vaso(int cantidadVasos, int contenido) {
		super();
		this.cantidadVasos = cantidadVasos;
		this.contenido = contenido;
	}
	
	public boolean hasVasos(int cantidadDeVasos) {
		if(getCantidadVasos()>=cantidadDeVasos)
			return true;
		return false;
	}

	public int getCantidadVasos() {
		return cantidadVasos;
	}

	public void setCantidadVasos(int cantidadVasos) {
		this.cantidadVasos = cantidadVasos;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public void giveVasos(int cantidad) {
		setCantidadVasos(getCantidadVasos()-cantidad);
		
	}

}
