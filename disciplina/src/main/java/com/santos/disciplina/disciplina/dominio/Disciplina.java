package com.santos.disciplina.disciplina.dominio;

public class Disciplina {
	private String nome, professor, codigo_sala_classroom;
	private int id, periodo;

	public Disciplina(int id, String nome, String professor, int periodo, String codigo_sala_classroom) {
		super();
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.periodo = periodo;
		this.codigo_sala_classroom = codigo_sala_classroom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getCodigo_sala_classroom() {
		return codigo_sala_classroom;
	}

	public void setCodigo_sala_classroom(String codigo_sala_classroom) {
		this.codigo_sala_classroom = codigo_sala_classroom;
	}
}
