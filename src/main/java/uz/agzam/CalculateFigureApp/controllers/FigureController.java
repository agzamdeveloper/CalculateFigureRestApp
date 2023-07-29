package uz.agzam.CalculateFigureApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.agzam.CalculateFigureApp.dto.requests.*;
import uz.agzam.CalculateFigureApp.dto.responses.Response;
import uz.agzam.CalculateFigureApp.services.CalculateService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FigureController {
    private final CalculateService calculateService;

    @Autowired
    public FigureController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @PostMapping("/calculate-shape")
    public Response calculateShape(@RequestBody ShapeRequest request){
        return calculateService.calculateShape(request);
    }

    @PostMapping("/calculate-shape-list")
    public List<Response> calculateShapeList(@RequestBody ShapeListRequest request){
        return calculateService.calculateShapeList(request);
    }

}
