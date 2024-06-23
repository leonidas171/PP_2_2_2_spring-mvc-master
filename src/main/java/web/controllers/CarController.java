package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import org.springframework.ui.ModelMap;

@Controller
public class CarController {

    private CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String index(@RequestParam(defaultValue = "5") Integer count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carServiceImpl.cars(count));
        return "cars";
    }
}