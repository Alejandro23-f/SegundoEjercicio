package es.Studium.Parimpar;

import java.util.Scanner;

public class Parimpar
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int numero1 , numero2;
		System.out.println("Dame un número:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		if(numero1%2==0)
		{
			System.out.println("el número es par.");
		}
			else
			{
			System.out.println("El número es IMPAR.");
			}
		}
		teclado.close(Scanner);
}

