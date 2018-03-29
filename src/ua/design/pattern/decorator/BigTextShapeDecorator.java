package ua.design.pattern.decorator;

import ua.design.pattern.decorator.figure.Shape;

public class BigTextShapeDecorator extends ShapeDecorator{

    BigTextShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        bigText(decoratedShape);
    }

    private void bigText(Shape decoratedShape) {
        System.out.println("Big text");
    }

}
