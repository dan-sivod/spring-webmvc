package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",required = false) String counter, ModelMap model){
        int count = 0;
        if ((counter != null) && (Integer.valueOf(counter) <= 5)) {
            count = Integer.valueOf(counter);
        } else {
            count = 5;
        }
        Car car1 = new Car("Camry", 40, "Toyota");
        Car car2 = new Car("M3", 50, "BMW");
        Car car3 = new Car("C180", 60, "Mercedes");
        Car car4 = new Car("Supra", 30, "Toyota");
        Car car5 = new Car("Logan", 7, "Reno");
        List<Car> cars2 = new ArrayList<>();
        cars2.add(car1);
        cars2.add(car2);
        cars2.add(car3);
        cars2.add(car4);
        cars2.add(car5);
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; ++i) {
            cars.add(cars2.get(i));
            System.out.println(cars.get(i));
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
