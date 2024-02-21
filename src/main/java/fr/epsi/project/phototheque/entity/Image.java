package fr.epsi.project.phototheque.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private Long taille_octet;
    private Date date_creation;
    private Date date_modification;
    private String elements_detectes;
    private Boolean presence_individus;
    private String url_taille_reelle;
    private String url_miniature;
    private Integer compteur_telechargement;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTaille_octet() {
        return taille_octet;
    }

    public void setTaille_octet(Long taille_octet) {
        this.taille_octet = taille_octet;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Date getDate_modification() {
        return date_modification;
    }

    public void setDate_modification(Date date_modification) {
        this.date_modification = date_modification;
    }

    public String getElements_detectes() {
        return elements_detectes;
    }

    public void setElements_detectes(String elements_detectes) {
        this.elements_detectes = elements_detectes;
    }

    public Boolean getPresence_individus() {
        return presence_individus;
    }

    public void setPresence_individus(Boolean presence_individus) {
        this.presence_individus = presence_individus;
    }

    public String getUrl_taille_reelle() {
        return url_taille_reelle;
    }

    public void setUrl_taille_reelle(String url_taille_reelle) {
        this.url_taille_reelle = url_taille_reelle;
    }

    public String getUrl_miniature() {
        return url_miniature;
    }

    public void setUrl_miniature(String url_miniature) {
        this.url_miniature = url_miniature;
    }

    public Integer getCompteur_telechargement() {
        return compteur_telechargement;
    }

    public void setCompteur_telechargement(Integer compteur_telechargement) {
        this.compteur_telechargement = compteur_telechargement;
    }
}