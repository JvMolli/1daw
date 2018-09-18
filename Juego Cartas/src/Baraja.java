import java.util.Random;

public class Baraja {
	
	private Carta [] mazo;
	private Carta unaCarta;
	//private int numerototal=40;
	//private int figuras=12;
	//private int estacarta;
	//private Random r;
	
	public Baraja () {
		int j = 1;		
		int b = 1;
		int i=0;
		this.mazo = new Carta [40];
		while ( i<this.mazo.length) {
			if(b>4) {
				b=1;
			}
			if(j>=13) {
				b++;
				j=1;
			}
			if (j>0 && j<8 || j>9 && j<13) {
			this.mazo[i]=new Carta(j, b);
			 i++;
			}
			j++;
		}
				
	}
	
	public void barajar() {
		//this.estacarta=0;
		Random r = new Random();
		for(int i=0; i<this.mazo.length; i++) {
			int j=r.nextInt(this.mazo.length);
			Carta temporal=mazo[i];
			this.mazo[i]=this.mazo[j];
			this.mazo[j]=temporal;			
		}
		
	}
	
	
	public String toString () {
		for (int i =0; i<this.mazo.length; i++) {
		System.out.println(this.mazo[i] + "");
		}
		return null;
	}	
	
	
	private Carta [] eliminar() {
	 		int n =this.mazo.length-1;
			Carta [] mazo2 = new Carta [n];
			for(int i=0; i<n; i++) {
				mazo2[i]=this.mazo[i];
			}
		return mazo2;
		}
	
	public Carta darCarta () {
		int cont=this.mazo.length-1;
		if (cont<this.mazo.length) {
			this.unaCarta=this.mazo[cont];
			cont++;
			this.mazo=this.eliminar();
		}		
		return this.unaCarta;
	}
		
		
		
		
		
		
	}

	
	
	
	


	




