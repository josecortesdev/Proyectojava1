import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad:");
		Scanner edad=new Scanner(System.in);
		int edad_usuario=edad.nextInt();
		System.out.println("Hola " + nombre_usuario + ", el año que viene tendrás " + (edad_usuario+1) + " años");
	}

}
