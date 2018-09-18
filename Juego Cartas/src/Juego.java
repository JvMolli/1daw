
public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	//	Jugador jaime = new Jugador();
		/*Baraja a = new Baraja();
		Carta paco = new Carta(4,4);
		a.barajar();
		System.out.println(a.toString());
		System.out.println(a.darCarta());
		System.out.println(a.darCarta() + "\n" + "\n");
		System.out.println( a.toString());*/
		
		Juegos a = new Juegos();
		
		
System.out.println("       _____                                      _____" );
System.out.println("      ( ___ )------------------------------------( ___ ) ");
System.out.println("       |   |                                      |   | ");
System.out.println("       |   |           EMPIEZA EL JUEGO           |   | ");
System.out.println("       |___|                                      |___| " );
System.out.println("      (_____)------------------------------------(_____) "); 
		

System.out.println("\n" + "\n");
		
		a.start();
	//	a.veintiuno();
		a.dameganador();
		//System.out.println(a.veintiuno(null));
		
		
		
		
	
		
		
	}

}
