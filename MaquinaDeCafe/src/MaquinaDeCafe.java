
public class MaquinaDeCafe {
	
	Cafetera cafetera;
	Vaso vasosPequeno;
	Vaso vasosMediano;
	Vaso vasosGrande;
	Azucarero azucarero;
	
	public MaquinaDeCafe(){

	}
	
	public Vaso getTipoDeVaso(String tipo) {

		if(tipo=="pequeno")
			return getVasosPequeno();
		else if(tipo=="mediano")
			return getVasosMediano();
		else if(tipo=="grande")
			return getVasosGrande();
		return null;

	}

	public Cafetera getCafetera() {
		return cafetera;
	}

	public void setCafetera(Cafetera cafetera) {
		this.cafetera = cafetera;
	}

	public Vaso getVasosPequeno() {
		return vasosPequeno;
	}

	public void setVasosPequeno(Vaso vasoPequeno) {
		this.vasosPequeno = vasoPequeno;
	}

	public Vaso getVasosMediano() {
		return vasosMediano;
	}

	public void setVasosMediano(Vaso vasoMediano) {
		this.vasosMediano = vasoMediano;
	}

	public Vaso getVasosGrande() {
		return vasosGrande;
	}

	public void setVasosGrande(Vaso vasoGrande) {
		this.vasosGrande = vasoGrande;
	}

	public Azucarero getAzucarero() {
		return azucarero;
	}

	public void setAzucarero(Azucarero azucarero) {
		this.azucarero = azucarero;
	}

	public String getVasoDeCafe(Vaso vaso,int cantidadDeVasos, int cantidadAzucar) {
			if(!vaso.hasVasos(cantidadDeVasos))
				return "No hay Vasos";
			
			int cantidadDeCafe=vaso.getContenido()*cantidadDeVasos;
			int cantidadDeCafeDisponible=getCafetera().getCantidadCafe();
					
			if(cantidadDeCafeDisponible<cantidadDeCafe)
				return "No hay Cafe";
			int cantidadDeAzucarDisponible=getAzucarero().getCantidadAzucar();
			
			if(cantidadDeAzucarDisponible<cantidadAzucar)
				return "No hay Azucar";
			
			deleteMateriales(vaso, cantidadDeVasos, cantidadAzucar,
					cantidadDeCafe);
			
		return "Felicitaciones";
	}

	private void deleteMateriales(Vaso vaso, int cantidadDeVasos,
			int cantidadAzucar, int cantidadDeCafe) {
		cafetera.giveCafe(cantidadDeCafe);	
		vaso.giveVasos(cantidadDeVasos);
		azucarero.giveAzucar(cantidadAzucar);
	}


}
