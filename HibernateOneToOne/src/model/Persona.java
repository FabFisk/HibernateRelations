package model;

import javax.persistence.*;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String cognome;
	
	@OneToOne
	private Computer computer;
	
	public Persona(){
		this.nome = "";
		this.cognome = "";
	}
	public Persona(long id, String nome, String cognome){
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
}
