
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=12;
		int b=14;
		int c=99;
		int d=123;	
		
		Nodo p=new Nodo(d);
		Lista caca=new Lista(p);
		caca.A�adirPrincipio(a);
		caca.A�adirFinal(d);
		caca.A�adirPrincipio(c);
		System.out.println(caca.recorrer());		
		
		//caca.borrarPrimero();
		//caca.borrarUltimo();
		caca.borrarElegido(d);
		System.out.println(caca.recorrer());
		
		
		
		
	}

}
