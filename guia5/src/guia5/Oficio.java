package guia5;

public class Oficio {
	protected String nombre;
	protected ServicioEstandar servicioEstandar = null;
	//y elegir de un oficio un servicio estándar
	// Esto se me hizo un poco confuso, debido a que quizas pensaba que la 
	// relacion seria desde Servicio Estandar a Oficio, ya que imagino que cada 
	// servicio tiene un solo Oficio que lo puede resolver. Pero segun enunciado creo es al reves, entonces lo puse aca
	
	public  Oficio(String nombre, ServicioEstandar servicioEstandar) {
		this.nombre=nombre;
		this.servicioEstandar = servicioEstandar;
	}
	public Oficio(String nombre) {
		this.nombre = nombre;
		// No se si se puede, pero por si pudiera tener servicioEstandar nulo
	}
	
	//getters
	public String getNombre() {return nombre;}
	public ServicioEstandar getEstandar() {return servicioEstandar;}
	//setters
	public void setNombre(String nombre) {this.nombre=nombre;}
	public void setServicioEstandar(ServicioEstandar servicioEstandar) {this.servicioEstandar=servicioEstandar;}
	
	
	// metodo equals
	public boolean equals(Oficio oficio2) {
		if(oficio2.getNombre() == this.nombre) return true;
		return false;
	}
}
