package br.com.welisson.methodReferences;

import br.com.welisson.classes.Usuario;

/**
 * {@link ReferenciandoMetodosDeInstancia}
 *
 * @author Welisson Oliveira
 * @version 1.0 27/06/2017
 */
public class ReferenciandoMetodosDeInstancia {

	public static void main(String... args){
		Usuario welisson = new Usuario("Welisson Oliveira", 300);
		Runnable bloco = welisson::tornarModerador;
		bloco.run();

		// para ficar mais nitido os dois blocos são equivalentes
		Runnable runnable1 = welisson::tornarModerador;
		Runnable runnable2 = () -> welisson.tornarModerador();

	}
}
