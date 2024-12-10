package br.com.iconcourses.regesc.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="alunos")
public class Aluno {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer Idg;
		@Column(nullable=false)
		private String nome;
		private Integer idade;
		@ManyToMany(mappedBy="alunos")
		private List<Disciplina> disciplinas;
		
		
		public Aluno() {
			super();
		}


		public Aluno(String nome, Integer idade) {
			super();
			this.nome = nome;
			this.idade = idade;
			//this.disciplina = disciplina;
		}


		/**
		 * @return the idg
		 */
		public Integer getIdg() {
			return Idg;
		}


		/**
		 * @param idg the idg to set
		 */
		public void setIdg(Integer idg) {
			Idg = idg;
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
		 * @return the idade
		 */
		public Integer getIdade() {
			return idade;
		}


		/**
		 * @param idade the idade to set
		 */
		public void setIdade(Integer idade) {
			this.idade = idade;
		}


		/*@Override
		public String toString() {
			return "Aluno [Idg=" + Idg + ", nome=" + nome + ", idade=" + idade + ", disciplina=" + disciplina + "]";
		}
		*/
		
		
		
}



