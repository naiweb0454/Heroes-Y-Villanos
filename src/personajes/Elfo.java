package personajes;

public class Elfo extends Personaje{

	public Elfo(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia,
			double velocidadAtaque, int puntosAtaqueADistancia) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		this.velocidadAtaque=velocidadAtaque;
		this.puntosAtaqueADistancia=puntosAtaqueADistancia;
		
		
	}
	
	
	private double velocidadAtaque;
	private int puntosAtaqueADistancia;
	
	

	
	
	public double getVelocidadAtaque() {
		return velocidadAtaque;
	}

	public void setVelocidadAtaque(double velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
	}

	public int getPuntosAtaqueADistancia() {
		return puntosAtaqueADistancia;
	}

	public void setPuntosAtaqueADistancia(int puntosAtaqueADistancia) {
		this.puntosAtaqueADistancia = puntosAtaqueADistancia;
	}

	
	
	public void lluviaDeFlechas(Elfo e) {
		e.setVelocidadAtaque(e.getVelocidadAtaque()+2);
	}
	
	public void flechasAfiladas(Elfo e) {
		e.setPuntosAtaqueADistancia(e.getPuntosAtaqueADistancia()+15);
	}
	
	@Override
	public String atacar(Personaje p) {
		p.setPuntosVida(p.getPuntosVida()-5);
		this.puntosVida += 7;
		return this.nombre + " ha atacado a " + p.nombre;
	}
	
	@Override
	public String toString() {
//		return "Elfo [velocidadAtaque=" + velocidadAtaque + ", puntosAtaqueADistancia=" + puntosAtaqueADistancia
//				+ ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", movimiento=" + movimiento + ", edad=" + edad
//				+ ", nivel=" + nivel + ", experiencia=" + experiencia + "]";
		return "Guerrero" + super.toString()
		+ "\t Ataque a Distancia: " + this.puntosAtaqueADistancia+ "\n"
		+ "\t Velocidad de ataque:"+ this.velocidadAtaque+"\n";
	}
	
	
	
}
