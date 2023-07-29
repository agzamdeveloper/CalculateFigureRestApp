package uz.agzam.CalculateFigureApp.model;

import lombok.Builder;

@Builder
public class Square {
    private Double sideA;

    public Square(){}

    public Square(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }
}
