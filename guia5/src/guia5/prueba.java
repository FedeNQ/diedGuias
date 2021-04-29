package guia5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class prueba {
	public static void main(String[] args){
		LocalDate aux1 = LocalDate.now();
		LocalDate aux2 = LocalDate.now();
		aux2 = aux2.plusDays(3);
		System.out.println(aux1);
		System.out.println(aux2);
		System.out.println(ChronoUnit.DAYS.between(aux1,aux1));
		System.out.println(ChronoUnit.DAYS.between(aux2,aux1));
		System.out.println(aux1.isBefore(aux2));
		System.out.println(aux2.isBefore(aux1));
		System.out.println(aux1.isEqual(aux1));
	}
}
