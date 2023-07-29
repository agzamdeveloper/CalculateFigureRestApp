package uz.agzam.CalculateFigureApp.util;

import uz.agzam.CalculateFigureApp.model.*;

public class ShapeBuilder {
    private Shape shape;

    public static Circle circle(Shape shape){
        Shape.ShapeBuilder shapeCircle = Shape.builder().radius(shape.getRadius());
        return new Circle(shapeCircle.build().getRadius());
    }

    public static Square square(Shape shape){
        Shape.ShapeBuilder shapeSquare = Shape.builder().sideA(shape.getSideA());
        return new Square(shapeSquare.build().getSideA());
    }

    public static Rectangle rectangle(Shape shape){
        Shape.ShapeBuilder shapeRectangle = Shape.builder()
                .sideA(shape.getSideA())
                .sideB(shape.getSideB());
        Shape rectangle = shapeRectangle.build();
        return new Rectangle(rectangle.getSideA(), rectangle.getSideB());
    }

    public static Triangle triangle(Shape shape){
        Shape.ShapeBuilder shapeTriangle = Shape.builder()
                .sideA(shape.getSideA())
                .sideB(shape.getSideB())
                .cornerDegree(shape.getCornerDegree());
        Shape triangle = shapeTriangle.build();
        return new Triangle(triangle.getSideA(), triangle.getSideB(), triangle.getCornerDegree());
    }
}
