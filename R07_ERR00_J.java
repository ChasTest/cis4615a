import java.io.*;

public class R07_ERR00_J {
  public static void main(String[] args) {
    boolean validFlag = false;
    File file;
    FileInputStream fileInputStream;
    do {
      try {
        file = new File("nameOfMissingFile");
        fileInputStream = new FileInputStream(file);
        validFlag = true;
      } catch (FileNotFoundException e) {
        System.out.println("I would ask you for a different file name here until you gave a valid one");
        break;
      }
    } while (validFlag != true);

    // Use the file
  }
}
