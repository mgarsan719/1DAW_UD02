package boletines.boletin2;

import java.util.Scanner;

public class Boletin2
{

	/*
	 * Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'NO VOCAL'
	 * en caso contrario, el programa termina cuando se introduce un punto.
	 */
	public static void esVocal()
	{
		Scanner sc = new Scanner(System.in);
		String caracter = null;

		do
		{
			System.out.println("Dame un caracter");
			caracter = sc.next();

			if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u"))
			{
				System.out.println("VOCAL");
			}

			else if (caracter.equals("."))
			{
				System.out.println("Ha salido del programa");
			}

			else
			{
				System.out.println("NO VOCAL");
			}

		} while (!(caracter.equals(".")));

	}

	/*
	 * Pide una cadena y un carácter por teclado (valida que sea un carácter) y
	 * muestra cuantas veces aparece el carácter en la cadena.
	 */
	public static void cadenaCaracteres()
	{
		String cadena;
		String caracter;
	}

}
