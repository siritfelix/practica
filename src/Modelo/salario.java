package Modelo;

public class salario {
	private Float sueldo_neto;
	private Float sueldo_mano;
	private Float deducciones;
	private Persona persona;
	
	public Float sueldo_mano(Float sueldo_neto, Float deducciones) {
		sueldo_mano=sueldo_neto-sueldo_neto*deducciones;
		return sueldo_mano;
	}

	public Float getSueldo_neto() {
		return sueldo_neto;
	}

	public void setSueldo_neto(Float sueldo_neto) {
		this.sueldo_neto = sueldo_neto;
	}

	public Float getSueldo_mano() {
		return sueldo_mano;
	}

	public void setSueldo_mano(Float sueldo_mano) {
		this.sueldo_mano = sueldo_mano;
	}

	public Float getDeducciones() {
		return deducciones;
	}

	public void setDeducciones(Float deducciones) {
		this.deducciones = deducciones;
	}

}
