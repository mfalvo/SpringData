package br.com.iconcourses.regesc.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="disciplinas")
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String Nome;
	private Integer semestre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_professor", nullable = true)
	private Professor professor;
	
	@ManyToMany
	@JoinTable(name="disciplinas_alunos",
			joinColumns = @JoinColumn(name = "disciplina_fk"),
			inverseJoinColumns = @JoinColumn(name="aluno_fk"))
	private List<Aluno> alunos;

	
	
	@Deprecated
	public Disciplina() {
		super();
	}

	public Disciplina(String nome, Integer semestre, Professor professor,  Aluno aluno) {
		super();
		Nome = nome;
		this.semestre = semestre;
		this.professor = professor;
		//this.aluno = aluno;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the semestre
	 */
	public Integer getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre the semestre to set
	 */
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/**
	 * @return the disciplina
	 */
	//public Aluno getAluno() {
	//	return aluno;
	//}

	/**
	 * @param disciplina the disciplina to set
	 */
	//public void setAluno(Aluno aluno) {
	//	this.aluno = aluno;
	//}

	//@Override
	//public String toString() {
	//	return "Disciplina [id=" + id + ", Nome=" + Nome + ", semestre=" + semestre + ", professor=" + professor
	//			+ ", aluno=" + aluno + "]";
	//}
	
	
	
	
}
