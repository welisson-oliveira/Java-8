package br.com.welisson.ordenacao;

import br.com.welisson.classes.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/**
 * {@link OrdenandoNoJava8}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class OrdenandoNoJava8 {

	public static void main(String... args){
		Usuario user1 = new Usuario("Welisson",150);
		Usuario user2 = new Usuario("Wilson",120);
		Usuario user3 = new Usuario("Oliveira",190);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		usuarios.forEach(u -> System.out.println(u.getNome()));

		//forma mais sucinta, acessando o metodo default da interface List
		usuarios.sort((u1, u2) -> u2.getNome().compareTo(u1.getNome()));
		usuarios.forEach(u -> System.out.println(u.getNome()));

		//utilizando o método statico comparing da interface List, que é uma factory de comparators
		usuarios.sort(Comparator.comparing(u -> u.getNome()));
		usuarios.forEach(u -> System.out.println(u.getNome()));

		List<String> palavras =
				Arrays.asList("Casa do Código", "Alura", "Caelum");
		palavras.sort(Comparator.reverseOrder());
		palavras.forEach(u -> System.out.println(u));

		//entendendo melhor o comparing
		Function<Usuario, String> extraiNome = u -> u.getNome();
		Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
		usuarios.sort(comparator);

		ToIntFunction<Usuario> extraiPontos = u -> u.getPontos();
		Comparator<Usuario> intComparator = Comparator.comparingInt(extraiPontos);
		usuarios.sort(intComparator);

		//versão mais enxuta
		usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));

	}
}
