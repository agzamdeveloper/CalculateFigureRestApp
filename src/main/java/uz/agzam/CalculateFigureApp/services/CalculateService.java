package uz.agzam.CalculateFigureApp.services;

import org.springframework.stereotype.Service;
import uz.agzam.CalculateFigureApp.dto.requests.ShapeRequest;
import uz.agzam.CalculateFigureApp.dto.requests.ShapeListRequest;
import uz.agzam.CalculateFigureApp.dto.responses.Response;
import uz.agzam.CalculateFigureApp.enums.TypeOfShape;
import uz.agzam.CalculateFigureApp.model.*;
import uz.agzam.CalculateFigureApp.util.ShapeBuilder;

import java.util.LinkedList;
import java.util.List;

@Service
public class CalculateService {

    public Response calculateSquare(Square square) {
        double area = Math.pow(square.getSideA(), 2);
        double perimeter = square.getSideA() * 4;

        return new Response(area, perimeter, TypeOfShape.SQUARE);
    }

    public Response calculateRectangle(Rectangle rectangle) {
        double area = rectangle.getSideA() * rectangle.getSideB();
        double perimeter = 2 * (rectangle.getSideA() + rectangle.getSideB());

        return new Response(area, perimeter, TypeOfShape.RECTANGLE);
    }

    public Response calculateTriangle(Triangle triangle) {
        // S = 1/2absinY
        double area = 0.5 * triangle.getSideA() * triangle.getSideB() *
                Math.abs(Math.sin(Math.toRadians(triangle.getCornerDegree())));

        //  a=√b2+c2-2bccosγ
        double sideC = Math.sqrt(Math.pow(triangle.getSideA(), 2) + Math.pow(triangle.getSideB(), 2) -
                2 * triangle.getSideA() * triangle.getSideB() * Math.cos(Math.toRadians(triangle.getCornerDegree())));

        double perimeter = triangle.getSideA() + triangle.getSideB() + sideC;

        return new Response(area, perimeter, TypeOfShape.TRIANGLE);
    }

    public Response calculateCircle(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        double circumference = 2 * Math.PI * circle.getRadius();

        return new Response(area, circumference, TypeOfShape.CIRCLE);
    }

    public Response calculateShape(ShapeRequest request) {
        Response response = null;
        switch (request.getShape().getTypeOfShape()) {
            case CIRCLE -> response = calculateCircle(ShapeBuilder.circle(request.getShape()));
            case SQUARE -> response = calculateSquare(ShapeBuilder.square(request.getShape()));
            case RECTANGLE -> response = calculateRectangle(ShapeBuilder.rectangle(request.getShape()));
            case TRIANGLE -> response = calculateTriangle(ShapeBuilder.triangle(request.getShape()));
        }
        return response;
    }

    public List<Response> calculateShapeList(ShapeListRequest request) {
        List<Response> responseList = new LinkedList<>();
        for (Shape shape : request.getShapeList()) {
            switch (shape.getTypeOfShape()) {
                case CIRCLE -> responseList.add(calculateCircle(ShapeBuilder.circle(shape)));
                case SQUARE -> responseList.add(calculateSquare(ShapeBuilder.square(shape)));
                case RECTANGLE -> responseList.add(calculateRectangle(ShapeBuilder.rectangle(shape)));
                case TRIANGLE -> responseList.add(calculateTriangle(ShapeBuilder.triangle(shape)));
            }
        }
        return responseList;
    }
}
