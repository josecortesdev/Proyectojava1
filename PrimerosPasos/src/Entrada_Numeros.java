import javax.swing.JOptionPane;


public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1=JOptionPane.showInputDialog("Introduce número:");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es: ");
		
		System.out.printf("%1.10f", Math.sqrt(num2));
		
		
	}

}
