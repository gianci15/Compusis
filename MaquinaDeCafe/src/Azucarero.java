
public class Azucarero {
	private int cantidadAzucar;

	public Azucarero(int cantidadAzucar) {
		this.setCantidadAzucar(cantidadAzucar);
	}

	public boolean hasAzucar(int cantidadAzucar) {
		if(cantidadAzucar<=getCantidadAzucar())
			return true;
		return false;
	}

	public int getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

	public void giveAzucar(int cantidadAzucar) {
		
		setCantidadAzucar(getCantidadAzucar()-cantidadAzucar);
	}

}
