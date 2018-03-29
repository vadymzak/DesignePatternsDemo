package ua.design.pattern.decorator;

import ua.design.pattern.decorator.figure.Circle;
import ua.design.pattern.decorator.figure.Rectangle;
import ua.design.pattern.decorator.figure.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(circle);

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        Shape redCircleAndBigText = new BigTextShapeDecorator(new RedShapeDecorator(new Circle()));

        redCircleAndBigText.draw();
        /*System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();*/

    }
}
