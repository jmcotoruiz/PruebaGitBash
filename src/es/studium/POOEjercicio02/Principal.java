package es.studium.POOEjercicio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal
{

	public static void main(String[] args)
	{
		Director director = new Director("Pedro Almodovar", LocalDate.of(1949,  9, 25), "español");
		System.out.println(director.getFechaNacimiento());
	
		Pelicula pelicula1 = new Pelicula ("Jamón, Jamón", 1989, 120, director);
		
		LocalDate formatoFechaNacimiento = LocalDate.parse("25/09/1949", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(formatoFechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(pelicula1.getTitulo()+", del año "+pelicula1.getAnio()+" dura "+pelicula1.getDuracion()+" minutos, es del director "+director.getNombre());
	}

}
