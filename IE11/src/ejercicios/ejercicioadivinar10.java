package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class ejercicioadivinar10 {

	public static void main(String[] args) {
		double numeroadivinar;
		int numer;
		Scanner entrada = new Scanner(System.in);
		numeroadivinar= Math.random()*100+1;
		System.out.println("intente adivinar un numero");
		numer = entrada.nextInt();
		while (numer != numeroadivinar ) {
			System.out.println("introduzca un numero");
			numer = entrada.nextInt();
			if (numer>numeroadivinar) {
				System.out.println("el numero introducido es demasiado alto, intente otro");
			}else if (numer<numeroadivinar) {
				System.out.println("el numero introducido es demasiado bajo, intente otro");
			}else {
				System.out.println("Enhorabuena has adivinado el numero");
			}
		}
		
	}
		
	}
	
		