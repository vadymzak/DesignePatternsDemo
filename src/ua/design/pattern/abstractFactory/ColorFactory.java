package ua.design.pattern.abstractFactory;

import ua.design.pattern.abstractFactory.color.Blue;
import ua.design.pattern.abstractFactory.color.Color;
import ua.design.pattern.abstractFactory.color.Green;
import ua.design.pattern.abstractFactory.color.Red;
import ua.design.pattern.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null)return null;
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }else if (color.equalsIgnoreCase("Blue")){
            return new Blue();
        }else if (color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }
}
