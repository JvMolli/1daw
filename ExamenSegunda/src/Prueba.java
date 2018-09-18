
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc= "ABCDEFGHIJKLMNÑOPQRSTUVWYZ";
		String b = "LAS RANAS TIENEN";		
		System.out.println(Metodos.ejer1(abc, b));
		//int a=8;
		//System.out.println(Metodos.esPrimo(a));
		
		/*int sb = 5;
		int [] caca=Metodos.secuencia(sb);
		
		for (int i=0; i<sb; i++) {
			System.out.println("[" +caca[i]+  "]");
		}*/		
		//System.out.println(Metodos.cadena(b));
		int [] caca = {2,23,20,2,2,55,99,0,0,0,0,0,0,0,0};
		int sb=6;
		
		int e=2;
		Metodos.eliminaArray(caca, sb, e);
	
	}

}
