package users;

import java.util.ArrayList;

import objects.Car;

/**
 * Created by Kasia on 2016-12-20.
 */
public class PoliceMan {

    private ArrayList<Car> cars;

    public PoliceMan(ArrayList<Car> cars) {

        this.cars = cars;

    }

    public Car getAll()
    {
        for(int i = 0; i < this.cars.size(); i++) //cars name of arraylist
        {
            Car car = this.cars.get(i);
            {
                return this.cars.get (i);
            }
        }
        return null;
    }

}
