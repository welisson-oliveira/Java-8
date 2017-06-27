package br.com.welisson.methodReferences;

import br.com.welisson.classes.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/**
 * {@link OrdenandoNoJava8}
 *
 * @author Welisson Oliveira
 * @version 1.0 27/06/2017
 */
public class OrdenandoNoJava8 {
	public static void main(String... args) {
		Usuario user1 = new Usuario("Welisson", 150);
		Usuario user2 = new Usuario("Wilson", 120);
		Usuario user3 = new Usuario("Oliveira", 190);
		Usuario user4 = null;

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);


		Collections.sort(usuarios, (u1, u2) -> u2.getNome().compareTo(u1.getNome()));
		usuarios.forEach(u -> System.out.println(u.getNome()));

		System.out.println("-----------------------");

		usuarios.sort(Comparator.comparing(Usuario::getNome));
		usuarios.forEach(System.out::println);

		System.out.println("-----------------------");

		Function<Usuario, String> byName = Usuario::getNome;
		Comparator comparator = Comparator.comparing(byName);
		usuarios.sort(comparator);
		usuarios.forEach(System.out::println);

		System.out.println("-----------------------");

		ToIntFunction<Usuario> byPontos = Usuario::getPontos;
		Comparator intComparator = Comparator.comparingInt(byPontos);
		usuarios.sort(intComparator);
		usuarios.forEach(System.out::println);

		System.out.println("-----------------------");

		//filtrar por mais de um atributo
		Comparator<Usuario> comparatorOfMoreThanOneAttribute = Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome);
		usuarios.sort(comparatorOfMoreThanOneAttribute);
		usuarios.forEach(System.out::println);

		System.out.println("-----------------------");

		//ordenando DEC por nome e deixando os nulos na frente;
		usuarios.add(user4);
		usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome).reversed()));
		System.out.println("\nTestando");
		usuarios.forEach((u) -> {
			final String s = u == null ? "" : u.getNome();
			System.out.println(s);
		});


	}
}
