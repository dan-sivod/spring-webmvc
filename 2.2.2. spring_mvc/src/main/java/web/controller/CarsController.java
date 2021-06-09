package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",required = false) String counter, ModelMap model){
        int count;
        if ((counter != null) && (Integer.valueOf(counter) <= 5)) {
            count = Integer.valueOf(counter);
        } else {
            count = 5;
        }
        CarService carService = new CarServiceImp();
        model.addAttribute("cars", carService.getListCars(count));
        return "cars";
    }
}
