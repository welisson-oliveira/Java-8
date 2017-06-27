package br.com.welisson.defaultMethods;

import br.com.welisson.classes.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * {@link MethodRemoveIf}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class MethodRemoveIf {

	public static void main(String... args){
		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			@Override
			public boolean test(Usuario usuario) {
				return usuario.getPontos() > 160;
			}
		};

		Usuario user1 = new Usuario("Welisson",150);
		Usuario user2 = new Usuario("Wilson",120);
		Usuario user3 = new Usuario("Oliveira",190);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		usuarios.removeIf(predicado);
		usuarios.forEach(u -> System.out.println(u.getNome()));

		System.out.println("\n\n\nCom Lambda");
		usuarios.clear();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		usuarios.removeIf(u -> u.getPontos() > 100 && u.getPontos() < 150);
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}
