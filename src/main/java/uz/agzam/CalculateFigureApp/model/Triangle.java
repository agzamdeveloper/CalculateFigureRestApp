package uz.agzam.CalculateFigureApp.model;

import lombok.Builder;

@Builder
public class Triangle {
    private Double sideA;

    private Double sideB;

    private Double cornerDegree;

    public Triangle() {}

    public Triangle(Double sideA, Double sideB, Double cornerDegree) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.cornerDegree = cornerDegree;
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

    public Double getCornerDegree() {
        return cornerDegree;
    }

    public void setCornerDegree(Double cornerDegree) {
        this.cornerDegree = cornerDegree;
    }
}
