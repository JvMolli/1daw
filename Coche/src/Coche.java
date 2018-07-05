import javax.swing.JOptionPane;
import java.util.*;
public class Coche {
	
	Scanner sc =new Scanner(System.in);
	
	private String modelo;
	private ColorCoche color;
	private boolean pinturaMetalizada;
	private String matricula;
	private Segmento segmento;
	private int año;
	private Seguro seguro;
	
	
	public Coche() {
		
	}
	
	public Coche (String modelo, ColorCoche color, boolean pinturaMetalizada, String matricula, Segmento segmento, int año, Seguro seguro) {
	
		this.modelo=modelo;
		this.color=color;
		this.pinturaMetalizada=pinturaMetalizada;
		this.matricula=matricula;
		this.segmento=segmento;
		this.año=año;
		this.seguro=seguro;		
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}

	public ColorCoche getColor() {
		return color;
	}

	public void setColor(ColorCoche color) {
		this.color = color;
	}

	public boolean isPinturaMetalizada() {
		return pinturaMetalizada;
	}

	public void setPinturaMetalizada(boolean pinturaMetalizada) {
		this.pinturaMetalizada = pinturaMetalizada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Segmento getSegmento() {
		return segmento;
	}

	public void setSegmento(Segmento segmento) {
		this.segmento = segmento;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	
	public ColorCoche dameColor() {
		
			int opcion=4;
			
			
			System.out.println("Introduce el color 1-Rojo , 2-Blanco , 3-Negro");
		
			
			while (opcion>3 || opcion<0 ) {      
				
				opcion=sc.nextInt();
				
			switch (opcion) {
		
				case 1: 
				this.color=ColorCoche.ROJO;				
				System.out.println("Su color es rojo");
				break;
				case 2:
					this.color=ColorCoche.BLANCO;
				System.out.println("Su color es blanco");
				break;
				case 3:
					this.color=ColorCoche.NEGRO;
				System.out.println("Su color es rojo");
				break;
				
			default:
				System.out.println("Solo existen modelos disponibles en Rojo, Blanco o negro");
					break;	
				}
			}
			return this.color;
			
			}
	
		public boolean pMetalizada() {
			String tipopint;
			
			String opcion2="";
			
			System.out.println("Introduzca si quiere pintura Metalizada S o N");
			
			while (!opcion2.equalsIgnoreCase("S") && !opcion2.equalsIgnoreCase("N")) {
				Scanner sc2 = new Scanner(System.in);
				opcion2=sc2.nextLine();
				
				switch (opcion2) {
					case "S":
						this.pinturaMetalizada=true;
						break;
					case "N":
						this.pinturaMetalizada=false;
						break;
				}
			}
			
			if (pinturaMetalizada=true) {
				String tipoPint = String.valueOf(pinturaMetalizada);
				tipoPint ="metalizada";
			}else {
				String tipoPint = String.valueOf(pinturaMetalizada);
				tipoPint = "mate";
			}
			return pinturaMetalizada;
		}
		
		/*public String tipopintura(String pintura) {
			pintura="";
			String.valueOf(pinturaMetalizada);
			if(pinturaMetalizada==true) {
				pintura = "metalizada";
			}else {
				pintura ="mate";
			}
			return pintura;
		}*/
			
		public Segmento tipo() {
			
			int opcion=4;
				
				
				System.out.println("Introduce el segmento 1-Deportivo, 2-Compacto , 3-Todoterreno");
			
				
				while (opcion>3 || opcion<0 ) {      
					
					opcion=sc.nextInt();
					
				switch (opcion) {
			
					case 1: 
					this.segmento=Segmento.DEPORTIVO;				
					System.out.println("Deportivo");
					break;
					case 2:
						this.segmento=Segmento.COMPACTO;
					System.out.println("Compacto");
					break;
					case 3:
						this.segmento=Segmento.TODOTERRENO;
					System.out.println("Todoterreno");
					break;
					
				default:
					System.out.println("Esta marca no tiene este tipo de coche");
						break;	
					}
				
				}
			
					return this.segmento;
					
		}
		
		public Seguro Seguros() {
			int caso=3;
			
			 while(caso>2 || caso<0 ) {
				System.out.println("Introduzca la modalidad de su seguro 1.A terceros // 2.A Todo Riesgo");
				caso=sc.nextInt();
				switch(caso) {
				case 1: this.seguro=Seguro.TERCEROS;
					break;
				case 2: this.seguro=Seguro.TODORIESGO;
					break;	
			}
			
					
			 }
			
			return this.seguro;
			
		}
	
		public String visualizar () {
			return " El coche es " + this.modelo + ", de color " + this.color + ", de pintura " + this.pinturaMetalizada
				+ ", con matricula " + this.matricula + ", del segmento " + this.segmento + 
				", con la opcion del seguro a " + this.seguro;
			}
	
	
	
	
	
	

}
