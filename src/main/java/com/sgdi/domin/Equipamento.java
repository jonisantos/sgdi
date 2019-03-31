package com.sgdi.domin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sgdi.enums.Entidade;

@Entity
public class Equipamento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private String serie;
	private String descricao;

	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="tipoEquipamento_id")
	private TipoEquipamento tipoEquipamento;
	
	private Integer entidade;
	
	@ManyToOne
	@JoinColumn(name="unidade_id")
	private Unidade unidade;

	public Equipamento() {

	}

	public Equipamento(Long id, String numero, String serie, String descricao, Marca marca,
			TipoEquipamento tipoEquipamento, Entidade entidade, Unidade unidade) {
		this.id = id;
		this.numero = numero;
		this.serie = serie;
		this.descricao = descricao;
		this.marca = marca;
		this.tipoEquipamento = tipoEquipamento;
		this.entidade = entidade.getCod();
		this.unidade = unidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public TipoEquipamento getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public Integer getEntidade() {
		return entidade;
	}

	public void setEntidade(Integer entidade) {
		this.entidade = entidade;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
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
		Equipamento other = (Equipamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
		
}
