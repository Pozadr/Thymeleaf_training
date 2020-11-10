package pl.pozadr.thymeleafhello.service;

import org.springframework.stereotype.Service;
import pl.pozadr.thymeleafhello.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car(1L,"VW","T5"));
        carList.add(new Car(2L,"Ford","Mustang"));
        carList.add(new Car(3L,"Ford","Focus"));
        carList.add(new Car(4L,"Fiat","126p"));
    }

    public Optional<Car> getCarById(Long id) {
        return carList.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public boolean addCar(Car car) {
        return carList.add(car);
    }
}
