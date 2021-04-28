package guia5;

public class ServicioEstandar extends Servicio {
	protected double costoFijo;
	protected Trabajador trabajador;
	// trabajador pense que quizas estaba en ambos Servicios
	// pero no lo nombra en Servicio Personalziado
	
	//constructor
	public ServicioEstandar(String nombre, Oficio oficio, boolean urgente, Trabajador trabajador, double costoFijo) {
		super();
		super.setNombre(nombre);
		super.setOficio(oficio);
		super.setUrgente(urgente);
		this.trabajador = trabajador;
		this.costoFijo = costoFijo;
	}
	
	public Trabajador getTrabajador() {return trabajador;}
	public double getCostoFijo() {return costoFijo;}

	public void setTrabajador(Trabajador trabajador) {this.trabajador = trabajador;}
	public void getCostoFijo(double costoFijo) {this.costoFijo = costoFijo;}
}
