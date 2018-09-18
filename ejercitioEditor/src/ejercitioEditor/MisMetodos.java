package ejercitioEditor;

import java.awt.Menu;
import java.util.Scanner;

public class MisMetodos {
	
	public static String menu () {
		System.out.println("Introduzca su cadena");
		String cadena=LeerDatos.leerCadena();
		
		System.out.println("Introduzca la opcion que quiere ejecutar\n 1.Numero de Palabras\n "
		+ "2.Cuantas letras\n 3.Cambiar frase\n 4.Primera Letra Mayuscula\n 5.Busque una palabra"  );
		
		int opcion=LeerDatos.leerEntero();
		while (opcion>9) {
			System.out.println("¡¡¡¡¡¡¡¡¡ERROR!!!!!!!!!!!!!\n Introduzca la opcion que quiere ejecutar\n 1.Numero de Palabras\n 2.Cuantos parrafos");
			opcion=LeerDatos.leerEntero();
		}
		 switch (opcion) {
			case 1:
	 			MisMetodos.cuantasPalabras(cadena);
	 			break;
			case 2:
			 	MisMetodos.cuantasLetras(cadena);
				break;
			case 3:
				MisMetodos.cambiarfrase(cadena);
				break;
			case 4 :
				//MisMetodos.palabras();
				System.out.println("elige que palabra quieres");				
				int num =LeerDatos.leerEntero();
				System.out.println(MisMetodos.palabras(cadena, num));
				break;
			case 5 :
				MisMetodos.buscarPalabra(cadena);
				break;
		}
		
		return cadena;
	}
	
	public static void cuantasPalabras(String cadena) {
		int contador=1;
		
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)==' ') {
				if ( i+1!=cadena.length() && cadena.charAt(i+1) != ' ') {
				contador++;
	  			for(int j=i; cadena.charAt(j)!= ' '; j++) {
				 	i=j-1;
				 }
				}
			}
		}
		System.out.println(" El numero de palabras es " + contador);
	}
	
	public static void cuantasLetras(String cadena) {
 		int contador=0;
		for (int i=0; i<cadena.length(); i++) {
			contador++;
			if(cadena.charAt(i)==' ') {
				contador--;
			}
		}
		System.out.println("\nEl numero de letras es " + contador);
	} 
	
	public static String cambiarfrase (String cadena) {
		System.out.println("Introduzca su nueva cadena");
		String cadena1=LeerDatos.leerCadena();
		cadena=cadena1;
		System.out.println("\nSu nueva frase es:\n " + cadena);
		return cadena;
	}
	
	public static String palabras (String cadena, int x) {
		int pivot=0;
		String palabra="";
		int contador=0;
		
		for (int i = 0; i<cadena.length(); i++) {
			if(cadena.charAt(i)!=' ') {
				pivot=i;
			}
			while (i<cadena.length() && cadena.charAt(i)!=' ') {
				i++;
			}
			contador++;
			if(contador == x) {
		 		return cadena.substring(pivot, i);
			}			
		}
		return null;		
	}
	
		
	public static void buscarPalabra (String cadena) {
		System.out.println("Introduzca la palabra que desea buscar");
		String palabra = LeerDatos.leerCadena();
	 	String buscada="";
		
		for (int i = 1; palabras(cadena, i)!=null; i++) {
				if(palabra.equals(palabras(cadena, i))) {
				System.out.println("Tu palabra - " + palabra + " - esta en el texto");
			}
		}
	}
	

}


/*if(j<cadena.length()) {
for(j=contador1; j!=cadena.charAt(' ') || j<cadena.length(); j++) {
	 contador1++;
	 	if(k<cadena.length()) {
	 	for( k=j; k!=cadena.charAt(' '); k++) {
	 			contador2++;}
	 		}
		}
	 	j=k;
	 	if(j==k || k==j) {
	 		cuentaP++;
	 	 }
	 }*/