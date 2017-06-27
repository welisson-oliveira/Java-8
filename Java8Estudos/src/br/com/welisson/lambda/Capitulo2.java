package br.com.welisson.lambda;

import br.com.welisson.classes.Mostrador;
import br.com.welisson.classes.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * {@link Capitulo2} 
 * Lambda e uma maneira mais simples de implementar uma interface qe so tem um unico metodo
 * @author Welisson Oliveira
 * @version 1.0 19/06/2017
 */
public class Capitulo2 {
	public static void main(String[] args){
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		// Arrays.asList é uma maneira simples de criar um List imutável.
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		//Modo antigo
		System.out.println("Modo Antigo:");
		for(Usuario u : usuarios){
			System.out.println(u.getNome());
		}

		System.out.println();

		//Java 8 implementando Interface Consumer
		System.out.println("Java 8 - implementando Interface Consumer:");
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);

		System.out.println();

		System.out.println("Java 8 - utilizando classe anônima:");
		Consumer<Usuario> usuarioConsumer = new Consumer<Usuario>() {
			@Override
			public void accept(Usuario usuario) {
				System.out.println(usuario.getNome());
			}
		};
		usuarios.forEach(usuarioConsumer);

		System.out.println();

		System.out.println("Java 8 - diminuindo o codigo evitando a criação da variavel local usuarioConsumer:");
		usuarios.forEach(new Consumer<Usuario>(){
			public void accept(Usuario usuario){
				System.out.println(usuario.getNome());
			}
		});

		System.out.println();

		System.out.println("Enfim a magica do Lambda:");
		System.out.println("CastExplicito:");
		Consumer<Usuario> usuarioConsumerComCastExplicito = (Usuario u) -> {System.out.println(u.getNome());};
		usuarios.forEach(usuarioConsumerComCastExplicito);

		System.out.println();

		System.out.println("CastImplicito:");
		Consumer<Usuario> usuarioConsumerComCastImplicito = u -> {System.out.println(u.getNome());};
		usuarios.forEach(usuarioConsumerComCastImplicito);

		System.out.println();

		System.out.println("Caso o bloco dentro de { } contenha apenas uma instrução,\n"
				+ "podemos omiti-lo e remover também o ponto e vírgula:");
		Consumer<Usuario> semchaves = u -> System.out.println(u.getNome());
		usuarios.forEach(semchaves);

		System.out.println();

		System.out.println("PQP que fodaaaaaa:");
		usuarios.forEach(u -> System.out.println(u.getNome()));

		usuarios.forEach(u -> u.tornarModerador());

	}
}
