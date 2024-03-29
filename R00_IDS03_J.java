import java.util.logging.*;
import java.util.regex.Pattern;

public class R00_IDS03_J {
  public static void main(String[] args) {
    String s = "x\ny";
    Logger logger =
      Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    logger.log(Level.INFO, sanitize(s));
  }

  public static String sanitize(String username) {
    return Pattern.matches("[A-Za-z0-9_]+", username)
      ? username : "bad input";
  }


}
