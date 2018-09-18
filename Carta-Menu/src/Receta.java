
public class Receta {

	private String nombre;
	private String [] ingredientes;
	private Lista pasosPreparacion;
	
	
	public Receta() {
		this.nombre="";
		this.ingredientes= new String [1];
		this.pasosPreparacion=null;
				
	}
	
	public Receta(String nombre, String [] ingredientes, Lista pasos) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.pasosPreparacion=pasos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Lista getPasosPreparacion() {
		return pasosPreparacion;
	}

	public void setPasosPreparacion(Lista pasosPreparacion) {
		this.pasosPreparacion = pasosPreparacion;
	}
	
	
	public void añadirIngrediente(Paso p) {
		this.pasosPreparacion.AñadirFinal(p);
	}
		
	
	public String toString() {
		String receta = "Su receta " + this.nombre + ", tiene los siguientes ingredientes: ";
		for (int i=0; i<this.ingredientes.length; i++) {
			receta+= this.ingredientes[i].toString() + ", ";
			if (i==this.ingredientes.length-1) receta+= this.ingredientes[i].toString() + ".\n";
		}
		receta+="Con los pasos de " + this.getPasosPreparacion().tipoPaso() + "\n";
				
		return receta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
