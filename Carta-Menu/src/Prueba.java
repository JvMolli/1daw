import javax.swing.SingleSelectionModel;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo el primero paso. 
		int n=2; int m=2;
		String paso1 = "Sacar ingredientes de la nevera";
		Tiempo t = new Tiempo (n,m);		
		Paso primer = new Paso (paso1, t);		
	//	Nodo primero = new Nodo (primer);
		
		//Creo toda la lista de pasos.
		Lista pasos = new Lista (primer);
		
		//Añado un paso mas
		int nn=1; int mm=150;
		String paso2 = "Abrir tuppers";
		Tiempo t2 = new Tiempo (nn,mm);		
		Paso segundo = new Paso (paso2, t2);		
	//	Nodo segundoo = new Nodo (segundo);
		pasos.AñadirFinal(segundo);
				
		//Creo la receta
		String peppetter = "pizza de horchata";
		String [] paco = {"Queso", "Peperoni"};
		Masa tipo = Masa.Rellena;
		Pizza patata = new Pizza(peppetter, paco, pasos, tipo);
		
		System.out.println(patata.toString());
		
					
		
		
	}

}
