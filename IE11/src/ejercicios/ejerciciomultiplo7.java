package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejerciciomultiplo7 {

	public static void main(String[] args) {
		
		System.out.println("Escriba hasta que numero quiere que le muestre los multiplos de 3");
		int numer,cont;
		Scanner entrada = new Scanner(System.in);
		numer= entrada.nextInt();
		
		if (numer>0) {
			cont=0;
			if (numer>0) {
				System.out.println("1");
				for (int i = 0; i <= numer; i+=3) {
					System.out.println(+i);
					cont = cont+1;
				}
			}
		}else {
			System.out.println("El numero introducido es incorrecto");
		}
		
		
	}
	}