package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class ejerciciodados12 {

	public static void main(String[] args) {
		System.out.println("Escribe el numero de veces que quieres que se tire el dado");
		Scanner entrada= new Scanner(System.in);
		int numer,d1=0,d2=0,d3=0,d4=0,d5=0,d6=0;
		double dado;
		numer= entrada.nextInt();
		for (int i = 1; i <= numer; i++) {
			dado = Math.random()*6+1;
			if (dado==1) {
				d1=d1+1;
			}else if (dado==2) {
				d2=d2+1;
			}else if (dado==3) {
				d3=d3+1;
			}else if (dado==4) {
				d4=d4+1;
			}else if (dado==5) {
				d5=d5+1;
			}else {
				d6=d6+1;
			}
			
		}System.out.println(" la cara 1 ha salido un " +d1/100 +" % de veces");
		System.out.println(" la cara 2 ha salido un " +d2/100 +" % de veces");
		System.out.println(" la cara 3 ha salido un " +d3/100 +" % de veces");
		System.out.println(" la cara 4 ha salido un " +d4/100 +" % de veces");
		System.out.println(" la cara 5 ha salido un " +d5/100 +" % de veces");
		System.out.println(" la cara 6 ha salido un " +d6/100 +" % de veces");
		
	}
	}