package personajes;

public class Picaro extends Personaje{
	private int destreza;
	private boolean sigilo=false;
	public Picaro(String nombre, double vida, int movimiento, int edad, int nivel, int experiencia, int destreza) {
		super(nombre, vida, movimiento, edad, nivel, experiencia);
		this.destreza=destreza;
	}
	
	public void robar(Personaje robado) {
		if(Math.random()>=0.5) {
			this.experiencia++;
			robado.experiencia--;
		}else {
			this.puntosVida-=5;
		}
	}
	
	public void entrarSigilo() {
		sigilo=true;
	}
	
	@Override
	public String atacar(Personaje p) {
		if(sigilo) {
			p.setPuntosVida(p.getPuntosVida()-destreza*2);
			this.experiencia+=4;
			sigilo=false;
		}else {
			p.setPuntosVida(p.getPuntosVida()-destreza);
			this.experiencia+=2;
		}
		return this.nombre + " ha atacado a " + p.nombre;
	}
	
	@Override
	public String toString() {
		return "Picaro " + super.toString()
		+"\t Destreza: "+this.destreza+"\n";
	}
}
