package pl.pozadr.thymeleafhello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.pozadr.thymeleafhello.model.Car;
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
        model.addAttribute("cars", carService.getCarList());
        model.addAttribute("newCar", new Car());
        model.addAttribute("modifyCar", new Car());
        model.addAttribute("delCar", new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car) {
        carService.addCar(car);
        return "redirect:/car";
    }

    @GetMapping("/delete-car")
    public String deleteCar(@ModelAttribute Car car) {
        carService.removeCar(car.getId());
        return "redirect:/car";
    }

    @GetMapping("/modify-car")
    public String modifyCar(@ModelAttribute Car car) {
        boolean delete = carService.removeCar(car.getId());
        boolean add = carService.addCar(car);
        if (delete && add) {
            return "redirect:/car";
        }
        return "fault";
    }
}
