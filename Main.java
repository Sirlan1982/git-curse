/*
 * Me sale error al ejecutar, creo que tengo excepciones que debo de poner para que no me salga error, especificamente en el default
 * del switch
*/

package Enumeracion;
//import Enumeracion.*;

import javax.swing.JOptionPane;

public class Main {


	public static void main(String[] args) {
		Boolean excep = false;
		do {
			Continentes continentes =new Continentes.valueOf(pedirContinente());  //Convierto un String que solicito en metodo "pedirContinente" a un enum
			if (Continentes.class ==  continentes.getClass()){//continentes.equals(continentes)  //  Continentes.class ==  continentes.getClass()
			datosContinente(continentes);
			}else {
				JOptionPane.showMessageDialog(null, "Dato erroneo vuelve a intentar");
				excep = true;
			}
		}while (excep == true);
		
		
			 
	}
	
	public static String pedirContinente(){
		String continente;
		continente = JOptionPane.showInputDialog("Dame el nombre del continente:");
		return continente;
	}
	
	public static void datosContinente(Continentes continente)  {
		switch (continente) {
		case AFRICA:
			System.out.println("Tiene "+Continentes.AFRICA.getHabitantes()+" habitantes y "+Continentes.AFRICA.getPaises()+" paises");
			break;
			
		case AMERICA:
			System.out.println("Tiene "+Continentes.AMERICA.getHabitantes()+" habitantes y "+Continentes.AMERICA.getPaises()+" paises");
			break;
			
		case OCEANIA:
			System.out.println("Tiene "+Continentes.OCEANIA.getHabitantes()+" habitantes y "+Continentes.OCEANIA.getPaises()+" paises");
			break;
			
			
		}	
	}
	
}
