import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nombre_Usuario=JOptionPane.showInputDialog("Introduce tu nombre");
		
		String Edad=JOptionPane.showInputDialog("Edad");
		
		String Invertido=JOptionPane.showInputDialog("Cantidad invertida:");
		
		int edad_usuario=Integer.parseInt(Edad);
		
		int cantidad_invertida=Integer.parseInt(Invertido);
		
		
		System.out.println("Hola, tu nombre es " + Nombre_Usuario + " y tendrás " + (edad_usuario + 1) + " años y acumularás " + (cantidad_invertida + 1000));
	}

}
