package guia5;


public abstract class Servicio {
	protected String nombre;
	protected Oficio oficio;
	protected boolean urgente; // si es urgente, precio +50%
	
	public abstract double costo();
	
	//getters
	public String getNombre() {return nombre;}
	public Oficio getOficio() {return oficio;}
	public boolean getUrgente() {return urgente;} 
	
	//setters
	public void setNombre(String nombre) {this.nombre=nombre;}
	public void setOficio(Oficio oficio) {this.oficio=oficio;}
	public void setUrgente(boolean urgente) {this.urgente=urgente;}
	
}
