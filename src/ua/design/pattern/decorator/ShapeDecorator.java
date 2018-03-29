package ua.design.pattern.decorator;

import ua.design.pattern.decorator.figure.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
