
public class Metodos {

	//EJERCICIO 1
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
	
	
	public static String ordena (String a) {
			char [] pal = new char [a.length()];
			for (int i=0; i<pal.length; i++) {
				pal[i]=a.charAt(i);				
			}			
			String ordenada="";
			for (int i=0; i<pal.length; i++) {
				for(int j=i+1; j<pal.length; j++) {
					if (pal[i]>pal[j]){
						char aux= pal[j];
						pal[j]=pal[i];
						pal[i]=aux;
					}
				}
			}
			
			for (int i=0; i<pal.length; i++) {
				ordenada+=pal[i];
			}			
		return ordenada;
	}
	
	
	public static String fraseOrdenada(String a) {
		String espacio=" ";
		String fOrdenada="";
		int count=0;
		for(int i=0; i<a.length(); i++) {
			if (a.charAt(i)==' ' || i==a.length()) {
				count++;
				}
		//return fOrdenada;
		}
		return fOrdenada;
	}			
	//Ejercicio Moda
		
	public static int[] moda (int a[]) {
		int [] moda = new int [100];
		int max=0;
		int count=1;
		int k=0;
		for (int i=0; i<a.length-1; i++) {
			int j=i+1;
			
			count=1;
			while (a[i]==a[j]) {
				j++;
				count++;
			}
			if(count>max) {
				max=count;
				k=0;
				moda[k]=a[i];
				i=j;
			}else if(count==max) {
				k++;
				moda[k]=a[i];
				i=j;
			}
			
		} 
		
		return moda;
	}	
	
	
	
	
	
	
	
	
	
	
}
