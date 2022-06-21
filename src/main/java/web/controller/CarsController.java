package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServise;


@Controller
public class CarsController {


    private CarServise carServise;

    @Autowired
    public CarsController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "0") int i, ModelMap model) {
        model.addAttribute("carsList", carServise.countCars(i));

        return "cars";
    }

}