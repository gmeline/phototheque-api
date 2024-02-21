package fr.epsi.project.phototheque.service;

import fr.epsi.project.phototheque.entity.Categorie;
import fr.epsi.project.phototheque.repository.CategorieRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategorieService {
    CategorieRepository categorieRepository;
    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }
    public List<Categorie> findAll(){
        return categorieRepository.findAll();

    }


}
