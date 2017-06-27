package br.com.welisson.classes;

/**
 * {@link Usuario}
 *
 * @author Welisson Oliveira
 * @version 1.0 19/06/2017
 */

public class Usuario {
	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos){
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}

	public Usuario() {
		this.moderador = false;
	}

	public Usuario(String nome){
		this.nome = nome;
		this.moderador = false;
	}

	public String getNome(){
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void tornarModerador(){
		this.moderador = true;
	}

	public boolean isModerador(){
		return moderador;
	}

	@Override
	public String toString() {
		return "Usuario: "+getNome();
	}
}

