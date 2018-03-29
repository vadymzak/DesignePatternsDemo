package ua.design.pattern.abstractFactory;

import ua.design.pattern.abstractFactory.color.Color;
import ua.design.pattern.abstractFactory.shape.Shape;

public class AbstractFMain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("Red");
        color1.fill();

        Color color2 = colorFactory.getColor("Blue");
        color2.fill();

        Color color3 = colorFactory.getColor("Green");
        color3.fill();

    }
}
