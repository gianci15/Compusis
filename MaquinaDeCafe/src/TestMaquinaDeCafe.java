import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestMaquinaDeCafe {
	Cafetera cafetera;
	Vaso vasosPequeno;
	Vaso vasosMediano;
	Vaso vasosGrande;
	Azucarero azucarero;
	MaquinaDeCafe maquinaDeCafe;
	
	@Before
	public void setUp(){
		cafetera=new Cafetera(50);
		vasosPequeno=new Vaso(5,10);
		vasosMediano=new Vaso(5,20);
		vasosGrande=new Vaso(5,30);
		azucarero=new Azucarero(20);
		
		maquinaDeCafe=new MaquinaDeCafe();
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setVasosPequeno(vasosPequeno);
		maquinaDeCafe.setVasosMediano(vasosMediano);
		maquinaDeCafe.setVasosGrande(vasosGrande);
		maquinaDeCafe.setAzucarero(azucarero);
	}

	@Test
	public void deberiaDevolverUnVasoPequeno() {
		
		Vaso vaso=maquinaDeCafe.getTipoDeVaso("pequeno");
		
		assertEquals(maquinaDeCafe.vasosPequeno,vaso);
		
	}
	
	@Test
	public void deberiaDevolverUnVasoMediano() {
		MaquinaDeCafe maquinaDeCafe=new MaquinaDeCafe();
		
		Vaso vaso=maquinaDeCafe.getTipoDeVaso("mediano");
		
		assertEquals(maquinaDeCafe.vasosMediano,vaso);
		
	}
	
	@Test
	public void deberiaDevolverUnVasoGrande() {
		
		Vaso vaso=maquinaDeCafe.getTipoDeVaso("grande");
		
		assertEquals(maquinaDeCafe.vasosGrande,vaso);
		
	}
	
	@Test
	public void deberiaDevolverNoHayVasos() {

		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		String resultado=
				maquinaDeCafe.getVasoDeCafe(vaso,10,2);
		
		assertEquals("No hay Vasos",resultado);
		
	}

	@Test
	public void deberiaDevolverNoHayCafe() {

		cafetera=new Cafetera(5);
		maquinaDeCafe.setCafetera(cafetera);
		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		String resultado=
				maquinaDeCafe.getVasoDeCafe(vaso,1,2);
		
		assertEquals("No hay Cafe",resultado);
		
	}
	
	@Test
	public void deberiaDevolverNoHayAzucar() {

		azucarero=new Azucarero(2);
		maquinaDeCafe.setAzucarero(azucarero);
		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		String resultado=
				maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		assertEquals("No hay Azucar",resultado);
		
	}
	
	@Test
	public void deberiaRestarCafe() {

		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		int resultado=
				maquinaDeCafe.getCafetera().getCantidadCafe();
		
		assertEquals(40,resultado);
		
	}
	
	@Test
	public void deberiaRestarVaso() {

		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		int resultado=
				maquinaDeCafe.getVasosPequeno().getCantidadVasos();
		
		assertEquals(4,resultado);
		
	}
	
	@Test
	public void deberiaRestarAzucar() {

		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		int resultado=
				maquinaDeCafe.getAzucarero().getCantidadAzucar();
		
		assertEquals(17,resultado);
		
	}

	
	@Test
	public void deberiaDevolverFelicitaciones() {

		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso("pequeno");
		
		String resultado=
				maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		assertEquals("Felicitaciones",resultado);
		
	}
}
