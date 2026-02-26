package personajes;

public class Personaje {

	protected String nombre;
	protected double puntosVida;
	protected int movimiento;
	protected int edad;
	protected int nivel;
	protected int experiencia;

	@Override
	public String toString() {
		//		return "Personaje [nombre=" + nombre + ", puntosVida=" + puntosVida + ", movimiento=" + movimiento + ", edad="
		//				+ edad + ", nivel=" + nivel + ", experiencia=" + experiencia + "]";
		return this.nombre +", nivel: " + this.nivel + "\n" + "\t Edad: " + this.edad 
				+ "\n" + "\t Vida: " + this.puntosVida + "\n" + "\t Experiencia: " 
				+ this.experiencia + "\n" + "\t Movimiento: " + this.movimiento + "\n";
	}



	public Personaje(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia) {
		super();
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.movimiento = movimiento; 
		this.edad = edad;
		this.nivel = nivel;
		this.experiencia = experiencia;

	}



	//metodo atacar

	public void setPuntosVida(double puntosVida) {
		this.puntosVida = puntosVida;
	}
	public double getPuntosVida() {
		return puntosVida = puntosVida;
	}


	//		public void atacar(Personaje p) {
	//			p.setPuntosVida(p.getPuntosVida()-1);
	//			this.experiencia++;
	//		}

	public String atacar(Personaje p) {
		p.setPuntosVida(getPuntosVida());
		this.experiencia ++;
		return this.nombre + " ha atacado a " + p.nombre;
	}


	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}

	public int getMovimiento() {
		return movimiento;
	}

	/*
		public void dormir(Personaje p){
			p.setMovimiento(p.getMovimiento()-100);
		}
	 */


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void atacar(Personaje[] arrayPersonajes) {


	}






}

//metodo defender




