package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String cognome;
				
				//insieme al ManyToOne...stesso scopo
	@OneToMany (fetch=FetchType.EAGER, mappedBy="persona", cascade=CascadeType.ALL)
	@NotFound(action=NotFoundAction.IGNORE)
	private Set<Computer> computers;
	
	
	
	public Persona(){
		this.nome = "";
		this.cognome = "";
		this.computers = new HashSet<Computer>();
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
	public Set<Computer> getComputers() {
		return computers;
	}
	public void setComputers(Set<Computer> computers) {
		this.computers = computers;
	}
	public void addComputers(Computer c){
		this.computers.add(c);
	}
	
	
	
	
}
