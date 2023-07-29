package uz.agzam.CalculateFigureApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;
import uz.agzam.CalculateFigureApp.enums.TypeOfShape;

@Data
@Builder(toBuilder = true)
public class Shape {
    @JsonProperty("side_a")
    @Positive(message = "sides of shape must be positive")
    private Double sideA;

    @JsonProperty("side_b")
    @Positive(message = "sides of shape must be positive")
    private Double sideB;

    @JsonProperty("side_с")
    @Positive(message = "sides of shape must be positive")
    private Double sideС;

    @JsonProperty("corner_degree")
    @Max(value = 360, message = "corner must not be more than 360")
    @Positive(message = "corner must be more then zero")
    private Double cornerDegree;

    @JsonProperty("radius")
    @Positive(message = "radius of circle must be positive")
    private Double radius;
    private Double area;

    private Double perimeter;

    @JsonProperty("type")
    @NotBlank(message = "type of shape must be declared")
    private TypeOfShape typeOfShape;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public TypeOfShape getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(TypeOfShape typeOfShape) {
        this.typeOfShape = typeOfShape;
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

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getSideС() {
        return sideС;
    }

    public void setSideС(Double sideС) {
        this.sideС = sideС;
    }
}
