
public class VistaMaquinaDeCafe extends javax.swing.JFrame {

	MaquinaDeCafe maquinaDeCafe;
	ControllerMaquinaDeCafe controlador;
	
    public VistaMaquinaDeCafe() {

        initComponents();
        controlador=new ControllerMaquinaDeCafe();
        
		Cafetera cafetera=new Cafetera(50);
		Vaso vasosPequeno=new Vaso(5,10);
		Vaso vasosMediano=new Vaso(5,20);
		Vaso vasosGrande=new Vaso(5,30);
		Azucarero azucarero=new Azucarero(20);
		
		maquinaDeCafe=new MaquinaDeCafe();
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setVasosPequeno(vasosPequeno);
		maquinaDeCafe.setVasosMediano(vasosMediano);
		maquinaDeCafe.setVasosGrande(vasosGrande);
		maquinaDeCafe.setAzucarero(azucarero);

		
		controlador.init(this,maquinaDeCafe);
        
    }
                          
    private void initComponents() {

        Vasos = new javax.swing.JComboBox();
        labelVasos = new javax.swing.JLabel();
        labelCucharadasAzucar = new javax.swing.JLabel();
        azucar = new javax.swing.JComboBox();
        comprar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panelEstadisticas = new javax.swing.JPanel();
        labelCantidadDeVasosPequenos = new javax.swing.JLabel();
        labelCantidadCafe = new javax.swing.JLabel();
        labelCantidadAzucar = new javax.swing.JLabel();
        cantidadVasosPequenos = new javax.swing.JLabel();
        cantidadCafe = new javax.swing.JLabel();
        cantidadAzucar = new javax.swing.JLabel();
        labelCantidadDeVasosMedianos = new javax.swing.JLabel();
        cantidadVasosMedianos = new javax.swing.JLabel();
        labelCantidadDeVasosGrandes = new javax.swing.JLabel();
        cantidadVasosGrandes = new javax.swing.JLabel();
        tipoVaso = new javax.swing.JComboBox();
        labelTipoDeVaso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vasos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        labelVasos.setText("Vasos");

        labelCucharadasAzucar.setText("Cucharadas De Azucar");

        azucar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        titulo.setText("MAQUINA DE CAFE");

        labelCantidadDeVasosPequenos.setText("Catidad De Vasos Pequenos:");

        labelCantidadCafe.setText("Catidad Cafe :");

        labelCantidadAzucar.setText("Catidad Azucar :");

        cantidadVasosPequenos.setText("0");

        cantidadCafe.setText("0");

        cantidadAzucar.setText("0");

        labelCantidadDeVasosMedianos.setText("Catidad De Vasos Medianos:");

        cantidadVasosMedianos.setText("0");

        labelCantidadDeVasosGrandes.setText("Catidad De Vasos Grandes   :");

        cantidadVasosGrandes.setText("0");

        javax.swing.GroupLayout panelEstadisticasLayout = new javax.swing.GroupLayout(panelEstadisticas);
        panelEstadisticas.setLayout(panelEstadisticasLayout);
        panelEstadisticasLayout.setHorizontalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticasLayout.createSequentialGroup()
                        .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCantidadDeVasosPequenos)
                            .addComponent(labelCantidadAzucar)
                            .addComponent(labelCantidadCafe))
                        .addGap(18, 18, 18)
                        .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadVasosPequenos)
                            .addComponent(cantidadCafe)
                            .addComponent(cantidadAzucar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEstadisticasLayout.createSequentialGroup()
                        .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                                .addComponent(labelCantidadDeVasosMedianos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantidadVasosMedianos))
                            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                                .addComponent(labelCantidadDeVasosGrandes)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadVasosGrandes)))
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        panelEstadisticasLayout.setVerticalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadVasosPequenos)
                    .addComponent(labelCantidadDeVasosPequenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadVasosMedianos)
                    .addComponent(labelCantidadDeVasosMedianos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadVasosGrandes)
                    .addComponent(labelCantidadDeVasosGrandes))
                .addGap(18, 18, 18)
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticasLayout.createSequentialGroup()
                        .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadCafe)
                            .addComponent(labelCantidadCafe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadAzucar))
                    .addGroup(panelEstadisticasLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelCantidadAzucar)))
                .addGap(43, 43, 43))
        );

        tipoVaso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pequeno", "mediano", "grande" }));
        labelTipoDeVaso.setText("Tipo De Vaso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(azucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCucharadasAzucar)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(titulo))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(comprar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tipoVaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelVasos)
                                .addComponent(Vasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipoDeVaso)
                        .addGap(161, 161, 161)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(panelEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoDeVaso)
                    .addComponent(labelVasos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoVaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelCucharadasAzucar)
                .addGap(18, 18, 18)
                .addComponent(azucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comprar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	int cantidadVasos=Integer.parseInt(Vasos.getSelectedItem().toString());
    	int cantidadAzucar=Integer.parseInt(azucar.getSelectedItem().toString());
    	
    	controlador.venderCafe(this,maquinaDeCafe);

    }                                       

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMaquinaDeCafe().setVisible(true);
            }
        });
    }

	public MaquinaDeCafe getMaquinaDeCafe() {
		return maquinaDeCafe;
	}

	public void setMaquinaDeCafe(MaquinaDeCafe maquinaDeCafe) {
		this.maquinaDeCafe = maquinaDeCafe;
	}

	public ControllerMaquinaDeCafe getControlador() {
		return controlador;
	}

	public void setControlador(ControllerMaquinaDeCafe controlador) {
		this.controlador = controlador;
	}

	public javax.swing.JComboBox getVasos() {
		return Vasos;
	}

	public void setVasos(javax.swing.JComboBox vasos) {
		Vasos = vasos;
	}

	public javax.swing.JComboBox getAzucar() {
		return azucar;
	}

	public void setAzucar(javax.swing.JComboBox azucar) {
		this.azucar = azucar;
	}

	public javax.swing.JLabel getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(javax.swing.JLabel cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

	public javax.swing.JLabel getCantidadCafe() {
		return cantidadCafe;
	}

	public void setCantidadCafe(javax.swing.JLabel cantidadCafe) {
		this.cantidadCafe = cantidadCafe;
	}

	public javax.swing.JLabel getCantidadVasosGrandes() {
		return cantidadVasosGrandes;
	}

	public void setCantidadVasosGrandes(javax.swing.JLabel cantidadVasosGrandes) {
		this.cantidadVasosGrandes = cantidadVasosGrandes;
	}

	public javax.swing.JLabel getCantidadVasosMedianos() {
		return cantidadVasosMedianos;
	}

	public void setCantidadVasosMedianos(javax.swing.JLabel cantidadVasosMedianos) {
		this.cantidadVasosMedianos = cantidadVasosMedianos;
	}

	public javax.swing.JLabel getCantidadVasosPequenos() {
		return cantidadVasosPequenos;
	}

	public void setCantidadVasosPequenos(javax.swing.JLabel cantidadVasosPequenos) {
		this.cantidadVasosPequenos = cantidadVasosPequenos;
	}

	public javax.swing.JButton getComprar() {
		return comprar;
	}

	public void setComprar(javax.swing.JButton comprar) {
		this.comprar = comprar;
	}

	public javax.swing.JLabel getLabelCantidadAzucar() {
		return labelCantidadAzucar;
	}

	public void setLabelCantidadAzucar(javax.swing.JLabel labelCantidadAzucar) {
		this.labelCantidadAzucar = labelCantidadAzucar;
	}

	public javax.swing.JLabel getLabelCantidadCafe() {
		return labelCantidadCafe;
	}

	public void setLabelCantidadCafe(javax.swing.JLabel labelCantidadCafe) {
		this.labelCantidadCafe = labelCantidadCafe;
	}

	public javax.swing.JLabel getLabelCantidadDeVasosGrandes() {
		return labelCantidadDeVasosGrandes;
	}

	public void setLabelCantidadDeVasosGrandes(
			javax.swing.JLabel labelCantidadDeVasosGrandes) {
		this.labelCantidadDeVasosGrandes = labelCantidadDeVasosGrandes;
	}

	public javax.swing.JLabel getLabelCantidadDeVasosMedianos() {
		return labelCantidadDeVasosMedianos;
	}

	public void setLabelCantidadDeVasosMedianos(
			javax.swing.JLabel labelCantidadDeVasosMedianos) {
		this.labelCantidadDeVasosMedianos = labelCantidadDeVasosMedianos;
	}

	public javax.swing.JLabel getLabelCantidadDeVasosPequenos() {
		return labelCantidadDeVasosPequenos;
	}

	public void setLabelCantidadDeVasosPequenos(
			javax.swing.JLabel labelCantidadDeVasosPequenos) {
		this.labelCantidadDeVasosPequenos = labelCantidadDeVasosPequenos;
	}

	public javax.swing.JLabel getLabelCucharadasAzucar() {
		return labelCucharadasAzucar;
	}

	public void setLabelCucharadasAzucar(javax.swing.JLabel labelCucharadasAzucar) {
		this.labelCucharadasAzucar = labelCucharadasAzucar;
	}

	public javax.swing.JLabel getLabelTipoDeVaso() {
		return labelTipoDeVaso;
	}

	public void setLabelTipoDeVaso(javax.swing.JLabel labelTipoDeVaso) {
		this.labelTipoDeVaso = labelTipoDeVaso;
	}

	public javax.swing.JLabel getLabelVasos() {
		return labelVasos;
	}

	public void setLabelVasos(javax.swing.JLabel labelVasos) {
		this.labelVasos = labelVasos;
	}

	public javax.swing.JPanel getPanelEstadisticas() {
		return panelEstadisticas;
	}

	public void setPanelEstadisticas(javax.swing.JPanel panelEstadisticas) {
		this.panelEstadisticas = panelEstadisticas;
	}

	public javax.swing.JComboBox getTipoVaso() {
		return tipoVaso;
	}

	public void setTipoVaso(javax.swing.JComboBox tipoVaso) {
		this.tipoVaso = tipoVaso;
	}

	public javax.swing.JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(javax.swing.JLabel titulo) {
		this.titulo = titulo;
	}

	private javax.swing.JComboBox Vasos;
    private javax.swing.JComboBox azucar;
    private javax.swing.JLabel cantidadAzucar;
    private javax.swing.JLabel cantidadCafe;
    private javax.swing.JLabel cantidadVasosGrandes;
    private javax.swing.JLabel cantidadVasosMedianos;
    private javax.swing.JLabel cantidadVasosPequenos;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel labelCantidadAzucar;
    private javax.swing.JLabel labelCantidadCafe;
    private javax.swing.JLabel labelCantidadDeVasosGrandes;
    private javax.swing.JLabel labelCantidadDeVasosMedianos;
    private javax.swing.JLabel labelCantidadDeVasosPequenos;
    private javax.swing.JLabel labelCucharadasAzucar;
    private javax.swing.JLabel labelTipoDeVaso;
    private javax.swing.JLabel labelVasos;
    private javax.swing.JPanel panelEstadisticas;
    private javax.swing.JComboBox tipoVaso;
    private javax.swing.JLabel titulo;
                  
}
