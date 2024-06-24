package web.Dao;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW","red",3.0));
        cars.add(new Car("Lada","white",1.6));
        cars.add(new Car("M-benz","black",3.4));
        cars.add(new Car("Audi","green",2.5));
        cars.add(new Car("Ford","blue",2.0));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        if(count>=5){
            return cars;
        }
        List<Car> showCars = new ArrayList<>();
        for(Car car : cars) {
            if (count>0) {
                showCars.add(car);
                count--;
            }
        }
        return showCars;
    }

}
