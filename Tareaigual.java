package igual;
import java.util.Scanner;
public class Tareaigual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = scan.nextInt();
		if (numero >0) {
			System.out.println("El numero es positivo");
		}
		if (numero<0) {
			System.out.println("El numero es negativo");
		}
		if (numero==0) {
			System.out.println("El numero es nulo");
		}
	}
}
