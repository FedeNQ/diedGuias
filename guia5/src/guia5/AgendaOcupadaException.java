package guia5;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException() {
		super("El trabajador ya tiene ocupada esa fecha");
	}
}
