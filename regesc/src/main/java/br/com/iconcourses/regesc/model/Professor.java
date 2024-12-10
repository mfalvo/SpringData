package br.com.iconcourses.regesc.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="professores")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_professor;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false, unique = true)
	private String prontuario;
	@OneToMany(mappedBy="professor", fetch=FetchType.EAGER)
	private List<Disciplina> Disciplinas;
	
	@Deprecated
	public Professor() {
		super();
	}


	public Professor(String nome, String prontuario, List<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.prontuario = prontuario;
		Disciplinas = disciplinas;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the prontuario
	 */
	public String getProntuario() {
		return prontuario;
	}


	/**
	 * @param prontuario the prontuario to set
	 */
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}


	/**
	 * @return the disciplinas
	 */
	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}


	/**
	 * @param disciplinas the disciplinas to set
	 */
	public void setDisciplinas(List<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	
	
	
	
	
}
