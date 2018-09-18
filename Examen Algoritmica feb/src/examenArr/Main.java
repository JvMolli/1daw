package examenArr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String texto = "hola a todos";
		String[] str = texto.split(" ");
		char [] caca = null;
		String or="";
		for(String palabra:str) {
			caca = palabra.toCharArray();
			Arrays.sort(caca);
			for(int i=0; i<caca.length; i++) {
				or+=caca[i];
			}
			or+=" ";
		}
		System.out.println(or);
		
	}

}
