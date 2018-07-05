import javax.swing.*;
import java.util.*;
public class TuCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Coche miCoche = new Coche ();
		System.out.println("Introduzca el modelo de su vehiculo");
		miCoche.setModelo(sc.nextLine());
		miCoche.dameColor();
		miCoche.pMetalizada();
		miCoche.tipo();
		System.out.println("Introduzca su matricula");
		miCoche.setMatricula(sc.nextLine());
		System.out.println("Introduzca el año");
		miCoche.setAño(sc.nextInt());
		
		miCoche.Seguros();
		
		
				
		System.out.println(miCoche.visualizar());
		
		
		
		
	}

}
