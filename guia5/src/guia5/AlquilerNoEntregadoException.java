package guia5;

public class AlquilerNoEntregadoException extends Exception{
	public AlquilerNoEntregadoException() {
		super("El usuario tiene mas de dos alquileres en este momento");
	}
}
