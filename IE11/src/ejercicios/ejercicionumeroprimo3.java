package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejercicionumeroprimo3 {

	public static void main(String[] args) {
		System.out.println("introduzca un numero del 1 al 100");
		int numer,cont=0, cont2=0;
		Scanner entrada = new Scanner(System.in);
		numer= entrada.nextInt();
		if (numer>=1 && numer<=100) {
			for (int numeroelegido = 1; numeroelegido < numer; numeroelegido++) {
				for (int i = 1; i < numeroelegido; i++) {
					if (numeroelegido%i==0) {
						cont=cont+1;
					}
				} if (cont==2) {
					cont2=cont+1;
					cont=0;
				} cont=0;
			} System.out.println("el numero de numeros primos es "+cont2);
		} else {
			System.out.println("El numero es incorrecto");
		}
	}
	}