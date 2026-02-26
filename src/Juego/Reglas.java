package Juego;

import personajes.Bardo;
import personajes.Personaje;


public class Reglas {

	//uno contra uno

	public String combate1vs1 (Personaje p1, Personaje p2) {
		String mensaje = "";

		switch (p1.getClass().getSimpleName()) {
		case "Princesa": 
			if (p2.getClass().getSimpleName().equals("Princesa")) {
				mensaje = "Dos princesas se miran desafiantes";
			}else {
				mensaje = p2.getNombre() + "!!! Cómo osas enfrentarte a una princesa!!";
			} 
			break; //necesario
		case "Guerrero":
			switch(p2.getClass().getSimpleName()) {
			case "Princesa":
				mensaje = p1.getNombre() + "!! como osas enfrentarte a una princesa!!-------";
				break;
			case "Guerrero":
				mensaje = p1.atacar(p2);
				break;
			case "Bardo":				
				Bardo b = (Bardo) p2;
				b.dormir(p1);
				mensaje = p1.getNombre() +  " se ha tropezado con un Bardo y siente una gran resaca ";
				break;
			}
	
		break;
		}
		return mensaje;
	}



	//uno contra muchos 
	public String combate1vsN (Personaje p1, Personaje[] arrayPersonajes) {
		String mensaje = "";

		
		p1.atacar(arrayPersonajes);

		return mensaje;
	}




	//muchos contra muchos
	public String NvsM (Personaje[] arrayPersonaje, Personaje[] arrayPersonajes) {
		String mensaje = "";



		return mensaje;
	}


}