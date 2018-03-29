package ua.design.pattern.abstractFactory;

import ua.design.pattern.abstractFactory.color.Color;
import ua.design.pattern.abstractFactory.shape.Circle;
import ua.design.pattern.abstractFactory.shape.Rectangle;
import ua.design.pattern.abstractFactory.shape.Shape;
import ua.design.pattern.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        if(shape == null)return null;
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
