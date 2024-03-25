package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    public static List<Car> getCars(List<Car> cars, int qty){
        return cars.subList(0, qty);
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, ModelMap model){
        System.out.println(count);
        List<Car> cars = new ArrayList<>();
        List<Car> new_cars = new ArrayList<>();
        cars.add(new Car("Car1",1,5000));
        cars.add(new Car("Car2",2,5005));
        cars.add(new Car("Car3",3,5010));
        cars.add(new Car("Car4",4,5015));
        cars.add(new Car("Car5",5,5020));
        new_cars = getCars(cars, count);
        model.addAttribute("cars", new_cars);
        return "cars";
    }
}
