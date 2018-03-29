package ua.design.pattern.decorator;

import ua.design.pattern.decorator.figure.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color - red");
    }
}
