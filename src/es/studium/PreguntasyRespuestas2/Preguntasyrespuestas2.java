package es.studium.PreguntasyRespuestas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Preguntasyrespuestas2
{
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String nombre = nombre();
		String anios = anios();
		String curso = curso();
		mensaje(nombre, anios, curso);
	}

	private static String curso() throws IOException
	{
		System.out.println("¿En qué curso estás?");
		String curso = entrada.readLine();
		return curso;
	}

	private static String anios() throws IOException
	{
		System.out.println("¿Cuántos años tienes?");
		String anios = entrada.readLine();
		return anios;
	}

	private static String nombre() throws IOException
	{
		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.readLine();
		return nombre;
	}

	public static void mensaje(String nombreUsuario, String edadUsuario, String aniosUsuario) {
		System.out.println("Te llamas " + nombreUsuario + ", tienes " + edadUsuario + " años y estás en " + aniosUsuario);
	}
}