package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class ejerciciotren13 {

	public static void main(String[] args) {
	
	int sumatorio1=0,sumatorio2=0,resultado=0,resultado2=0,dia1,mes1,año1,hora1,minuto1,dia2,mes2,año2,hora2,minuto2;
	Scanner entrada = new Scanner(System.in);
	System.out.println("introduzca el dia (dia, mes año), hora y minuto de salida del tren");
	dia1= entrada.nextInt();
	mes1= entrada.nextInt();
	año1= entrada.nextInt();
	hora1 = entrada.nextInt();
	minuto1 = entrada.nextInt();
	
	System.out.println("introduzca el dia (dia, mes,año), hora y minuto de la llegada del tren");
	dia2= entrada.nextInt();
	mes2= entrada.nextInt();
	año2= entrada.nextInt();
	hora2 = entrada.nextInt();
	minuto2 = entrada.nextInt();
	
	if (año2<año1 || ((mes2<mes1) && (año2<=año1)) || ((dia2<dia1) && (mes2<=mes1) && (año2 <= año1)) || ((hora2<hora1) && (dia2<=dia1) && (mes2<=mes1) && (año2 <= año1)) || ((minuto2<minuto1) && (hora2 <= hora1) && (dia2<=dia1) && (mes2<=mes1) && (año2 <= año1))) {
		System.out.println("HUbo un error al introducir datos, no puedes ir atrás en el tiempo");
	
	}else {
		sumatorio1= (año1 * 525600) + (mes1 * 43800) + ( dia1 * 1440) + (hora1 * 60) + minuto1;
		sumatorio2= (año2 * 525600) + (mes2 * 43800) + ( dia2 * 1440) + (hora2 * 60) + minuto2;
		resultado= sumatorio2 - sumatorio1;
		System.out.println(" Ha tardado : " );
		System.out.println(+(resultado/525600)+ " años ");
		resultado2 = resultado%525600;
		System.out.println(+(resultado2/43800) +" meses ");
		resultado= resultado2%43800;
		System.out.println((resultado/1440)+ " dias ");
		resultado2 = resultado%1440;
		System.out.println(+(resultado2/60) +" horas ");
		System.out.println(+resultado2%60+ " minutos");
	}
		
	
	}
		
	}