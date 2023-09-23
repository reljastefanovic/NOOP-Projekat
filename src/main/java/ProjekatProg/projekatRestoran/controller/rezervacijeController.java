package ProjekatProg.projekatRestoran.controller;
import ProjekatProg.projekatRestoran.model.rezervacijeEntitet;
import ProjekatProg.projekatRestoran.repository.rezervacijeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class rezervacijeController {
    private final rezervacijeRepository rezervacijeRepository;
    @Autowired
    public rezervacijeController(rezervacijeRepository entity) {
        this.rezervacijeRepository = entity;
    }
    @RequestMapping(value="/submit",method = RequestMethod.POST)
    public String handleFormSubmission(@ModelAttribute rezervacijeEntitet rezervacije) {
            rezervacijeRepository.save(rezervacije);
            System.out.println("Treba da upise u bazu");
            return "redirect:/uspesna-rezervacija.html";


    }
}
