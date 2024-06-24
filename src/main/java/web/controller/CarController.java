package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;

@Controller
@RequestMapping("")
public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping("/cars")
    public String GetCars(Model model, @RequestParam(value = "count",defaultValue = "5") int count) {
        model.addAttribute("SomeCars", carDao.getCars(count));
        return "SomeCars";
    }
}
