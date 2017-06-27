package br.com.welisson.classes;

/**
 * {@link Validador}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
@FunctionalInterface//informa que a interface � funcional e nao permite a adi��o de um novo metodo.
public interface Validador<T> {
	boolean valida(T t);
}
