package br.com.welisson.lambda;

/**
 * {@link Capitulo3}
 *
 * @author Welisson Oliveira
 * @version 1.0 20/06/2017
 */
public class Capitulo3 {

	public static void main(String... args){
		new Thread(() -> {
			for (int i = 0; i <= 100000; i++){
				System.out.print(i+" ");
			}
		}).start();

		Runnable r2 = () -> {
			for (int i = 100001; i <= 200000; i++){
				System.out.print(i+" ");
			}
		};

		new Thread(r2).start();
	}

	
}
