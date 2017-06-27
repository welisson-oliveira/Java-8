package br.com.welisson.methodReferences;

import br.com.welisson.classes.Usuario;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * {@link ReferenciandoConstrutores}
 *
 * @author Welisson Oliveira
 * @version 1.0 27/06/2017
 */
public class ReferenciandoConstrutores {

	public static void main(String... args){

		//supplier é utilizado para instanciar uma classe com o construtor default
		Supplier<Usuario> criadorDeUsuarios = Usuario::new;
		Usuario novo = criadorDeUsuarios.get();

		//utilizando function para instanciar uma classe com o construtor que possui argumentos
		Function<String, Usuario> criadorDeUsuariosComArgumento = Usuario::new;
		Usuario welisson = criadorDeUsuariosComArgumento.apply("Welisson");
		Usuario oliveira = criadorDeUsuariosComArgumento.apply("oliveira");

		BiFunction<String, Integer, Usuario> criadorDeUsuariosComVariosArgumentos = Usuario::new;
		Usuario usr1 = criadorDeUsuariosComVariosArgumentos.apply("usr1",300);
		Usuario usr2 = criadorDeUsuariosComVariosArgumentos.apply("usr2",400);
		Usuario usr3 = criadorDeUsuariosComVariosArgumentos.apply("usr3",500);

//		Também consigo usar constructor reference com um array, mas neste
//		caso a sintaxe vai mudar um pouco. Basta adicionar os colchetes do array
//		antes do delimitador :: , por exemplo: int[]::new .
	}
}
