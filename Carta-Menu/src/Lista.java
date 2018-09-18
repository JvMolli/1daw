
public class Lista {
	private Nodo comienzo;
	
	public Lista(){
		this.comienzo = null;
	}
	
	public Lista(Paso head){
		Nodo p = new Nodo(head);
		
		this.comienzo = p;
	}

	
	public Nodo getStart() {
		return comienzo;
	}

	public void setStart(Nodo start) {
		this.comienzo = start;
	}
	
	public int length() {
		int contador=0;
		if(this.comienzo==null) {
			System.out.println("Su lista esta vacia");
		}else {
			Nodo p=this.comienzo;
			contador++;
			while (p!=null) {
				p=p.getNext();
				contador++;
			}
		}
		return contador;
	}

	public void AñadirPrincipio(Paso dato) {
		Nodo p = new Nodo();
		p.setInfo(dato);
		p.setNext(this.comienzo);
		this.comienzo=p;		
	}
	

	public String contenido () {
		String lista="Su lista contiene los siguientes nodos:  ";
		Nodo p=comienzo;
		int cont=0;
		while (p!=null) {
			lista+= "[" + p.toString();
			p=p.getNext();
			cont++;
		}
		lista+="XX ]" + " Y tiene un total de :" + cont + " Nodos.";
		return lista;
	}
	
	public void AñadirFinal(Paso dato) {
		Nodo p = this.comienzo;;
		Nodo f = new Nodo(dato);
		
		if(this.comienzo==null)this.comienzo=f;
		else {	
			while (p.getNext()!=null) {
				p=p.getNext();
			}			
			p.setNext(new Nodo(dato));			
		}		
	}
	
	public void borrarPrimero() {
		
		if(this.comienzo==null)System.out.println("La lista esta vacia");
		
		this.comienzo=this.comienzo.getNext();
		
	}
	
	public void borrarUltimo() {
		Nodo p=this.comienzo;
		if(this.comienzo==null) {
			System.out.println("La lista esta vacia");
		}else if(p.getNext()==null){
			this.comienzo=null;
			}else {
				while (p.getNext().getNext()!=null) {
					p=p.getNext();
					}
				}	
		p.setNext(null);
	}
	
	public void borrarElegido(Paso dato) {
		Nodo p;
		Nodo aux;
		boolean find=false;
		int cont=0;
		int leng= length();
		
		if(this.comienzo==null) {
			System.out.println("Su lista esta vacia");
		}else {
			p=this.comienzo;
			while (p.getNext()!=null) {
				aux=p.getNext();
				if(this.comienzo.getInfo()==dato){
					this.comienzo=this.comienzo.getNext();
					p=this.comienzo;
					aux=p.getNext();
					}
				if(aux.getInfo()==dato) {
					p.setNext(aux.getNext());;
				}
			p=p.getNext();
			}
					
		}
		
	}
	
	public String tiempoEnString () {
		Nodo p=comienzo;
		int cont=0;
		int min=0;
		int h=0;		
		while (p!=null) {
			min+=p.getInfo().getTiempPreparacion().getMin();
			h+=p.getInfo().getTiempPreparacion().getHora();
			p=p.getNext();
			cont++;
		}		
		String tiempo="El tiempo total de su receta es de : " + h + "horas y " + min + " minutos" ;		
		return tiempo;
	}	
	
	public Tiempo tiempoTotal () {
		Nodo p=comienzo;
		int cont=0;
		int min=0;
		int h=0;		
		while (p!=null) {
			min+=p.getInfo().getTiempPreparacion().getMin();
			h+=p.getInfo().getTiempPreparacion().getHora();
			p=p.getNext();
			cont++;
		}
		
		Tiempo t = new Tiempo(h,min);
		return t;
	}
	
	public int totalMin() {
		Nodo p=comienzo;
		int cont=0;
		int min=0;
		int h=0;		
		while (p!=null) {
			min+=p.getInfo().getTiempPreparacion().totalMin();
			p=p.getNext();
			cont++;
		}
		return min;
	}
	
	public String tipoPaso() {
		Nodo p=comienzo;
		String r="";		
		while (p!=null) {
			r+=p.getInfo().toString() + ", ";
			p=p.getNext();
		}
		return r;
	}
	
}
