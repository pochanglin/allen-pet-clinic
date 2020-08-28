package allen.springdemo.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VetController {

    @RequestMapping({"","/"})
    public String listVets(){
        return "vets/index";
    }

}
