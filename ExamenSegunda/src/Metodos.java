
public class Metodos {
	
	//Ejercicio 1
	public static String ejer1 (String abc, String b) {
		String excluidas="";		
		for(int i=0; i<abc.length(); i++) {
			boolean esta=false;
			for (int j=0; j<b.length(); j++) {
				if (b.charAt(j)==abc.charAt(i)) {
					esta = true;
				}							
			}
			if(esta==false)excluidas+=abc.charAt(i);			
		}		
		return excluidas;
	}
	
	//Ejercicio 2
	public static boolean esPrimo (int a) {
		boolean primo = true;
		int cont=2;
		while (cont<a) {
			if(a%cont==0) {
				primo=false;
				}
			cont++;
		}
		return primo;
	}
	
	public static boolean llena (int [] a) {
		boolean relleno = true;
		
		for (int i=0; i<a.length; i++) {
			if(a[i]==0)relleno=false;
		}
		
		return relleno;
	}
		
	public static int [] secuencia (int a) {
		int [] secuencia = new int [a];
		
		for (int i=2; i<Integer.MAX_VALUE; i++) {
			if(Metodos.esPrimo(i)==false) {
				int c=i+1;
				secuencia[0]=i;
				for (int j=1; j<a; j++) {
					if(Metodos.esPrimo(c)==false) {
						secuencia[j]=c;
						c++;
					}
				}
			}
			if(Metodos.llena(secuencia)==true)break;
		}
		
		return secuencia;
	}
	
	//EJERCICIO 3
	public static String damePalabra (String a, int n) {
		String palabra="";
		int counter=1;
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i)==' ') {
				counter++;}
			while(counter == n) {
				int j=i+1;
				if (counter==1) j=i;
					while (a.charAt(j)!=' ' && j<a.length()-1) {
						palabra+=a.charAt(j);
						j++;
						if(j==a.length()-1) {
							int k=j;
							while(k<a.length()) {
								palabra+=a.charAt(k);
								k++;
							}
						}
					}
					counter++;
				}
			}		
		return palabra;		
	}

	public static String cadena (String a) {
		String b="";
		int n=1;
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i)==' ' || i==a.length()-1) {
				b+=Metodos.damePalabra(a, n);
				int c=Metodos.damePalabra(a, n).length()-1;
				for(int j=0; j<Metodos.damePalabra(a, n).length()-1; j++) {
					if(a.charAt(i)==' ')b+=a.charAt(i-1);
					if(i==a.length()-1)b+=a.charAt(i);
				} 
				b+=" ";
				n++;
				}
		}	
		a=b;
		return a;
	}
	
//EJERCICIO 5
	
	public static void eliminaArray (int [] a, int n, int e) {
		for (int i=0; i<n; i++) {
			if (a[i] == e) { 
				a[i] = a[i+1];
				n--;
			}
			System.out.println(a[i]);
		}	
			
	}
	
	
	
	
	
		
	
	
	
	
}
