package lesson7;

import org.junit.Test;
import java.io.*;

public class FileReadDemo {

    // Тест на чтение из lorem.txt
    @Test
    public void readFileContext() throws IOException {
        try (InputStream input = new BufferedInputStream(new FileInputStream("tmp/lorem.txt"))) {
            byte[] buffer = new byte[1024];
            for (int length = 0; (length = input.read(buffer)) != -1; ) {
                System.out.write(buffer, 0, length);
            }
        }
    }

    // Ввожу строки в консоль и сохраняю в файл addText.txt
    @Test
    public void writeFileContext() throws IOException {

            InputStream input = new ByteArrayInputStream("Баклажан\nКабачок\nМорковка".getBytes());
        byte[] buffer = new byte[1024];

        File targetFile = new File("tmp/addText.txt");
        OutputStream outStream = new FileOutputStream(targetFile);
        for (int length = 0; (length = input.read(buffer)) != -1; ) {
            outStream.write(buffer, 0, length);
        }
    }
}