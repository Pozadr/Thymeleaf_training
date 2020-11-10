package pl.pozadr.thymeleafhello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pozadr.thymeleafhello.model.Car;
import pl.pozadr.thymeleafhello.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private List<Car> carList;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carList = carRepository.getCarList();
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

    public boolean removeCar(Long id) {
        Optional<Car> carToRemove = carList.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst();
        return carToRemove.map(car -> carList.remove(car)).orElse(false);
    }

}
