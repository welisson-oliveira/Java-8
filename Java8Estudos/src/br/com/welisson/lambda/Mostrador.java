package br.com.welisson.lambda;

import java.util.function.Consumer;

/**
 * {@link Mostrador}
 *
 * @author Welisson Oliveira
 * @version 1.0 19/06/2017
 */
public class Mostrador implements Consumer<Usuario> {

	public void accept(Usuario usuario) {
		System.out.println(usuario.getNome());
	}
}
