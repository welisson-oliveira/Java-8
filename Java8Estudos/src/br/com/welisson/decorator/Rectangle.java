package br.com.welisson.decorator;

/**
 * {@link Rectangle}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
