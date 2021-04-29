package guia5;

import java.time.LocalDate;

public class Trabajo implements Contratable{
	protected String nombre;
	protected Servicio servicio;
	protected Trabajador trabajador;
	protected LocalDate fechaFin;
	
	public Trabajo(String nombre, Servicio servicio, Trabajador trabajador, LocalDate fechaFin) {
		this.nombre = nombre;
		this.servicio = servicio;
		this.trabajador = trabajador;
		this.fechaFin = fechaFin;
	}
	
	public String getNombre() {return nombre;}
	public Servicio getServicio() { return servicio;}
	public Trabajador getTrabajador() { return trabajador;}
	public LocalDate getFechaFin() {return fechaFin;}
	
	public void setNombre(String nombre) {	this.nombre= nombre;}
	public void setServicio(Servicio servicio) {this.servicio = servicio;}
	public void setTrabajador(Trabajador trabajador) {this.trabajador = trabajador;}
	public void setFechaFin(LocalDate fechaFin) {this.fechaFin = fechaFin;}
	
	
	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return servicio.costo();
	}
	@Override
	public boolean finalizado() {
		// TODO Auto-generated method stub
		if(fechaFin == null) return false;
		return true;
	}
	
}
