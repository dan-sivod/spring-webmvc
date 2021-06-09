package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    List<Car> listCars = new ArrayList<>();

    public CarServiceImp(){
        Car car1 = new Car("Camry", 40, "Toyota");
        Car car2 = new Car("M3", 50, "BMW");
        Car car3 = new Car("C180", 60, "Mercedes");
        Car car4 = new Car("Supra", 30, "Toyota");
        Car car5 = new Car("Logan", 7, "Reno");
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);
    }

    public List<Car> getListCars(int count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
