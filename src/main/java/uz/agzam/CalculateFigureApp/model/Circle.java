package uz.agzam.CalculateFigureApp.model;

import lombok.Builder;

@Builder
public class Circle {
    private Double radius;

    public Circle(){}

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
