package unb.bd.trab.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teste", schema="trabalho_bd")
public class Teste implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@Column
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
