import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if (edad<16) {

		System.out.println("Muy joven");
		}
		
		else if (edad<18){		
		System.out.println("Menor de edad");
		}
		
		else {
		System.out.println("Mayor de edad");
		}
	}

}
