package model;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

@Entity
public class Computer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String modello;
	
	@ManyToMany
	private Set<Persona> persone;
	
	public Computer() {
		this.modello = "";
		this.persone = new HashSet<Persona>();
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
	public Set<Persona> getPersone() {
		return persone;
	}
	public void setPersone(Set<Persona> persone) {
		this.persone = persone;
	}
	public void addPersone(Persona p){
		this.persone.add(p);
	}
	
}
