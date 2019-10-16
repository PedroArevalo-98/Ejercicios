package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class ejercicionumeroamigos11 {

	public static void main(String[] args) {
		int num1,num2,sumatorio=0,sumatorio2=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("introducir 2 numeros");
		num1= entrada.nextInt();
		num2= entrada.nextInt();
		for (int i = 1; i <= num1/2; i++) {
			if (num1%i==0) {
				sumatorio=sumatorio+i;
			}
		}for (int i2 = 1; i2 <=num2/2; i2++) {
			if (num2%i2==0) {
				sumatorio2=sumatorio2+i2;
				
			}
		} if (sumatorio == num2 && sumatorio == num1) {
			System.out.println("Los numeros son amigos");
		
		}else {
			System.out.println("los numeros nos son amigos");
		}
	}
		
	}