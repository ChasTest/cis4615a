import java.io.*;

public class R02_XP00_J {
  public static void main(String[] args) {
    File someFile = new File ("someFileName.txt");
    if (!someFile.delete()) {
      System.out.println("couldn't delete");
      // Handle failure to delete the file
    }
  }

}
