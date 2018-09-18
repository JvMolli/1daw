
public class Paso {
	private String descripcion;
	private Tiempo tiempPreparacion;
		
	
	public Paso () {
		this.descripcion="";
		this.tiempPreparacion = new Tiempo();
	}
	
	public Paso (String descripcion, Tiempo t) {
		this.descripcion=descripcion;
		this.tiempPreparacion=t;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tiempo getTiempPreparacion() {
		return tiempPreparacion;
	}

	public void setTiempPreparacion(Tiempo tiempPreparacion) {
		this.tiempPreparacion = tiempPreparacion;
	}
	
	
	public String toString() {
		String s="";
			s+=this.descripcion;		
		return s;
	}
	
	
	
}
