package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model){
        Car car1 = new Car("Camry", 40, "Toyota");
        Car car2 = new Car("M3", 50, "BMW");
        Car car3 = new Car("C180", 60, "Mercedes");
        Car car4 = new Car("Supra", 30, "Toyota");
        Car car5 = new Car("Logan", 7, "Reno");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
