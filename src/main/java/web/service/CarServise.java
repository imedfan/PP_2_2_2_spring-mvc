
package web.service;

import org.springframework.stereotype.Component;

import web.model.Cars;

import java.util.List;

@Component
public class CarServise {
    private List<Cars> carsList;


    public CarServise(List<Cars> carsList) {
        this.carsList = carsList;
        Cars car1 = new Cars("VAZ", 5506, 100);
        Cars car2 = new Cars("UAZ", 2216, 101);
        Cars car3 = new Cars("GAZ", 8854, 102);
        Cars car4 = new Cars("SHMAZ", 5451, 103);
        Cars car5 = new Cars("GIGAZ", 5454, 105);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
    }


    public List<Cars> countCars(int i){
        if(i > 0 && i < 5) return carsList.subList(0, i);
        return carsList;
    }
}
