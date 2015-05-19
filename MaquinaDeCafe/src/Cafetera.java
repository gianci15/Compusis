
public class Cafetera {
	private int cantidadCafe;

	public Cafetera() {
		// TODO Auto-generated constructor stub
	}

	public Cafetera(int cantidadCafe) {
		this.setCantidadCafe(cantidadCafe);
	}

	public boolean hasCafe(int cantidadCafe) {
		if(getCantidadCafe()>=cantidadCafe)
			return true;
		return false;
	}

	public int getCantidadCafe() {
		return cantidadCafe;
	}

	public void setCantidadCafe(int cantidadCafe) {
		this.cantidadCafe = cantidadCafe;
	}

	public void giveCafe(int cantidadCafe) {
		setCantidadCafe(getCantidadCafe()-cantidadCafe);
	}

}
