package br.com.welisson.defaultMethods;

import br.com.welisson.classes.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * {@link MethodAndThen}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class MethodAndThen {
	public static void main(String... args){
		Usuario user1 = new Usuario("Welisson",150);
		Usuario user2 = new Usuario("Wilson",120);
		Usuario user3 = new Usuario("Oliveira",190);

		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);

		Consumer<Usuario> mostraMostragem = u -> System.out.println("antes de imprimir os nomes");

		Consumer<Usuario> imprimeNomes = u -> System.out.println(u.getNome());

		usuarios.forEach(mostraMostragem.andThen(imprimeNomes));
	}
}
