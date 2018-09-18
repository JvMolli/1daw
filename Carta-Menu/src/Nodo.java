
public class Nodo {
	
	private Paso info;
	private Nodo next;
	
	public Nodo() {
		this.next=null;
	}
	
	public Nodo(Paso dato) {
		this.info=dato;
		this.next=null;
	}

	public Paso getInfo() {
		return info;
	}

	public void setInfo(Paso info) {
		this.info = info;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}
	
		

    public String toString(){
       String s="";
      s+=this.info;
      return s;
    }

	
	
	
}

