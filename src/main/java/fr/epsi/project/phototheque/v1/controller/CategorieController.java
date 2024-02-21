package fr.epsi.project.phototheque.v1.controller;

import fr.epsi.project.phototheque.entity.Categorie;
import fr.epsi.project.phototheque.service.CategorieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/categories")
public class CategorieController {
    CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    @GetMapping
    public List<Categorie> findAll(){
        return categorieService.findAll();
    }
}
