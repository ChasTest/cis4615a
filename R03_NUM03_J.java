import java.io.*;

public class R03_NUM03_J {
  public static void main(String[] args) {
    try {
      System.out.println(
        getInteger(new DataInputStream(new FileInputStream("binary.data")))
      );
    } catch(Exception e) {

    }
  }

  public static long getInteger (DataInputStream is) throws IOException {
    return is.readInt();// & 0xFFFFFFFFL;
    // return is.readInt() & 0xFFFFFFFFL;
  }
}
