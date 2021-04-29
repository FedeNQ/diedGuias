package guia5;


public class ServicioPersonalizado extends Servicio {
	public double presupuesto;
	public double costoMateriales;
	public double costoTransporte;
	
	//constructor
		public ServicioPersonalizado(String nombre, Oficio oficio, boolean urgente, double presupuesto, double costoTransporte, double costoMateriales) {
			super();
			super.setNombre(nombre);
			super.setOficio(oficio);
			super.setUrgente(urgente);
			this.presupuesto = presupuesto;
			this.costoTransporte = costoTransporte;
			this.costoMateriales = costoMateriales;
		}
		
	
	//getters
	public double getPresupuesto() {	return presupuesto;	}
	public double getCostoMateriales() {return costoMateriales;}
	public double getCostoTransporte() {return costoTransporte;}
	
	//setters
	public void setPresupuesto(double presupuesto) {this.presupuesto = presupuesto;}
	public void setCostoMateriales(double costoMateriales) {this.costoMateriales = costoMateriales;}
	public void setCostoTransporte(double costoTransporte) {this.costoTransporte = costoTransporte;}
	
	@Override
	public double costo() {
		// TODO Auto-generated method stub
		double auxCosto = presupuesto+costoMateriales+costoTransporte;
		if(super.urgente) return auxCosto * 1.5;
		return auxCosto;
	}

	
}
