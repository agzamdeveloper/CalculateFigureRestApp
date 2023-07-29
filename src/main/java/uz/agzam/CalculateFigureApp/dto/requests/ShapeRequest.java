package uz.agzam.CalculateFigureApp.dto.requests;

import jakarta.validation.constraints.NotNull;
import uz.agzam.CalculateFigureApp.model.Shape;

public class ShapeRequest {
    @NotNull
    private Shape shape;


    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
