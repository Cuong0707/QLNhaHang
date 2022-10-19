
package Helper;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class XImage {

    public static Image getAppicon() {
        URL url = XImage.class.getResource("/PS20265_EDUSYS/src/icon");
        
        System.out.println(url.getPath());
        return new ImageIcon(url).getImage();
        /*
            public URL getResource(String resourceName)
            ImageIcon(URL location): Tạo ImageIcon từ URL đã cho.
            Image getImage(): Trả về hình ảnh của icon này
        */
    }

    public static void save(File src) {

        File dst = new File("logos", src.getName());
        
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs(); // Tạo thư mục logos nếu chưa tồn tại
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            /*
                System.out.println("src" + src.getAbsolutePath());
                System.out.println("dst" + dst.getAbsolutePath());
            */
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING); // Copy file vào thư mục logos
        } catch (Exception ex) {
            System.out.println("Lỗi saveImage: " + ex);
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        System.out.println(path.getAbsolutePath());
        return new ImageIcon(path.getAbsolutePath());
    }
}
