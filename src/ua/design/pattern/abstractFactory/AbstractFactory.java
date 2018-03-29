package ua.design.pattern.abstractFactory;

import ua.design.pattern.abstractFactory.color.Color;
import ua.design.pattern.abstractFactory.shape.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
