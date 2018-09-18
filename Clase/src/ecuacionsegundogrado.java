import java.util.Scanner;

public class ecuacionsegundogrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		double raiz;
		double sol1, sol2;
		
		System.out.println("introduzca el primer valor de la ecuacion (a)");
			a=sc.nextInt();
			
		System.out.println("introduzca el valor de b");
			b=sc.nextInt();
			
		System.out.println("valor de c");
			c=sc.nextInt();
		
		raiz = Math.pow(b, 2) - 4 * a * c;
		
		if ( raiz < 0) {
			
			System.out.println("Es inferior a 0");
			
		}else {
				if (raiz == 0) {
					sol1 = -b / (2.0*a);
					sol2 = sol1;
					
				}else {
						sol1 = (-b + Math.sqrt(raiz)) / (2.0 * a);
						
						sol2 = (-b - Math.sqrt(raiz)) / (2.0 * a) ;
						
					}
				
				System.out.println("-La solucion a la ecuacion es " +" Solucion1 " + sol1 + " Solucion2 " + sol2);
				}
			
		
		
		
			
		}
		
		
		
	}


