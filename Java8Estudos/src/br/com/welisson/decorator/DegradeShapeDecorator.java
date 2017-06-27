package br.com.welisson.decorator;

/**
 * {@link DegradeShapeDecorator}
 *
 * @author Welisson Oliveira
 * @version 1.0 26/06/2017
 */
public class DegradeShapeDecorator extends ShapeDecorator {
	public DegradeShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {

		decoratedShape.draw();
		setDecoratedDegrade(decoratedShape);
	}

	private void setDecoratedDegrade(Shape decoratedShape){
		System.out.println("Degrade: SIM");
	}

}
