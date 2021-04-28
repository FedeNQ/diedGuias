package guia5;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	protected String nombre;
	protected String correo;
	protected Oficio oficio;
	protected double costoPorHora;
	protected double comision;
	protected ArrayList<Trabajo> listaDeTrabajos;
	
	public Trabajador(String nombre, String correo, Oficio oficio, double costoPorHora, double comision) {
		this.nombre = nombre;
		this.correo = correo;
		this.oficio = oficio;
		this.costoPorHora = costoPorHora;
		this.comision = comision;
		this.listaDeTrabajos = new ArrayList<Trabajo>();
	}
	
	//getters
	public String getNombre() {return nombre;}
	public String getCorreo() {return correo;}
	public Oficio getOficio() {return oficio;}
	public double getCostoPorHora() { return costoPorHora;}
	public double getComision() { return comision;}
	
	// setters
	public void setNombre(String nombre) {	this.nombre = nombre;}
	public void setCorreo(String correo) {this.correo = correo;}
	public void setOficio(Oficio oficio) {this.oficio = oficio;}
	public void setCostoPorHora(double costoPorHora) {this.costoPorHora = costoPorHora;}
	public void setComision(double comision) {this.comision = comision;}
	

}
