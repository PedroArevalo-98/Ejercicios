package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejerciciomedianumero5 {

	public static void main(String[] args) {
	
		int sumatoriopositivos=0,sumatorionegativos=0,sumatorioceros=0, num;
		Scanner entrada = new Scanner(System.in);
		for (int cont = 1; cont <=10; cont++) {
			System.out.println("Introducir "+cont+"º numero por teclado");
			num= entrada.nextInt();
			if (num>0) {
				sumatoriopositivos=sumatoriopositivos+1;
				
			}else if (num==0) {
				sumatorioceros=sumatorioceros+1;
			}else {
				sumatorionegativos=sumatorionegativos+1;
			}
		} System.out.println("El numero de cero es "+sumatorioceros);
		 System.out.println("El numero de positivos es "+sumatoriopositivos);
		 System.out.println("El numero de cnegativos4 es "+sumatorionegativos);
	}
	}