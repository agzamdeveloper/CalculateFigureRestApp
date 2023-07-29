package uz.agzam.CalculateFigureApp.model;

import lombok.Builder;

@Builder
public class Rectangle {
    private Double sideA;

    private Double sideB;

    public Rectangle() {}

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }
}
