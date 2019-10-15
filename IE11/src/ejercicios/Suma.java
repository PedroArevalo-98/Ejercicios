package ejercicios;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota=0, media=0;
		System.out.println("Por favor introduzca la nota de Programacion");
		Scanner entrada = new Scanner(System.in);
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Lenguajes de Marcas");
		Scanner entrada2 = new Scanner(System.in);
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota Base de Datos");
		Scanner entrada3 = new Scanner(System.in);
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Entornos de Desarrollo");
		Scanner entrada4 = new Scanner(System.in);
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Sistemas informaticos");
		Scanner entrada5 = new Scanner(System.in);
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Formación y orientación laboral");
		Scanner entrada6 = new Scanner(System.in);
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("La nota media es"+media/6);
	}

}
