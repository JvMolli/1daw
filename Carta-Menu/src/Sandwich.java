
public class Sandwich extends Receta implements FastFood {
	private Preparacion tipo;
	
	public Sandwich() {
		super();
		this.tipo=Preparacion.CRUDO;
	}
	
	public Sandwich(String nombre, String [] ingredientes, Lista pasos, Preparacion p) {
		super(nombre, ingredientes, pasos);
		this.tipo=p;
	}
		
	public Preparacion getTipo() {
		return tipo;
	}

	public void setTipo(Preparacion tipo) {
		this.tipo = tipo;
	}

	@Override
	public Tiempo tPreparacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isVeg(boolean b) {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public Preparacion tipo() {
		// TODO Auto-generated method stub
		return null;
	}

}
