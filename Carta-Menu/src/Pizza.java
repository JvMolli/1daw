
public class Pizza extends Receta implements FastFood {
	private Masa masa;
	private Preparacion tipo=Preparacion.HORNO;
	
	public Pizza() {
		super();
		this.masa=this.masa.Normal;
		
	}
	
	public Pizza (String nombre, String [] ingredientes, Lista pasos, Masa masa) {
		super(nombre, ingredientes, pasos);
		this.masa=masa;
	}
				
	public Masa getMasa() {
		return masa;
	}

	public void setMasa(Masa masa) {
		this.masa = masa;
	}

	@Override
	public Tiempo tPreparacion() {
		Tiempo total=this.getPasosPreparacion().tiempoTotal();
		return total;
	}
	@Override
	public boolean isVeg(boolean b) {
		// TODO Auto-generated method stub
		return b;
		}	
	@Override
	public Preparacion tipo() {
		Preparacion p;
		p=Preparacion.HORNO;		
		return p;
	}
	
	public Preparacion getTipo() {
		return tipo;
	}

	public void setTipo(Preparacion tipo) {
		this.tipo = tipo;
	}

	public String toString () {
		String a = super.toString() + "Con masa " + this.masa + " y " + this.getPasosPreparacion().tiempoEnString();
		return a;
	}
		

}
