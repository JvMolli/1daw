
public class Jugador {
	private String nombre;
	public Carta [] mano;
	//private Juego juego;
	//private Carta cartaBaraja;
	private int n;
		
	public Jugador () {
	this.nombre=this.altaJugador();
	this.mano = new Carta[40];
	this.n=0;
	}
	public Jugador (int maxMano) {
		this.nombre=this.altaJugador();
		this.mano = new Carta[maxMano];
	}
	
	public String altaJugador() {
		System.out.println();
		System.out.println("»------(¯` Introduzca su nombre ´¯)------» ");
		this.nombre=LeerDatos.leerCadena();
		return this.nombre;
	}
	
	public void dameCarta () {
		 
		this.mano[this.n]=Jugador.darCarta();	
		
			
	}
	
	
	public String toString() {
		return "  " + this.nombre;
	}
	
	
	public static Carta darCarta() {
		Baraja nueva = new Baraja();
		nueva.barajar();
		Carta pedida=nueva.darCarta();
		
		return pedida;
		
	}
	
	
	
	
	
	
	
	
}
