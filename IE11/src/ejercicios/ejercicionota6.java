package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejercicionota6 {

	public static void main(String[] args) {
	
		int numer;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca su nota");
		numer=entrada.nextInt();
				if (numer>=0 && numer<=10) {
					if (numer<5) {
					System.out.println("Suspenso");
					}else if (numer<7) {
						System.out.println("Bien");
					}else if (numer<9) {
						System.out.println("Notable");
					}else {
						System.out.println("Sobresaliente");
					}
				}else {
					System.out.println("Nota incorrecta");
				}
	}
	}