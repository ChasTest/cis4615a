import java.util.*;

class R05_OBJ03_J {
  private static void addToList(List<String> list, String str) {
    list.add(str); // Unchecked warning
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, "42");
    System.out.println(list.get(0));  // Throws ClassCastException
  }
}
