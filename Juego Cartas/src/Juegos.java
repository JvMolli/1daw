import org.omg.Messaging.SyncScopeHelper;

public class Juegos {
	//private int valor;
	private Jugador [] jugadores;
	private Baraja mazo;
	private Carta [] mano;
	  
	public Juegos() {
		this.mazo = new Baraja();
				
	} 	
	public Jugador [] start() {
		
System.out.println("                (0 0)                "); 
System.out.println("        ---oOO-- (_) ----oOO---      ");
System.out.println("      ---------------------------    ");
System.out.println("      | Cuantos jugadores son?  |     ");
System.out.println("      |-------------------------|     ");
System.out.println("         -------------------          ");
System.out.println("               |__|__|                ");
System.out.println("                || ||                 ");
System.out.println("               ooO Ooo                ");
		
		
		
				
		//System.out.println("Cuantos jugadores van a jugar ? ");
		int n=LeerDatos.leerEntero();		
		this.jugadores = new Jugador [n];		
		for (int i=0; i<jugadores.length; i++) {
			jugadores[i]= new Jugador();
			}
		System.out.println();
		System.out.println("»------(¯` BIENVENIDOS!! ´¯)------» ");
		for (int i =0; i<jugadores.length; i++) {
			System.out.println(" ````````  Player : " + jugadores[i] + "  :D   ´´´´´´´´´´´´ ");
			}		
		return this.jugadores;
				
	}
	/*public Carta dameCarta() {
		return null;
	}*/
	public Jugador veintiuno( ) {
		this.mazo.barajar();
		//int nJugador=0;			
		for (int i=0; i<jugadores.length; i++) {
			int pedir=1;
			int nMano=0;
			double valor=0;
			System.out.println("///////\\\\\\ \n Empieza su turno" + this.jugadores[i]);
			while(pedir==1) {
				jugadores[i].mano[nMano]=this.mazo.darCarta();
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println( "**********  "+ i+ " El Jugador : " + this.jugadores[i] + " Recibe el : " + jugadores[i].mano[nMano] + " **********");
				System.out.println();
				valor+=jugadores[i].mano[nMano].valor;
				System.out.println(" ");
				System.out.println("  El valor de su mano es de : ");
				System.out.println();
				System.out.println(" _______________");
				System.out.println(" |              |");
				System.out.println(" | "  +valor + " |");
				System.out.println(" |______________|");
				System.out.println();
				if(valor>21) {
					System.out.println("  ¡¡¡ UPS !!! LO SENTIMOS SE HA PASADO \n :( :( :( :( ");
					break;}
				System.out.println(this.jugadores[i]+"  Quiere usted una carta 1-SI     2-NO");
				pedir=LeerDatos.leerEntero();
				nMano++;				
			}
			
			//nJugador++;
		}
		
		double [] valorMano = new double [jugadores.length];
		for (int i=0; i<valorMano.length; i++) {
			int nMano1=0;
			while (this.jugadores[i].mano[nMano1]!=null) {
				valorMano[i]+=this.jugadores[i].mano[nMano1].valor;
				System.out.println(this.jugadores[i]+ "Su cumulacion es  " + valorMano[i]);
				nMano1++;
			}
		   if(valorMano[i]>21.1) {
		    	valorMano[i]=0.0;
		    	}		
		}		
		for (int i=0; i<valorMano.length; i++) {
			for (int j=i+1; j<valorMano.length; j++) {
				if(valorMano[i]<valorMano[j]) {
					Jugador aux = this.jugadores[j];
					this.jugadores[j]=this.jugadores[i];
					this.jugadores[i]=aux;
				}
			}
		}		
		return this.jugadores[0];
	}
		
	public void dameganador() {
		Jugador nuevo = this.veintiuno();
		
System.out.println("       _____             " +nuevo+ "              _____" );
System.out.println("      ( ___ )------------------------------------( ___ ) ");
System.out.println("       |   |                                      |   | ");
System.out.println("       |   |               YOU  WIN               |   | ");
System.out.println("       |___|                                      |___| " );
System.out.println("      (_____)------------------------------------(_____) "); 
		
	}	
		
		
	
	
	
	
}
