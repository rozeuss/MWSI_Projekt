package users;

import java.util.ArrayList;

import objects.Car;

/**
 * Created by Kasia on 2016-12-20.
 */
public class Foreman {

    private ArrayList<Car> cars;

    public Foreman(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

}
