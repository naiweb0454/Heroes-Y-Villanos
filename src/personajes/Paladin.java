package personajes;

public class Paladin extends Personaje {
	
	private double mana;

	public Paladin(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia,
			double mana) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		this.mana = mana;
	}
	
	public void curar(Personaje p) {
		if(mana < 5) {
			System.out.println("El paladin no tiene suficiente maná para poder curar. " + "\n");
		}
		else {
			p.setPuntosVida(p.getPuntosVida()+10);
			mana -= 5;
		}
	}
	
	public void regenerarMana() {
		this.mana += 4;
	}
	
	@Override
	public String atacar(Personaje p) {
		p.setPuntosVida(p.getPuntosVida()-3);
		return this.nombre + " ha atacado a " + p.nombre;
	}

	@Override
	public String toString() {
		return "Paladin " + super.toString() + "\t Maná: " + this.mana + "\n";
	}

	

}
