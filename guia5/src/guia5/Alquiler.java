package guia5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Contratable {
	public Herramienta herramienta;
	protected LocalDate fechaInicio;
	protected LocalDate fechaFin;
	protected LocalDate fechaRealDevolucion;
	
	public Alquiler(Herramienta herramienta, LocalDate fechaInicio, LocalDate fechaFin) {
		this.herramienta = herramienta;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaRealDevolucion = null;
	}
	
	public Alquiler() {super();} // para que no tire error en Usuario
	
	//getters & setters
	public Herramienta getHerramienta() {return herramienta;}
	public void setHerramienta(Herramienta herramienta) {this.herramienta = herramienta;}
	public LocalDate getFechaInicio() {return fechaInicio;}
	public void setFechaInicio(LocalDate fechaInicio) {this.fechaInicio = fechaInicio;}
	public LocalDate getFechaFin() {return fechaFin;}
	public void setFechaFin(LocalDate fechaFin) {this.fechaFin = fechaFin;}
	public LocalDate getFechaRealDevolucion() {return fechaRealDevolucion;}
	public void setFechaRealDevolucion(LocalDate fechaRealDevolucion) {this.fechaRealDevolucion = fechaRealDevolucion;}

	
	@Override
	public double costo() {
		// TODO Auto-generated method stub
		if(finalizado()) {
			return calcularDiferencia(fechaInicio, fechaRealDevolucion) * herramienta.getCostoDiario();
		}
		LocalDate fechaActual = LocalDate.now();
		return calcularDiferencia(fechaInicio, fechaActual)*herramienta.getCostoDiario();
	}
	

	@Override
	public boolean finalizado() {
		if(fechaRealDevolucion == null) return false;
		return true;
	}
	
	public boolean enMora() {
		if(finalizado()) {
			if(calcularDiferencia(fechaRealDevolucion, fechaFin) < 0) return true;
			// devuelve negativo si me pase de la fecha
			return false;
		}
		if(calcularDiferencia(LocalDate.now(), fechaFin) < 0) return true;
		return false;
	}
	
	private long calcularDiferencia(LocalDate inicio, LocalDate fin) {
		return ChronoUnit.DAYS.between(inicio, fin);
	}
	
	//https://stackoverflow.com/questions/27005861/calculate-days-between-two-dates-in-java-8
}
