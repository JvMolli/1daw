
public class Carta {
	private Palo palo;
	private int numero;
	public double valor;
	
		
	public Carta ( int numero, int palo ) {
		this.numero=numero;
			
		if(palo==1) {
 			this.palo=Palo.BASTOS;
		}else if(palo==2) {
			this.palo=Palo.COPAS;
		}else if(palo==3) {
			this.palo=Palo.ESPADAS;
		}else if(palo==4) {
			this.palo=Palo.OROS;
		}
		
		this.valor = this.numero;
		/*if (this.numero==10 || this.numero==11 || this.numero==12) {
			this.valor=0.5;
		}*/
	}
	
	public String toString() {
		return this.numero +  "  de:  " + this.palo;
	} 
	

	
}
