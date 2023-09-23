package ProjekatProg.projekatRestoran.controller;

import ProjekatProg.projekatRestoran.model.narudzbinaEntitet;
import ProjekatProg.projekatRestoran.repository.narudzbinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class narudzbinaController {
    private final narudzbinaRepository repository;
    @Autowired
    public narudzbinaController(narudzbinaRepository entity)
    {
        this.repository=entity;
    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute narudzbinaEntitet entity) {
        repository.save(entity);
        System.out.println("NIJE ISPISALO NISTA AL JE VALJDA PROBALO");

        return "redirect:/narudzbina.html"; // Redirect to a success page

    }
}
