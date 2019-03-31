package com.sgdi.domin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgdi.enums.Entidade;

@Entity
public class Unidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	private Integer entidade;
	
	@JsonIgnore
	@OneToMany(mappedBy="unidade")
	private List<Setor> setores = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="unidade")
	private List<Equipamento> equipamenos = new ArrayList<>();
	
	public Unidade() {	
	}

	public Unidade(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	

	public Unidade(Long id, String nome, Entidade entidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.entidade = entidade.getCod();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Entidade getEntidade() {
		return Entidade.toEnum(entidade);
	}

	public void setEntidade(Integer entidade) {
		this.entidade = entidade;
	}	

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Unidade other = (Unidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
