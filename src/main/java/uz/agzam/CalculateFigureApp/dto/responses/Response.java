package uz.agzam.CalculateFigureApp.dto.responses;

import uz.agzam.CalculateFigureApp.enums.TypeOfShape;

public class Response {
    private double area;
    private double perimeter;

    private TypeOfShape typeOfShape;

    public Response(){}

    public Response(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public Response(double area, double perimeter, TypeOfShape typeOfShape) {
        this.area = area;
        this.perimeter = perimeter;
        this.typeOfShape = typeOfShape;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getTypeOfShape() {
        return typeOfShape.name();
    }

    public void setTypeOfShape(TypeOfShape typeOfShape) {
        this.typeOfShape = typeOfShape;
    }
}
