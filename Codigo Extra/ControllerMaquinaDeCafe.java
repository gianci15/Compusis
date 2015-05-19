import javax.swing.JOptionPane;


public class ControllerMaquinaDeCafe {
	
	public void init(VistaMaquinaDeCafe vistaMaquinaDeCafe, MaquinaDeCafe maquinaDeCafe){
		vistaMaquinaDeCafe.getCantidadVasosPequenos().setText(""+maquinaDeCafe.getVasosPequeno().getCantidadVasos());
		vistaMaquinaDeCafe.getCantidadVasosMedianos().setText(""+maquinaDeCafe.getVasosMediano().getCantidadVasos());
		vistaMaquinaDeCafe.getCantidadVasosGrandes().setText(""+maquinaDeCafe.getVasosGrande().getCantidadVasos());
		
		vistaMaquinaDeCafe.getCantidadCafe().setText(""+maquinaDeCafe.getCafetera().getCantidadCafe());
		vistaMaquinaDeCafe.getCantidadAzucar().setText(""+maquinaDeCafe.getAzucarero().getCantidadAzucar());

	}

	public void venderCafe(VistaMaquinaDeCafe vistaMaquinaDeCafe,
			MaquinaDeCafe maquinaDeCafe) {
		
		Vaso vaso= maquinaDeCafe.getTipoDeVaso(vistaMaquinaDeCafe.getTipoVaso().getSelectedItem().toString());
		int cantidadDeVasos= Integer.parseInt(vistaMaquinaDeCafe.getVasos().getSelectedItem().toString());
		int cantidadDeAzucar= Integer.parseInt(vistaMaquinaDeCafe.getAzucar().getSelectedItem().toString());
		
		String resultado=
				maquinaDeCafe.getVasoDeCafe(vaso,cantidadDeVasos,cantidadDeAzucar);
		this.init(vistaMaquinaDeCafe, maquinaDeCafe);
		
		JOptionPane.showMessageDialog(null,resultado);
		
	}


}
