

import java.util.Scanner;

public class LeerDatos {
	
	public static int leerEntero() {
	 	
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		
		return n;		
		
	}
	
	public static String leerCadena() {
		Scanner sc = new Scanner (System.in);
		
		String c=sc.nextLine();
		
		return c;
		
	}

}
