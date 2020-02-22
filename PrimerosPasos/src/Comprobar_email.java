import javax.swing.JOptionPane;


public class Comprobar_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce el email");
		
		for(int i=0;i<mail.length();i++){
			
			if(mail.charAt(i)=='@'){
				arroba=true;
			}
				
		}
		if (arroba==true){
			System.out.println("Válido");
		}
		else{
			System.out.println("No es válido");
		}
		
	}

}
