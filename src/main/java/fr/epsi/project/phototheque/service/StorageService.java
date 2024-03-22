package fr.epsi.project.phototheque.service;

import com.fasterxml.jackson.databind.util.NativeImageUtil;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

public class StorageService {


    private StorageRepository repository;

    private final String FOLDER_PATH="";

    public String uploadImage(MultipartFile file) throws IOException {


        ImageData imageData= repository.save(ImageData.builder()
        .nom(file.getContentType())
        .description(file.getContentType())
        .taille_octet(file.getContentType())
        .date_creation(file.getContentType())
        .date_modification(file.getContentType())
        .elements_detectes(file.getContentType())
        .presence_individus(file.getContentType())
        .url_taille_reelle(file.getContentType())
        .url_miniature(file.getContentType())
        .compteur_telechargement(ImageUtils.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded sucessfuly : " + file.getOriginalFilename();
        }
        return null;
}

public byte[] downloadImage(String filename) {
    Optional<ImageData> dbImageData = repository.finByName(filename);
    byte[] images = ImageUtils.decompressImage(dbImageData.get().getImageData());
    return images;
}
}