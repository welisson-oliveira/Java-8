package br.com.welisson.generics;

import br.com.welisson.classes.Usuario;

import java.util.Arrays;
import java.util.List;

/**
 * {@link TrabalhandoComMetodos}
 *
 * @author Welisson Oliveira
 * @version 1.0 27/06/2017
 */
public class TrabalhandoComMetodos {

	public List<Object> objects;
	public List<Usuario> usuarios;

	public TrabalhandoComMetodos(){
		Arrays.asList("Objeto 1", "Objeto 2", "Objeto 3");
		Arrays.asList(new Usuario("Welisson",10), new Usuario("Wilson", 20), new Usuario("Oliveira", 30));
	}

	public static void main(String... args){

	}

	/**
	 * não compila, pois nao retorna uma lista de Object
	 * @return
	 * public List<Object> getUsuarios(){
	 *		return this.usuarios;
	 * }
	 * pra funcionar deve retornar uma lista de object ou uma lista de objetos que extendam object
	 */
	public List<Object> getObjects(){
		return this.objects;
	}

	public List<? extends Object> getUsuarios(){
		return this.usuarios;
	}



}
