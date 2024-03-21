import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Base64;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;
//Téléchargement des images
    public String uploadImage(MultipartFile file) {
        try {
            Image image = new Image(file.getOriginalFilename(), file.getBytes());
            imageRepository.save(image);
            return "Image uploaded successfully: " + file.getOriginalFilename();
        } catch (IOException e) {
            return "Failed to upload image: " + e.getMessage();
        }
    }
//Affichage des images
    public ResponseEntity<byte[]> getImage(String imageName) {
        Image image = imageRepository.findByName(imageName);
        byte[] imageData = image.getData();
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageData);
    }
}
