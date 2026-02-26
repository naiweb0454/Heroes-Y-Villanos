package personajes;

import Juego.Reglas;

public class Pruebas {

	public static void main(String[] args) {

		Reglas r = new Reglas();
		
		Guerrero g1 = new Guerrero("Juan", 100, 100, 100, 1, 1, 1, 1);
		Guerrero g2 = new Guerrero("Paco", 100, 100, 100, 1, 1, 1, 1);
		g1.atacar(g2);
		g2.atacar(g1);
		
		
		Guerrero[] g ={g1,g2};
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		
		Bardo b1 = new Bardo("Luis", 100, 100, 100, 1, 1, 5, 1);
		b1.dormir(g2);
		
		System.out.println(b1.toString());
		System.out.println(g2.toString());
		
		b1.despertar(g2);
		System.out.println(b1.toString());
		System.out.println(g2.toString());
	}

	
}
