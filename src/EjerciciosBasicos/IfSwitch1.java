package EjerciciosBasicos;

public class IfSwitch1 {
	public static void main(String[] args) {
		int mesNum = 10;
		String mesText;

		if (mesNum == 1)
		        mesText = "Enero";
		else if (mesNum == 2)
		        mesText = "Febrero";
		else if (mesNum == 3)
		        mesText = "Marzo";
		else if (mesNum == 4)
		        mesText = "Abril";
		else if (mesNum == 5)
		        mesText = "Mayo";
		else if (mesNum == 6)
		        mesText = "Junio";
		else if (mesNum == 7)
		        mesText = "Julio";
		else if (mesNum == 8)
		        mesText = "Agosto";
		else if (mesNum == 9)
		        mesText = "Septiembre";
		else if (mesNum == 10)
		        mesText = "Octubre";
		else if (mesNum == 11) 
		        mesText = "Noviembre";
		else if (mesNum == 12)
		        mesText = "Diciembre";
		else
		    mesText = "No entiendo";

		System.out.println(mesText);
	}
	public static void main(String[] args) {
		int mesNum = 10;
		String mesText;

		switch(mesNum) {
		    case 1: 
		        mesText = "Enero";
		        break;
		    case 2: 
		        mesText = "Febrero";
		        break;
		    case 3: 
		        mesText = "Marzo";
		        break;
		    case 4: 
		        mesText = "Abril";
		        break;
		    case 5: 
		        mesText = "Mayo";
		        break;        
		    case 6: 
		        mesText = "Junio";
		        break;
		    case 7: 
		        mesText = "Julio";
		        break;
		    case 8: 
		        mesText = "Agosto";
		        break;
		    case 9: 
		        mesText = "Septiembre";
		        break;
		    case 10: 
		        mesText = "Octubre";
		        break;
		    case 11: 
		        mesText = "Noviembre";
		        break;
		    case 12: 
		        mesText = "Diciembre";
		        break;
		    default:
		        mesText = "No entiendo";
		}
		System.out.println(mesText);
	}
}
