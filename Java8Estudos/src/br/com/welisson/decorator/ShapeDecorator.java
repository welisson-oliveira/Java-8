package br.com.welisson.decorator;

/**
 * {@link ShapeDecorator}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}

	public void draw(){
		decoratedShape.draw();
	}
}
