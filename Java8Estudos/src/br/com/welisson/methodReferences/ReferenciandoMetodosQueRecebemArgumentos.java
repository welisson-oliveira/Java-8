package br.com.welisson.methodReferences;

import br.com.welisson.classes.Usuario;

import java.util.Arrays;
import java.util.List;

/**
 * {@link ReferenciandoMetodosQueRecebemArgumentos}
 *
 * @author Welisson Oliveira
 * @version 1.0 27/06/2017
 */
public class ReferenciandoMetodosQueRecebemArgumentos {

	public static void main(String... args){

		//o compilador sabe que ao iterar um
		//uma lista de usu�rios, a cada itera��o do m�todo forEach teremos um objeto do
		//	tipo Usuario , e infere que esse � o par�metro que dever� ser passado ao
		// method reference.
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		usuarios.forEach(System.out::println);

		//
	}
}
