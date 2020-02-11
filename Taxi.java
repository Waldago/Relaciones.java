public class Taxi {

	private LinkedList <Persona> pasajero;
	private int patente;
	private static int CONT=1;
	
	public Taxi() {
		this.setPasajero(new LinkedList());
		this.setPatente(CONT);
		CONT++;
	}
	
	public boolean subirPasajero(Persona a) {
		if (this.getPasajero().size()<2) {
			this.getPasajero().add(a);
		}
		return false;
	}
	
	public void bajarP() {
		this.getPasajero().clear();
	}

	public LinkedList<Persona> getPasajero() {
		return pasajero;
	}

	public void setPasajero(LinkedList<Persona> pasajero) {
		this.pasajero = pasajero;
	}

	public int getPatente() {
		return patente;
	}

	public void setPatente(int patente) {
		this.patente = patente;
	}

	public boolean comprobar(String s) {
		if(this.getPasajero().getFirst().getNombre()==s || this.getPasajero().getLast().getNombre()==s ) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Taxi:" + patente + pasajero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pasajero == null) ? 0 : pasajero.hashCode());
		result = prime * result + patente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taxi other = (Taxi) obj;
		if (pasajero == null) {
			if (other.pasajero != null)
				return false;
		} else if (!pasajero.equals(other.pasajero))
			return false;
		if (patente != other.patente)
			return false;
		return true;
	}


	
	
}
