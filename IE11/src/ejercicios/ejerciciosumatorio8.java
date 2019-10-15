package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejerciciosumatorio8 {

	public static void main(String[] args) {
		int sumatoriopar=0,sumatorioimpar=0;
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				sumatoriopar=sumatoriopar+i;
			}else {
				sumatorioimpar=sumatorioimpar+i;
			}
		} System.out.println("El sumatorio de numeros positivos del 1 al 100 es "+sumatoriopar);
		  System.out.println("El sumatorio de numeros negativos del 1 al 100 es"+sumatorioimpar);
	}
	}