
public class DeclaracionesOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="M�laga";
		System.out.println(nombre);
		System.out.println("M�laga tiene " + nombre.length() + " letras.");
		System.out.println("La tercera letra es " + nombre.charAt(2));
		
		int ultima;
		ultima=nombre.length();
		System.out.println(nombre.charAt(ultima-1));
	}

}
