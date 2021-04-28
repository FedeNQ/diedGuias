package guia5;

public class Herramienta {
	//Cada herramienta tiene un nombre y un costo por día
	public String nombre;
	public double costoDiario;
	
	public Herramienta(String nombre, double costoDiario){
		this.nombre = nombre;
		this.costoDiario = costoDiario;
	}
	//getters
	public String getNombre() {return nombre;}
	public Double getCostoDiario() {return costoDiario;}
	//setters
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setCostoDiario(double costoDiario) {this.costoDiario = costoDiario;}
	
}
