package uz.agzam.CalculateFigureApp.dto.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.agzam.CalculateFigureApp.model.Shape;

import java.util.List;

public class ShapeListRequest {
    @JsonProperty("shape_list")
    private List<Shape> shapeList;

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }
}
