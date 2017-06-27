package br.com.welisson.decorator;

/**
 * {@link DecoratorPatternDemo}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {

//		Shape circle = new Circle();
//		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(circle);
		Shape degrade = new DegradeShapeDecorator(redCircle);


		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nCircle of Degrade");
		degrade.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}
