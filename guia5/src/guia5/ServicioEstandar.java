package guia5;


public class ServicioEstandar extends Servicio {
	protected double costoFijo;
	protected Trabajador trabajador;
	// trabajador pense que quizas estaba en ambos Servicios
	// pero no lo nombra en Servicio Personalziado
	
	//quizas oficio no es necesario??? ver
	
	//constructor
	public ServicioEstandar(String nombre, Oficio oficio, boolean urgente, Trabajador trabajador, double costoFijo) {
		super();
		super.setNombre(nombre);
		super.setOficio(oficio);
		super.setUrgente(urgente);
		this.trabajador = trabajador;
		this.costoFijo = costoFijo;
	}
	
	//getters
	public Trabajador getTrabajador() {return trabajador;}
	public double getCostoFijo() {return costoFijo;}

	//setters
	public void setTrabajador(Trabajador trabajador) {this.trabajador = trabajador;}
	public void setCostoFijo(double costoFijo) {this.costoFijo = costoFijo;}

	@Override
	
	/* se cobra un monto fijo, definido por ReparaFix para ese servicio más
		el plus que cobre el profesional seleccionado. 
	*/
	public double costo() {
		// TODO Auto-generated method stub
		double auxCosto = (this.costoFijo*(1 + this.trabajador.getComision()));
		if(super.urgente) return auxCosto * 1.5;
		else return auxCosto;
		// como es un porcentaje
		// por ej  costofijo = 100, comision = 20%;
		//costofijo = 100 * (1+0.2) = 120;
	}


}

