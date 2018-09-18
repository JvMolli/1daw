
public class Fraccion {
	
	private int num;
	private int den;
	
	public Fraccion () {
		
		
	}
	
	public Fraccion (int num, int den) {
		this.num=num;
		this.den=den;
		
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public void visualizar () {
		LeerMostrarDatos.mostrarEntero(num);
		
		LeerMostrarDatos.mostrarMensaje("/" );
		
		LeerMostrarDatos.mostrarEntero(this.den);
	}
	
	public void sumar ( fraccion1, fraccion2) {
		
		this.num = f1.num;
		this.den = f1.den;
		this.num = f2.num;
		this.den = f2.num;
		
		
	}

}
