package br.com.welisson.lambda;

/**
 * {@link VariaveisLocais}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class VariaveisLocais {
	public static void main(String... args){
		final int n1 = 10;
		int n2 = 15;

		new Thread(() -> {
			System.out.println(n1+" "+n2);
		}).start();
//		não compilaria, caso essa linha estivesse descomentada
//		n2 = 20;
	}
}
