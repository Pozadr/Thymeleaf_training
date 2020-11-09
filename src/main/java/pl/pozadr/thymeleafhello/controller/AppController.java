package pl.pozadr.thymeleafhello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pozadr.thymeleafhello.service.CarService;

@Controller
public class AppController {
    private final CarService carService;

    @Autowired
    public AppController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("carId1", carService.getCarById(1L).get());
        model.addAttribute("carId2", carService.getCarById(2L).get());
        model.addAttribute("carId3", carService.getCarById(3L).get());
        return "car";
    }
}
