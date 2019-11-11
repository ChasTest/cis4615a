import java.io.*;

class Point implements Serializable {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {}
}

public class R14_SER03_J extends Point {
  public static void main(String[] args) {
    FileOutputStream fout = null;
    try {
      Point p = new Point(5, 2);
      fout = new FileOutputStream("point.ser");
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      oout.writeObject(p);
    } catch (Throwable t) {
      // Forward to handler
    } finally {
      if (fout != null) {
        try {
          fout.close();
        } catch (IOException x) {
          // Handle error
        }
      }
    }
  }
}

