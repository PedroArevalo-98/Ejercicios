package ejercicios;

import java.util.Scanner;

public class EjercicioNotasMedia1 {

	public static void main(String[] args) {
		
		float nota=0, media=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor introduzca la nota de Programacion");
		
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Lenguajes de Marcas");
		
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota Base de Datos");
		
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Entornos de Desarrollo");
		
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Sistemas informaticos");
		
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("Por favor introduzca la nota de Formación y orientación laboral");
	
		nota=entrada.nextFloat();
		media=media+nota;
		System.out.println("La nota media es "+media/6);
	}

}
