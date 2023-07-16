package mingroup.AnalysisSys.controller.file;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class FileUploadingController {

    @PostMapping("/upload")
    public String upload(
            String filename,
            MultipartFile file,
            HttpServletRequest request
    ) {
        String path = request.getServletContext().getRealPath("/upload");
        saveFile(file, path);
        System.out.println("filename: " + filename + "save in: " + path);
        return "Upload success!";
    }

    public void saveFile(MultipartFile f, String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            // if path not exists, create it
            dir.mkdirs();
        }

        File file = new File(path + f.getOriginalFilename());
        try {
            f.transferTo(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
