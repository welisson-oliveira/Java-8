package br.com.welisson.lambda;

public class Main {

	public static void main(String args[]) {
		Runnable run = () -> System.out.println("O que sou eu? Que Lambda?");

		run.run();
		System.out.println(run);
		System.out.println(run.getClass());
	}
}
