import java.io.*;

public class R07_ERR00_J {
  public static void main(String[] args) {
    try {
      File file = new File("nameOfMissingFile");
      FileInputStream fileInputStream = new FileInputStream(file);
      // try to open a file
    } catch (IOException ioe) {
      ioe.printStackTrace(); // accidentally supresses error
    }
  }
}
