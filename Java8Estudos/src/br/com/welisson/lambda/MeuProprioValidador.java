package br.com.welisson.lambda;

import br.com.welisson.classes.Validador;

/**
 * {@link MeuProprioValidador}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class MeuProprioValidador {
	public static void main(String... args){


		//classe anonima
		Validador<String> validador = new Validador<String>() {
			@Override public boolean valida(String s) {
				return s.matches("[0-9]{5}-[0-9]{3}");
			}
		};
		validador.valida("12227-801");
		//fim classe anonima

		//Lambda
		Validador<String> validadorCEP = valor -> { return valor.matches("[0-9]{5}-[0-9]{3}");};
		validadorCEP.valida("12227-801");

		//Lambda Simplificado
		Validador<String> validadorCEPSimplificado = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		validadorCEPSimplificado.valida("12227-8010");


	}
}
