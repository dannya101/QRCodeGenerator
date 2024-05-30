// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.BarcodeFormat;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws WriterException, IOException {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String url = "https://www.linkedin.com/in/daguilar3/";
        String path = "/Users/danny/Desktop/linkedin.jpg";

        BitMatrix matrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
        System.out.println("QR CODE read successfully");
    }
}