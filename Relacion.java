public class Relacion {

	public static void main(String[] args) {
		Persona p1 = new Persona("Alberto");
		Persona p2 = new Persona("Carolina");
		Persona p3 = new Persona("Blanca");
		Taxi t1 = new Taxi();
		Taxi t2 = new Taxi();
		Relacion r = new Relacion();
		r.agregarP(p1);
		r.agregarP(p2);
		r.agregarP(p3);
		r.agregarT(t1);
		r.agregarT(t2);
		r.mejorExp();
		

		
	}

	private LinkedList <Taxi> vehiculo;
	private LinkedList <Persona> pasajeros;
	
	public Relacion () {
		this.setVehiculo(new LinkedList());
		this.setPasajeros(new LinkedList());
	}
	
	public void agregarP(Persona a) {
		this.getPasajeros().add(a);
	}
	
	public void agregarT(Taxi a) {
		this.getVehiculo().add(a);
	}
	
	public void mejorExp(){
		for (Persona p : this.getPasajeros()) {
			for (Persona p2 : this.getPasajeros()) {
				if (!p2.equals(p)) {
					for (Persona p3 : this.getPasajeros()) {
						if (!p3.equals(p2)&& !p.equals(p3)) {
							for (Taxi t : this.getVehiculo()) {								
								for (Taxi t2 : this.getVehiculo()) {									
									if (!t.equals(t2)) {
										t.subirPasajero(p);
										t.subirPasajero(p2);
										t2.subirPasajero(p3);
										if ((t.comprobar("Alberto") && t.comprobar("Carolina"))||(t2.comprobar("Alberto") && t2.comprobar("Carolina"))){
											System.out.println(this.getVehiculo().getFirst()+" "+this.getVehiculo().getLast()+" VERDADERO");
											}
											else System.out.println(this.getVehiculo().getFirst()+" "+this.getVehiculo().getLast()+" FALSO");
										this.getVehiculo().getFirst().bajarP();
										this.getVehiculo().getLast().bajarP();										
									}
								}
							}
						}		
					}
				}
			}
		}
	}
	
	public LinkedList<Taxi> getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(LinkedList<Taxi> vehiculo) {
		this.vehiculo = vehiculo;
	}
	public LinkedList<Persona> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(LinkedList<Persona> pasajeros) {
		this.pasajeros = pasajeros;
	}
}
