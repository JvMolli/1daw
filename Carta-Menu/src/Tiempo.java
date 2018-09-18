
public class Tiempo {
	private int hora;
	private int min;
	
	
	public Tiempo() {
		this.hora=0;
		this.min=0;
	}
	
	public Tiempo(int h, int m) {
		this.hora=h;
		this.min=m;
		
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	
	public int totalMin() {
		int min=this.min;
		min+=this.hora*60;
		return min;
	}
	
	public int totalHor() {		
		int hor=this.hora;
		int min=this.min;
		while(min>60) {			
				hor++;
				min=min-60;
		}
		return hor;
	}
	
	
	
	
		
	
}
