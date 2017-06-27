package br.com.welisson.decorator;

/**
 * {@link Circle}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class Circle implements Shape{
	@Override public void draw() {
		System.out.println("Shape: Circle");
	}
}
