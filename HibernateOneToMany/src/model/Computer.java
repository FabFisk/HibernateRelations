package model;

import javax.persistence.*;

@Entity
public class Computer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String modello;
	
	@ManyToOne //In questo modo forzo a non creare la terza tabella
	private Persona persona;
	
	public Computer() {
		this.modello = "";
	}	
	public Computer(long id, String modello) {
		this.id = id;
		this.modello = modello;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
