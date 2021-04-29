package guia5;

import java.util.ArrayList;

public class Usuario {
	protected String correo;
	protected String nombre;
	protected ArrayList<Contratable> encargos;
	
	public Usuario(String correo, String nombre) {
		this.correo = correo;
		this.nombre = nombre;
		this.encargos = new ArrayList<Contratable>();
	}
	
	
	//setters & getters
	public void setCorreo(String correo) {this.correo = correo;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getCorreo() { return correo;}
	public String getNombre() { return nombre;}
	
	
	
	public void Contratar(Contratable unContratable){
		try {
			if(unContratable.getClass().isInstance(new Alquiler())) {
				if(this.puedeAlquilar(unContratable)) {	encargos.add(unContratable);}
			}
			else {encargos.add(unContratable);}
		}
		catch (AlquilerNoEntregadoException e) {e.printStackTrace();}
	}
	
	private boolean puedeAlquilar(Contratable unContratable) throws AlquilerNoEntregadoException {
		int acum = 0;
		for(Contratable c : encargos) {
			if(c.getClass().isInstance(new Alquiler())) acum++;
			if(acum>2) return false;
		}
		return true;
	}
}
