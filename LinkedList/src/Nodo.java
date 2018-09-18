
public class Nodo {
	private int info;
	private Nodo next;
	
	public Nodo() {
		this.next=null;
	}
	
	public Nodo(int dato) {
		this.info=dato;
		this.next=null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
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
      s+=this.info + " |-]-->";
      return s;
    }

	
	
	
}

