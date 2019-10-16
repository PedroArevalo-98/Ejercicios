package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejerciciocalculadora9 {

	public static void main(String[] args) {
		
		System.out.println();
		Scanner entrada = new Scanner(System.in);
		int instruccion = 0,num1,num2;
		System.out.println("Introducir dos numeros para la calculadora");
		num1= entrada.nextInt();
		num2= entrada.nextInt();
		System.out.println("1 Sumar numeros");
		System.out.println("2 Restar numeros");
		System.out.println("3 Multiplicar los numeros");
		System.out.println("4 Dividir loa numeros");
		System.out.println("5 salir del programa");
		
	while (instruccion != 5) {
		instruccion= entrada.nextInt();
				if (instruccion == 1) {
					System.out.println("La suma entre num1 y num2 es: "+(num1+num2));
				}else if (instruccion == 2) {
					System.out.println("La resta entre num1 y num2 es "+ (num1-num2));
				}else if (instruccion == 3) {
					System.out.println("La multiplicacion entre num1 y num2 " + (num1*num2));
				}else if (instruccion == 4) {
					if (num2 == 0) {
						System.out.println("no puedes dividir entre 0, por favor introduzca otro numero");
					num2= entrada.nextInt();
					}else {
						System.out.println("La division entre num1 y num2 es"+(num1/num2));
					}

					}System.out.println("Introduzca otra instruccion");
					instruccion= entrada.nextInt();
					
				}System.out.println("Ha elegido salir del programa");
	}
			
		}
	
	