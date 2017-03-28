package consultorio;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author diego
Outra	classe	que	deve	ser	criada	é	Consulta.	
Esta	classe	possui	os	atributos	paciente,	médico,	
data e hora.Criar	dois	construtores,	os	métodos	get, toString	e	equal
 */
public class CONSULTA {

	private Paciente pac;
	private Médico med;
	private LocalTime hora;
	private LocalDate data;

	
	public CONSULTA(Paciente pac, Médico med, LocalTime hora, LocalDate data) {
		this.pac = pac;
		this.med = med;
		this.hora = hora;
		this.data = data;
	}

	public CONSULTA() {
		this.pac = null;
		this.med = null;
		this.hora = null;
		this.data = null;
	}

	// métodos Gets
	
	public Paciente getPac() {
		return pac;
	}

	public Médico getMed() {
		return med;
	}

	public LocalTime getHora() {
		return hora;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	
	public void setPac(Paciente pac) {
		this.pac = pac;
	}
	
	//Métodos Sets
	public void setMed(Médico med) {
		this.med = med;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
	public String toString() {
		return "\n\t CONSULTA [" + pac + " "
				+ "" + med + ", hora=" + hora + ", data=" + data + "]";
	}
	
}
