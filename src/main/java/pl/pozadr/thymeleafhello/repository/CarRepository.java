package pl.pozadr.thymeleafhello.repository;

import org.springframework.stereotype.Repository;
import pl.pozadr.thymeleafhello.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    List<Car> carList;

    public CarRepository() {
        carList = new ArrayList<>();
        carList.add(new Car(1L,"VW","T5"));
        carList.add(new Car(2L,"Ford","Mustang"));
        carList.add(new Car(3L,"Ford","Focus"));
        carList.add(new Car(4L,"Fiat","126p"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }


}
