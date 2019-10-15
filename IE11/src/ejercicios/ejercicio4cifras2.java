package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejercicio4cifras2 {

	public static void main(String[] args) {
		
		int numer,rest ;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero positivo de cuatro cifras");
		numer = entrada.nextInt();
		if (numer>0) {
			System.out.println("Los digitos son");
			rest = numer%10;
			System.out.println("El cuarto digito es "+rest);
			numer = numer/10 ;
			rest = numer%10;
			System.out.println("El tercer digito es "+rest);
			numer = numer/10 ;
			rest = numer%10;
			System.out.println("El segundo digito es "+rest);
			numer = numer/10 ;
			rest = numer%10;
			System.out.println("El primer digito es "+rest);
			numer = numer/10 ;
			rest = numer%10;
			
		}
		else {
			System.out.println("El numero introducido no es entero positivo ");
		}
		
	}
	}