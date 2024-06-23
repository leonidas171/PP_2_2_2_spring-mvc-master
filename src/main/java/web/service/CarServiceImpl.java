package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    public static int CARS_COUNT;

    @Override
    public List<Car> cars(Integer count) {
        List<Car> cars = new ArrayList<>();

        {

            cars.add(new Car(++CARS_COUNT, "model1", "red", 2011));
            cars.add(new Car(++CARS_COUNT, "model2", "orange", 2012));
            cars.add(new Car(++CARS_COUNT, "model3", "yellow", 2013));
            cars.add(new Car(++CARS_COUNT, "model4", "green", 2014));
            cars.add(new Car(++CARS_COUNT, "model5", "blue", 2015));

        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
